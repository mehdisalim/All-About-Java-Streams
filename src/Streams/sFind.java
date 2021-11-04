package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 04/11/2021
 */

public class sFind {

    Stream<DataModel> stream = new Streams().getStream();
    List<DataModel> list;

    // Constructor with No Args
    public sFind(){
        this.list =new ListOfData().getData();
    }

    /**
     * Use this method to find the first element
     * @return Optional<DataModel>
     */
    public Optional<DataModel> findAny(){
        return stream.findAny();
    }

    /**
     * Use this method to find the first element
     * @return Optional<DataModel>
     */
    public Optional<DataModel> findFirst(){
        return stream.findFirst();
    }
}
