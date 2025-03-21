class FactorialOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 

        // Calculate and display factorial for each number in the array
        for (int num:array) {
            int factorial = 1;
            for (int i=1;i <= num;i++) {
                factorial*= i;
            }
            System.out.println("Factorial of "+num+" is: " +factorial);
        }
    }
}