class Cricket{
	public static void matchDetails(String day,String... player){
		for(String name:player){
			System.out.println("the player is:"+name);
		}
		System.out.println("the days:"+day);
	}
	
	public static void matchDetails(int matches,int totalruns,String... player){
		for(String name:player){
			System.out.println("the player is:"+name);
		}
		System.out.println("the matches:"+matches);
		System.out.println("the total runs:"+totalruns);
		
		int avg= totalruns/matches;
		System.out.println("avg"+avg);
	}
}