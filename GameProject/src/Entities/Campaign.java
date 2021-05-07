package Entities;

public class Campaign {
    int id;
    String code;
    double discountPercent;

    public Campaign(int id, String code, double discountPercent) {
        this.id = id;
        this.code = code;
        this.discountPercent = discountPercent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDiscount() {
        return discountPercent;
    }

    public void setDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
