import java.util.*;  
public class Inventory {  
    static Map<String, Integer> items = new HashMap<>();  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        while (true) {
System.out.println("1. Add 2. Remove 3. View 4. Exit");  
            int choice = sc.nextInt();  
            if (choice == 4) break;
System.out.print("Item: "); String item = sc.next();  
            if (choice == 1) items.put(item, items.getOrDefault(item, 0) + 1);  
            else if (choice == 2) items.put(item, Math.max(0, items.getOrDefault(item, 0) - 1));
else if (choice == 3) System.out.println(items);  
        }  
        sc.close();  
    }  
}