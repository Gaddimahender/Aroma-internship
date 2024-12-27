import java.util.*;

public class AddressBook {
    public static void main(String[] args) {
        ArrayList<String> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add 2. View 3. Exit");
int choice = sc.nextInt(); sc.nextLine(); 
             if (choice == 1) { 
                System.out.print("Enter name: ");  
                contacts.add(sc.nextLine());
} else if (choice == 2) {
                contacts.forEach(System.out::println);
            } else if (choice == 3) break;
        }
    }
}