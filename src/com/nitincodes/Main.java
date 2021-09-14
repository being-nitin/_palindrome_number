package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// java code to find that the given number is palindrome or not:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        n = temp;
        int rem,rev=0;
        while(n!=0){
            rem = n%10;
            rev = rev*10 +rem;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==temp){
            System.out.println("the number is a palindrome");
        }
        else{
            System.out.println("the number is not a palindrome");
        }
    }
}

