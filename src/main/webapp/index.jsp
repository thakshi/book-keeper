<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/custom.css">
    <script src="js/jquery-1.11.3.min.js"></script>
    <%
        session = request.getSession(false);// don't create if it doesn't exist
        String pageURL = "/";
        if(session.isNew() || session.getAttribute("authenticated") == null || false == (boolean)session.getAttribute("authenticated")) {
            response.sendRedirect("login/login.jsp");
        }
    %>
    <script>
        $(function(){
            $("#header").load("header.jsp");
            $("#footer").load("footer.jsp");
        });
    </script>
</head>
<body>
<div id="header"></div>
<div class="container">


    <div class="row">
        <div class="col-md-4">

            <a href="pulpitrock.jpg" class="thumbnail">
                <h>Invoice Management </h>
                <img src="images/invoice.jpg" alt="Pulpit Rock" style="width:150px;height:150px">
            </a>
        </div>
        <div class="col-md-4">
            <a href="moustiers-sainte-marie.jpg" class="thumbnail">
                <h>Voucher Management </h>
                <img src="images/voucher.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px">
            </a>
        </div>
        <div class="col-md-4">
            <a href="moustiers-sainte-marie.jpg" class="thumbnail">
                <h>Inventory Management </h>
                <img src="images/inventory.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px">
            </a>

        </div>
    </div>

    <div class="container">


        <div class="row">
            <div class="col-md-4">
                <a href="pulpitrock.jpg" class="thumbnail">
                    <h>Customer Management</h>
                    <img src="images/customer.jpg" alt="Pulpit Rock" style="width:150px;height:150px">
                </a>
            </div>
            <div class="col-md-4">
                <a href="moustiers-sainte-marie.jpg" class="thumbnail">
                    <h>Vendors Management </h>
                    <img src="images/vendor.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px">
                </a>
            </div>
            <div class="col-md-4">
                <a href="moustiers-sainte-marie.jpg" class="thumbnail">
                    <h>Advance Search Management </h>
                    <img src="images/search.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px">
                </a>
            </div>


        </div>
        </div>
    </div>


<div id="footer"></div>
</body>
</html>
