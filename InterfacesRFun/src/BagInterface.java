

public interface BagInterface<T> {
	
	
	public int getCurrentSize(); 
	//Gets the entries in the bag
	
	
	public boolean isEmpty();
	//Returns boolean value if bag is empty or not
	
	public boolean add( T newEntry);
	//new entry will be added, returns either true or false
	
	
	public T remove();//Removes an unspecified entry
	
	
	public boolean remove(T anEntry);//removes an entry from the bag if it is found once
	//will return true if the remove was successful
	
	public void clear();//removes all entries from the bag
	
	public int getFrequencyOf(T anEntry);//checks number of times entry is in the bag
	
	public boolean contains(T anEntry);//checks if entry is in bag
	 
	public T[] toArray(); // allocates an array of all entries in the bag
	
	public BagInterface <T> union(BagInterface <T> otherBag);
	//union of the bags
	public BagInterface <T> intersection(BagInterface <T> otherBag);
	//a new collection of overlapping collections in the bag
	public BagInterface<T> difference (BagInterface<T> otherBag);
}   // the leftover collection of objects after intersection
	
	
	
	
	
   
	
   

	



