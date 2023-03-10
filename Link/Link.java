package Link;
import java.util.LinkedList;
import java.util.Scanner;

class Link {
    public static void main(String[] asrgs) {
        //create new list and define the scanner
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        
        //find how long the list will be
        System.out.print("How many elements are in this list: ");
        int num = sc.nextInt();
        
        //loop x times to get the input for the list
        for (int i=0; i < num; i++){
            System.out.print("Add item: ");
            String item = sc.next();
            list.add(item);
        }
        
        //output the list
        System.out.println();
        System.out.println("LinkedList: ");
        for (int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}


