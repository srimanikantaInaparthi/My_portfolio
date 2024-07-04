class PalindromeExa{
    public static void main(String args[]){
        int rem,temp,n=5445,sum=0;
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
        System.out.println(temp+ " is palindrome number.");
        else
        System.out.println(temp+ " is not a palindrome number.");
    }
}