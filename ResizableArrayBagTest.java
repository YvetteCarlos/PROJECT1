import java.util.Arrays;

public class ResizableArrayBagTest
{
   public static void main(String[] args)
   {
	   BagInterface < String > bag1 = new ResizableArrayBag < >();
	   BagInterface < String > bag2 = new ResizableArrayBag < >();

			bag1.add("A");
			bag1.add("N");
			bag1.add("A");
			bag1.add("C");
			bag2.add("A");
			bag2.add("N");
			bag2.add("L");
			bag2.add("C");
	
	System.out.println("Union: ");
	System.out.println(Arrays.toString(bag1.union(bag2).toArray()));
	
	System.out.println("Intersection: ");
	System.out.println(Arrays.toString(bag1.intersection(bag2).toArray()));
	
	System.out.println("Difference: ");
	System.out.println(Arrays.toString(bag1.difference(bag2).toArray()));}
}
