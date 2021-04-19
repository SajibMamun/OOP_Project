package animal_shop_management;

import java.util.ArrayList;  //here import Arraylist.....
import java.util.List;   //here import List..........

public class shopmanagement {

    private String shopname;  //these are our data member
    private String shopaddress;
    private List<Animal> animals; //here use List data structure

    // here is our constructor.........
    public shopmanagement(String shopname, String shopaddress) {
        this.shopname = shopname;
        this.shopaddress = shopaddress;

        animals = new ArrayList<>();
    }

    //// here declare getter method of Shopname data member.......
    public String getShopname() {
        return shopname;
    }
    //// here declare setter method of Shopname data member.......

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    //// here declare getter method of shopaddress data member.......

    public String getShopaddress() {
        return shopaddress;
    }
    //// here declare setter method of shopaddress data member.......

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }
    //// here declare getter method of animals data member in arrayList.......

    public List<Animal> getAnimals() {
        return animals;
    }

    public void AddAnimals(Animal animal) // this method use to add animal data.
    {
        animals.add(animal);
    }

    public void removeanimal(Animal animal) // this method use use to remove animal data.
    {
        animals.remove(animal);
    }

    // here are our display method..............
    public void Displayshop() {
        System.out.println("Shop Name = " + shopname);
        System.out.println("Shop address = " + shopaddress);
    }

    void print_all_animal() // here print all animal details in data list.
    {
        try {
            for (int i = 0; i < animals.size(); i++)
            {
                getAnimals().get(i).printanimal();
            }
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());  // this will print any exception.

        }
    }

}
