class CourseTrainingCost {

    public static void printTrainingCost(Course course) {
        if (course == Course.JAVA) {
            System.out.println("Training cost for Java: 1500");
        } 
		else if (course == Course.PYTHON) {
            System.out.println("Training cost for Python: 2450");
        } 
		else if (course == Course.DATA_SCIENCE) {
            System.out.println("Training cost for Data Science: 1500");
        } 
		else if (course == Course.WEB_DEVELOPMENT) {
            System.out.println("Training cost for Web Development: 2600");
        } 
		else if (course == Course.MACHINE_LEARNING) {
            System.out.println("Training cost for Machine Learning: 2550");
        } 
		
    }
}