<a href="/">HOME</a><p></p>
<a style="color:aquamarine" href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:blueviolet" href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:brown" href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a style="color:coral" href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a style="color:aqua" href="/close">CloseAccount</a><p></p>

<a style="color:blue" href="/addCustomer">Add NewCustomer details</a><p></p>
<a style="color:fuchsia" href="/viewCustomer">View Customer Details</a><p></P>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="pink">
	<h1 style="color:blue">Your bank customer Data</h1>
<h1 style="color:blue"> Welcome to ${balance.name}</h1>
		<table border ="1">
	<tr>
		  <th> ACCOUNT NO</th>
		  <th> NAME </th>
		  <th> PASSWORD</th>
		  <th> BALANCE</th>
		  <th> ADDRESS</th>
		  <th> MOBILE NO</th>
	</tr>
	<tr>
		  <td>${balance.accountno}</td>
		  <td>${balance.name}</td>
		  <td>${balance.password}</td>
		  <td>${balance.amount}</td>
		  <td>${balance.address}</td>
		  <td>${balance.mobileno}</td>
		  
	</tr>
		</table>
</body>
	