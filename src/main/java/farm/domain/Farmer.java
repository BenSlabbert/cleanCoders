package farm.domain;

/**
 * Created by benjamin on 2016/08/30.
 */
public class Farmer {
    
    private long id;
    private String name;
    
    public Farmer() {
    
        
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                '}';
    }
}
