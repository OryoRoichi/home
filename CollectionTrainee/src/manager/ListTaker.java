package manager;

import services.IOService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListTaker {
    List<String> list;
    IOService service;

    public ListTaker() {
        this.list = new ArrayList<>();
        this.service = new IOService();
    }

    void fill(){
        service.write("введите элементы через запяткую");
        String[] arr = service.readString().split(",");
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
    }
}
