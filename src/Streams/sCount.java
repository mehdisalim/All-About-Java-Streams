package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.util.List;
import java.util.stream.Stream;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class sCount {
    Stream<DataModel> stream=new Streams().getStream();
    List<DataModel> list;

    // Constructor with No Args
    public sCount(){
        this.list=new ListOfData().getData();
    }

    /**
     * we can use count to get count of items
     * @return long
     */
    public long count(){
        return stream.filter(dataModel -> true).count();
    }
}
