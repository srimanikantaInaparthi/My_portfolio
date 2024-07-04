public class Main{
    public static void main(String[] args) {
int[] myArray= {5,2,2,23,5,56,89};
int sum = 0, i;
for(i=0;i<myArray.length;i++){
    sum += myArray[i];
}
System.out.println("The sum is: "+sum);
    }
}