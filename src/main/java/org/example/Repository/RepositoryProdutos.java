package org.example.Repository;
import org.example.Model.Produtos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryProdutos {
    private static ArrayList<Produtos> titulos;
    static Scanner sc = new Scanner(System.in);
    public static void inicializar(){
        titulos = new ArrayList<>();
        Produtos produto1 = new Produtos(1,"Tesouro Prefixado", BigDecimal.valueOf(12.38d),BigDecimal.valueOf(36.89d),BigDecimal.valueOf(737.98d), "01/01/2025");
        titulos.add(produto1);
    }

    public static ArrayList<Produtos> getTitulos() {
        return titulos;
    }
    //printa todos investimentos do repositório e suas caracteristicas e depois disso pede ao usuário para escolher um
    public static Produtos getInvestimento() {
        ArrayList<Produtos> listaDeInvestimentos =getTitulos();
        getListaDeInvestimento();
        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();
        return listaDeInvestimentos.get(escolha-1);
    }
    public static void getListaDeInvestimento() {
        ArrayList<Produtos> listaDeInvestimentos =getTitulos();
        for (Produtos investimento : listaDeInvestimentos) {
            System.out.printf("%d - Nome: %s -- Investimento Mínimo: R$ %.2f -- Preço unitário: R$ %.2f -- " +
                            "Rentabilidade anual: %.2f%% -- Vencimento: %s\n",investimento.getCode(), investimento.getNome(),
                    investimento.getInvestimentoMinimo(), investimento.getPrecoUnitario(),
                    investimento.getRentabilidadeAnual().multiply(BigDecimal.valueOf(100d)),
                    investimento.getVencimento());
        }
    }
}
