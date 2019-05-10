package task4.entity;

import java.util.Objects;

public class Beer {
    private int id;
    private int cost;
    private String name;
    private int alcoholPercentage;
    private String country;

    public Beer() {
    }

    public Beer(int id, int cost, String name, int alcoholPercentage, String country) {
        this.id = id;
        this.cost = cost;
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlcoholPercentage(int alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return alcoholPercentage == beer.alcoholPercentage &&
                name.equals(beer.name) &&
                country.equals(beer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alcoholPercentage, country);
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", alcoholPercentage=" + alcoholPercentage +
                ", country='" + country + '\'' +
                '}';
    }
}

