class CabSearch {

    // Method to get the cost by source and destination in Karnataka
    static int getCostBySourceAndDestination(String source, String destination) {
        
        if (source == "Bengaluru" && destination == "Mysuru") {
            return 200; 
        } else if (source == "Mangaluru" && destination == "Udupi") {
            return 150; 
        } else if (source == "Hubballi" && destination == "Dharwad") {
            return 80; 
        } else if (source == "Bellary" && destination == "Hospet") {
            return 100; 
        } else if (source == "Raichur" && destination == "Bagalkot") {
            return 120; 
        } else if (source == "Gulbarga" && destination == "Bidar") {
            return 110; 
        } else if (source == "Chikkamagaluru" && destination == "Shimoga") {
            return 130; 
        } else if (source == "Hassan" && destination == "Kodagu") {
            return 160; 
        } else if (source == "Tumakuru" && destination == "Chitradurga") {
            return 140; 
        } else if (source == "Bagalkot" && destination == "Badami") {
            return 90; 
        } else if (source == "Kolar" && destination == "Chikkaballapur") {
            return 70; 
        } else if (source == "Dakshina Kannada" && destination == "Kodagu") {
            return 180; 
        } else {
            return -1; 
        }
    }
}