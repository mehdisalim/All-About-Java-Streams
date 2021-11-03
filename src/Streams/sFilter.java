package Streams;

import FakeData.DataModel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

public class sFilter {

    /** Get Instance Of Streams Class */
    Streams streams=new Streams();

    //TODO: Filter Method return Predicate Value and Predicate return DataModel

    /**
     * Filter Data using Age Args to find data
     * @param age
     * @return list of Data
     */
    public List<DataModel> filterByAge(int age){
        return streams.getStream()
                .filter(dataModel -> dataModel.getAge() <= age)
                .collect(Collectors.toList());
    }

    /**
     * Filter Data using Name Args to find data
     * @param name
     * @return List Of Data
     */
    public List<DataModel> filterByName(String name){
        return streams.getStream()
                .filter(dataModel -> dataModel.getName().contains(name))
                .collect(Collectors.toList());
    }

    /**
     * Filter Data using City Args to find data
     * @param city
     * @return List Of Data
     */
    public List<DataModel> filterByCity(String city){
        return streams.getStream()
                .filter(dataModel -> dataModel.getCity().contains(city))
                .collect(Collectors.toList());
    }

    /**
     * We can use Predicate Object to defined
     * condition inside Filter Method
     * @return List Of Data
     */
    public List<DataModel> filterMethod1(){
        Predicate<DataModel> s = dataModel -> dataModel.getName().contains("S");
        return streams.getStream()
                .filter(s)
                .collect(Collectors.toList());
    }

    /**
     * We Can Use Boolean Variable inside Filter Method
     * and return boolean true Or false
     * */
    public List<DataModel> filterMethod2(){
        return streams.getStream()
                    .filter(dataModel -> {
                        /* Boolean B */
                        boolean d = dataModel.getName().contains("d");
                        return d;
                    })
                    .collect(Collectors.toList());
    }

    /**
     * We Can Use Also multi filter in stream
     * @return List Of Data
     */
    public List<DataModel> MultiFilters(){
        return streams.getStream()
                .filter(dataModel -> dataModel.getName().equals("m"))
                .filter(dataModel -> dataModel.getAge()<30)
                .filter(dataModel -> dataModel.getCity().contains("ag"))
            //  ... you can add more filter methods
                .collect(Collectors.toList());
    }

    /**
     * In this case Stream going to return all Data
     * Because the Condition is True
     * --> By Default : The Condition is Always True
     *
     * @return List Of Data
     */
    public List<DataModel> filterByBoolean_True(){
        return streams.getStream()
                .filter(dataModel -> true)
                .collect(Collectors.toList());
    }

    /**
     * In this case Stream will not return any things
     * Because the Condition is False
     * @return List Of Data
     */
    public List<DataModel> filterByBoolean_False(){
        return streams.getStream()
                .filter(dataModel -> false)
                .collect(Collectors.toList());
    }

    /**
     * We can Use Boolean Condition inside Filter Method
     * If One of this Condition doesn't equal true then the stream will be return false
     * then No data
     * @return List Of Data
     */
    public List<DataModel> filterByBoolean_Condition(){
        return streams.getStream()
                .filter(dataModel -> 1==1)              // The Condition is True
                .filter(dataModel -> "s".equals("s"))   // The Condition is True
                .filter(dataModel -> "s"!="s")          // The Condition is False
                .collect(Collectors.toList());
    }

    /**
     * Also you can use Override Test Method From Predicate Class
     * @return List Of Data
     */
    public List<DataModel> filterByOverrideMethod (){
        return streams.getStream()
                .filter(new Predicate<DataModel>() {
                    @Override
                    public boolean test(DataModel dataModel) {

                        // Just Put any Condition you want and return it By ** return ** statement
                        // For Example :

                        /*
                        * boolean condition = dataModel.getAge() <= 30;
                        * return condition;
                         */
                        return dataModel.getAge()<=30;

                    }
                })
                .collect(Collectors.toList());
    }

}
