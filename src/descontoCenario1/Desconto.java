package descontoCenario1;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;
    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    BigDecimal calcula(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuaCalculo(orcamento);
        }

        return proximo.calcula(orcamento);
    }
    protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);
    abstract boolean deveAplicar(Orcamento orcamento);
}
