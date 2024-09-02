
package com.example.tareas.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String rol;

    @OneToMany(mappedBy = "usuarioAsignado")
    private List<Tarea> tareas;

    // Getters y Setters
    // ...
}
