/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.linked.list;
import java.util.Scanner;
/**
 *
 * @author rawda
 */
public class SingleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       LinkedList List=new LinkedList();
       if(List.isEmpty()){
           System.out.println("the list is Empty");
       
       }
       else{
         System.out.println("the list contains"+List.Counter());

       }
        System.out.println("Enter item to insert in the list");
        int item;
        item=input.nextInt();
       List.insertFirst(item);
       List.Display();
         System.out.println("Enter item to insert in the list");
        item=input.nextInt();
       List.insertFirst(item);
       List.Display();
       System.out.println("Enter item to insert in the list");
        item=input.nextInt();
       List.insertFirst(item);
       List.Display();
        System.out.println("the list contains"+List.Counter());
        System.out.println("Enter item to search for");
        item=input.nextInt();
        if(List.isFound(item)){
            System.out.println("item is found");
        }
        else
        {System.out.println("item is not found");}
        System.out.println("enter value to append");
        int newvalue=input.nextInt();
           List.insertLast(newvalue);
           List.Display();
           List.DeleteLast();
           List.Display();
           List.DeleteLast();
           List.Display();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//      System.out.println("Enter item and new value to insert");
//        item=input.nextInt();
//        int newnode=input.nextInt();
//        List.insertBefore(item, newnode);
//               List.Display();
    }



        
        
        
        
        
    
    
    
}
