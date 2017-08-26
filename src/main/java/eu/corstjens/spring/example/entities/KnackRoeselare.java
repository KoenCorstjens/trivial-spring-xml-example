package eu.corstjens.spring.example.entities;


public class KnackRoeselare implements Team {
    private String name= "Knack Roeselare";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
