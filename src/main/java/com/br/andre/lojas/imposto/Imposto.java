package com.br.andre.lojas.imposto;

import com.br.andre.lojas.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(final Orcamento orcamento);
}
