package FakeData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class ListOfData {

    // List Of Data
    public List<DataModel> getData(){
        List<DataModel> list=new ArrayList<>();
        list.add(new DataModel(1,"Omar",20,"Agadir".toLowerCase()));
        list.add(new DataModel(2,"Hassan",25,"Casablanca".toLowerCase()));
        list.add(new DataModel(3,"Khadija",17,"Tanger".toLowerCase()));
        list.add(new DataModel(4,"Yassin",10,"Rabat".toLowerCase()));
        list.add(new DataModel(5,"Mehdi",23,"Dakhela".toLowerCase()));
        list.add(new DataModel(6,"Fatima",30,"Fes".toLowerCase()));
        list.add(new DataModel(7,"Zineb",28,"Casablanca".toLowerCase()));
        list.add(new DataModel(8,"Ahmed",21,"MARRAKECH".toLowerCase()));
        list.add(new DataModel(9,"Mohammed",35,"RABAT".toLowerCase()));
        list.add(new DataModel(10,"Mariam",24,"Agadir".toLowerCase()));
        return list;
    }
}
