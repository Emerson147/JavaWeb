<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   <title>Formulario de Prueba</title>
</head>
<body>
<h1>Datos del Usuario</h1>
<form action="svUsuario" method="POST" >
   <p><label>Dni: </label><label>
      <input type="text" name="dni">
   </label></p>
   <p><label>Nombre: </label><label>
      <input type="text" name="nombre">
   </label></p>
   <p><label>Apellidos: </label><label>
      <input type="text" name="apellido">
   </label></p>
   <p><label>Telefono: </label><label>
      <input type="text" name="telefono">
   </label></p>
   <button type="submit">Enviar</button>
</form>

<h1>Ver lista de Usuarios</h1>
<p>Para ver los datos de los usuarios cargados</p>
<form action="svUsuario" method="GET" >
   <button type="submit">Mostrar Usuarios</button>
</form>

<h1>Eliminar Usuario</h1>
<p>Ingrese el ID del usuario que desea eliminar</p>
<form action="svEliminar" method="POST" >
   <p><label>Id: </label> <input type="text" name="id_usuario"></p>
   <button type="submit">Eliminar Usuario</button>
</form>

<h1>Editar Usuarios</h1>
<p>Ingrese el ID del usuario que desea editar</p>
<form action="svEditar" method="GET" >
   <p><label>Id: </label> <input type="text" name="id_usuarioEdit"></p>
   <button type="submit">Editar Usuario</button>
</form>

</body>
</html>