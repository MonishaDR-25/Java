class ContactSearchRunner2 {
    public static void main(String[] args) {
        // Calling the method for different last names and printing the result
        
        // Searching for names with last name Kapoor
        System.out.println("Names with last name Kapoor:");
        String[] kapoorNames = ContactSearch2.searchByLastName("Kapoor");
        for (String name : kapoorNames) {
            System.out.println(name);
        }

        // Searching for names with last name Sharma
        System.out.println("\nNames with last name Sharma:");
        String[] sharmaNames = ContactSearch2.searchByLastName("Sharma");
        for (String name : sharmaNames) {
            System.out.println(name);
        }

        // Searching for names with last name Shetty
        System.out.println("\nNames with last name Shetty:");
        String[] shettyNames = ContactSearch2.searchByLastName("Shetty");
        for (String name : shettyNames) {
            System.out.println(name);
        }
    }
}