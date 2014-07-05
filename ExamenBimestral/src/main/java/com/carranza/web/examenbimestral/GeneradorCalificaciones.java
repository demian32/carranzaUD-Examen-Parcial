/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carranza.web.examenbimestral;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {
    
    public static ArrayList<Evaluacion> Generarcalificaciones(){
        ArrayList<Evaluacion> lista= new ArrayList<Evaluacion>();
        
        Evaluacion ev;
        ev=new Evaluacion("Petra", (float) 5.8);
        lista.add(ev);
         
        ev=new Evaluacion("Jose", (float) 7.4);
        lista.add(ev);
        ev=new Evaluacion("Roberta", (float) 8.6);
        lista.add(ev);
        return lista;
    }
    
}
