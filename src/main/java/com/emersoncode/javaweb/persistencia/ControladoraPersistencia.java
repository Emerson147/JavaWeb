package com.emersoncode.javaweb.persistencia;

import com.emersoncode.javaweb.logica.Usuario;

import java.util.List;

public class ControladoraPersistencia {

  UsuarioJpaController usuJpa = new UsuarioJpaController();

  //Operacion CREATE
  public void crearUsuario(Usuario usu) {
    usuJpa.create(usu);
  }

  //Operacion Read
  public List<Usuario> traerUsurio() {
    return usuJpa.findUsuarioEntities();
  }

  public void eliminarUsuario(int idEliminar) {
    try {
      usuJpa.destroy(idEliminar);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Usuario traerUsuario(int id_Editar) {
    return usuJpa.findUsuario(id_Editar);
  }

  public void editarUsuario(Usuario usu) {
    try {
      usuJpa.edit(usu);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
