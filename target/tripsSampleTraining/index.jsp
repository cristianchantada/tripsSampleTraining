<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sales.*"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.reflect.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./styles/style.css">
<title>Seleccionar tiendas</title>
</head>
<body>

	<% 

	Store storeSeattle = new Store();
	SalesDao salesDao = new SalesDao();
	
	ArrayList<Store> salesListInSeattle = new ArrayList<>();
	salesListInSeattle = salesDao.searchStoresByLocation("Seattle");
	
	
	ArrayList<Store> salesListDenverInStore = new ArrayList<>();
	salesListDenverInStore = salesDao.searchStoresByLocationAndPurchaseMethod ("Denver", "In store" );

	%>
		<h2>Tiendas de Seattle</h2>
		<table>
			<thead>
				<tr>
					<th>Número de tienda</th>
					<th>Ciudad</th>
					<th>Método de compra</th>
				</tr>
			</thead>
		<tbody>
	<%
		int i = 1;
		for(Store store : salesListInSeattle){
	%>		
			<tr>
				<td><%= i++%></td>
				<td><%= store.getStoreLocation() %></td>
				<td><%= store.getPurchaseMethod()%></td>
			</tr>	
	<% 
		} 
	%>	
		</tbody>
	</table>
	
	<h2>Tiendas de Denver con método de compra en tienda</h2>
	
	<table>
		<thead>
			<tr>
				<th>Número de tienda</th>
				<th>Ciudad</th>
				<th>Método de compra</th>
			</tr>
		</thead>
		<tbody>
	<%
		int j = 1;
		for(Store store : salesListDenverInStore){
	%>	
		<tr>
			<td><%= j++%></td>
			<td><%= store.getStoreLocation() %></td>
			<td><%= store.getPurchaseMethod()%></td>
		</tr>
	
	<% 
	} 
	%>
		</tbody>
	</table>
</body>
</html>