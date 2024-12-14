package org.example.string;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] freqs = new int[26];
        int[] freqt = new int[26];
        for(char c : s.toCharArray()){
            freqs[c-'a']++;
        }
        for(char c : t.toCharArray()){
            freqt[c-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(freqs[i] != freqt[i])
                return false;
        }
        return true;
    }
}
