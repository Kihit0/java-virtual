package service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
    private final String path = String.format("%s/src/db/db.txt", System.getProperty("user.dir"));
    public String getStringWithoutFile() {
        StringBuilder text = new StringBuilder();
        try{
            BufferedReader file = new BufferedReader(new FileReader(this.path));
            text.append(file.readLine());
            file.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        return text.toString();
    }
}
