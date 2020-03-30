package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        int numGen = random.nextInt(4);
        StringBuilder dnaSeq = new StringBuilder("AGTTC");
        System.out.println(dnaSeq);
        for (int i = 0; i < dnaSeq.length(); i++) {
            if (numGen == 0) {
                dnaSeq.setCharAt(numGen, 'A');
            }
            else if (numGen == 1) {
                dnaSeq.setCharAt(numGen, 'T');
            }
            else if (numGen == 2) {
                dnaSeq.setCharAt(numGen, 'C');
            }
            else if (numGen == 3) {
                dnaSeq.setCharAt(numGen, 'G');
            }
        }
        DNASeq(dnaSeq, 5);
        System.out.println(dnaSeq);

    }

    public static void DNASeq(StringBuilder sequence, int numOfMutations) {
        for (int i = 0; i < numOfMutations; i++) {
            System.out.println(sequence);
        }
    }
}
