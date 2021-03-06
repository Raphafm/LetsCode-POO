package org.example.views.creation;
import org.example.controller.validations.ValidateWithMaxAndMin;

import java.math.BigDecimal;
import java.util.Scanner;

public class QuizInvestorProfile {
    private static final String[][] QUESTIONS = {
            {"(1) Qual o seu principal objetivo ao investir seu dinheiro?",
                    "1 - Preservar meu patrimônio assumindo um menor risco.",
                    "2 - Uma combinação entre preservação do patrimônio e sua valorização.",
                    "3 - Maximizar o potencial de ganho assumindo um maior risco."},
            {"(2) Como você descreveria a sua expectativa de renda futura para os próximos 5 anos?",
                    "1 - Minha renda deve diminuir devido à aposentadoria, mudança de emprego, diminuição de faturamento, etc.",
                    "2 - Minha deve se manter estável.",
                    "3 - Minha renda deve aumentar devvido a uma promoção, novo emprego, aumento de faturamento, etc."},
            {"(3) De quanto em quanto tempo você checa suas aplicações",
                    "1 - Pelo menos uma vez a cada seis meses.",
                    "2 - Não tem muita regularidade, mais ou menos a cada dois ou três meses.",
                    "3 - Pelo menos uma vez por mês."},
            {"(4) Sobre a sua experiência, é possível afirmar:",
                    "1 - Não possuo experiência sobre mercado financeiro.",
                    "2 - Tenho experiênca em mercado financeiro e algumas vezes preciso de orientação profissional antes de investir.",
                    "3 - Tenho vasto conhecimento em mercado financeiro e sinto seguro ao investir sem orientação profissional"},
            {"(5) Por conta das oscilações do mercado, considere que seus investimentos percam 10% do valor aplicado. Neste caso, o que você faria?",
                    "1 - Não sei o que faria.",
                    "2 - Tiraria todo o dinheiro.",
                    "3 - Manteria o dinheiro.",
                    "4 - Colocaria mais dinheiro."},
            {"(6) Com que frequência você acompanha o mercado financeiro?",
                    "1 - Raramente, só quando uma notícia chama muito a minha atenção.",
                    "2 - Pelo menos uma vez por semana eu tento me atualizar.",
                    "3 - Todos os dias leio pelo menos um pouquinho sobre o assunto."}};

    public static int quiz(Scanner sc){
        int answer;
        int answerFinal = 0;
        for (String[] question : QUESTIONS) {
            do {
                System.out.println("-----------------------------------------------------------------");
                for (String s : question) {
                    System.out.println(s);
                }
                System.out.print("Resposta: ");
                answer = ValidateWithMaxAndMin.run(sc, BigDecimal.valueOf(1),BigDecimal.valueOf(question.length - 1)).intValue();
            } while (!(answer >= 1 && answer <= question.length - 1));
            answerFinal += answer;
            sc.nextLine();
        }
        System.out.println("-----------------------------------------------------------------");

       return answerFinal;
    }
}
