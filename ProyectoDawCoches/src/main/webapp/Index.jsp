<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Más que coches</title>
<style type="text/css">
h1, h2, h3 {
	color: red;
	text-align: center;
}

.contenedor {
	display: flex;
	justify-content: space-around;
	flex-wrap: wrap;
}

td {
	text-align: center;
}

.table {
	height: 60%;
	border: 1px solid black;
	margin-top: 1em;
}

.boton {
	color: white;
	background-color: black;
	font-weight: bold;
}

.centrar {
	width: 90%;
	display: flex;
	justify-content: center;
	display: flex;
}

a {
	color: white;
	background-color: black;
	text-decoration: none;
	margin: 1px;
	padding: 3px;
}

.main {
	flex: 1;
}

fieldset {
	display: flex;
	flex-direction: column;
}

header, footer {
	background-color: #000;
	color: #FFF;
	text-align: center;
}

body {
	background-color: grey;
	font-weight: bold;
	font-size: large;
	display: flex;
	flex-direction: column;
	margin: 0;
	min-height: 100vh;
}
</style>
</head>
<body>

	<header>
		<h1>Bienvenido a más que coches, tu tienda de 2º Mano de
			confianza</h1>
	</header>
	<main class="main">
		<div class="contenedor">

			<form action="${pageContext.request.contextPath}/Control">
				<input class="boton" type="submit" value="ver tabla"> <input
					type="hidden" value="tabla" name="operacion">
			</form>

			<a href="modificar.jsp">modificar precio</a>

			<div class="centrar">
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
		</div>
	</main>
	<footer>
		<p>Diseño creado por Expertos Developers S.L Azarquiel 2022 DAW</p>
	</footer>
</body>
</html>