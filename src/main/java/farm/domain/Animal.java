package farm.domain;

import java.time.LocalDate;


/**
 * Created by benjamin on 2016/08/30.
 */
public class Animal {
    
    private int id;
    private String breed;
    private LocalDate dateOfBirth;
    private float weight;
    private String description;
    private String type;
    boolean isVaccinated;
    boolean isParent;
    private int age;
    
    private enum Sex {
        FEMALE, MALE
    }
    
    public Animal() {
    }
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public LocalDate Age() {
        return dateOfBirth;
    }
    
    public void setAge() {
        this.age = Integer.valueOf(LocalDate.now().minusYears(dateOfBirth.getYear()).toString());
        
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public boolean isVaccinated() {
        return isVaccinated;
    }
    
    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
    
    public boolean isParent() {
        return isParent;
    }
    
    public void setParent(boolean parent) {
        isParent = parent;
    }
    


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
