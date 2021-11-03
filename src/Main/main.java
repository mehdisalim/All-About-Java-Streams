package Main;


import FakeData.DataModel;
import Streams.*;
import org.junit.platform.engine.support.hierarchical.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class main {
    static sFilter filter=new sFilter();
    static sCollect collect=new sCollect();
    static sSorted sorted =new sSorted();
    static sLimit limit =new sLimit();
    static sCount count =new sCount();

    public static void main(String[] args){
        /**
         *
        //TODO: printData(filter.filterByName("m"));    ----> get Data By Name
        //TODO: List<Object> list = Arrays.asList(collect.collectByToArrayMethod());
        //TODO: collect.collectAsUnModifiableSet().forEach(System.out::println);
        //TODO: sorted.MultiSorted().forEach(System.out::println);
         */

    }

    private static void printData(List<DataModel> m) {
        List<DataModel> list = m;
        list.forEach(System.out::println);
    }

    public void AllFilterMethods(){
        filter.filterByName("mehdi");
        filter.filterByAge(30);
        filter.filterByCity("Ag");
        filter.filterMethod1();
        filter.filterMethod2();
        filter.filterByBoolean_True();
        filter.filterByBoolean_False();
        filter.filterByBoolean_Condition();
        filter.MultiFilters();
        filter.filterByOverrideMethod();
    }

    public void AllCollectMethods(){
        collect.collectAsList();
        collect.collectAsCollection();
        collect.collectAsSet();
        collect.collectAsUnModifiableSet();
        collect.collectAsUnModifiableList();
        collect.collectByToListMethod();
        collect.collectByToArrayMethod();
    }

    public void AllSortedMethods(){
        sorted.sorted();
        sorted.sortedById();
        sorted.sortedByName();
        sorted.sortedByAge();
        sorted.sortedByCity();
        sorted.sortedByMethod();
        sorted.MultiSorted();
        sorted.reverseSorted();
        sorted.compareSorted();
    }

    public void AllLimitMethods(){
        limit.limit();
        limit.limitData();
    }

    public void AllCountMethods(){
        count.count();
    }

}
