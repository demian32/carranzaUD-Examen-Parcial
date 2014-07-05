/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carranza.web.examenbimestral;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/examen")

public class ControladorExamen {
    
    
    @RequestMapping(value="/servicio-calificaciones", method=RequestMethod.GET, headers=("Accept=Application/json"))
    @ResponseBody ArrayList<Evaluacion> cali(){
    return GeneradorCalificaciones.Generarcalificaciones();
} 

}
