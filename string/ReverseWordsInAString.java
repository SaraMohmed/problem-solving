package org.example.string;

public class ReverseWordsInAString {
    public String reverseWords(String s){
        String[] splitted = s.trim().replaceAll("\\s+"," ").split(" ");
        StringBuilder rev= new StringBuilder();
        for(int i=splitted.length-1; i>=0; i--){
            rev.append(splitted[i]);
            if(i > 0)
                rev.append(" ");
        }
        return rev.toString();
    }
}
