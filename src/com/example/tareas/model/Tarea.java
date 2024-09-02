
package com.example.tareas.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinalizacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioAsignado;

    // Getters y Setters
    // ...
}

enum Estado {
    PENDIENTE,
    EN_PROGRESO,
    COMPLETADA
}
