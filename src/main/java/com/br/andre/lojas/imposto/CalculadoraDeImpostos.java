package com.br.andre.lojas.imposto;

import com.br.andre.lojas.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(final Orcamento orcamento, final Imposto imposto){
        return imposto.calcular(orcamento);

    }
}
