package mal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class step0_repl {

    public static String READ(String str){

        return str;
    }

    public static String EVAL(String str){
        return str;

    }

    public static String PRINT(String str){
        return str;

    }

    public static String rep(String str){

        return PRINT(EVAL(READ(str)));
    }

    public static void main(String[] args) throws IOException {
        StringReader sr = new StringReader(args[0]);
        BufferedReader br = new BufferedReader(sr);
        String thisLine;
        while ((thisLine = br.readLine()) != null) {
            System.out.print("user>");
            BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
            String s = buffer.readLine();
            rep(s);
        }
    }
}
