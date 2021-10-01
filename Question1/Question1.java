

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



class TestClass {

    public static int solution(int n)
    {
    	int d=n/3;
        int r=n%3;
        if(r!=0)
            return (2*d)+1;
        return 2*d;
    }


    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n:");
        int n=Integer.parseInt(br.readLine());
        int answer=solution(n);
        System.out.println(answer);
        
    }
}
