class SambarRunner{
	
	public static void main(String[] args){
	
	String[] ref=Sambar.vegetables();
	for(String name:Sambar.vegetables())
		System.out.println("vegetables are:" +name);
	
	int refs=Sambar.quantity();
	System.out.println("quqntity is:" +refs);
	
	boolean refe=Sambar.hotCold();
	System.out.println("the sambar is hot:" +refe);
	
	boolean refer=Sambar.goodBad();
	System.out.println("the sambar is good:" +refer);
	}
	
}