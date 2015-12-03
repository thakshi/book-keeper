<html>
    <link rel="stylesheet" type="text/css" href="css/custom.css">
<body>
<h2>Well come to Accounting App</h2>
<%--<a href="invoice">--%>
    <%--<img src="images/invoice.jpeg" alt="invoice" style="width:100px;height:100px;">--%>
<%--</a>--%>

<div onclick="location.href=#" class="event_box estimate">Estimate</div>
<img src="images/front_right_arrow.png" class="front_right-arrow estimate_to_sales_order">
<div onclick="location.href=#" class="event_box sales_order">Sales Order</div>
<img src="images/right_arrow.png" class="right-arrow sales_order_to_purchase_order">
<div onclick="location.href=#" class="event_box estimate purchase_order">Purchase Order</div>
<img src="images/round_arrow.png" class="round_arrow" id="purchase_order_to_gin">
<div onclick="location.href=#" class="event_box estimate" id="gin">GIN</div>
<img src="images/right_arrow.png" class="right-arrow" id="grn_to_gin">
<div onclick="location.href=#" class="event_box estimate" id="grn">GRN</div>
<img src="images/right_arrow.png" class="right-arrow" id="invoices_to_receive_payments">
<img src="images/right_arrow.png" class="right-arrow" id="receive_payments_to_deposit">
<img src="images/three_side_arrow.png" class="three_side_arrow" id="gin_to_enter_and_pay_bill">
<img src="images/south_arrow.png" class="south_arrow" id="estimate_to_invoices">
<div onclick="location.href='invoice'" class="event_box" id="invoices">Invoices</div>
<div onclick="location.href=#" class="event_box" id="enter_bill">Enter Bill</div>
<div onclick="location.href=#" class="event_box" id="pay_bill">Pay Bill</div>
<div onclick="location.href=#" class="event_box" id="receive_payments">Receive Payments</div>
<div onclick="location.href=#" class="event_box" id="deposit">Deposit</div>
<img src="images/three_side_arrow.png" class="three_side_arrow" id="deposit_to_write_check_and_reconciliation">
<div onclick="location.href=#" class="event_box" id="write_check">Write Check</div>
<div onclick="location.href=#" class="event_box" id="reconciliation">Reconciliation</div>
</body>
</html>
