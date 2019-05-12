package task4.strategy;

public class StrategyClient {
    Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.execute();
    }
}
