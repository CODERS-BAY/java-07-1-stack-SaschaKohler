package com.main.java;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private class Node<T> {

        T data;
        Node<T> previous;

        public Node(T e) {
            this.data = e;
        }
    }

    private Node<T> last;
    private Node<T> first;
    private int counter;

    public Stack() {
        this.last = null;
        this.first = null;
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    private boolean isEmpty() {
        return this.last == null;
    }

    public T push(T data) {
        if (this.isEmpty()) {
            this.last = new Node<T>(data);
            this.first = this.last;
            this.last.previous = this.first;
            this.first.previous = null;
            this.counter++;
            return this.last.data;
        }
        Node<T> oldLast = this.last;
        this.last = new Node<T>(data);
        this.last.previous = oldLast;
        this.counter++;
        return this.last.data;

    }

    public T pop() throws Exception{

        try {
            Node<T> temp = this.last;
            this.last = this.last.previous;
            this.counter--;
            return temp.data;
        } catch (Exception e) {
            throw new IllegalArgumentException("StackSizeTooSmall");
        }
    }


    public T peek() throws Exception {

        try {
            return last.data;
        } catch(Exception e){
            throw new IllegalArgumentException("StackSizeTooSmall");
        }

    }

    int size() {
        return this.counter;
    }

    List<T> pop(int number)  {
        List<T> array = new ArrayList<T>(number);
        for (int i = 0; i < number; i++) {
            try {
                array.add(this.pop());
            } catch (Exception e) {
                return null;
            }
        }

        return array;

    }

}



