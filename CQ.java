import java.util.Scanner; 
class CQ { 

    public static void main(String[] args) { 

        CircularArrayQueue cq = new CircularArrayQueue(5); 

        Scanner scanner = new Scanner(System.in); 

        // Menu based Queue 

        while (true) { 

            System.out.println("1: Enqueue"); 

            System.out.println("2: Dequeue"); 

            System.out.println("3: Display"); 

            System.out.println("4: Exit"); 

            int option = scanner.nextInt(); 

            switch (option) { 

                case 1: 

                    int e = scanner.nextInt(); 

                    cq.enCqueue(e); 

                    break; 

                case 2: 

                    int delElement = cq.deCqueue(); 

                    if (delElement == -1) 

                        System.out.println("Circular Queue Underflow"); 

                    else 

                        System.out.println("Deleted element = " + 							delElement); 

                    break; 

                case 3: 

                    cq.display(); 

                    break; 

                case 4: 

                    scanner.close(); 

                    return; 

                default: 

                    System.out.println("Invaild option"); 

            } 

        } 

    } 

} 