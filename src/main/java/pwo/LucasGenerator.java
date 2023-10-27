/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author student
 */
public class LucasGenerator {
    public static long[] generateLucasSequence(int n) {
        long[] sequence = new long[n];
        sequence[0] = 2; // pierwszy wyraz ciągu
        sequence[1] = 1; // drugi wyraz ciągu

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2]; // wyliczanie kolejnych wyrazów ciągu
        }

        return sequence;
    }

    public static void saveLucasSequenceToFile(long[] sequence, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (long num : sequence) {
                writer.write(String.valueOf(num));
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisywania ciągu Lucasa do pliku: " + e.getMessage());
        }
    }
}