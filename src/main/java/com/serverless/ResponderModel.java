package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "peru";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Integer number1;
        Integer number2;
        Integer number3;
        Integer number4;

        Double number1sqr;
        Double number2sqr;

        Double number1cube;
        Double number2ube;

        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()) {
            return teamName;
        }

        Matcher theresaMayMatcher = Pattern.compile(".*which year was Theresa May first elected as the Prime Minister of Great Britain").matcher(question);
        if (theresaMayMatcher.matches()) {
            return "2016";
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher sumPlusMatcher = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        if (sumPlusMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumPlusMatcher.group(1)) + Integer.parseInt(sumPlusMatcher.group(2)));
        }

        Matcher compareFourNumbersMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+), (\\d+), (\\d+)").matcher(question);
        if (compareFourNumbersMatcher.matches()) {
            number1 = Integer.parseInt(compareFourNumbersMatcher.group(1));
            number2 = Integer.parseInt(compareFourNumbersMatcher.group(2));
            number3 = Integer.parseInt(compareFourNumbersMatcher.group(3));
            number4 = Integer.parseInt(compareFourNumbersMatcher.group(4));

            if (number1>number2 && number1>number3 && number1 > number4)
                return String.valueOf(number1);
            if (number2>number1 && number2>number3 && number2 > number4)
                return String.valueOf(number2);
            if (number3>number2 && number3>number1 && number3 > number4)
                return String.valueOf(number3);
            if (number4>number2 && number4>number1 && number4 > number3)
                return String.valueOf(number4);
        }

        Matcher compareMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (compareMatcher.matches()) {
            number1 = Integer.parseInt(compareMatcher.group(1));
            number2 = Integer.parseInt(compareMatcher.group(2));
            return String.valueOf( number1>number2 ? number1 : number2);
        }

        Matcher compareMultipliedMatcher = Pattern.compile(".*what is (\\d+) multiplied by (\\d+)").matcher(question);
        if (compareMultipliedMatcher.matches()) {
            number1 = Integer.parseInt(compareMultipliedMatcher.group(1));
            number2 = Integer.parseInt(compareMultipliedMatcher.group(2));
            return String.valueOf( number1*number2);
        }

        Matcher primeMatcher = Pattern.compile(".*which of the following numbers are primes: (\\d+), (\\d+)").matcher(question);
        if (primeMatcher.matches()) {
            number1 = Integer.parseInt(primeMatcher.group(1));
            number2 = Integer.parseInt(primeMatcher.group(2));

            return String.valueOf(isPrime(number1) ? number1 : number2);
        }


        Matcher compareSquareCubeMatcher = Pattern.compile(".*which of the following numbers is both a square and a cube: (\\d+), (\\d+)").matcher(question);
        if (compareSquareCubeMatcher.matches()) {
            number1 = Integer.parseInt(compareSquareCubeMatcher.group(1));
            number2 = Integer.parseInt(compareSquareCubeMatcher.group(2));

            number1sqr = Math.sqrt(number1);
            number2sqr = Math.sqrt(number2);

            number1cube = Math.cbrt(number1);
            number2ube = Math.cbrt(number2);

            return String.valueOf(((number1sqr % 1 == 0) && (number1cube % 1 == 0)) ? number1 : number2);
        }
        return teamName;
    }

    public boolean isPrime(Integer num){

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}