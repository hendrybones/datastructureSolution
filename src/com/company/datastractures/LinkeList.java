package com.company.datastractures;

import org.w3c.dom.Node;

public class LinkeList {
     static Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }//constructor
        public static void main(String[] args)
        {
            LinkeList list=new LinkeList();
            list.push(10);
            list.push(5);
            list.append(4);
            list.insertAfter(list.head.next,7);
            list.printList();

        }

    }

    private void printList() {
        Node n= head;
        while (n != null){
            System.out.println(n.data + " ");
            n=n.next;
        }
    }
    //adding data in front
    private void push(int new_data){
        //allocate the node and put the data
        Node new_node=new Node(new_data);
        // make the next of new node as head
        new_node.next=head;

        //make new node as the head
        head=new_node;
    }
    private void append(int new_data){
        /*
        allocate the node
        put in the data
        set next node null
        */
        Node new_node= new Node(new_data);

       /* 4. If the Linked List is empty, then make the
        new node as head */
        if (head==null){
            head =new Node(new_data);
            return;
        }
        else {
            new_node.next=null;// the next of this new node is going to be null
            // traverse till the last node
            Node last=head; //. this checks if the head is the last node if not move next
            while (last.next !=null){
                last=last.next;
                // change the last of the next
                last.next=new_node;
                return;
            }

        }

    }
    public  void insertAfter(Node prev_node,int new_data){
        if (prev_node==null){
            System.out.println("the given previous cannot be null");
        }
        //allocate the new node and put data
        Node new_node=new Node(new_data);
        //make the next of new_node as next the previos node
        new_node.next=prev_node.next;
         //make new of previous node as new node
        prev_node.next=new_node;

    }
    private void deleteNode(int key){

        //store head node
        Node temp= head, prev = null;
        // if head node itself hold the data to be deleted
        if (temp!=null & temp.data==key){
            head=temp.next;// changed head
        }
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp !=null & temp.data !=key){
            prev =temp;
            temp= temp.next;
        }
        

    }
}
