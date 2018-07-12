/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import bean.TestBean;
import entity.MultipleChoice;
import entity.TestWord;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.testDAO;

/**
 *
 * @author Wasd
 */
public class TestServlet extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String[] type= request.getParameterValues("test_type");
            
            if(type.length>1){
//               50% of multiple choice and 50% of writing 
            }else{
                if(type[0].equals("multipleChoice")){
//                    multiple choice
                    multipleChoice(request,response);
                }else{
//                    writing
                }
            }
        }
    }
    void multipleChoice(HttpServletRequest request, HttpServletResponse response) throws IOException, Exception{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String lessonID= request.getParameter("lessonID");
            List<MultipleChoice> list = new ArrayList<>();
            List<TestWord> wordList = new ArrayList<>();
            testDAO dao = new testDAO();
            wordList=dao.getWords(lessonID);
            for (int i = 0; i < wordList.size(); i++) {
                System.out.println(wordList.get(i));
            }
            for (int i = 0; i < wordList.size(); i++) {
                String question = wordList.get(i).getVietnamese();
                String ans1= wordList.get(i).getJapanese();
                String ans2= wordList.get(new Random().nextInt(wordList.size()-1)).getJapanese();
                String ans3= wordList.get(new Random().nextInt(wordList.size()-1)).getJapanese();
                String ans4= wordList.get(new Random().nextInt(wordList.size()-1)).getJapanese();
                list.add(new MultipleChoice(question,ans1,ans2,ans3,ans4));
            }
            request.setAttribute("questionList", list);
            request.getRequestDispatcher("test_question.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
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
