package queue;

import exceptions.NoSuchElementException;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private List<Integer> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    public boolean add(int elem) {
        this.list.add(elem);
        return true;
    }

    public Object element() throws NoSuchElementException {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return list.get(0);
        }
    }

    public boolean offer(int elem) {
        this.list.add(elem);
        return true;
    }

    public Object peek() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public Object poll() {
        if (list.isEmpty()) {
            return null;
        } else {
            int tmp = list.get(0);
            this.list.remove(0);
            return tmp;
        }
    }

    public Object remove() throws NoSuchElementException {
        if (list.isEmpty()) {
        throw new NoSuchElementException();
        } else {
            int tmp = list.get(0);
            this.list.remove(0);
            return tmp;
        }
    }

    public void printQ() {
        System.out.println(this.list);
    }
}
