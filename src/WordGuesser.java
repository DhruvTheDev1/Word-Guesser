import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class WordGuesser {
    public static void main(String[] args) throws Exception {
        System.out.println("----Welcome To The Guessing Game----");
        System.out.println("Pick Your Difficuly: ");
        System.out.println(
                "1. Easy - 15 chances \n2. Medium - 10 chances \n3. Hard - 8 chances \n4. Impossible - 5 chances");
        System.out.println("----------");

        Scanner scanner = new Scanner(System.in);
        int guesses = 0;
        boolean validChoice = false;

        while (!validChoice) {
            System.out.print("Difficulty: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            if (userInput == 1) {
                guesses = 15;
                validChoice = true;
            } else if (userInput == 2) {
                guesses = 10;
                validChoice = true;
            } else if (userInput == 3) {
                guesses = 8;
                validChoice = true;
            } else if (userInput == 4) {
                guesses = 5;
                validChoice = true;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        scanner.close();

        List<String> words = new ArrayList<>();

        try {
            Scanner reader = new Scanner(new File("words.txt"));
            while (reader.hasNextLine()) {
                String word = reader.nextLine();
                words.add(word);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        StringBuilder randomWord = new StringBuilder();
        Random random = new Random();
        String wordSelected = words.get(random.nextInt(words.size())); // random word selected
        randomWord = new StringBuilder("_".repeat(wordSelected.length())); // random word -> '_ _ _ _ _'

        // System.out.println(wordSelected);
        // System.out.println(randomWord);

        startGame(randomWord, guesses);
    }

    public static void startGame(StringBuilder randomWord, int guesses) {
        Scanner scanner = new Scanner(System.in);
        int remainingGuesses = guesses;
        Set<Character> guessedLetters = new HashSet<>(26);

        System.out.println("--------");
        System.out.println("--------");
        System.out.println("Lets Begin The Game");

        // user has guesses and word not guessed yet
        while (remainingGuesses > 0 && randomWord.indexOf("_") != -1) {
           // game logic
        }

    }

    
}
