public class Main {
  
  public static Stack queueToStack(Queue inputQueue){
    
    Stack tempStack = new Stack();
    String [] stringArray = new String[inputQueue.getLength()]; 
    Queue.Node pushingNode = inputQueue.frontofQueue;
    
    int arrayLocation = 0; 
    
    while(pushingNode != null) {
      stringArray[arrayLocation] = pushingNode.value;
      arrayLocation++;
      pushingNode = pushingNode.next; 
    }
    for (int x = stringArray.length - 1; x >= 0; x--) {
      tempStack.push(stringArray[x]);
    }
    return tempStack; 
  }
  
  
  public static Queue stackToQueue(Stack inputStack){
    
    Queue newQueue = new Queue();
    Stack.Node queueNode = inputStack.top; 
    
    while(queueNode != null){
      newQueue.enqueue(queueNode.value); 
      queueNode = queueNode.next; 
    }
    return newQueue; 
  }
  
  
  
  public static Stack stackToStack(Stack inputStack){
    Stack duplicateStack = new Stack(); 
    String [] stringArray = new String [inputStack.getLength()];
    Stack.Node pushingSecondNode = inputStack.top;
    
    int arrayLocation = 0; 
    
    while(pushingSecondNode != null){
      stringArray[arrayLocation] = pushingSecondNode.value; 
      arrayLocation++; 
       pushingSecondNode = pushingSecondNode.next; 
     }
    
    for (int x = stringArray.length - 1; x >= 0 ; x--){
      duplicateStack.push(stringArray[x]);
    }
    
    return duplicateStack; 
  }
  
  
  
  
  public static void main(String [] args){
    Stack list = new Stack(); 
    Queue queuelist = new Queue(); 
    
    
    //testing the Stack Class
    System.out.println("Print the Stack:");
    list.push("1");
    list.push("2");
    list.push("3");
    list.push("4");
    list.push("5");
    list.printForward();
    
    String data = list.pop();
    System.out.println("\nList popped: " + data);
    System.out.println("After popping, we are left with: ");
    list.printForward();
    
    System.out.println("\nList peeked: " + list.peek());
    
    
    //test the Queue Class
    System.out.println("\nPrint the Queue: ");
    queuelist.enqueue("10");
    queuelist.enqueue("20");
    queuelist.enqueue("30");
    queuelist.enqueue("40");
    queuelist.enqueue("50");
    queuelist.printQueue();
    
    
    String data2 = queuelist.dequeue();
    System.out.println("\nDequeue: " + data2);
    System.out.println("After dequeue, Queue prints: ");
    queuelist.printQueue();
    System.out.println("\nPeek: " + queuelist.peek());
    System.out.println(queuelist.peek());
    
    
    //Initiaizing our second set of stack and queue
    Stack secondList = new Stack(); 
    Queue queuesecondList = new Queue(); 
    
    System.out.println("\nThe second stack: ");
    secondList.push("One");
    secondList.push("Two");
    secondList.push("Three");
    secondList.push("Four");
    secondList.push("Five");
    secondList.printForward();
    
    
    System.out.println("\nThis is our second Queue");
    queuesecondList.enqueue("One");
    queuesecondList.enqueue("Two");
    queuesecondList.enqueue("Three");
    queuesecondList.enqueue("Four");
    queuesecondList.enqueue("Five");
    queuesecondList.printQueue();
    System.out.println();
    
    
    System.out.println("Stack to queue: ");
    Queue testQueue3 = new Queue();
    
    testQueue3 = stackToQueue(secondList);
    System.out.println("Print Stack: ");
    secondList.printForward();
    System.out.println("\nPrint Queue: ");
    testQueue3.printQueue();
    System.out.println();
    
    System.out.println("Change Queue to Stack: ");
    Stack testStack3 = new Stack();
    
    testStack3 = queueToStack(queuesecondList);
    System.out.println("The Queue: ");
    queuesecondList.printQueue();
    System.out.println("\nThe Stack: ");
    testStack3.printForward();
    
    
    System.out.println();
    System.out.println("Change StackOne to StackTwo: ");
    Stack testStack4 = new Stack();
    
    testStack4 = stackToStack(secondList);
    System.out.println("The Stack: ");
    secondList.printForward();
    System.out.println("\nThe second Stack: ");
    testStack4.printForward();
       
  }
}