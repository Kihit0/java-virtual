package view;

import java.util.Map;

public class View {
    public void viewCount(int word){
        System.out.printf("Количество слов в файле: %d", word);
        System.out.println();
    }

    public  void viewLongWord(String word){
        System.out.printf("Саммое длинное слово в файле: %s", word);
        System.out.println();
    }

    public void viewCountWord(Map<String, Integer> words){
        for (Map.Entry<String, Integer> word: words.entrySet()){
            String name = word.getKey().substring(0, 1).toUpperCase() + word.getKey().substring(1);
            System.out.printf("Название: %s - Количество: %d", name, word.getValue());
            System.out.println();
        }
    }
}
