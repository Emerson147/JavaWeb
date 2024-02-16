package com.emersoncode.javaweb.servlet;


import com.emersoncode.javaweb.logica.Controladora;
import com.emersoncode.javaweb.logica.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "svEditar", value = "/svEditar")
public class svEditar extends HttpServlet {

  Controladora control = new Controladora();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    int id_editar = Integer.parseInt(request.getParameter("id_usuarioEdit"));
    Usuario usu = control.traerUsuario(id_editar);

    HttpSession miSesion = request.getSession();
    miSesion.setAttribute("usuEditar", usu);

    response.sendRedirect("editarUsuario.jsp");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String dni = request.getParameter("dni");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String telefono = request.getParameter("telefono");

    Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");
    usu.setDni(dni);
    usu.setNombre(nombre);
    usu.setApellido(apellido);
    usu.setTelefono(telefono);

    control.editarUsuario(usu);

    response.sendRedirect("index.jsp");

  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }
}