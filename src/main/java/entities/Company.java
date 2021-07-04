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
public class Company extends TaxPlayer{
    private int numberOfEmployees;
    
    public Company(){
        super();
    }
    
    public Company(String name, double anualIncome, int numberOfEmployees){
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
         if(numberOfEmployees > 10){
             return getAnualIncome() * 14 / 100;
         }
         return getAnualIncome() * 16 /100;
    }

   
}
