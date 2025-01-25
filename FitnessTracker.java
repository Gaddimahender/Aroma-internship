import java.util.*;

public class FitnessTracker
	{
    static class Workout 
	 {
        String type;
		double duration;
		int calories;
        Workout(String t, double d, int c) 
			{
			type = t;
			duration = d;
			calories = c;
			}
public String toString() 
	{
	return type + " | " + duration + " hrs | " + calories + " kcal"; 
	 }
         }
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);
        List<Workout> workouts = new ArrayList<>();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int choice;
        do {
              System.out.println("1. Log Workout  2. View Workouts  3. Exit");
              choice = sc.nextInt();
			  sc.nextLine();
            if (choice == 1) 
				{
                System.out.print("Workout type: "); 
				String type = sc.nextLine();
                System.out.print("Duration (hrs): "); 
                double duration = sc.nextDouble();
                System.out.print("Calories burned: "); 
				int calories = sc.nextInt(); 
				sc.nextLine();
                workouts.add(new Workout(type, duration, calories));
                }
else if (choice == 2) workouts.forEach(System.out::println);
        }
		while (choice!= 3);
        System.out.println("Goodbye, " + name + "!");
    }
}