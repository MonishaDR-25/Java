class Scope{
	static int staticVar=20;
	public static void methodExample(){
		int localVar=30;
		System.out.println(localVar);
	}
	public static void main(String[] args){
	System.out.println(staticVar);
	methodExample();
	}
	
}