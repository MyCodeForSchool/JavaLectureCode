package Lab3Week;

public class FormatExamples {
    public static void main(String[] args) {
        String college = "MCTC";
        String className = "Java Programming";
        int classCode = 2545;
        int credits = 6;
        double averageGrade = 84.545345;
        boolean isOnline = true;

        System.out.println("This class is " + classCode + " " + className + ".  It is taught at "
        + college + ".  It is " + credits + " credits.  The average grade is " + averageGrade
        + "%.  It is online? " + isOnline + ".");

        //%d = int
        //%f = double
        //%s = String & anything else

        System.out.printf("This class is %d %s.  It is taught at %s.  It is %d credits.  " +
                "The average grade is %.2f%%.  It is online? %s.\n", classCode, className, college,
                credits, averageGrade, isOnline);

        System.out.printf("The average grade is %.0f.\n", averageGrade);
    }
}
