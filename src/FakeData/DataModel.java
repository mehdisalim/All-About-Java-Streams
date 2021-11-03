package FakeData;

/**
 * @CreatedBy : SALIM MEHDI
 * @Date : 03/11/2021
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Annotations
 * */
@Data               // Getter and Setter
@AllArgsConstructor // Constructor with all args
// @NoArgsConstructor Constructor with no args
@ToString           // ToString Method
public class DataModel {
    int id;
    String name;
    int age;
    String city;

}
