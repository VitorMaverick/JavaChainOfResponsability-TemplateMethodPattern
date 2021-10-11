package descontoCenario1;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconto {

    public DescontoValorMaiorQueQuinhentos(Desconto proximo) { super(proximo); }

    @Override
    public BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
