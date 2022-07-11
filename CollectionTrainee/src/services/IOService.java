package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOService {
    BufferedReader reader;

    public IOService() {
        this.reader = new BufferedReader( new InputStreamReader(System.in));
    }

    public String readString(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            write("Reading ERROR");
            return readString();
        }
    }
    public int readInt (){
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            write("Reading ERROR");
            return readInt();
        }
    }
    public void write(String message){
        System.out.println(message);
    }
}
