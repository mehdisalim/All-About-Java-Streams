package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.util.List;
import java.util.stream.*;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 04/11/2021
 */

public class sMap {

    Stream<DataModel> stream =new Streams().getStream();
    List<DataModel> list;

    public sMap(){
        this.list=new ListOfData().getData();
    }

    public List<String> map(){
        return stream.map(DataModel::getName).collect(Collectors.toList());
    }

    public List<Object> MultiMap(){
        return stream
                .mapMulti(
                        (dataModel, consumer)
                                -> consumer.accept(dataModel.getName())
                )
                .collect(Collectors.toList());
    }

    public IntStream MapToInt(){
        return stream
                .mapToInt(DataModel::getAge);
    }

    public IntStream MultiMapToInt(){
        return stream
                .mapMultiToInt((dataModel, intConsumer) -> intConsumer.accept(dataModel.getAge()));
    }

    public DoubleStream MapToDouble(){
        return stream
                .mapToDouble(DataModel::getAge);
    }

    public DoubleStream MultiMapToDouble(){
        return stream
                .mapMultiToDouble((dataModel, intConsumer) -> intConsumer.accept(dataModel.getAge()));
    }

    public LongStream MapToLong(){
        return stream
                .mapToLong(DataModel::getAge);
    }
    public LongStream MultiMapToLong(){
        return stream
                .mapMultiToLong((dataModel, intConsumer) -> intConsumer.accept(dataModel.getAge()));
    }
}
