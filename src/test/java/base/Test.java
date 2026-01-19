package base;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //   Input: "API automation testing"
        //        Output: "testing automation API"
        String input = "API automation testing";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i =words.length-1; i>= 0; i--){
            result.append(words[i]).append(" ");
        }
        System.out.println("final result     " + result);
    }
}
