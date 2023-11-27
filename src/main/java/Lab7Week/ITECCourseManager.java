package Lab7Week;

public class ITECCourseManager {

        public static void main(String[] args) {

            ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20 );
            //Add some students.   TODO check that we have not exceeded the max number for the class
            maintenanceCourse.addStudent("Anna");
            maintenanceCourse.addStudent("Bill");
            maintenanceCourse.addStudent("Carl");

            maintenanceCourse.removeStudent("Carl");
            maintenanceCourse.removeStudent("Martha");
            maintenanceCourse.writeCourseInfo();


            ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);
            //Add some students
            datacomCourse.addStudent("Dave");
            datacomCourse.addStudent("Ed");
            datacomCourse.addStudent("Flora");

            datacomCourse.writeCourseInfo();


            ITECCourse softwareDevProj = new ITECCourse("Software Development Projects", 2903, 24);
            //Add some students
            softwareDevProj.addStudent("Gus");
            softwareDevProj.addStudent("Harry");
            softwareDevProj.addStudent("Izzy");

            softwareDevProj.writeCourseInfo();
            int totalEnrolled = softwareDevProj.getNumberOfStudents();
            System.out.println("The "+ softwareDevProj.getName() + " class has " + totalEnrolled + " students enrolled.");
            System.out.println("ITEC " + softwareDevProj.getCode() + " " + softwareDevProj.getName());

            softwareDevProj.setMaxStudents(-30);
            softwareDevProj.writeCourseInfo();


            ITECCourse tinyCourse = new ITECCourse("Made Up Course", 1234, 3);
            //Add some students
            tinyCourse.addStudent("Tim");
            tinyCourse.addStudent("Jim");
            tinyCourse.addStudent("Bob");
            tinyCourse.addStudent("Rob");

            tinyCourse.writeCourseInfo();
        }

}



