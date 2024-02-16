<%@ page import="com.emersoncode.javaweb.logica.Usuario" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
   <title>Editar Usuario</title>
</head>
<body>
<% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");%>
<h1>Datos del Usuario</h1>
<form action="svEditar" method="POST" >
   <p><label>Dni: </label><label>
      <input type="text" name="dni" value="<%=usu.getDni()%>">
   </label></p>
   <p><label>Nombre: </label><label>
      <input type="text" name="nombre" value="<%=usu.getNombre()%>">
   </label></p>
   <p><label>Apellidos: </label><label>
      <input type="text" name="apellido" value="<%=usu.getApellido()%>">
   </label></p>
   <p><label>Telefono: </label><label>
      <input type="text" name="telefono" value="<%=usu.getTelefono()%>">
   </label></p>
   <button type="submit">Enviar</button>
</form>
</body>
</html>
