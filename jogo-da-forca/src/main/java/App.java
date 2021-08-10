//import java.util.Scanner;
//
//public class App {
//
//    public static void main(String[] args) {
//
//        var in = new Scanner(System.in);
//        var word = "CASA";
//        var qtyAttempt = 6;
//
//        var wordHidden = new char[word.length()];
//
//        for (int i = 0; i < word.length(); i++) {
//            wordHidden[i] = '_';
//        }
//
//        var len = word.length();
//
//        while (qtyAttempt > 0) {
//
//            var letter = in.next();
//
//            for (int i = 0; i < word.length(); i++) {
//                if (word.charAt(i) == letter.charAt(0)) {
//                    wordHidden[i] = letter.charAt(0);
//                    len--;
//                }
//            }
//
//            System.out.println(wordHidden);
//
//            if (len == 0) {
//                System.out.println("Parabéns");
//                break;
//            }
//
//            qtyAttempt--;
//
//        }
//
//        if (len > 0) {
//            System.out.println("Game Over!");
//        }
//
//    }
//}
