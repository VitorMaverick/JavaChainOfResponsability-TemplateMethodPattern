package descontoCenario1;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto {

    public DescontoMaisDeCincoItens(Desconto proximo) { super(proximo); }

    @Override
    public BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQtdItens() > 5;
    }


}
