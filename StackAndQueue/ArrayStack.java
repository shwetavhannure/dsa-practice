class ArrayStack {
    private int stackArray[];
    private int topIndex;

    public ArrayStack(){
        stackArray = new int[100];
        topIndex = -1;
    }

    public void push(int x){
        if(topIndex >= stackArray.length - 1){
            System.out.println("Stack ovrflow!");
            return;
        }
        stackArray[++topIndex] = x;
    }

     public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
