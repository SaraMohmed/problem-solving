package org.example.string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        String[] splitted = s.split(" ");
        return splitted[splitted.length-1].length();
    }
}
