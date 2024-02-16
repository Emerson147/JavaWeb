package com.emersoncode.javaweb.logica;

import com.emersoncode.javaweb.persistencia.ControladoraPersistencia;

import java.util.List;

public class Controladora {

  ControladoraPersistencia controlPersis = new ControladoraPersistencia();

  public void crearUsuario(Usuario usu) {
    controlPersis.crearUsuario(usu);
  }

  public List<Usuario> traerUsuario() {
    return controlPersis.traerUsurio();
  }
  public void eliminarUsuario(int id_Eliminar) {
    controlPersis.eliminarUsuario(id_Eliminar);
  }

  public Usuario traerUsuario(int id_Editar) {
    return  controlPersis.traerUsuario(id_Editar);
  }

  public void editarUsuario(Usuario usu) {
    controlPersis.editarUsuario(usu);
  }
}
