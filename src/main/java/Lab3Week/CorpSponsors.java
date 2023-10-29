package Lab3Week;

import java.util.Arrays;

public class CorpSponsors {
    public static void main(String[] args) {
        String [] sponsors = { "ikea", "at&t", "cvs", "3m"};

        for (int i =0; i< sponsors.length; i++) {
            // System.out.println(sponsors[i]);
            sponsors[i] = sponsors[i].toUpperCase();
//            String sponsor=sponsors[i];
//            sponsor=sponsor.toUpperCase();
//            sponsors[i]=sponsor;
        }
        System.out.println(Arrays.toString(sponsors));

    }
}
