public final class LinkedBag <T> implements BagInterface <T>

{

private Node firstNode; 

private int numberOfEntries;

public LinkedBag()

{

firstNode = null;
numberOfEntries = 0;

} 


public boolean isEmpty()

{

return numberOfEntries == 0;

} 
public int getCurrentSize()

{

return numberOfEntries;

} 

public boolean add(T newEntry) 
{


Node newNode = new Node(newEntry);

newNode.next = firstNode; 
firstNode = newNode; 
numberOfEntries++;
return true;

} 


public T[] toArray()

{


@SuppressWarnings("unchecked")

T[] result = (T[]) new Object[numberOfEntries]; 

int index = 0;

Node currentNode = firstNode;

while ((index < numberOfEntries) && (currentNode != null))

{

result[index] = currentNode.data;

index++;

currentNode = currentNode.next;

} 

return result;

} 

public int getFrequencyOf(T anEntry)

{

int frequency = 0;

int counter = 0;

Node currentNode = firstNode;

while ((counter < numberOfEntries) && (currentNode != null))

{

if (anEntry.equals(currentNode.data))

{

frequency++;

} 

counter++;

currentNode = currentNode.next;

} 

return frequency;

} 

public boolean contains(T anEntry)

{

boolean found = false;

Node currentNode = firstNode;

while (!found && (currentNode != null))

{

if (anEntry.equals(currentNode.data))

found = true;

else

currentNode = currentNode.next;

} // end while

return found;

} 

private Node getReferenceTo(T anEntry)

{

boolean found = false;

Node currentNode = firstNode;

while (!found && (currentNode != null))

{

if (anEntry.equals(currentNode.data))

found = true;

else

currentNode = currentNode.next;

} 

return currentNode;

} 

public void clear()

{

while (!isEmpty())

remove();

} 

public T remove()

{

T result = null;

if (firstNode != null)

{

result = firstNode.data;

firstNode = firstNode.next; 

numberOfEntries--;

} 

return result;

} 

public boolean remove(T anEntry)

{

boolean result = false;

Node nodeN = getReferenceTo(anEntry);

if (nodeN != null)

{

nodeN.data = firstNode.data; 

firstNode = firstNode.next; 

numberOfEntries--;

result = true;

} 

return result;

} 

private class Node

{

private T data; 

private Node next; 

private Node(T dataPortion)

{

this(dataPortion, null);

} 

private Node(T dataPortion, Node nextNode)

{

data = dataPortion;

next = nextNode;

} 

} 

@Override
public BagInterface <T> union(BagInterface <T> Bag2) {
   BagInterface <T> result = new LinkedBag < >();
       T[] others = Bag2.toArray();
   for (T elem : others) {
   result.add(elem);
   }
   T[] mine = this.toArray();
   for (T elem : mine) {
   result.add(elem);
   }
   return result;
}

@Override
public BagInterface < T > intersection(BagInterface < T > Bag2) {
       BagInterface < T > result = new LinkedBag < >();
       BagInterface < T > finalResult = new LinkedBag < >();
   T[] mine = this.toArray();
   for (T elem : mine) {
   result.add(elem);
   }
   T[] others = Bag2.toArray();
   for (T elem : others) {
   if(result.contains(elem)){
       finalResult.add(elem);
   }
   }
   return finalResult;
}

@Override
public BagInterface <T> difference(BagInterface <T> Bag2) {
       BagInterface <T> result = new LinkedBag < >();
   T[] mine = this.toArray();
   for (T elem : mine) {
   result.add(elem);
   }
   T[] others = Bag2.toArray();
   for (T elem : others) {
   if(result.contains(elem)){
       result.remove(elem);
   }
   }
   return result;
}

} 
