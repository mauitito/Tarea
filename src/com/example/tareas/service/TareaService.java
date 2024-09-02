
package com.example.tareas.service;

import com.example.tareas.model.Tarea;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TareaService {

    @PersistenceContext
    private EntityManager em;

    public void crearTarea(Tarea tarea) {
        em.persist(tarea);
    }

    public Tarea obtenerTareaPorId(Long id) {
        return em.find(Tarea.class, id);
    }

    public List<Tarea> obtenerTodasLasTareas() {
        return em.createQuery("SELECT t FROM Tarea t", Tarea.class).getResultList();
    }

    public void actualizarTarea(Tarea tarea) {
        em.merge(tarea);
    }

    public void eliminarTarea(Long id) {
        Tarea tarea = em.find(Tarea.class, id);
        if (tarea != null) {
            em.remove(tarea);
        }
    }
}
