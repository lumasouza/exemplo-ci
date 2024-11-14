package school.sptech.atv_cicd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.atv_cicd.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    @PostMapping("/divisao/{a}/{b}")
    public ResponseEntity<Double> dividir(@PathVariable double a,@PathVariable Double b) {
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }
}
