package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private final String REGEX_FOR_EXCLAMATORY_SENTENCE = "([a-zA-Z\s]+\\b!)";
    private final Pattern PATERN = Pattern.compile(REGEX_FOR_EXCLAMATORY_SENTENCE);

    public String exclamatorySentences(String text, int minWords) {
        Matcher matcher = PATERN.matcher(text);
        while (matcher.find()) {
            String sentence = matcher.group();
            String trimSentence = sentence.trim();
            String[] words = trimSentence.split("\\s+");
            if (words.length < minWords) {
                text = text.replaceAll(Pattern.quote(sentence), "");
            }
        }
        return text;
    }

    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Args Error. Uncorrect number of arguments");
            return;
        }
        String text = args[0];
        int minWord = Integer.parseInt(args[1]);

        Text testedText = new Text();
        System.out.println(testedText.exclamatorySentences(text, minWord));

    }

}
