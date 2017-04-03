public class Main{
  public static void main(Strings[] args){
    
    //Test out the DoublyLinkedList
    DoublyLinkedList testing = new DoublyLinkedList();
    
    testing.add(0,1);
    testing.add(0,2);
    testing.add(0,3);
    
    testing.print();
    System.out.println("Size: " + testing.getSize());
  }