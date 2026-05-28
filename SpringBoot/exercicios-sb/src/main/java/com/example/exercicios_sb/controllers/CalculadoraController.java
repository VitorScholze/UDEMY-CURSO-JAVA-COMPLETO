package com.example.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    //2 EXERICICIOS:
    // /calculadora/somar/10/20
    // /calculadora/subtrair?a=100&b=39

    @GetMapping("/somar/{num1}/{num2}")
    public int somar(@PathVariable int num1,@PathVariable int num2){
        return num1 + num2;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a")int num1 ,@RequestParam(name = "b") int num2){
        if(num1 > num2){
            return num1 - num2;
        }else{
            return num2 - num1;
        }
    }

}
