package org.example.pattern_Strategy;

public class DefaultStrategyImpl implements IStrategy{
    @Override
    public void applyStrategy() {
        System.out.println("Step intermediare  of the Algorithm  by default....");
    }
}
