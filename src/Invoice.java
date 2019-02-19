import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.ArrayList;

public class Invoice extends Item {
    private String date;
    private String customerName;
    private String  address;
    private int account;
    private ArrayList<Item> invoiceItems = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String date, String customerName, String address, int account, ArrayList<Item> invoiceItems) {
        this.date = date;
        this.customerName = customerName;
        this.address = address;
        this.account = account;
        this.invoiceItems = invoiceItems;
    }

    public Invoice(String name, double price, int quantity, boolean taxable, double cost)
    {
        super(name, price, quantity, taxable, cost);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public ArrayList<Item> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(ArrayList<Item> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

}
