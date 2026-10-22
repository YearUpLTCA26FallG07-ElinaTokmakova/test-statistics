package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] scores = {60, 99, 100, 33, 37, 86, 78, 43, 100, 89};

        //average
//        public void calculate
        double sum = 0;
        int length = scores.length; //get the array length

        //loop through the elements of the array
        for (int score : scores) {
            sum += score;
        }

        // calculate average
        double avg = sum / length;

        //calculate max
        int max = scores[0];

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }

        //calculate min
        int min = scores[0];

        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }

        // calculate median
        Arrays.sort(scores);

        double median = (scores[4] + scores[5])/2;

        //final output
        System.out.println("Average test score: " + avg);
        System.out.println("The highest test score: " + max);
        System.out.println("The lowest test score: " + min);
        System.out.println("Median test score: " + Math.round(median));
    }
}
