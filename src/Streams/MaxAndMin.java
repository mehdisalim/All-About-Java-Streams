package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 04/11/2021
 */

public class MaxAndMin {

    Stream<DataModel> stream = new Streams().getStream();
    List<DataModel> list;

    // Constructor with No Args
    public MaxAndMin(){
        this.list=new ListOfData().getData();
    }

    /**
     * Use this Method to get The Maximal Value in the data
     * @return Optional<DataModel>
     */
    public Optional<DataModel> max(){
        return stream.max(Comparator.comparing(DataModel::getAge));
    }

    /**
     * Use this Method to get The Minimal Value in the data
     * @return Optional<DataModel>
     */
    public Optional<DataModel> min(){
        return stream.min(Comparator.comparing(DataModel::getAge));
    }
}
