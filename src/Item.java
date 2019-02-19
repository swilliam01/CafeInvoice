import java.util.ArrayList;

public class Item{
    private String name;
    private double price;
    private int quantity;
    private boolean taxable;
    private double cost;

    public Item() {
    }

    public Item(String name, double price, int quantity, boolean taxable, double cost) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public ArrayList InvoiceItems(ArrayList<Item> invoiceItems) {
        return InvoiceItems(invoiceItems);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost(int quantity, double price){
        double cost = quantity * price;

        return cost;
    }
    public double getSubTotal(){
        double subTotal=0;
        subTotal+= getCost(quantity,price);
        return subTotal;
    }
}
