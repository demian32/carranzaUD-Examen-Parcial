/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladores;

import com.carranza.web.examenbimestral.Evaluacion;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
public class ServletExamen extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Evaluacion un;
        un= new Evaluacion("Ana", 7);
        un.ObtenerEvaluacion();
        request.setAttribute("Evaluacion", un);
        RequestDispatcher despachador= request.getRequestDispatcher("/Presentacion.jsp");
        despachador.forward(request, response);
        
    }
    
    }
    
        