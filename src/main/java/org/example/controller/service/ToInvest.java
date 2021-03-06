package org.example.controller.service;
import org.example.model.TextColors;
import org.example.model.Investment;
import org.example.views.show.ShowYields;

import java.util.List;

public class ToInvest {
    public static void run(List<Investment> listInvestment) {
        for (int i = 0; i < listInvestment.size(); i++) {
            System.out.print(TextColors.GREEN);
            System.out.printf("%-10s %-25s %-30s %-20s %n", "Item", "Data do investimento", "Nome", "Tipo de produto");
            System.out.printf("%-10d %-25s %-30s %-20s %n",i+1, listInvestment.get(i).getDateInvested(),
                    listInvestment.get(i).getProduct().getName(),
                    listInvestment.get(i).getProduct().getProductType().getLabel());
            System.out.print(TextColors.RESET);

            Calculator.run(listInvestment.get(i));
            ShowYields.run(listInvestment.get(i), listInvestment.get(i).getYield(), listInvestment.get(i).getPriceIof(),
                    listInvestment.get(i).getProfitStockbroker(), listInvestment.get(i).getPriceIR(),
                    listInvestment.get(i).getPriceTotalYieldNet(), listInvestment.get(i).getPriceTotalYield());
        }
    }
}
