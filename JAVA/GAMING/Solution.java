import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        StringBuilder frase1 = new StringBuilder("oso");
        //frase1 = frase1.replace(" ","");
        StringBuilder frase1inv = new StringBuilder();
        frase1inv = frase1.reverse();
        if(frase1 == frase1inv) {
            System.out.println("SI");            
        } else {
            System.out.println("NO"); 
        }
    }
}