package dataStructuresTools ;

public class SinglyLinkedList<E> {
    
    //------------------nested Node class--------------------
    private static class Node<E> {
        private E element ;
        private Node<E> next ;

        public Node(E e, Node<E> n) {
            this.element = e ;
            this.next = n ;
        }

        public E getElement() { return this.element ; }
        public Node<E> getNext() { return this.next ; }
        public void setNext(Node<E> n) { this.next = n ; }
    }
    //---------------end of nested Node class----------------

    private Node<E> head = null ;
    private Node<E> tail = null ;
    private int size = 0 ;

    public SinglyLinkedList() {} //Constructs an initially empty list

    public int size() { return this.size ; }
    public boolean isEmpty() { return this.size == 0 ; }

    public E first() {
        if (this.isEmpty()) { return null ; }
        return head.getElement() ;
    }

    public E last() {
        if (this.isEmpty()) { return null ; }
        return this.tail.getElement() ;
    }

    public void addFirst(E e) {
        this.head = new Node<E>(e, head) ;
        if( this.size == 0 ) { this.tail = this.head ; }
        size++ ;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null) ;
        if(this.isEmpty()) {
            head = newest ;
        }else {
            this.tail.setNext(newest) ;
        }
        this.tail = newest ;
        size++ ;
    }

    public E removeFirst() {
        if(this.isEmpty()) { return null ; }
        E answer = this.head.getElement() ;
        this.head = this.head.getNext() ;
        this.size-- ;

        if(this.isEmpty()) {
            this.tail = null ;
        }
        return answer ;
    }
}
