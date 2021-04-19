package animal_shop_management;

public class Animal {

    private String name;       // these all are our data member.........
    private String catagory;
    private String color;
    private String gender;
    private String type;

    // here are our constructor....................................
    public Animal(String name, String catagory, String color, String gender, String type) {
        this.name = name;
        this.catagory = catagory;
        this.color = color;
        this.gender = gender;
        this.type = type;
    }

// here declare getter method of name data member.......
    public String getName() {
        return name;
    }
// here declare setter method of name data member.......

    public void setName(String name) {
        this.name = name;
    }
// here declare getter method of catagory data member.......

    public String getCatagory() {
        return catagory;
    }
// here declare setter method of catagory data member.......

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    /// here declare getter method of color data member.......
    public String getColor() {
        return color;
    }
// here declare setter method of color data member.......

    public void setColor(String color) {
        this.color = color;
    }

    // here declare getter method of gender data member.......
    public String getGender() {
        return gender;
    }
    // here declare setter method of gender data member.......

    public void setGender(String gender) {
        this.gender = gender;
    }

    // here declare getter method of type data member.......
    public String getType() {
        return type;
    }
// here declare setter method of type data member.......

    public void setType(String type) {
        this.type = type;
    }

    // here are display method............................
    void printanimal() {
        System.out.println("Catagory is:   " + catagory + "\n"
                + "Name is: " + name + "\n"
                + "Gender is:  " + gender + "\n"
                + "Color is:  " + color + "\n"
                + "Type is:  " + type + "\n\n");
    }

}
