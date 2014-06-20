/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.GOF;

/**
 *
 * @author sveta
 */
// Класс контекста использующий интерфейс стратегии
public class Context {
 
    private Strategy strategy;
 
    // Constructor
    public Context() {
    }
 
    // Set new strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
 
    public String executeStrategy(String a, String b,String c) {
        return strategy.execute(a, b,c);
    }
}