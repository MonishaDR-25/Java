class CabSearch1 {

    // Method to get the distance by source and destination
    static int getDistanceBySourceAndDestination(String source, String destination) {
        
        if (source == "Bengaluru" && destination == "Mysuru") {
            return 145; 
        } 
		else if (source == "Mangaluru" && destination == "Udupi") {
            return 60; 
        }
		else if (source == "Hubballi" && destination == "Dharwad") {
            return 20; 
        }
		else if (source == "Bellary" && destination == "Hospet") {
            return 35; 
        } 
		else if (source == "Raichur" && destination == "Bagalkot") {
            return 100; 
        }
		else if (source == "Gulbarga" && destination == "Bidar") {
            return 65; 
        }
		else if (source == "Chikkamagaluru" && destination == "Shimoga") {
            return 120; 
        }
		else if (source == "Hassan" && destination == "Kodagu") {
            return 115; 
        }
		else if (source == "Tumakuru" && destination == "Chitradurga") {
            return 140; 
        }
		else if (source == "Bagalkot" && destination == "Badami") {
            return 45; 
        }
		else if (source == "Kolar" && destination == "Chikkaballapur") {
            return 50; 
        }
		else if (source == "Dakshina Kannada" && destination == "Kodagu") {
            return 200; 
        }
		else if (source == "Bengaluru" && destination == "Tumakuru") {
            return 70; 
        }
		else if (source == "Mysuru" && destination == "Chamarajanagar") {
            return 55; 
        }
		else if (source == "Mangaluru" && destination == "Karkala") {
            return 30; 
        }
		else if (source == "Hassan" && destination == "Chikkamagaluru") {
            return 45; 
        }
		else if (source == "Shivamogga" && destination == "Sagara") {
            return 60; 
        }
		else if (source == "Bijapur" && destination == "Bagalkot") {
            return 90; 
        }
		else if (source == "Davanagere" && destination == "Harihar") {
            return 35; 
        }
		else if (source == "Gulbarga" && destination == "Raichur") {
            return 75; 
        }
		else if (source == "Belgaum" && destination == "Hubballi") {
            return 110; 
        }
		else if (source == "Madikeri" && destination == "Virajpet") {
            return 35; 
        }
		else if (source == "Bagalkot" && destination == "Gadag") {
            return 60; 
        }
		else if (source == "Bengaluru" && destination == "Chikmagalur") {
            return 240; 
        }
		else if (source == "Mysuru" && destination == "Kodagu") {
            return 120; 
        }
		else {
            return 0; 
        }
    }
}