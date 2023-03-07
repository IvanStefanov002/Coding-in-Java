package Lectures;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class WordFilterAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] wordsArr = Arrays.stream(sc.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), wordsArr));

    }
}
