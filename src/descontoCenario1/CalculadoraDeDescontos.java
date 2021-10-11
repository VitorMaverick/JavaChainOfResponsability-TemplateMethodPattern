package descontoCenario1;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    BigDecimal calculaDesconto (Orcamento orcamento) {
        Desconto desconto = new DescontoValorMaiorQueQuinhentos(new DescontoMaisDeCincoItens(new SemDesconto()));
        return desconto.calcula(orcamento);
    }
}
