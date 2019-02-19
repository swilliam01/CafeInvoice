import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Item> newItems = new ArrayList<>();
        ArrayList<Invoice> allInvoice = new ArrayList<>();
        double subTotal = 0;
        double salesTax = 0;
        double total = 0;
    //    Invoice invoice = new Invoice();
      //  Item it = new Item();
        String response = "";
        double priceItem;
        int itemQuantity;
        boolean itemTaxable;
        double cost = 0;

        System.out.println("Enter your name: ");
        String input = keyboard.nextLine();
        System.out.println("Enter your address");
        String input2=keyboard.nextLine();
        System.out.println("Enter your date: ");
        String input3=keyboard.next();
        System.out.println("Enter account number: ");
        int num4=keyboard.nextInt();
        do {
            System.out.println("Enter item name: ");
            String itemName = keyboard.next();
            System.out.println("Enter the price: ");
            priceItem = keyboard.nextDouble();
            System.out.println("Enter the quantity: ");
            itemQuantity = keyboard.nextInt();
            System.out.println("Is the item taxable(True/False): ");
            itemTaxable = keyboard.nextBoolean();
            cost = priceItem*itemQuantity;
            if (itemTaxable==true){
                System.out.println("Enter your state: ");
                String state = keyboard.next();
                if(state.equalsIgnoreCase("MD")|| state.equalsIgnoreCase("Maryland")){
                    salesTax += (cost * 6)/100;
                }else if(state.equalsIgnoreCase("DC")){
                    salesTax += (cost * 5.30)/100;
                }else if(state.equalsIgnoreCase("VA")|| state.equalsIgnoreCase("Maryland")){
                    salesTax += (cost * 5.75)/100;
                }
                newItems.add(new Item(itemName, priceItem, itemQuantity, itemTaxable,cost));
            }else{
                newItems.add(new Item(itemName, priceItem, itemQuantity, itemTaxable,cost));

            }


            allInvoice.add(new Invoice(input3,input,input2,num4,newItems));

            System.out.println("Do you want to add more items? ");
            response = keyboard.next();
            keyboard.nextLine();
        } while (!response.equalsIgnoreCase("no"));

        System.out.println("------------------------------------------------------");
        for (Invoice invoice1 : allInvoice) {
            System.out.println("Customer Name: " + invoice1.getCustomerName() +"\n"
                    +"Date:" + invoice1.getDate() + "\n" +
                    "Email Address: " + invoice1.getAddress());
        }
        System.out.println("------------------------------------------------" + "\n");
        System.out.println("Item Name"+"\t"+"\t"+"\t"+"\t"+"Price"+"\t"+"\t"+"\t"+"\t"+"Quantity"+"\t"+"\t"+"\t"+"\t"+"Taxable"
                +"\t"+"\t"+"\t"+"\t"+ "Cost");
        NumberFormat formatter = new DecimalFormat("#0.00");

        for(Item i : newItems){
            System.out.println(i.getName() +"\t"+"\t"+"\t"+"\t"+ i.getPrice() +"\t"+"\t"+"\t"+"\t"+ i.getQuantity()
                    +"\t"+"\t"+"\t"+"\t"+ i.isTaxable()+"\t"+"\t"+"\t"+"\t"+ i.getCost() );
            subTotal +=i.getSubTotal();
            total=subTotal;
        }
        System.out.println("SubTotal: " + subTotal);
        if(salesTax>0){
            System.out.println("SalesTax: " + formatter.format(salesTax));
            System.out.println("-------------------------------------------------");
            total=subTotal+salesTax;
            System.out.println("Total: " + formatter.format(total));
        }else{
            System.out.println("Total: " + formatter.format(total));

        }
    }
}
