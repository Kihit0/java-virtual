package service;



import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;


public class CountService {
    private final HashSet<String> setWord = new HashSet<>();
    private final List<String> word;

    public CountService(String data){
        this.word = Arrays.stream(data.split(" ")).filter(e -> e.length() > 1).toList();
        this.setWord.addAll(this.word);
    }

    public int getCount(){
        return this.word.size();
    }

    public String getLongWord(){
        String longWord = "";
        for(String word: setWord){
            if(word.length() > longWord.length()){
                longWord = word;
            }
        }

        return longWord;
    }

    public Map<String, Integer> getCountWords(){
        return this.word.stream().collect(Collectors.toMap(
                e -> e,
                e -> 1,
                Integer::sum
        ));
    }

}
