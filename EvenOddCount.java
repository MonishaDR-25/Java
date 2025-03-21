class EvenOddCount{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; 
        int evenCount = 0, oddCount = 0;

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenCount++;
            }
        }

        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
