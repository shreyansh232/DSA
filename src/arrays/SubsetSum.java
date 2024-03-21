package arrays;

public class SubsetSum {
    public static boolean subSetSum(int s, int n, int a[])
    {
        if(s==0){
            return true;
        }
        if(s<0){
            return false;
        }

        if(n==0){
            return false;
        }


        return subSetSum(s-a[n-1], n-1, a)|subSetSum(s, n-1, a);

    }
    public static void main(String [] args){
        int [] a =  {3, 34, 4, 12, 5, 2};

        int s = 9;

        System.out.print(subSetSum(s, 6, a));
    }
}
