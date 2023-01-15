import model.Orcamento;
import orcamento.CalculadoraDeDesconto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);


        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.efetuarCalculo(primeiroOrcamento));
        System.out.println(calculadora.efetuarCalculo(segundoOrcamento));
    }
}