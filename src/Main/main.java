package Main;


import FakeData.DataModel;
import Streams.sFilter;
import org.junit.platform.engine.support.hierarchical.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class main {
    static sFilter filter=new sFilter();

    public static void main(String[] args){
        //TODO: printData(filter.filterByAge(30));      ----> get Data By Age
        //TODO: printData(filter.filterByName("m"));    ----> get Data By Name
        //TODO: printData(filter.filterByCity("Ag".toLowerCase()));  ----> get Data By City


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

}
