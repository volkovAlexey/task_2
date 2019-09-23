package model;

import java.util.List;
import java.util.Objects;

public class Shop {
    private String name;
    private String phoneNumber;
    private TypeOfShop type;
    private int numberOfCashDesk;
    private boolean delivery;
    private List<Product> products;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(getName(), shop.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName());
    }

    public TypeOfShop getType() {
        return type;
    }

    public void setType(TypeOfShop type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfCashDesk() {
        return numberOfCashDesk;
    }

    public void setNumberOfCashDesk(int numberOfCashDesk) {
        this.numberOfCashDesk = numberOfCashDesk;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
