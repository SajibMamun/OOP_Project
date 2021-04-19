package animal_shop_management;

// here Customer class inherit Accounts class....
public class Customer extends Accounts {

    private int sellno;
    private String cus_name;
    private String Address;
    private int phone;
    private String gender;

    //here declare constructor......
    public Customer(int sellno, String cus_name, String Address, int phone, String gender, String type, String name, int price, int quantity) {
        super(type, name, price, quantity);  // here declare super  to take data data member from Accounts class....
        this.sellno = sellno;
        this.cus_name = cus_name;
        this.Address = Address;
        this.phone = phone;
        this.gender = gender;
    }
// here declare getter method of Sellno data member.......

    public int getSellno() {
        return sellno;
    }
// here declare setter method of Sellno data member.......

    public void setSellno(int sellno) {
        this.sellno = sellno;
    }
//// here declare getter method of Cus_name data member.......

    public String getCus_name() {
        return cus_name;
    }
//// here declare setter method of Cus_name data member.......

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }
// // here declare getter method of Address data member.......

    public String getAddress() {
        return Address;
    }
// here declare setter method of Address data member.......

    public void setAddress(String Address) {
        this.Address = Address;
    }

    // here declare getter method of phone data member.......
    public int getPhone() {
        return phone;
    }
// here declare setter method of phone data member.......

    public void setPhone(int phone) {
        this.phone = phone;
    }
// here declare getter method of gender data member.......

    public String getGender() {
        return gender;
    }
// here declare setter method of gender data member.......

    public void setGender(String gender) {
        this.gender = gender;
    }

    // here is our display method.......
    void printcustomer() {
        System.out.println("Number of Sell:  " + sellno + "\n"
                + "Customer Name:  " + cus_name + "\n"
                + "Customer Address:  " + Address + "\n"
                + "Customer Gender: " + gender + "\n"
                + "Phone Number:  +880" + phone);
        //here call display method from Accounts class...
        super.displayprice();
    }

}
