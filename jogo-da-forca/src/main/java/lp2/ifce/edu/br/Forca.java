package lp2.ifce.edu.br;

import java.util.HashSet;
import java.util.Set;

public class Forca {

    private String word;
    private Set<String> letters;
    private String hiddenWord;

    public Forca(String word) {
        this.word = word;
        this.hiddenWord = word.replaceAll(".", "*");
        this.letters = new HashSet<>();
    }

    public void add(String letter) {

        this.letters.add(letter);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                var hidden = new StringBuilder(hiddenWord);
                hidden.setCharAt(i, letter.charAt(0));

                hiddenWord = hidden.toString();
            }
        }

    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public Set<String> getLetters() {
        return letters;
    }

    public boolean isWinner() {
        return hiddenWord.equals(word) && letters.size() <= 6;
    }

    public int getQtyLetters() {
        return word.length();
    }
}
