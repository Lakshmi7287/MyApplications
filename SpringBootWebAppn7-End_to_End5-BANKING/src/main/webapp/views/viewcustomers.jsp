 <a href="/">HOME</a><p></p>
<a style="color:aquamarine" href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:blueviolet" href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:brown" href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:coral" href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a style="color:aqua" href="/close">CloseAccount</a><p></p>



<a style="color:blue" href="/addCustomer">Add NewCustomer details</a><p></p>
<a style="color:fuchsia" href="/viewCustomer">View Customer Details</a><p></P>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<center>
<table border="2" width="70%" cellPadding="2">
<tr>
<th>ACCOUNT NO</th>
<th> NAME</th>
<th>PASSWORD</th>
<th>AMOUNT</th>
<th>MOBILE NO</th>
<th>ADDRESS </th>
<th>STATUS</th>
<th>EDIT</th>
<th>DELETE</th>

</tr>

<c:forEach var="c" items="${customers}">
<tr>
<td>${c.accountno}</td>
<td>${c.name}</td>
<td>${c.password}</td>
<td>${c.amount}</td>
<td>${c.mobileno}</td>
<td>${c.address}</td>
<td>${c.status}</td>

<td><a href="/delete/${c.accountno}">Delete</a></td>
<td><a href="/update/${c.accountno}">Edit</a></td>
</tr>
</c:forEach>

</table>
</center>