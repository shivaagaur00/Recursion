import java.util.*;
public class maze_path {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=path(a,b,0,0,"");
        System.out.println();
        System.out.println(m);
        sc.close();
    }
    public static int path(int m,int n ,int i ,int j,String s){
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1){
            System.out.print(s+" " );
            return 1;
        }
        int y=path(m,n,i+1,j,s+'V');
        int x=path(m,n,i,j+1,s+'H');
        int z=path(m,n,i+1,j+1,s+'D');
        return x+y+z;
    }
}