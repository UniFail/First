import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int i = n;
        String bin = "";
        int count = 0;
        int test = 0;
        while (i >= 1) {
            if (n % 2 != 0) {
                n = (int) Math.floor(n/2);
                bin += "1";
                i = n;
            }
            else {
                n = (int) Math.floor(n/2);
                bin += "0";
                i = n;
            }
        }
        System.out.println(bin);
        for (int j = 0; j  <  bin.length(); j++) {
            if(bin.charAt(j) == '1'){
              count += 1;
              if (test < count){
                  test = count;
              }
            }
            else
                count = 0;
        }
        System.out.println(test);
        bufferedReader.close();
    }
}
