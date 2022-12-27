/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.linked.list;



/**
 *
 * @author rawda
 */
public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }
    public boolean isEmpty(){
    
    return (head==null);
    }
    public void insertFirst(int Newvalue)
    {
        Node Newnode=new Node(Newvalue);
       
        if(isEmpty()){
            Newnode.Data=Newvalue;
            Newnode.Next=null;
            head=Newnode;
            }
        else{
            Newnode.Data=Newvalue;
            Newnode.Next=head;
            head=Newnode;
            }
    }
    public void Display(){
    Node Temp=head;
    while(Temp!=null){
        System.out.print(Temp.Data+"   ");
        Temp=Temp.Next;
    }
        System.out.println();
    
    }
     public int Counter(){
         int Counter=0;
    Node Temp=head;
    while(Temp!=null){
                Counter++;
        Temp=Temp.Next;
    }
       return Counter;
    
    }
      public boolean isFound(int key){
          boolean found=false;
    Node Temp=head;
    while(Temp!=null&&found!=true){
        if(Temp.Data!=key)
        Temp=Temp.Next;
        else
        { found=true;}
        
    }
        return found;
    
    }
      
//      public void insertBefore(int item,int newvalue){
//          if(isFound(item)){
//      Node temp=head;
//      while(temp!=null&&temp.Next.Data!=item)
//      {
//      temp=temp.Next;
//      }
//      Node newnode=new Node(newvalue);
//      newnode.Data=newvalue;
//      newnode.Next=temp.Next;
//      temp.Next=newnode;}
//          else
//          { System.out.println("Sorry, item is not found");}
//      
//      }
       public void insertLast(int newvalue){
    
    if(isEmpty()){
    
    insertFirst(newvalue);
    }
    else{
    
    Node Temp=head;
    while(Temp.Next!=null){
    Temp=Temp.Next;
    
    }
        Node newnode=new Node(newvalue);
        newnode.Data=newvalue;
       Temp.Next=newnode;
       newnode.Next=null;
    }
    }
       public void Delete(int item){
       if(isEmpty()){
           System.out.println("List is empty, no items to delete");
       }//delete from first
              Node delptr=head;// delete lint 
       if(head.Data==item){
       head=head.Next;
           System.out.println("node which i deleted : data = "+delptr.Data+" next = "+delptr.Next);
       
       }
       else{
       Node prev=null;
       delptr=head;
       while(delptr.Data!=item){
           prev=delptr;
       delptr=delptr.Next;
       }
       prev.Next=delptr.Next;
        System.out.println("node which i deleted : data = "+delptr.Data+" next = "+delptr.Next);

       }
       //delete last
       
       
       
       
       }
       public void DeleteLast(){
            
         Node delptr=head;// delete lint 

       if(isEmpty()){
           System.out.println("List is empty, no items to delete");
       }
        while(delptr.Next.Next!=null){

       delptr=delptr.Next;
        
        }
        delptr.Next=null;

        
       
       
       }
       
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
