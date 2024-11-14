package school.sptech.atv_cicd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
