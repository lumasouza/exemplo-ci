package school.sptech.atv_cicd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.atv_cicd.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    @GetMapping("/divisao/{a}/{b}")
    public ResponseEntity<Double> dividir(@PathVariable double a,@PathVariable Double b) {
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }
}
