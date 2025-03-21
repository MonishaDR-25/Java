 class Statements {
    public static void main(String[] args) {
		//If condition
        int num = 10;
        if (num > 0) {
            System.out.println("Number is positive.");
        }

        // 2. If-Else condition
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // 3. While loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count = " + count);
            count++;
        }

        // 4. For loop (Print numbers 1 to 5)
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 5. Switch statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}