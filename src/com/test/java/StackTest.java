package com.test.java;

import com.main.java.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack<Integer> intStack;

    @BeforeEach
    void initialize(){
        intStack = new Stack<>();
    }

    @Test
    void can_create_an_Instance_of_IntStack_with_counter_equals_0(){
        assertEquals(0,intStack.getCounter());
    }

    @Test
    void push_first_item_onto_stack_as_new_last(){
        assertEquals(4,intStack.push(4));
    }

    @Test
    void push_Item_onto_Stack_as_new_Last(){
        assertEquals(4,intStack.push(4));
        assertEquals(3,intStack.push(3));
        assertEquals(2,intStack.getCounter());
    }

    @Test
    void push_items_onto_stack_and_peek_for_last(){
        intStack.push(4);
        intStack.push(3);

     //   assertEquals(3,intStack.peek());
        assertEquals(2,intStack.size());
    }

    @Test
    void get_actual_size_of_stack(){
        intStack.push(2);
        intStack.push(3);

        assertEquals(2,intStack.size());
    }

    @Test
    void when_pop_from_stack_of_small_size_throw_exception(){
        assertThrows(IllegalArgumentException.class,()->intStack.pop());
    }

    @Test
    void pop_an_array_of_integers_from_stack(){
        Stack<Integer> intStack = new Stack<>();
        intStack.push(4);
        intStack.push(3);
        intStack.push(2);
        intStack.push(1);


        assertThrows(IllegalArgumentException.class,()->intStack.pop(5) );
    }
}