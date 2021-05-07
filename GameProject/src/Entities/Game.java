package Entities;

public class Game {
    int id;
    String name;
    String developer;
    double unitPrice;
    String description;
    String language;

    public Game(int id, String name, String developer, double unitPrice, String description, String language) {
        this.id = id;
        this.name = name;
        this.developer = developer;
        this.unitPrice = unitPrice;
        this.description = description;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
