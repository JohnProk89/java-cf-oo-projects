package ch14utilitiesfactories.stack;

public class Driver {

    public static void main(String[] args) {

        StackManager stackManager = StackManager.getInstance();
        stackManager.push("I");
        stackManager.push("am");
        stackManager.push("John");
        String popped = stackManager.pop();
        System.out.println("POPPED " + popped);
        popped = stackManager.pop();
        System.out.println("POPPED " + popped);
        popped = stackManager.pop();
        System.out.println("POPPED " + popped);
        popped = stackManager.pop();
    }
}
