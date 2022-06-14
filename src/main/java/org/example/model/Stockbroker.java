package org.example.model;
import org.example.repository.RepositoryProducts;
import org.example.views.creation.CreateProduct;

import java.math.BigDecimal;
import java.util.Scanner;

public class Stockbroker extends User {

    public Stockbroker(String nome, String login, String senha, String cnpj) {
        super(nome, login, senha, cnpj);
        }

    public void relatorioClientes(){
        //implementar relatorio
    }

    public BigDecimal arrecadacao(){
        return BigDecimal.ZERO;
    }

    public void registerUpdate(Scanner sc){
        RepositoryProducts.save(new CreateProduct().run(sc));
    }



//    public ArrayList<Products> getProdutos() {
//        return produtos;
//    }

}
