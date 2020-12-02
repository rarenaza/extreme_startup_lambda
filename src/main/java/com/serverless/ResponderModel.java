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

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher compareMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (compareMatcher.matches()) {
            number1 = Integer.parseInt(compareMatcher.group(1));
            number2 = Integer.parseInt(compareMatcher.group(2));
            return String.valueOf( number1>number2 ? number1 : number2);
        }
        
        return teamName;
    }

}