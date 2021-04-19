package animal_shop_management;

import java.util.Scanner; // here import scanner.

public class main {

    public static void main(String[] args) {
        // these are object of Customer class...
        Customer c1 = new Customer(01, "sajib Bin Mamun", "Shafipur", 1628778041,
                "male", "Bird", "Parrot", 1750, 3);
        Customer c2 = new Customer(02, "Nasim Mahmud Likhon", "Rajshahi", 1755132180,
                "Male", "Bird", "Magpie", 1750, 3);
        Customer c3 = new Customer(03, "Akhy", "Savar", 1628778041,
                "Female", "Bird", "Pigeon", 1750, 3);

        //this is object of shopmanagement class............
        shopmanagement s1 = new shopmanagement("Friends Animal Shop", "DIU__Asulia");

        //it is our title of project.........
        System.out.print("\n\t\t                             ##                              ");
        System.out.print("\n\t\t                           ######                            ");
        System.out.print("\n\t\t                      ################                       ");
        System.out.print("\n\t\t                   ######################                    ");
        System.out.print("\n\t\t           ######################################            ");
        System.out.print("\n\t\t    ####################################################     ");
        System.out.print("\n\t\t&&......................***************....................&&");
        System.out.print("\n\t\t|.....                                                 .....|");
        System.out.print("\n\t\t|....           Animal Shop Management System            ...|");
        System.out.print("\n\t\t|..........             Powered by                   .......|");
        System.out.print("\n\t\t|***....****                                     ***....****|");
        System.out.print("\n\t\t|                           **                              |");
        System.out.print("\n\t\t|                        ********                           |");
        System.out.print("\n\t\t|                     **************                        |");
        System.out.print("\n\t\t|***....****            Team Snowy                    **..**|");
        System.out.print("\n\t\t|***....****            ||      ||                  ***...**|");
        System.out.print("\n\t\t|******....*******....**||      ||.*******....*******...****|");
        System.out.print("\n\t\t|#######################||......||##########################|\n");

        System.out.println("\n");
        s1.Displayshop();  // here call display method from shopmanagement class.....
        System.out.println("\n\n");

        // these all are objects of animal class.............
        Animal a1 = new Animal("Parrot", "Bird", "Green", "male", "adult");
        Animal a2 = new Animal("Magpie", "Bird", "black", "male", "adult");
        Animal a3 = new Animal("pigeon", "Bird", "brown", "male", "adult");
        //here call all add method...........
        s1.AddAnimals(a1);
        s1.AddAnimals(a2);
        s1.AddAnimals(a3);

        //these for to take user input...............
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Search Animal ");
            System.out.println("2. Sell Details ");
            System.out.println("3. Remove Animals ");
            System.out.println("4. Exit");
            System.out.println("\n");
            System.out.print("\t\tChose your option : ");

            int a = input.nextInt(); // it is for user input.........
            System.out.println("\n");
            System.out.print("\t\tYou have choosen option : " + a + "\n\n");

            //if the user input will 4, the program also will be closed........
            if (a == 4) {
                break;
            }

            //here declare switch case............
            switch (a) {
                case 1:
                    s1.print_all_animal();   // here call display function from shopmanagement class.......
                    break;
                case 2:
                    System.out.println("\n\n");

                    // here call display method from customer class......
                    c1.printcustomer();
                    c2.printcustomer();
                    c3.printcustomer();
                    break;
                case 3:
                    s1.removeanimal(a1);  //here call remove method..........
                    s1.print_all_animal();// here print all data after delete from shopmanagement class........

                    break;
                default:
                    System.out.println("Chose Correct word"); // if user input is wrong, here will print this message.........
                    break;
            }

        }

    }

}
