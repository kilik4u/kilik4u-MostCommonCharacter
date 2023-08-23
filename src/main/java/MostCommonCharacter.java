import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     * 
    public static char findMostCommonCharacter(String input) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            // If character is already in the HashMap, increment its count
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1); // Otherwise, add the character with count 1
            }
        }

        // Find the character with the highest count
        char mostCommonChar = '\0'; // Default value if input is empty
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommonChar = entry.getKey();
            }
        }  return mostCommonChar;
    }
 public static void main(String[] args) {
        String input = "abcaabbccc";
        char mostCommon = findMostCommonCharacter(input);
        System.out.println("The most common character is: " + mostCommon);
     */
    public char recurringChar(String str) {
        //create hashmaps to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        //Loop through each character in the string
        for(char c : str.toCharArray()) {
            //if character is already in the HashMap, increment its count
            if(charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else{
                charCounts.put(c, 1); //otherwise, add the character with count 1
            }
        }
        //find character with highest count
        char mostCommonChar = '\0'; //default value if input is empty
        int maxCount = 0;

        for(Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommonChar = entry.getKey();
            }
        }
        return mostCommonChar;
    }
}
