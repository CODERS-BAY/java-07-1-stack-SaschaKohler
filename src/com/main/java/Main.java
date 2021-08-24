import com.main.java.Stack;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> integerStack1 = new Stack<>();
        Stack<Integer> integerStack2 = new Stack<>();


        try {
            stringStack.pop();
        } catch (Exception e) {
            System.out.println("StackSizeTooSmall");
        }

        stringStack.push("fun");
        stringStack.push("all");
        stringStack.push("have");
        stringStack.push("it");

        integerStack1.push(4);
        integerStack1.push(3);
        integerStack1.push(2);
        integerStack1.push(1);

        integerStack2.push(3);
        integerStack2.push(2);
        integerStack2.push(1);

        try {
            System.out.println(stringStack.peek());
        } catch (Exception e){
            System.out.println("StackSizeTooSmall");
        }

        try {
            System.out.println(integerStack1.peek().toString());
        } catch(Exception e){
            System.out.println("StackSizeTooSmall");
        }

        List<String> stringList = stringStack.pop(3);
        List<Integer> integerList1 = integerStack1.pop(3);

        List<Integer> integerList2 = integerStack2.pop(10);

        for (String item : stringList) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (Integer item : integerList1) {
            System.out.print(item + " ");
        }


    }
}
