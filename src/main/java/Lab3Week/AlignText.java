package Lab3Week;

public class AlignText {
    public static void main(String[] args) {
//        int [] classCodes = {2545, 2505, 2560};
//        String [] classNames = {"Java", "C#", "Web"};
////
//        System.out.printf("%-10s%-10s\n", "Code","Name");
//        for (int c=0; c < classCodes.length; c++){
//            int code = classCodes[c];
//            String name = classNames [c];
//            //System.out.println(code + name);
//            System.out.printf("%-10d%-10s", code, name);
//            System.out.println();
//        }
        int [] classCodes = {2545, 2505, 2560};
        String [] classNames = {"Java", "C#", "Web"};
        double [] averageClassSizes = {22.34233, 17.42323, 14.2342334};

        String templateString = "%-10s%-10s%-10s\n"; //use this to format output

        System.out.printf(templateString, "Code","Name", "Average Size");

        String tableTemplateString = "%-10d%-10s%-10.2f\n";

        for (int c=0; c < classCodes.length; c++){
            int code = classCodes[c];
            String name = classNames [c];
            double averageClassSize = averageClassSizes [c];
            //System.out.println(code + name);
            System.out.printf(tableTemplateString, code, name, averageClassSize);
        }

    }
}
