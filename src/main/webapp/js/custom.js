$( document ).ready(function() {
    for(var i = 0; i < 10; i++) {
        $('#invoice-table > tbody:last-child').append('<tr> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr>');
    }

    $('td').click(function(){
        $(this).attr("contenteditable", true);
        if($(this).html() == "&nbsp;"){
            $(this).html("");
        }

    });

    $( "#date" ).datepicker();

    //callback handler for form submit
    $("#invoice_form").submit(function(e)
    {
        var postData = $(this).serializeArray();
        var formURL = $(this).attr("action");
        $.ajax(
            {
                url : formURL,
                type: "POST",
                data : postData,
                success:function(data, textStatus, jqXHR)
                {
                    //data: return data from server
                },
                error: function(jqXHR, textStatus, errorThrown)
                {
                    //if fails
                }
            });
        e.preventDefault(); //STOP default action
       // e.unbind(); //unbind. to stop multiple form submit.
    });

    $("#invoice_form").submit(); //Submit  the FORM
});

