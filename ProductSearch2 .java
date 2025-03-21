class ProductSearch2 {

    static String searchProductAvailability(String productName) {
        
        if (productName == "Toothbrush") {
            return "Toothbrush is available.";
        } 
		else if (productName == "Shampoo") {
            return "Shampoo is available.";
        }
		else if (productName == "Conditioner") {
            return "Conditioner is available.";
        } 
		else if (productName == "Body Wash") {
            return "Body Wash is available.";
        }
		else if (productName == "Handwash") {
            return "Handwash is available.";
        }
		else if (productName == "Dishwashing Liquid") {
            return "Dishwashing Liquid is available.";
        }
		else if (productName == "Toilet Cleaner") {
            return "Toilet Cleaner is available.";
        }
		else if (productName == "Laundry Detergent") {
            return "Laundry Detergent is available.";
        }
		else if (productName == "Washing Powder") {
            return "Washing Powder is available.";
        }
		else if (productName == "Soft Drink") {
            return "Soft Drink is available.";
        }
		else if (productName == "Coffee") {
            return "Coffee is available.";
        }
		else if (productName == "Tea") {
            return "Tea is available.";
        }
		else if (productName == "Biscuits") {
            return "Biscuits are available.";
        }
		else if (productName == "Chocolates") {
            return "Chocolates are available.";
        }
		else if (productName == "Cooking Oil") {
            return "Cooking Oil is available.";
        }
		else if (productName == "Salt") {
            return "Salt is available.";
        }
		else if (productName == "Sugar") {
            return "Sugar is available.";
        }
		else if (productName == "Rice") {
            return "Rice is available.";
        }
		else if (productName == "Atta (Wheat Flour)") {
            return "Atta (Wheat Flour) is available.";
        }
		else if (productName == "Tea Kettle") {
            return "Tea Kettle is available.";
        }
		else if (productName == "Pressure Cooker") {
            return "Pressure Cooker is available.";
        }
		else if (productName == "Blender") {
            return "Blender is available.";
        }
		else {
            return "The product " + productName + " is not available.";
        }
    }
}