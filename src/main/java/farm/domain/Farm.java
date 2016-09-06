package farm.domain;

/**
 * Created by benjamin on 2016/08/30.
 */
public class Farm {
    
    private long id;
    private String address;
    private String name;
    
    
    public Farm() {
    
    }
    
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    


    @Override
    public String toString() {
        return "Farm{" +
                "id=" + id +
                '}';
    }
}
