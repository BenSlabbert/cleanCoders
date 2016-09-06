package farm.domain;

import java.util.Date;


/**
 * Created by benjamin on 2016/08/30.
 */
public class Animal {
    
    Date DateOfBirth;
    
    enum Sex {
        FEMALE, MALE
    }
    
    float Weight;
    String Description;
    String Type;
    
    
    
    public Animal() {
    }
    
    private long id;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
