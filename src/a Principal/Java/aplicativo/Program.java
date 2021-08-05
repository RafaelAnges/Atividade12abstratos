/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Company;
import entities.Individual;
import entities.TaxPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 aauthor rafaa
 */
/*
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais 
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, 
bem como o total de imposto arrecadado. 
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica 
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as 
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com 
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% 
destes gastos são abatidos no imposto. 
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto 
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 
funcionários, ela paga 14% de imposto. 
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 
400000 * 14% = 56000.00

*/

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPlayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.println("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (ch == 'c') {
                System.out.println("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));

            }

        }

        System.out.println("");
        System.out.println("TAXES PAID:");

        double sum = 0;
        for (TaxPlayer tax : list) {
            double tp = tax.tax();
            sum = sum + tp;
            System.out.println(tax.getName() + ": $ " + String.format("%.2f", tp));

        }
        System.out.println("");
        System.out.println("TOTAL TAXES: $" + sum);

        sc.close();
    }
}
