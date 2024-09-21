package ENZO_PRADO.primeirob.listas.listasete;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Gerente extends Funcionario  {

    public Gerente(String nome, Integer idade, Endereco endereco, Loja loja, double salariBase, List<Double> salarioRecebido){
        super(nome, idade, endereco, loja, salariBase, salarioRecebido);
    }

    @Override
    void apresentarse(){
        System.out.println("Sou o Gerente ".concat(getNome()).concat("\nTenho: ") + getIdade() + " anos"
        .concat("\nE sou da loja: " ).concat(loja.nomeFantasia));
    }

    @Override
     void calcularBonus(){
        Locale locale = new Locale("pt", "BR");  
        double bonus;

        bonus = salariBase * 0.35;

        NumberFormat formatador = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Bonus recebido: " + formatador.format(bonus));
    }

}