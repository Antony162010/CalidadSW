package unmsm.edu.pe.calidadsw.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import unmsm.edu.pe.calidadsw.dao.DAOFactory;
import unmsm.edu.pe.calidadsw.dao.design.IEventDAO;
import unmsm.edu.pe.calidadsw.dao.model.Event;

/**
 *
 * @author antony
 */
@WebServlet(name = "events", urlPatterns = { "/events" })
public class EventManagementServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(EventManagementServlet.class.getName());
    static IEventDAO eventDAO = DAOFactory.getInstance().getEventDAO();

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // String accion = request.getParameter("accion");
        // int id = Integer.parseInt(request.getParameter("id"));

        // if (accion.equals("publicar")) {
        // if (eventDAO.publish(id)) {
        // System.out.println("Evento publicado con exito");
        // request.getRequestDispatcher("eventManagement.jsp").forward(request,
        // response);
        // } else {
        // System.out.println("Error en la operacion");
        // request.getRequestDispatcher("eventManagement.jsp").forward(request,
        // response);
        // }
        // }

        List<Event> elements;
        try {
            elements = eventDAO.read();
            request.setAttribute("eventos", elements);
            request.getRequestDispatcher("eventManagement.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String startDate = request.getParameter("start-date");
        String endDate = request.getParameter("end-date");
        List<Event> elements;
        try {
            elements = eventDAO.search(startDate, endDate);
            request.setAttribute("eventos", elements);
            request.getRequestDispatcher("eventManagement.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
