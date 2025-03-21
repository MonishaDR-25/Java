class ProductSearch {

    // Method to return price based on product name
    static double getPriceByProduct(String productName) {
        if (productName == "Laptop") {
            return 50000.00; 
        } 
		else if (productName == "Smartphone") {
            return 20000.00; 
        }
		else if (productName == "Tablet") {
            return 15000.00; 
        }
		else if (productName == "Headphones") {
            return 2000.00; 
        }
		else if (productName == "Smartwatch") {
            return 8000.00; 
        } 
		else if (productName == "Bluetooth Speaker") {
            return 3000.00; 
        }
		else if (productName == "TV") {
            return 40000.00; 
        }
		else if (productName == "Camera") {
            return 25000.00; 
        }
		else if (productName == "Printer") {
            return 5000.00; 
        }
		else if (productName == "Washing Machine") {
            return 15000.00; 
        }
		else if (productName == "Refrigerator") {
            return 25000.00; 
        }
		else if (productName == "Microwave Oven") {
            return 10000.00; 
        }
		else if (productName == "Air Conditioner") {
            return 30000.00; 
        } 
		else if (productName == "Dishwasher") {
            return 18000.00; 
        }
		else if (productName == "Juicer") {
            return 3000.00; 
        }
		else if (productName == "Coffee Maker") {
            return 4000.00; 
        } 
		else if (productName == "Electric Kettle") {
            return 1500.00; 
        }
		else if (productName == "Vacuum Cleaner") {
            return 6000.00; 
        }
		else if (productName == "Fan") {
            return 2000.00; 
        }
		else if (productName == "Iron") {
            return 1500.00; 
        }
		else if (productName == "Hair Dryer") {
            return 1200.00; 
        }
		else if (productName == "Recliner Chair") {
            return 10000.00; 
        }
		else if (productName == "Gaming Console") {
            return 25000.00; 
        }
		else {
            return -1.0; 
        }
    }
}

