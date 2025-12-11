package controller;

import detector.RuleEngine;
import simengine.Transaction;
import simengine.TransactionGenerator;

public class Main {

    public static void main(String[] args) {

        TransactionGenerator generator = new TransactionGenerator();
        RuleEngine detector = new RuleEngine();

        System.out.println("------ FRAUD DETECTION SIMULATION STARTED ------");

        for (int i = 1; i <= 20; i++) {

            boolean fraud = (i % 5 == 0); // generate fraud every 5th transaction
            Transaction t = generator.generate(fraud);

            boolean flagged = detector.isFraudulent(t);

            System.out.println(t);
            System.out.println("FLAGGED BY SYSTEM: " + flagged);
            System.out.println("-----------------------------------------------");
        }

        System.out.println("------ SIMULATION COMPLETED ------");
    }
}
