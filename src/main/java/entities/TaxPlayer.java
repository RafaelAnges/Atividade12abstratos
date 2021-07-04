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
public abstract class TaxPlayer {
    private String name;
    private double anualIncome;
    
    public TaxPlayer(){
       
    }
    
    public TaxPlayer(String name, double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }
    
    public abstract double tax();
    
}
