
package com.example.tareas.servlet;

import com.example.tareas.service.TareaService;
import com.example.tareas.model.Tarea;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/tareas")
public class TareaServlet extends HttpServlet {

    @Inject
    private TareaService tareaService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Tarea> tareas = tareaService.obtenerTodasLasTareas();
        request.setAttribute("tareas", tareas);
        request.getRequestDispatcher("/WEB-INF/jsp/tareas.jsp").forward(request, response);
    }
}
