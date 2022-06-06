import java.util.Arrays;
import java.util.Random;

public class Hall {
    Tables[] tables;

    public Hall(int tablesCount ) {
        this.tables = new Tables[tablesCount] ;
        setTables();
    }


    @Override
    public String toString() {
        return "Hall{" +'\n'+
                "tables=" + Arrays.toString(tables) +
                '}'+'\n';
    }
    @Override
    public boolean equals(Object obj) {
        int count=0;
        if(obj instanceof Hall){
            for(int i =0 ; i<((Hall) obj).tables.length;i++){
                for(int j= 0; j<this.tables.length;j++)
                if(((Hall) obj).tables[i].equals(this.tables[i])){
                    count++;
                    break;
                }
            }
            return count== this.tables.length;
        }
        return false;
    }

    public Tables[] getTables() {
        return tables;
    }
    public void setTables() {

        for (int i = 0; i <this.tables.length;i++){
            this.tables[i] = new LilT();
            if(i== this.tables.length-2|| i== this.tables.length -3){
                this.tables[i] = new MIddleT();
            }
            if(i == this.tables.length-1){
                this.tables[i] = new BigT();
            }
        }

    }
}
