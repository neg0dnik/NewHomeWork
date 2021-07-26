package Leeson4.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Банан", "Огурец", "Арбуз", "Арбуз", "Помидор",
                "Капуста", "Банан", "Свекла", "Огурец", "Тыква",
                "Тыква", "Арбуз", "Свекла", "Банан", "Картошка",
                "Картошка", "Тыква", "Тыква", "Горох", "Горох"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
