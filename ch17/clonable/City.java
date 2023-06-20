package gr.aueb.cf.ch17.clonable;

public class City implements Cloneable{

    private String name;

    public City() {}

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(City city) {
        this.name = city.getName();

    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();  // Object.clone()
    }
}
