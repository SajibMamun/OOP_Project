package animal_shop_management;

public class Accounts {

    private String type;    // these are our data member..
    private String name;
    private int price;
    private int quantity;
// here declare constructor..

    public Accounts(String type, String name, int price, int quantity) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

// this getter method of type data member.
    public String getType() {
        return type;
    }

    // this setter method of type data member.
    public void setType(String type) {
        this.type = type;
    }

    //// this getter method of name data member.
    public String getName() {
        return name;
    }

    // this setter method of name data member.
    public void setName(String name) {
        this.name = name;
    }

    // // this getter method of price data member.
    public int getPrice() {
        return price;
    }

    //// this setter method of price data member.
    public void setPrice(int price) {
        this.price = price;
    }

    // this getter method of quantity data member.
    public int getQuantity() {
        return quantity;
    }

    //// this setter method of quantity data member.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // here calculate total price ..
    public int totalprice() {
        return quantity * price;
    }

    //here declare display method....
    void displayprice() {
        System.out.println("Catagory of the Animal:   " + type + "\n"
                + "Name of the Animal: " + name + "\n"
                + "Per Peice price:  " + price + "\n"
                + "Quantity of Animal:  " + quantity + "\n"
                + "Total Ammount is:   " + totalprice() + "\n\n");
    }
}
