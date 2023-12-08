package org.example.pattern_Strategy;

import org.example.pattern_Strategy.strategy.IStrategy;

public class Context {
    private IStrategy strategy;

    public Context() {
        this.strategy = new DefaultStrategyImpl(); //new : couplage fort
    }


    public void process(int type){
        System.out.println("Step 1  of the Algorithm");
        if (type == 1) {
            System.out.println("Step intermediare  of the Algorithm with strategy 1....");
        }else if (type == 2) {
            System.out.println("Step intermediare  of the Algorithm  with strategy 2....");
        }else if (type == 3) {
            System.out.println("Step intermediare  of the Algorithm  with strategy 3....");
        }else  {
            System.out.println("Step intermediare  of the Algorithm  by default....");
        }
        System.out.println("Step end  of the Algorithm ....");


    }
    public void processStrategy(){
        System.out.println("Step 1  of the Algorithm");
        strategy.applyStrategy();
        System.out.println("Step end  of the Algorithm ....");
    }
    //set strategy est très important car pendant en cour exécuter injecter, il va affecter var strategy, il va implémente cette Interface

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }

}
