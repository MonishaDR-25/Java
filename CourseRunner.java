class CourseRunner {
    public static void main(String[] args) {
        
        Course course1 = Course.JAVA;
        Course course2 = Course.PYTHON;
        Course course3 = Course.DATA_SCIENCE;
        Course course4 = Course.WEB_DEVELOPMENT;
        Course course5 = Course.MACHINE_LEARNING;

        CourseTrainingCost.printTrainingCost(course1);
        CourseTrainingCost.printTrainingCost(course2);
        CourseTrainingCost.printTrainingCost(course3);
        CourseTrainingCost.printTrainingCost(course4);
        CourseTrainingCost.printTrainingCost(course5);
    }
}