package edu.touro.cs.mco264;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
class Foo{
    // Node n; not accessable
}
public class LinkedList<T> implements List<T>
{
    private static class Node<T>
    {
        private Node prev, next;
        private T data;

        // void foo(){LinkedList.this.size=0;}
    }

    // private (inner) class
    // static (inner) class = used when the inner class object does not need access to outer class

    private Node<T> head, tail;
    private int size;

    public LinkedList(){
        head = tail = null; // NC
    }


    public LinkedList(Collection<T> clc)
    {
        addAll(clc);
    }

    @Override //HW4
    public int size() {
        return size;
    }

    @Override //HW4
    public boolean isEmpty() {
        return size == 0;
    }

    @Override //HW4
    public boolean contains(Object o) {
        return false;
    }

    //HW5 XTRA so that a ConcrrentModificationException is thrown appropriately
    class MyLinkedListIterator implements Iterator<T>
    {
        private Node<T> currentNode = head;
        @Override
        public boolean hasNext() {
            if (currentNode == null)
                return false;
            else
                return true;
        }

        @Override
        public T next() {
            T temp = currentNode.data;
            currentNode = currentNode.next;
            return temp;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override //HW4
    public boolean add(T t) {
        Node newNode = new Node();
        newNode.data = t;
        newNode.next = null; // NC
        if (head == null) // first elt
        {
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override //HW4
    public boolean remove(Object o) {
        return false;
    }

    @Override //HW5
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override//HW5
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override//HW5
    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    @Override//HW5
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override //HW4
    public void clear() {
        head = tail = null;
        size = 0;

    }

    @Override //HW4
    public T get(int i) {
        return null;
    }

    @Override //HW5
    public T set(int i, T t) {
        return null;
    }

    @Override //HW5
    public void add(int i, T t) {

    }

    @Override //HW5
    public T remove(int i) {
        return null;
    }

    @Override //HW5
    public int indexOf(Object o) {
        return 0;
    }

    @Override //HW5
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override //HW5 XTRA
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override //HW5 XTRA
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @Override //HW5 XTRA
    public List<T> subList(int i, int i1) {
        return null;
    }
}
