package com.vallegrande.edu.reto_09_pipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/Hola")
    public @ResponseBody String hola() {
        return "Esta aplicacion esta hecha con spring boot - reto de Valle Grande";
    }

}
