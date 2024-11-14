package school.sptech.atv_cicd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
    public void testDividir() {
        // Cenário
        CalculadoraService calculadoraService = new CalculadoraService();
        Double a = 10.0;
        Double b = 2.0;
        Double esperado = 5.0;

        // Ação
        Double resultado = calculadoraService.dividir(a, b);

        // Verificação
        assertEquals(esperado, resultado);
    }

    @Test
    @DisplayName("Quando acionado com 10 e 0, então deve lançar uma exceção")
    public void testDividirPorZero() {
        // Cenário
        CalculadoraService calculadoraService = new CalculadoraService();
        Double a = 10.0;
        Double b = 0.0;
        var expectedMessage = "400 BAD REQUEST \"Não é possível dividir por zero\"";

        // Ação
        ResponseStatusException exception = assertThrows(
            ResponseStatusException.class,
            () -> calculadoraService.dividir(a, b)
        );


        // Verificação
        assertEquals(expectedMessage, exception.getMessage());
    }
}
