 

class CircularArrayQueue { 

    public static final int CAPACITY = 5;   

    private int[] data; // integer array used for storage 

    private int f = 0; // front pointer 

    private int r = 0; // rear pointer 

    private int N; // Queue max. size 
    private int sz;

    public CircularArrayQueue() { 

        this(CAPACITY); 

        N = CAPACITY; 

    } // constructs the queue with default capacity 

 

    public CircularArrayQueue(int capacity) {   

        data = new int[capacity]; 

        N = capacity; 

    } 

 public int getsize(){
    return sz;
 }

 

public void enCqueue(int e) { 
if (f==(r+1)%N){
    System.out.println("Circular Queue Overflow");
}else{
    data[r]=e;
     r=(r+1)%N;
    sz++;
}

} 

 

public int deCqueue() { 
    if(isEmpty()){
        System.out.println("Circular Queue is empty");
        return -1;
    }else{
       
        int result = data[f]; 
        f=(f+1)%N; 
        sz--;
        return result;
       
    }
    


   
          

     } 


public int peek(){
    
    if(isEmpty()){
        System.out.println("Circular Queue is empty");
        return -1;
    }else{
       return data[f];
    }
    
}


 

 


 

//is queue empty? 

public boolean isEmpty() { 
boolean result;
 if(f==r){
       result = true;
       return result;
 } else{
    return false;
 }


 

} 

 

//print all queue members 

public void display() { 
if(sz==0){
        System.out.println("Circular Queue is empty");
        System.out.println("No. of elements in CQ = 0");

}else{
 System.out.println("Q-list: ");
for(int i=0; i<sz; i++){
    System.out.print(data[(f+i)%N]+ "->");

}
System.out.println();
System.out.println("No. of elements in CQ = "+ sz);
}
 

 

 

} 

} 