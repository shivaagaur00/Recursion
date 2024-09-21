import java.util.*;
class Generate_Parenthesis{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,0,0,"");
        sc.close();
    }
    public static void func(int n,int open,int close,String s){
        // if(open>n || close>n || open<close) return;
        if(open==n && close==n){
            System.out.println(s);
            return;
        }
        if(open<n) func(n, open+1,close, s+"(");
        if(open>close) func(n, open, close+1, s+")");
        return ;
    }
}
