/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;

/**
 *
 * @author theca
 */
public class RegisterMemberServlet extends HttpServlet {

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
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String name = request.getParameter("name");
        String sname = request.getParameter("surname");
        String add = request.getParameter("address");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        long postal = Long.parseLong(request.getParameter("postal"));
        String tel = request.getParameter("tel");
        Customer cust = new Customer();
        cust.setCustUsername(user);
        cust.setCustPassword(pass);
        cust.setCustName(name);
        cust.setCustSurname(sname);
        cust.setCustAddress(add);
        cust.setCustState(state);
        cust.setCustCity(city);
        cust.setCustPostal(postal);
        cust.setCustTel(tel);

        int affect = Customer.addMember(cust);
        if (affect == 0) {
            request.setAttribute("mes", "username has already been taken");
            request.setAttribute("cust", cust);
            getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
            return;
        } else {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
