package com.main.java.test;

/**
 * Created by gaojinsuo on 2016/12/1.
 */
public enum StatiseEnum {
    one(10,20,20){
        @Override
        public boolean in(int amount){
            return  amount>this.getMin()&&amount<this.getMax();
        }
    },
    two(20,30,30){
        @Override
        public boolean in(int amount){
            return  amount>this.getMin()&&amount<this.getMax();
        }
    };
    private int min;
    private int max;
    private int amount;
    StatiseEnum(int min, int max, int amount){
        this.min = min;
        this.max = max;
        this.amount = amount;

    }
    public StatiseEnum of(int amount){
        for(StatiseEnum statise : values()){
            if(statise.in(amount)){
                return statise;
            }
        }
        throw new RuntimeException("unknown market tactic.");
    }

    public abstract boolean in(int amount) ;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
