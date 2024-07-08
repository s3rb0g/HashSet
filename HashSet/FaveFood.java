import java.util.*;
public class FaveFood{
	public static void main(String args[]){
		
	Scanner xd = new Scanner(System.in);
	String food;
	
	Set<String> group1 = new HashSet<>();
	System.out.println("Enter the favorite food of your Mother:");
	for(int i = 1; i <= 3; i++){
		System.out.print("Food " + i + ": ");
		food = xd.next();
		group1.add(food);
	}
	
	Set<String> group2 = new HashSet<>();
	System.out.println("\nEnter the favorite food of your Father:");
	for(int j = 1; j <= 3; j++){
		System.out.print("Food " + j + ": ");
		food = xd.next();
		group2.add(food);
	}
	
	System.out.println("\nGroup 1: " + group1);
	System.out.println("Group 2: " + group2);
		
	Set<String> self = new HashSet<>();
	System.out.print("\nEnter your favorite food: ");
	food = xd.next();
	self.add(food);
		
	Set<String> union = new HashSet<>(group1);
	union.addAll(group2);
	System.out.println("\nUnion: " + union);
	
	Set<String> inter = new HashSet<>(group1);
	inter.retainAll(group2);
	System.out.println("Intersection: " + inter);
	
	Set<String> diff = new HashSet<>(group1);
	diff.removeAll(group2);
	System.out.println("Difference: " + diff);
	
	String same = (union.containsAll(self)) ? 
	"You have the same favorite food with your parents." :
	"You don't have the same favorite food with your parents.";
	
	System.out.println("\n" + same);
		
	}
}