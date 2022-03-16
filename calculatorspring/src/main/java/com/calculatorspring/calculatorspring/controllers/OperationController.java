package com.calculatorspring.calculatorspring.controllers;

import com.calculatorspring.calculatorspring.models.Operation;
import com.calculatorspring.calculatorspring.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //Esto hace que el controlador funcione a traves de springboot
public class OperationController {

    @Autowired
    Operation operation;
    @Autowired
    OperationService service;
    @GetMapping("/") //Para indicar que el método va con get (Postmapping para el post)
    public ModelAndView welcome(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("operate", operation); // Aqui asigno el valor del objeto operation a operate
        return modelAndView;
    }

    @PostMapping("calc") //con el post llamo a la accion del index
    public ModelAndView calc(Operation operation){
        int result = service.Calculate(operation);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", result);
        return modelAndView;
    }


}
