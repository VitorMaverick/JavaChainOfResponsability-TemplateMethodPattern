package descontoCenario1;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    protected SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuaCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
