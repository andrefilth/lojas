package com.br.andre.lojas.imposto;

import com.br.andre.lojas.orcamento.Orcamento;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CalculadoraDeImpostosTest {

    @Test
    public void testarImpostoICMS(){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        final BigDecimal valorDoImposto = calculadoraDeImpostos.calcular(orcamento, new ICMS());
        Assertions.assertThat(valorDoImposto).isEqualTo(new BigDecimal("10.0"));
    }
    @Test
    public void testarImpostoISS(){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        final BigDecimal valorDoImposto = calculadoraDeImpostos.calcular(orcamento, new ISS());
        Assertions.assertThat(valorDoImposto).isEqualTo(new BigDecimal("6.00"));
    }
}