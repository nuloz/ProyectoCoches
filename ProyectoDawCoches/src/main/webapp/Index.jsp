<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@taglib
	uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1 {
	color: red
}

.contenedor {
	display: flex;
	justify-content: space-around;
	flex-wrap: wrap;
}
td{
text-align: center;
}
.table {
	width: 100%;
	height: 60%;
	border: 1px solid black;
	margin-top: 1em;
}

body {
	background-color: grey;
}
</style>
</head>
<body>

	<div class="contenedor">

		<form action="${pageContext.request.contextPath}/Control">
			<input type="submit" value="ver Tabla"> <input type="hidden"
				value="tabla" name="operacion">
		</form>

		<form action="${pageContext.request.contextPath}/Control">
			<input type="submit" value="Modificar"> <input type="hidden"
				value="modificar" name="operacion">
		</form>

	
			<table id="tabla" class="table">
				<caption>LISTADO DE COCHES 2º MANO EN VENTA</caption>
				<tr>
					<th>IDCOCHE</th>
					<th>MODELO</th>
					<th>PRECIO</th>
					<th>COLOR</th>
				</tr>
				<c:forEach items="${listacoche}" var="coche">
					<tr>
						<td>${coche.idcoches}</td>
						<td>${coche.modelo}</td>
						<td>${coche.precio}</td>
						<td>${coche.color}</td>
					</tr>
				</c:forEach>
			</table>
	
	</div>

</body>
</html>