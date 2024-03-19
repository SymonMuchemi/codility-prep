//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//public class Result {
//
//    /*
//     * Complete the 'pangrams' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING s as parameter.
//     */
//
//    public static String pangrams(String s) {
//        // Write your code here
//        int x = 0;
//
//        s = s.toUpperCase();
//
//        // boolean array to store the occurrence of an alphabet
//        // the index corresponds to the position of the alpabet
//        boolean[] alphabetOccurrence = new boolean[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (ch >= 'A' && ch <= 'Z') {
//                alphabetOccurrence[ch - 'A'] = true;
//            }
//
//            for (boolean occurence: alphabetOccurrence) {
//                if (occurence == false) {
//                    return "not pangram";
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(alphabetOccurrence));
//        return "pangram";
//    }
//
//}
//
