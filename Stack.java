public class Stack {
    private int[] stack;
    private int top;
    public Stack() {
        this.stack = new int[1000];
        this.top = -1;
    }
    public void push(int k) {
        stack[top + 1] = k;
        top++;
    }
    public int pop() {
        int x = stack[top];
        stack[top] = 0;
        top--;
        return x;
    }
    public int peek() {
        return stack[top];
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("========PUSH========");
        stack.push(7);
        System.out.println(stack.peek() + "is pushed.");
        stack.push(4);
        System.out.println(stack.peek() + "is pushed.");
        stack.push(2);
        System.out.println(stack.peek() + "is pushed.");
        System.out.println("========POP========");
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}