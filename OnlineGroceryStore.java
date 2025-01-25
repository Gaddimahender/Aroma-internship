import java.util.ArrayList;
import java.util.List;

// Represents a product
class Product
{
	String name;
    double price;

    // Constructor
    Product(String name, double price)
		{
        this.name = name;
        this.price = price;
       }

    // Display product details
    public String toString() 
		{
        return name + ": $" + price;
      }
}

// Represents the grocery store
class GroceryStore 
	{
    List<Product> products = new ArrayList<>();

    // Add a new product
    void addProduct(String name, double price) 
		{
        products.add(new Product(name, price));
    }

    // List all products
    List<Product> listProducts() 
		{
        return products;
    }
}

// Main class
public class OnlineGroceryStore 
	{
    public static void main(String[] args) 
		{
        GroceryStore store = new GroceryStore();

        // Add products to the store
        store.addProduct("Milk",1.3);
        store.addProduct("Bread",0.5);
        store.addProduct("Banana",1.5);

        // Print all available products
        System.out.println("Available Products:");
        for (Product product : store.listProducts())
			{
            System.out.println(product);
        }
    }
}