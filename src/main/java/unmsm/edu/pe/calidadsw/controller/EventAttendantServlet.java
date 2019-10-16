/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unmsm.edu.pe.calidadsw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import unmsm.edu.pe.calidadsw.dao.DAOFactory;
import unmsm.edu.pe.calidadsw.dao.design.IAssistantDAO;
import unmsm.edu.pe.calidadsw.dao.design.IEventDAO;
import unmsm.edu.pe.calidadsw.dao.model.Client;
import unmsm.edu.pe.calidadsw.dao.model.Event;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "EventAttendantServlet", urlPatterns = {"/EventAttendantServlet"})
public class EventAttendantServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(EventCreationServlet.class.getName());
    static IEventDAO eventDAO = DAOFactory.getInstance().getEventDAO();
    static IAssistantDAO assistantDAO = DAOFactory.getInstance().getAssistantDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EventAttendantServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EventAttendantServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Event> events;
        try {
            events = eventDAO.read();
            request.setAttribute("events", events);
            request.getRequestDispatcher("eventAttendant.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idEvent = Integer.parseInt(request.getParameter("eventId"));
        Event ev = new Event();
        ev.setIdEvent(idEvent);

        List<Client> attendant;
        try {
            attendant = assistantDAO.readAssistantsEvent(ev);
            request.setAttribute("attendant", attendant);
            request.getRequestDispatcher("eventAttendant.jsp").forward(request, response);
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