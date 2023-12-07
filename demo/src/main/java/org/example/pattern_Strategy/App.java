package org.example.pattern_Strategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Context context = new Context();
        /*context.process(1);
        System.out.println("-------------------------------");
        context.process(2);
        System.out.println("-------------------------------");
        context.process(3);
        System.out.println("-------------------------------");
        context.process(8);
        System.out.println("-------------------------------");*/
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
    while (!fin){
        System.out.print("Donnez la stratégy classe name: ");
        String strategyClassName = sc.nextLine();
        //instancie strategy pour connaître className d'Interface qu'on va uitliser
        IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
        context.setStrategy(strategy);
        System.out.println("-------------------------------");
        context.processStrategy();

    }
        context.processStrategy();
        System.out.println("-------------------------------");
        //avec la composition, on peut switcher. Sans cette ligne, on a que par défault
        context.setStrategy(new StrategyImpl1());

        context.processStrategy();
        System.out.println("-------------------------------");
        context.setStrategy(new StrategyImpl2());

        context.processStrategy();
        System.out.println("-------------------------------");
        context.setStrategy(new StrategyImpl3());

        context.processStrategy();
        System.out.println("-------------------------------");

        //NullepointerExcepion : car   la ligne strategy.applyStrategy(); pointer sur un Obj n'a pas encore créé => strategy = null
    }
}
