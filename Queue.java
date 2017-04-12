public class Queue {
  
  Node frontofQueue = null; 
  Node rearofQueue = null;
  
  
  public class Node {
    String value; //Variables for the Queue
    Node next;
    
    Node(String v, Node n) { //Constructor in Node class
      next = n;
      value = v;
    }
    
    Node(String v) {
      this(v, null); 
    }
  }
  
  
  
  public void enqueue(String data) { //This adds items to the front of the queue
    if(rearofQueue != null) {
      rearofQueue.next = new Node(data, null);
      rearofQueue = rearofQueue.next;
    }
    else {
      rearofQueue = new Node(data, null);
      frontofQueue = rearofQueue;
    }
  }
  
  
  
  public String dequeue(){ //This takes away an item from the queue
    if(isEmpty()){
      System.out.println("This queue is empty");
      return null;
    }
    else {
      String dequeuedValue = frontofQueue.value; 
      frontofQueue = frontofQueue.next; 
      
      if (frontofQueue == null) {
        rearofQueue = null;
      }
      
      return dequeuedValue; 
    }
  }
  
  
  public int getLength(){ //needed for main method
    int size = 0; 
    Node nodeLength = frontofQueue;
    
    while(nodeLength != null) {
      size++;
      nodeLength = nodeLength.next;
    }
    return size; 
  }
  
  
  
  public boolean isEmpty(){
    return frontofQueue == null; //if empty, set front to null
  }
  
  
  
  public String peek() { //Only views the item in a queue, doesn't remove it
    if(isEmpty()){
      System.out.println("This queue is empty"); 
           return null;}
    return frontofQueue.value;
  }
  
  

  public void printQueue(){ //prints the whole queue in order 
    Node printNode = frontofQueue;
    
    while(printNode != null){
      System.out.println(printNode.value); 
      printNode = printNode.next; 
    }
  }
}