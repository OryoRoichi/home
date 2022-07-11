package manager;

import services.IOService;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    IOService service;
    ListTaker listTaker;

    public Manager() {
        this.service = new IOService();
        this.listTaker = new ListTaker();
    }

    public void run() {
        listTaker.fill();
        Menu();
    }

    private void Menu() {
        this.service.write("choose operation");
        this.service.write("1 add");
        this.service.write("2 remove");
        this.service.write("3 printlist");
        this.service.write("4 contains");
        this.service.write("5 setElem");
        chooseOperation();
    }

    private void chooseOperation() {
        int operation = service.readInt();
        switch (operation) {
            case 1:
                this.service.write("enter elem");
                addElme(service.readString());
                Menu();
                break;
            case 2:
                this.service.write("enter removable elem");
                removeElem(service.readString());
                Menu();
                break;
            case 3:
                printlist();
                Menu();
                break;
            case 4:
                this.service.write("enter searchable elem");
                contains(service.readString());
                Menu();
                break;
            case 5:
                this.service.write("enter index of elem");
                int index = service.readInt();
                this.service.write("enter elem");
                setElem(index, service.readString());
                Menu();
                break;
            case 0:
                return;
        }
    }


    private void addElme(String elem) {
        listTaker.list.add(elem);
    }

    private void removeElem(String elem) {
        listTaker.list.remove(elem);
    }

    private void printlist() {
        System.out.println(listTaker.list);
    }

    private void contains(String elem) {
        service.write(String.valueOf(listTaker.list.contains(elem)));
    }

    private void setElem(int index, String elem) {
        listTaker.list.remove(index);
        listTaker.list.add(index, elem);
    }
}

