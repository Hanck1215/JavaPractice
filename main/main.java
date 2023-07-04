package main ;
import dataStructuresTools.SinglyLinkedList ;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList<>() ;
        list.addFirst("Hanck");
        System.out.println(list.first()) ;
        list.addFirst(true);
        System.out.println(list.first()) ;
        list.addLast(456) ;
        System.out.println(list.last()) ;
        System.out.println(list.size()) ;
        list.removeFirst() ;
        list.removeFirst() ;
        System.out.println(list.first()) ;
        System.out.println(list.last()) ;


    }
}
