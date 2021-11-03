package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class sSorted {

    Stream<DataModel> stream=new Streams().getStream();
    List<DataModel> list;

    // Constructor with No Args
    public sSorted(){
        this.list=new ListOfData().getData();
    }

    /**
     * we use sorted for order or group the data
     * @return Stream<DataModel>
     */
    public Stream<DataModel> sorted(){
        return stream.sorted();
    }

    /**
     * we use sorted for order the data By Id
     * @return List<DataModel>
     */
    public List<DataModel> sortedById(){
        return stream
                .sorted(
                        Comparator.comparing(DataModel::getId)
                )
                .toList();
    }

    /**
     * we use sorted for order the data By Name
     * @return List<DataModel>
     */
    public List<DataModel> sortedByName(){
        return stream
                .sorted(
                        Comparator.comparing(DataModel::getName)
                )
                .toList();
    }

    /**
     * we use sorted for order the data By Age
     * @return List<DataModel>
     */
    public List<DataModel> sortedByAge(){
        return stream
                .sorted(
                        Comparator.comparing(DataModel::getAge)
                )
                .toList();
    }

    /**
     * we use sorted for order the data By City
     * @return List<DataModel>
     */
    public List<DataModel> sortedByCity(){
        return stream
                .sorted(
                        Comparator.comparing(DataModel::getCity)
                )
                .toList();
    }

    /**
     * we can also use this way to sorted data
     * @return List<DataModel>
     */
    public List<DataModel> sortedByMethod(){
        Comparator<DataModel> comparing = Comparator.comparing(DataModel::getName);
        return stream
                .sorted(comparing)
                .toList();
    }

    /**
     * and you can use sorted multi time
     * @return List<DataModel>
     */
    public List<DataModel> MultiSorted(){
        return stream
                .sorted(
                        Comparator.comparing(DataModel::getCity)
                                .thenComparing(DataModel::getName)
                                .thenComparing(DataModel::getId)
                             // ...
                )
                .collect(Collectors.toList());
    }

    /**
     * this method has reversed the data
     * @return List<DataModel>
     */
    public List<DataModel> reverseSorted(){
        return stream
                .sorted(Comparator.comparing(DataModel::getName).reversed())
                .collect(Collectors.toList());
    }

    /**
     * to Compare two Objects
     * @return List<DataModel>
     */
    public List<DataModel> compareSorted(){
        return stream
                .sorted(
                        new Comparator<DataModel>() {
                            @Override
                            public int compare(DataModel o1, DataModel o2) {
                                // Just put any things you need in here
                                return 0;
                            }
                        }
                )
                .collect(Collectors.toList());
    }

}
