/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.GOF;

/**
 *
 * @author Sveta
 */
public class ConcreteStrategyNameSec implements Strategy {
 
    public String execute(String fam, String name, String second) {
        System.out.println("Called ConcreteStrategNameSec");
        return name+" "+second;  // Do an addition with a and b
    }
}