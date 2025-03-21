public class ArrayExample {
    public static void main(String[] args) {
        
        int[] numbers = {5, 2, 8, 1, 3};

        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        int target = 3;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        
        int[] copiedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copiedArray[i] = numbers[i];
        }

        System.out.print("Copied array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        int[] filledArray = new int[5];
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = 10;
        }

        System.out.print("Filled array: ");
        for (int num : filledArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}