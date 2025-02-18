public class VariableScope {

    // Global variable
    static int globalCount = 100;

    // Main method to run the program
    public static void main(String[] args) {
        System.out.println("Global Count (from main): " + globalCount);
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        int localCount = 50;
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}

