package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class sCollect {
    Stream<DataModel> stream=new Streams().getStream();
    List<DataModel> list;

    public sCollect(){
        this.list=new ListOfData().getData();
    }

    /**
     * Collect Data As List Form
     * @return List Of Data
     */
    public List<DataModel> collectAsList(){
        return stream.filter(o -> true ).collect(Collectors.toList());
    }

    /**
     * Collect Data As Collection Form
     * @return Collection Of Data
     */
    public Collection<DataModel> collectAsCollection(){
        return stream.filter(o -> true ).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Collect Data As Set Form
     * @return Set Of Data
     */
    public Set<DataModel> collectAsSet(){
        return stream.filter(dataModel -> true).collect(Collectors.toSet());
    }

    /**
     * Collect Data As UnmodifiableSet Form
     * @return Set Of Data
     */
    public Set<DataModel> collectAsUnModifiableSet(){
        return stream.filter(dataModel -> true).collect(Collectors.toUnmodifiableSet());
    }

    /**
     * Collect Data As unmodifiableList Form
     * @return List Of Data
     */
    public List<DataModel> collectAsUnModifiableList(){
        return stream.filter(dataModel -> true).collect(Collectors.toUnmodifiableList());
    }

    /**
     * Collect Data As List Form
     * @return List Of Data
     */
    public List<DataModel> collectByToListMethod(){
        return stream.filter(dataModel -> true).toList();
    }

    /**
     * Collect Data As Array Form
     * @return Object Of Data
     */
    public Object[] collectByToArrayMethod(){
        return stream.filter(dataModel -> true).toArray();
    }

}
