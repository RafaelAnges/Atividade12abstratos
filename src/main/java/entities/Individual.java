/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rafae
 */
public class Individual extends TaxPlayer {

    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() > 20000.0) {
            return (getAnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
        }
        return (getAnualIncome() * 15 /100) - (healthExpenditures * 50 /100);
    }

}
