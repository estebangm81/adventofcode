package com.adventofcode.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommonUtils {
    public static final Integer TARGET = 2020;
    public static final String PUZZLE_INPUT = "resources/input_days_1_2.txt";

    public static Map<Integer, Integer> readPuzzleInput() {
        Map<Integer, Integer> numbers = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(PUZZLE_INPUT))) {
            String line;
            while ((line = br.readLine()) != null) {
                numbers.put(Integer.valueOf(line), Integer.valueOf(line));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return numbers;
    }
}
