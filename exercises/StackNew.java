package exercises;

import java.util.Stack;


class StackNew extends Stack<Integer>
{
    Stack<Integer> min = new Stack<>();
    void push(int x)
    {
        if(isEmpty() == true)
        {
            super.push(x);
            min.push(x);
        }
        else
        {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if(x < y)
                min.push(x);
            else
                min.push(y);
        }
    }
    public Integer pop()
    {
        int x = super.pop();
        min.pop();
        return x;
    }

    int getMin()
    {
        int x = min.pop();
        min.push(x);
        return x;
    }

    public static void main(String[] args)
    {
        StackNew s = new StackNew();
        s.push(10);
        s.push(2);
        s.push(4);
        s.push(9);
        s.push(6);
        s.push(1);

        System.out.println("\nStack--> "+s);
        System.out.println("min element "+s.getMin());
        s.push(0);
        System.out.println("\nStack-->"+s);
        System.out.println("min element "+s.getMin()+"\n");
    }
}