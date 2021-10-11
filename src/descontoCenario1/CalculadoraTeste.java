package descontoCenario1;

import java.math.BigDecimal;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1100"), 2);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calculaDesconto(orcamento));
    }
}
