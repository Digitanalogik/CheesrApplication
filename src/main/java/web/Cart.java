package web;


public class Cart implements java.io.Serializable {

    private List<Cheese> cheeses new ArrayList<Cheese>();
    private Address billingAddress = new Address();

    public List<Cheese> getCheeses() {
        return this.cheeses;
    }

    public void setCheeses(List<Cheese> other) {
        this.cheeses = other;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public double getTotal() {
        double total = 0;
        for (Cheese cheese : this.cheeses) {
            total += cheese.getPrice();
        }
        return total;
    }
}
