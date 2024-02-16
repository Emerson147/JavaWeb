package com.emersoncode.javaweb.servlet;


import com.emersoncode.javaweb.logica.Controladora;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "svEliminar", value = "/svEliminar")
public class svEliminar extends HttpServlet {

  Controladora control = new Controladora();


  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
     int id_eliminar = Integer.parseInt(request.getParameter("id_usuario"));
     control.eliminarUsuario(id_eliminar);

     response.sendRedirect("index.jsp");

  }


}