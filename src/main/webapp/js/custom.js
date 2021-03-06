var makeNewRowToTable = function(){
    var numberOfColumns = $('#invoice-table > thead > tr > th').length;
    var newLineToBeAppended = "<tr>";
    for(var j = 0; j <numberOfColumns; j++){
        newLineToBeAppended +=  "<td>&nbsp;</td>";
    }
    newLineToBeAppended += "</tr>";
    $('#invoice-table > tbody:last-child').append(newLineToBeAppended);
}

var getTableCellByRowAndCol = function(table, rowIndex, columnIndex){
    var rows = $('tr', table);
    var current_row = rows.eq(rowIndex+1);
    return current_row.find('td:eq('+columnIndex+')');
}

var makeAmountColumn = function(current_cell, table, firstColumn, secondColumn, amountColumn){
    var current_row_index = current_cell.parent().index();
    var current_col_index = current_cell.index();
    if(current_col_index == firstColumn.index()){
        if(current_cell.text().match(/^\d+$/) && getTableCellByRowAndCol(table, current_row_index, secondColumn.index()).text().match(/^\d+$/)){
            getTableCellByRowAndCol(table, current_row_index, amountColumn.index()).html(current_cell.text()* getTableCellByRowAndCol(table, current_row_index, secondColumn.index()).text());
        }
    }
    else if(current_col_index == secondColumn.index()){

    }
    else{
        return;
    }
}

$( document ).ready(function() {


    $('form').attr('autocomplete', 'off');
    for(var i = 0; i < 10; i++) {
        makeNewRowToTable();
    }

    $('td').click(function(){
        $(this).attr("contenteditable", true);
        if($(this).html() == "&nbsp;"){
            $(this).html("");
        }

    });

    $( "td" ).blur(function() {
        makeAmountColumn($(this), $("#invoice-table"), $("#quantity") , $("#unit-price"), $("#amount"))

        //var $th = $(this).closest('table').find('th').eq($(this).index());
        //var table = document.getElementById("invoice-table");
        //var $current_row_index = $(this).parent().index();
        //var row = table.rows[$current_row_index];
        //if($th.html() == "Quantity"){
        //    var $unit_price_header_column_index = $('th:contains("Unit Price")').index();
        //
        //    var unit_price_cell = row.cells[$unit_price_header_column_index];
        //    var $unit_price_cell = $(unit_price_cell);
        //
        //    if($unit_price_cell.html().match( /^\d+$/)){
        //        var $amount_header_column_index = $('th:contains("Amount")').index();
        //        var amount_cell =  row.cells[$amount_header_column_index];
        //        $(amount_cell).html( $(this).html()*$unit_price_cell.html());
        //    }
        //}
        //
        //if($th.html() == "Unit Price"){
        //    var $quantity_header_column_index = $('th:contains("Quantity")').index();
        //
        //    var quantity_cell = row.cells[$quantity_header_column_index];
        //    var $quantity_cell = $(quantity_cell);
        //
        //    if($quantity_cell.html().match( /^\d+$/)){
        //        var $amount_header_column_index = $('th:contains("Amount")').index();
        //        var amount_cell =  row.cells[$amount_header_column_index];
        //        $(amount_cell).html( $(this).html()*$quantity_cell.html());
        //    }
        //}
        //
        //if($current_row_index > 6){
        //    var all_cell_filled = true;
        //    $('#invoice-table tr').eq($current_row_index).find('td').each(function(){
        //        if($(this).html().trim() == "" || $(this).html().trim() == "&nbsp;"){
        //            all_cell_filled=false;
        //            //return false;
        //        }
        //    });
        //    if(all_cell_filled){
        //        makeNewRowToTable();
        //    }
        //}

    });

    $( "#date" ).datepicker();

    $(".clear-button").click(function(){
        $("#invoice_form")[0].reset();
    });

    //callback handler for form submit
    $("#invoice_form").submit(function(e)
    {
        var postData = $(this).serializeArray();
        var formURL = $(this).attr("action");
        var tableData = JSON.stringify($('#invoice-table').tableToJSON());
        for(var i = 0;i < postData.length;i++){
            if(postData[i].name == 'invoice-table'){
                postData[i].name = "invoiceTable";
                postData[i].value = tableData;
                break;
            }
        }
        $.ajax(
            {
                url : formURL,
                type: "PUT",
                data : postData,
                success:function(data, textStatus, jqXHR)
                {
                    alert(data);
                },
                error: function(jqXHR, textStatus, errorThrown)
                {
                    //if fails
                }
            });
        e.preventDefault(); //STOP default action
       // e.unbind(); //unbind. to stop multiple form submit.
    });

    $("#customer_add_form").submit(function(e)
    {
        var postData = $(this).serializeArray();
        var formURL = $(this).attr("action");
        $.ajax(
            {
                url : formURL,
                type: "PUT",
                data : postData,
                success:function(data, textStatus, jqXHR)
                {
                    alert(data);
                },
                error: function(jqXHR, textStatus, errorThrown)
                {
                    //if fails
                }
            });
        e.preventDefault(); //STOP default action
        // e.unbind(); //unbind. to stop multiple form submit.
    });


    //begin typeahed part----------------------------------------------------------------------------------------------

    var substringMatcher = function(strs) {
        return function findMatches(q, cb) {
            var matches, substringRegex;

            // an array that will be populated with substring matches
            matches = [];

            // regex used to determine if a string contains the substring `q`
            substrRegex = new RegExp(q, 'i');

            // iterate through the pool of strings and for any string that
            // contains the substring `q`, add it to the `matches` array
            $.each(strs, function(i, str) {
                if (substrRegex.test(str)) {
                    matches.push(str);
                }
            });

            cb(matches);
        };
    };

    var names = ['Alabama', 'Alaska', 'Arizona', 'Arkansas', 'California',
        'Colorado', 'Connecticut', 'Delaware', 'Florida', 'Georgia', 'Hawaii',
        'Idaho', 'Illinois', 'Indiana', 'Iowa', 'Kansas', 'Kentucky', 'Louisiana',
        'Maine', 'Maryland', 'Massachusetts', 'Michigan', 'Minnesota',
        'Mississippi', 'Missouri', 'Montana', 'Nebraska', 'Nevada', 'New Hampshire',
        'New Jersey', 'New Mexico', 'New York', 'North Carolina', 'North Dakota',
        'Ohio', 'Oklahoma', 'Oregon', 'Pennsylvania', 'Rhode Island',
        'South Carolina', 'South Dakota', 'Tennessee', 'Texas', 'Utah', 'Vermont',
        'Virginia', 'Washington', 'West Virginia', 'Wisconsin', 'Wyoming'
    ];

    $('#invoice_form #name').typeahead({
            hint: true,
            highlight: true,
            minLength: 1
        },
        {
            name: 'names',
            source: substringMatcher(names)
        });


    //end typeahead part----------------------------------------------------------------------------------------------

    $(".form-signin").submit(function(e) {

        var url = "../services/login/login"; // the script where you handle the form input.

        $.ajax({
            type: "POST",
            url: url,
            data: $(".form-signin").serialize(), // serializes the form's elements.
            success: function(data)
            {
                var json = JSON.parse(data);
                if(json.authenticated == true){
                    window.location.href = "/book-keeper";
                }

            },
            error: function(xhr, error){
                alert(error);
            }
        });

        e.preventDefault(); // avoid to execute the actual submit of the form.
    });

});
