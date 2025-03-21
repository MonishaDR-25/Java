public class Branch{
    static String[] branchName={null,null,null};
	static int index=0;
	public static void addBranch(String BranchName){
		if(branchName!=null){
			System.out.println("before inccrement index"+index);
		
			//save logic
			if(index<branchName.length){
				branchName[index]=BranchName;
				index++;
				System.out.println("after increment index"+index);
				System.out.println("the array is filled successfully");
				
			}
			else{
				System.out.println("array is full element cannot be added");
			}
		}
		else{
			System.out.println("the aarray is null");
			}
		
	}
}

public static void display(){
	for( int index=0;index<branchName.length;index++){
		System.out.println(branchName[index]);
		
		]
}	

