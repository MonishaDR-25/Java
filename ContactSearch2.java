class ContactSearch2 {

    // Method to search names based on the last name
    static String[] searchByLastName(String lastName) {
        // If lastName is Kapoor
        if (lastName == "Kapoor") {
            String[] kapoorNames = {"Amit Kapoor", "Raj Kapoor", "Anil Kapoor", "Sandeep Kapoor", "Priya Kapoor"};
            return kapoorNames;
        }
        // If lastName is Sharma
        else if (lastName == "Sharma") {
            String[] sharmaNames = {"Vijay Sharma", "Sunita Sharma", "Ravi Sharma", "Anita Sharma", "Kiran Sharma"};
            return sharmaNames;
        }
        // If lastName is Shetty
        else if (lastName == "Shetty") {
            String[] shettyNames = {"Kiran Shetty", "Rajesh Shetty", "Anjali Shetty", "Suresh Shetty", "Priya Shetty"};
            return shettyNames;
        }
        // If no matching last name found
        else {
            return new String[]{"No names found for this last name"};
        }
    }
}

