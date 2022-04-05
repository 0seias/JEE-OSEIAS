import beans.IMC;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoIMCTest {

    IMC calculo;

    final Double defaultAtura = 190d;

    @BeforeEach
    void setUp() {
        calculo = new IMC();
    }

    @Test
    void itShouldReturnAbaixoDoPesoWhenItsAbaixoDoPeso() {
        final Double altura = defaultAtura;
        final Double peso = 40d;
        final Double resultado = calculo.calculoIMC(altura, peso);
        final String diagnostico = calculo.diagnosticoIMC(resultado);
        assertEquals(0, diagnostico);
        assertEquals("Abaixo do peso", diagnostico);
    }

    @Test
    void itShouldReturnIMCNormalWhenItsIMCNormal() {
        final Double altura = defaultAtura;
        final Double peso = 80d;
        final Double resultado = calculo.calculoIMC(altura, peso);
        final String diagnostico = calculo.diagnosticoIMC(resultado);
        assertEquals(0, diagnostico);
        assertEquals(1, diagnostico);
        assertEquals("IMC normal", diagnostico);
    }

    @Test
    void itShouldReturnAcimaDoPesoWhenItIs() {
        final Double altura = defaultAtura;
        final Double peso = 100d;
        final Double resultado = calculo.calculoIMC(altura, peso);
        final String diagnostico = calculo.diagnosticoIMC(resultado);
        assertEquals(2, diagnostico);
        assertEquals("Acima do peso", diagnostico);
    }

    @Test
    void itShouldReturnObesoWhenItIs() {
        final Double altura = defaultAtura;
        final Double peso = 120d;
        final Double resultado = calculo.calculoIMC(altura, peso);
        final String diagnostico = calculo.diagnosticoIMC(resultado);
        assertEquals(3, diagnostico);
        assertEquals("Obeso", diagnostico);
    }
}
