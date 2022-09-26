<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>List Customers</title>
	<link type="text/css" rel="stylesheet" 
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

	<div id= "wrapper">
		<div id="header">
			<h2> Logi - Peticiones Escuadron España </h2>
		</div>
	
	</div>
	<div id="container">
		<div id="content">
			
			
			<form:form action="addOrder" modelAttribute="order" method="POST">
				<table>
					<tr>
						<td><label>Cantidad:</label></td>
						<td><form:input path="amount" style="width:30px;"/></td>
						<td><label>Pedido:</label></td>
						<td><form:input path="pedido" /></td>
						<td><label>Region:</label></td>
						<td><form:input path="region" /></td>
						<td><input type="submit" value="Add" class="save"/></td>
						<td></td>
					</tr>
				</table>
			</form:form>
			
			<table>
				<tr>
					<th>Cantidad</th>
					<th>Pedido</th>
					<th>Creador</th>
					<th>Region</th>
				</tr>
				<c:forEach var="tempOrder" items="${orders}">
				
					<c:url var="updateLink" value="/logi/showFormForUpdate"> 
						<c:param name="id" value="${tempOrder.id}"></c:param>
					</c:url>
					<c:url var="deleteLink" value="/logi/delete"> 
						<c:param name="id" value="${tempOrder.id}"></c:param>
					</c:url>
					
					<tr>
						<td> ${tempOrder.amount}</td>
						<td> ${tempOrder.pedido}</td>
						<td> ${tempOrder.region}</td>
						<td>
							<a href="${updateLink}">Update</a>|
							<a href="${deleteLink}" onclick="if( !( confirm( 'Are you sure you want to delete this customer?' ) ) ) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	
</body>
</html>