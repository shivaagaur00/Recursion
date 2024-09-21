import java.util.*;
class subset_problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<String> list=new ArrayList<>();
        System.out.println(func(arr,target,0,0,"",list));
        System.out.println(list);
        sc.close();
    }
    public static int func(int[] arr,int target,int sum,int i,String s,List<String> list){
        if(sum>target) return 0;
        if(sum==target){
            list.add(s);
            return 1;
        }
        int total=0;
        for(;i<arr.length;i++){
            total=total+func(arr, target, sum+arr[i],i+1,s+arr[i]+" ", list);
        }
        return total;
    }
}