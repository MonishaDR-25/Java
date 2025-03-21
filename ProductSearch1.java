class ProductSearch1 {

    
    static String[] toothbrushBrands = {"Colgate", "Oral-B", "Sensodyne", "Pepsodent"};
    static String[] shampooBrands = {"Pantene", "Head & Shoulders", "Dove", "TRESemmé"};
    static String[] conditionerBrands = {"Dove", "Pantene", "L'Oreal", "TRESemmé"};
    static String[] bodyWashBrands = {"Dove", "Nivea", "Olay", "Lux"};
    static String[] handwashBrands = {"Dettol", "Savlon", "Lifebuoy", "Nirma"};
    static String[] dishwashingLiquidBrands = {"Pril", "Dawn", "Palmolive", "Fairy"};
    static String[] toiletCleanerBrands = {"Harpic", "Lizol", "Domex", "Pine-Sol"};
    static String[] laundryDetergentBrands = {"Surf Excel", "Tide", "Ariel", "Nirma"};
    static String[] washingPowderBrands = {"Tata", "Nirma", "Wheel", "Surf Excel"};
    static String[] softDrinkBrands = {"Coca-Cola", "Pepsi", "Sprite", "Mountain Dew"};
    static String[] coffeeBrands = {"Nescafé", "Bru", "Tata Coffee", "Lavazza"};
    static String[] teaBrands = {"Tata Tea", "Lipton", "Twinings", "Brooke Bond"};
    static String[] biscuitsBrands = {"Britannia", "Parle-G", "Hide & Seek", "Oreo"};
    static String[] chocolatesBrands = {"Cadbury", "Nestlé", "Mars", "Ferrero Rocher"};
    static String[] cookingOilBrands = {"Fortune", "Saffola", "Dhara", "Patanjali"};
    static String[] saltBrands = {"Tata Salt", "Aashirvaad", "Fortune", "Patanjali"};
    static String[] sugarBrands = {"Tata Sugar", "Dalda", "Bajaj", "Sundar"};
    static String[] riceBrands = {"Tilda", "Daawat", "Shakti Bhog", "Kohinoor"};
    static String[] attaBrands = {"Aashirvaad", "Pillsbury", "Shaktibhog", "Fortune"};
    static String[] teaKettleBrands = {"Prestige", "Pigeon", "Hawkins", "Bajaj"};
    static String[] pressureCookerBrands = {"Prestige", "Hawkins", "Bajaj", "Pigeon"};
    static String[] blenderBrands = {"Philips", "Bajaj", "Prestige", "Hamilton Beach"};

    // Method to return brands based on product name
    static String[] getBrandsByProduct(String productName) {
        if (productName == "Toothbrush") {
            return toothbrushBrands;
        } 
		else if (productName == "Shampoo") {
            return shampooBrands;
        }
		else if (productName == "Conditioner") {
            return conditionerBrands;
        }
		else if (productName == "Body Wash") {
            return bodyWashBrands;
        }
		else if (productName == "Handwash") {
            return handwashBrands;
        }
		else if (productName == "Dishwashing Liquid") {
            return dishwashingLiquidBrands;
        }
		else if (productName == "Toilet Cleaner") {
            return toiletCleanerBrands;
        }
		else if (productName == "Laundry Detergent") {
            return laundryDetergentBrands;
        }
		else if (productName == "Washing Powder") {
            return washingPowderBrands;
        }
		else if (productName == "Soft Drink") {
            return softDrinkBrands;
        } 
		else if (productName == "Coffee") {
            return coffeeBrands;
        }
		else if (productName == "Tea") {
            return teaBrands;
        }
		else if (productName == "Biscuits") {
            return biscuitsBrands;
        }
		else if (productName == "Chocolates") {
            return chocolatesBrands;
        }
		else if (productName == "Cooking Oil") {
            return cookingOilBrands;
        }
		else if (productName == "Salt") {
            return saltBrands;
        }
		else if (productName == "Sugar") {
            return sugarBrands;
        }
		else if (productName == "Rice") {
            return riceBrands;
        }
		else if (productName == "Atta (Wheat Flour)") {
            return attaBrands;
        }
		else if (productName == "Tea Kettle") {
            return teaKettleBrands;
        }
		else if (productName == "Pressure Cooker") {
            return pressureCookerBrands;
        }
		else if (productName == "Blender") {
            return blenderBrands;
        }
		else {
            return new String[]{"No brands found for this product"};
        }
    }
}