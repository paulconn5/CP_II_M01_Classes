import java.time.Year;

/**
 * @author Paul Connolly connolpe@mail.uc.edu
 *
 */
public class Product
{
    private String name;
    private String description;
    private String ID;
    private double cost;

    public Product(String name, String description, String ID, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ID='" + ID + '\'' +
                ", cost='" + cost +
                '}';
    }


    /**
     *
     * @return return the object data in cvs format
     */
    public String toCVSRecord() {
        return name + "," + description + ", " + ID + ", " + cost + "\n";
    }
}

