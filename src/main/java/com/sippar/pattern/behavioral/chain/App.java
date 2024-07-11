package com.sippar.pattern.behavioral.chain;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DispenseChain c1 = ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            c1.dispense(new Currency(amount));
        }

    }

    static DispenseChain  ATMDispenseChain() {
        // initialize the chain
        DispenseChain c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        return c1;
    }
}
