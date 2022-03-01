    import java.util.*;

    public class LinkedBagTest {

	public static void main(String[] args) {
    
	BagInterface <String> bag1 = new LinkedBag <>();
	
	BagInterface < String > bag2 = new LinkedBag <>();

	bag1.add("E");

	bag1.add("F");

	bag1.add("G");

	bag1.add("H");

	bag2.add("E");

	bag2.add("F");

	bag2.add("I");

	bag2.add("J");
	
    System.out.println("Union: ");
    
	System.out.println(Arrays.toString(bag1.union(bag2).toArray()));

	System.out.println("Intersection: ");
	
	System.out.println(Arrays.toString(bag1.intersection(bag2).toArray()));
	
	System.out.println("Difference: ");

	System.out.println(Arrays.toString(bag1.difference(bag2).toArray()));

	}

	}


