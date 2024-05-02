package com.infnet.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/math")
public class MathController {

    // Endpoint para adição
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public Double add(
            @RequestParam(value = "numberOne") String numberOne,
            @RequestParam(value = "numberTwo") String numberTwo
    ){
        return Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
    }

    // Endpoint para subtração
    @RequestMapping(value = "/subtract", method = {RequestMethod.GET, RequestMethod.POST})
    public Double subtract(
            @RequestParam(value = "numberOne") String numberOne,
            @RequestParam(value = "numberTwo") String numberTwo
    ){
        return Double.parseDouble(numberOne) - Double.parseDouble(numberTwo);
    }

    // Endpoint para multiplicação
    @RequestMapping(value = "/multiply", method = {RequestMethod.GET, RequestMethod.POST})
    public Double multiply(
            @RequestParam(value = "numberOne") String numberOne,
            @RequestParam(value = "numberTwo") String numberTwo
    ){
        return Double.parseDouble(numberOne) * Double.parseDouble(numberTwo);
    }

    // Endpoint para divisão
    @RequestMapping(value = "/divide", method = {RequestMethod.GET, RequestMethod.POST})
    public Double divide(
            @RequestParam(value = "numberOne") String numberOne,
            @RequestParam(value = "numberTwo") String numberTwo
    ){
        return Double.parseDouble(numberOne) / Double.parseDouble(numberTwo);
    }

    // Endpoint para exponenciação
    @RequestMapping(value = "/power", method = {RequestMethod.GET, RequestMethod.POST})
    public Double power(
            @RequestParam(value = "base") String base,
            @RequestParam(value = "exponent") String exponent
    ){
        return Math.pow(Double.parseDouble(base), Double.parseDouble(exponent));
    }
}
