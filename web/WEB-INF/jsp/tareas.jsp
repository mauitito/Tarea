
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Tareas</title>
</head>
<body>
<h2>Lista de Tareas</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Descripción</th>
        <th>Estado</th>
        <th>Asignada a</th>
    </tr>
    <c:forEach var="tarea" items="${tareas}">
        <tr>
            <td>${tarea.id}</td>
            <td>${tarea.nombre}</td>
            <td>${tarea.descripcion}</td>
            <td>${tarea.estado}</td>
            <td>${tarea.usuarioAsignado.nombre}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
