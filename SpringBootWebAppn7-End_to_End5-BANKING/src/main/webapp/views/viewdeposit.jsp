<a href="/">HOME</a><p></p>
<a style="color:aquamarine" href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:blueviolet" href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:brown" href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:coral" href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a style="color:aqua" href="/close">CloseAccount</a><p></p>



<a style="color:blue" href="/addCustomer">Add NewCustomer details</a><p></p>
<a style="color:fuchsia" href="/viewCustomer">View Customer Details</a><p></P>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Deposit Form</title>
</head>
<body>
    <jsp:include page="home.jsp" />
    <p></p>
   
   <center>
        <h1>Welcome to ${deposit.name}</h1><p></p>
    

        <h1>Your balanced incresed ${deposit.amount}</h1><p></p>
        
       </div>
    </center>
</body>
</html>