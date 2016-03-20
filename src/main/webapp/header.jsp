<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
    #custom-bootstrap-menu.navbar-default .navbar-brand {
        color: rgba(119, 119, 119, 1);
    }
    #custom-bootstrap-menu.navbar-default {
        font-size: 14px;
        background-color: rgba(0, 0, 0, 1);
        border-width: 1px;
        border-radius: 4px;
    }
    #custom-bootstrap-menu.navbar-default .navbar-nav>li>a {
        color: rgba(119, 119, 119, 1);
        background-color: rgba(248, 248, 248, 0);
    }
    #custom-bootstrap-menu.navbar-default .navbar-nav>li>a:hover,
    #custom-bootstrap-menu.navbar-default .navbar-nav>li>a:focus {
        color: rgba(51, 51, 51, 1);
        background-color: rgba(248, 248, 248, 0);
    }
    #custom-bootstrap-menu.navbar-default .navbar-nav>.active>a,
    #custom-bootstrap-menu.navbar-default .navbar-nav>.active>a:hover,
    #custom-bootstrap-menu.navbar-default .navbar-nav>.active>a:focus {
        color: rgba(85, 85, 85, 1);
        background-color: rgba(231, 231, 231, 1);
    }
    #custom-bootstrap-menu.navbar-default .navbar-toggle {
        border-color: #ddd;
    }
    #custom-bootstrap-menu.navbar-default .navbar-toggle:hover,
    #custom-bootstrap-menu.navbar-default .navbar-toggle:focus {
        background-color: #ddd;
    }
    #custom-bootstrap-menu.navbar-default .navbar-toggle .icon-bar {
        background-color: #888;
    }
    #custom-bootstrap-menu.navbar-default .navbar-toggle:hover .icon-bar,
    #custom-bootstrap-menu.navbar-default .navbar-toggle:focus .icon-bar {
        background-color: #000000;
    }
</style>
<div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><a class="navbar-brand" href="/">Home</a>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse navbar-menubuilder">
            <ul class="nav navbar-nav navbar-left">
                <li>
                    <a href="/invoice">Invoice</a>
                </li>
                <li>
                    <a href="/inventory">Inventory</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="login/login.jsp">Login</a>
                </li>
                <li>
                    <a href="login/logout.jsp">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</div>
