public class Stack {
  public class Node {
    String value; 
    Node next; 
    
    Node(String v, Node n){
      value = v;
      next = n;
    }
       Node(String v){
         this(v, null);
       }
  }
  
  Node top = null; 
  
  
  public boolean isEmpty(){
    return top == null; 
  }
  
  
  public int getLength(){
       int size = 0;
       Node lengthNode = top;
      
       while(lengthNode != null) {
           size++;
           lengthNode = lengthNode.next; 
       }
       return size; 
   }
  
   public void push(String data) {
       top = new Node(data, top); 
   }
  
   public String pop() {
       if(isEmpty()) {
         System.out.println("The Stack is empty.");
           return null;
       }
       else {
        String poppedValue = top.value; 
           top = top.next;
           return poppedValue; 
      }
   }
  
   public String peek(){
     if(isEmpty()){
           System.out.println("The Stack is empty."); 
           return null; 
       }
      else {
           return top.value; 
       }
   }
  
   public void printForward(){
       Node printNode = top; 
      while(printNode != null){
           System.out.println(printNode.value); 
           printNode = printNode.next; 
       }
   }
}
