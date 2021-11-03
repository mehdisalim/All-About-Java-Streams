package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class sLimit {
    Stream<DataModel> stream=new Streams().getStream();
    List<DataModel> list;

    // Constructor with No Args
    public sLimit(){
        this.list=new ListOfData().getData();
    }

    /**
     * This Method return Stream
     * @return Stream<DataModel>
     */
    public Stream<DataModel> limit(){
        return stream.limit(10);
    }

    /**
     * this method return list of data limited  on 10
     * @return List<DataModel>
     */
    public List<DataModel> limitData(){
        int maxSize = 10;
        return stream.limit(maxSize).collect(Collectors.toList());
    }

}
