public class Tables {
    int capacity;

    public Tables(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Tables){
            return this.capacity== ((Tables) obj).capacity;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Table, Capacity = "+this.capacity+'\n';
    }
}
