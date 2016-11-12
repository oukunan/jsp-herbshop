/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Herb;

/**
 *
 * @author theca
 */
public class SearchHerbTypeVegetableServlet extends HttpServlet {

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
        String searchType = request.getParameter("searchType");
        String searchText1 = request.getParameter("searchText1");
        final String type = "vegetable";
        String target = "/...";
        if (searchText1 == null || searchText1.trim().length() == 0) {
            request.setAttribute("message", "");
        } else {
            if (searchType.equalsIgnoreCase("price")) {
                String searchText2 = request.getParameter("searchText2");
                try {
                    double lower = Double.parseDouble(searchText1);
                    double upper = Double.parseDouble(searchText2);
                    List<Herb> herbs = Herb.searchHerbByPrice(lower, upper,type);
                    if (herbs == null) {
                        request.setAttribute("message", "Products for specific price does not exist !!");
                    }
                    request.getSession().setAttribute("herbs", herbs); // put products to session scope
                } catch (Exception e) {
                    request.setAttribute("message", "Please enter price range with decimal number ONLY !!!");
                }
            } else if (searchType.equalsIgnoreCase("name")){
                List<Herb> herbs = Herb.searchHerbByName(searchText1,type);
                if (herbs == null) {
                    request.setAttribute("message", "Products for specific name does not exist !!");
                }
                request.getSession().setAttribute("herbs", herbs);   // put products to session scope
            }
        }

        getServletContext().getRequestDispatcher(target).forward(request, response);
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
