/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carranza.web.examenbimestral;

//Activar WebMvc

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc

//Activar para configuracion. A quien inyectar independencias
@Configuration

//De donde escaneara las configuraciones
@ComponentScan("com.carranza.web.examenbimestral")

public class WebAppConfig extends WebMvcConfigurerAdapter{
    
    
    
}
