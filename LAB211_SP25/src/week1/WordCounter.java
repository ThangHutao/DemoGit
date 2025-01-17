/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author Family
 */
public class WordCounter {
    private String input;
  
    public WordCounter(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }   
        this.input = input;}
   
    
    Map<String,Integer> countWord(){
     StringTokenizer stl = new StringTokenizer(input, " ");
     HashMap<String, Integer> wordCount = new HashMap<>();
        while (stl.hasMoreTokens()) {
            String word = stl.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }     
     return wordCount; 
    } 
    Map<Character,Integer> countCharacter(){
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Count only letters and digits
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        return charCount;
    }
        // Optional: Getter for input if needed
    public String getInput() {
        return input;
    }

    // Optional: Setter for input if needed
    public void setInput(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        this.input = input;
    }
}
