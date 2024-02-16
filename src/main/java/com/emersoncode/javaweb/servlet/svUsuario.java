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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="svUsuario" , value = "/svUsuario" )
public class svUsuario extends HttpServlet {

  Controladora control = new Controladora();
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    listaUsuarios = control.traerUsuario();

    HttpSession miSesion = request.getSession();
    miSesion.setAttribute("listaUsuarios", listaUsuarios);

    response.sendRedirect("mostrarUsuarios.jsp");

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String dni = request.getParameter("dni");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String telefono = request.getParameter("telefono");

    Usuario usu = new Usuario();
    usu.setDni(dni);
    usu.setNombre(nombre);
    usu.setApellido(apellido);
    usu.setTelefono(telefono);

    control.crearUsuario(usu);

    response.sendRedirect("index.jsp");

  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }
}