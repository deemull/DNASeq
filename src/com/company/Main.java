package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        int numGen = random.nextInt(4);
        String nucleo = "";

        StringBuilder dnaSeq = new StringBuilder("AGTTC");

        if (numGen == 0) {
            nucleo = "A";
        }
        else if (numGen == 1) {
            nucleo = "T";
        }
        else if (numGen == 2){
            nucleo = "C";
        }
        else if (numGen == 3) {
            nucleo = "G";
        }


        dnaSeq.setCharAt(numGen, nucleo.charAt(numGen));

        System.out.println(dnaSeq);
    }
}
