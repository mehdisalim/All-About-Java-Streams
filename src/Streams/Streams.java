package Streams;

import FakeData.DataModel;
import FakeData.ListOfData;

import java.util.*;
import java.util.stream.Stream;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class Streams {
    String[] stringArray={"mehdi","Hanan","Omar","Samir","Khadija","Zineb","Mohammed","Said","khawela"};
    List<DataModel> list;
    Collection<String> collection= getAbstractCollection();
    ArrayList<String> arrayList=new ArrayList<String>();
    LinkedList<DataModel> linkedList=new LinkedList<DataModel>();

    /**
     * Constructor with No Args
     */
    public Streams() {
        this.list = new ListOfData().getData();
        arrayList.addAll(collection);
    }

    /**
     * Convert List of DataModel to Stream of DataModel
     * @return Stream<DataModel>
     */
    public Stream<DataModel> getStream(){
        return list.stream();
    }

    /**
     * Convert Array of Strings to Stream of Strings
     * @return Stream<String>
     */
    public Stream<String> getArrayStream(){
        return Arrays.stream(stringArray);
    }

    /**
     * Convert Collection Of Strings to Stream Of Strings
     * @return Stream<Stream>
     */
    public Stream<String> getCollectionStream(){
        return collection.stream();
    }

    /**
     * Convert ArrayList Of Strings to Stream Of Strings
     * @return Stream<String>
     */
    public Stream<String> getArrayListStream(){
        return arrayList.stream();
    }

    /**
     * Convert LinkedList Of DataModel To Stream Of DataModel
     * @return Stream<DataModel>
     */
    public Stream<DataModel> getLinkedListStream(){
        return linkedList.stream();
    }

    private AbstractCollection<String> getAbstractCollection() {
        return new AbstractCollection<String>() {
            @Override
            public Iterator iterator() {
                return Arrays.stream(stringArray).iterator();
            }

            @Override
            public int size() {
                return stringArray.length;
            }
        };
    }
}
