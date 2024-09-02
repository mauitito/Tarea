
package com.example.tareas.service;

import javax.ejb.Stateful;

@Stateful
public class UsuarioSesion {

    private Long usuarioId;

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void logout() {
        usuarioId = null;
    }
}
