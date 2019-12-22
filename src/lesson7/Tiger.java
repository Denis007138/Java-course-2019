package lesson7;

public class Tiger {
    private int age;
    private int cost;
    private String name;
    private String poroda;

    public Tiger() {

    }

    public Tiger(int age, String name, int cost, String poroda) {
        this.age = age;
        this.cost = cost;
        this.name = name;
        this.poroda = poroda;

    }

    public int getAge() {
        return age;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
}
