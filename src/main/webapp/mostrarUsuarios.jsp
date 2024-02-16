<%@ page import="com.emersoncode.javaweb.logica.Usuario" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
   <title>Mostrar Usuarios</title>
</head>
<body>
<h1>Lista de Usuarios Registrados</h1>
<%
   List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
   int cont = 1;
   for (Usuario usuario : listaUsuarios) {
%>
<p>Id: <%=usuario.getId()%></p>
<p><b>Usuario N^ <%=cont%></b></p>
<p>Dni: <%=usuario.getDni()%></p>
<p>Nombre: <%=usuario.getNombre()%></p>
<p>Apellido: <%=usuario.getApellido()%></p>
<p>Telefono: <%=usuario.getTelefono()%></p>
<p>- - - - -- - - - -- - - - -- - - - -- - - - -- - - - -</p>
<%cont = cont + 1;%>
<% } %>
</body>
</html>
