package main ;
import dataStructuresTools.SinglyLinkedList ;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList<>() ;
        list.addFirst("Hanck");
        System.out.println(list.first()) ;
    }
}