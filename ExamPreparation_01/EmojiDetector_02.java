package ExamPreparation_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        long coolThreshold = 1;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                int number = Integer.parseInt(symbol + ""); //преобразуване от char->String->int
                coolThreshold *= number;
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);

        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        //съвкупност от текстовете, които отговарят на нашия шаблон
        //matcher = ["::Smiley::", "**Tigers**", "::Mooning::"]

        int countValidEmojis = 0; //брой на въведените готини емоджита
        List<String> coolEmojis = new ArrayList<>();
        while (matcher.find()) { //true -> намерено валидно емоджи
            countValidEmojis++;
            int coolLevelCurrentEmoji = 0; //ниво на готиност на текущото емоджи
            String emoji = matcher.group("emoji");
            for (char symbol : emoji.toCharArray()) {
                coolLevelCurrentEmoji += (int) symbol; //добавя ASCII кода
            }
            if (coolLevelCurrentEmoji >= coolThreshold) {
                coolEmojis.add(matcher.group()); //връща целия текст, който отговаря на шаблона
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n", countValidEmojis);
        coolEmojis.forEach(System.out::println);
    }
}
