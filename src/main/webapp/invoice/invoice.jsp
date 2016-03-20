<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="../css/custom.css">
    <script src="../js/jquery-1.11.3.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>
    <script src="../js/jquery.tabletojson.js"></script>
    <script src="../js/typeahead.js"></script>
    <script src="../js/custom.js"></script>

    <title>create an invoice</title>
</head>
<body>


<div class="container">
    <form name="invoice_form" id="invoice_form" method="put" action="../services/invoice/add">
        <div class="row">
            <div class="col-md-5">
                <div class="form-group">
                    <label for="name" class="control-label col-md-4">Name :</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="name" name="name" placeholder="Lakshman">
                    </div>
                </div>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-5">
                <div class="form-group">
                    <label for="date" class="control-label col-md-4">Date :</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" name="date" id="date">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-5">
                <div class="form-group">
                    <label for="address" class="control-label col-md-4">Address :</label>
                    <div class="col-md-8">
                        <textarea id="address" name="address" class="form-control" rows="5" cols="30">  </textarea>
                    </div>
                </div>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-5">
                <div class="form-group">
                    <label for="tpNo" class="control-label col-md-4">Telephone No :</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="tpNo" name="tpNo">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8" style="height:292px;overflow:auto;">
                <table class="table-striped" id="invoice-table" name="invoice-table">
                    <input type="hidden" name="invoice-table" value=""/>
                    <thead>
                    <tr>
                        <th>Item Code</th>
                        <th>Quantity</th>
                        <th>Description</th>
                        <th>Unit Price</th>
                        <th>Amount</th>
                        <th>Tax</th>
                    </tr>
                    </thead>
                </table>
            </div>
            <div class="col-md-2"></div>
        </div>
        <div class="row">
            <div class="col-md-6"></div>
            <div class="col-md-4">
                <input type="submit" name="save_and_close" class="btn btn-primary" value="Save & Close">
                <input type="submit" name="save_and_new" class="btn btn-primary" value="Save & New">
                <input type="button" class="btn btn-primary clear-button" value="Clear">
            </div>
            <div class="col-md-2"></div>
        </div>
    </form>
</div>


</body>
</html>