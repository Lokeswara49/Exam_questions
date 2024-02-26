package com.company;
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        this.link=null;
    }
}
public class reverseLL {
    public static void main(String[] args) {
        int n=2;
        Node head=new Node(1);
        Node curr=head;
        while(n<11){
            Node temp=new Node(n);
            curr.link=temp;
            n++;
            curr=temp;
        }
        curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.link;
        }
        Node prev=null;
        curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.link;
            curr.link=prev;
            prev=curr;
            curr=next;


        }
        System.out.println("");
        head=prev;
        curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.link;
        }




    }
}
