package Array;

import java.util.Scanner;

public class firstoccurenceelement {

    public static int countarray(int a[],int x){
        int count=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                // System.out.println("index of this element :"+i);
                count++;
            }
        }
        return count;
    }
    static void printanswer(int ans){
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Size of Array :");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.print("enter "+n+" element :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter occurence element :");
        int x=sc.nextInt();
        int ans=countarray(a, x);
        // System.out.print(ans);
        printanswer(ans);
    }
}
