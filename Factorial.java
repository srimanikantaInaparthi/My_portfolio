class Factorial{
    public static void main(String args[]){
        int i,sum=1;
        int number=10;
        for(i=number;i>=1;i--){
            sum = sum*i;
        }
        System.out.print("Factorial of given number is: ");
        System.out.print(sum);
    }
}