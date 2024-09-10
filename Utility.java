import java.util.*;

class Utility{
    // Find A Factorial Number.
    public static long factorial(long value)
    {
        long count=1;
        if(value<0){
            System.out.print("Please, Enter Valid Number For Factorial.....♣");
        }
        else{
            for(int i=1;i<=value;i++)
            {
                count*=i;
            }    
        }
        return count;
    }
    // Find A Prime Number.
    public static boolean isPrime(int value1)
    {
        if(value1<=1)
        {
            return false;
        }else{
        for(int i=2; i<=Math.sqrt(value1);i++)
        {
            if( value1%i==0){
                return false;
            }
        }
     }
        return true;
    }
    // Find A Even Number.
    public static boolean isEven(long value1)
    {
        if(value1%2==0){
            return true;
        }
        else{
            return false;
        }
    }
     
    // Find A Odd Number.
    public static boolean isOdd(long value1)
    {
        if(value1%2==1){
            return true;
        }
        else{
            return false;
        }
    }
    Scanner s1=new Scanner(System.in);
    public static void main(String[] args) {
        
        //Utility obj=new Utility();
        
        Scanner s1=new Scanner(System.in);
        System.out.print("\nEnter Value For Factorial :");
        long value = s1.nextLong();

        System.out.print(value+" "+"Number is Factorial Number :"+factorial(value));

        System.out.print("\nEnter Value :");
        int value1 = s1.nextInt();

        System.out.print("\n"+value1+" "+"Number is Prime Number : "+ isPrime(value1));
        System.out.print("\n"+value1+" "+"Number is Even Number : "+ isEven(value1));
        System.out.print("\n"+value1+" "+"Number is Odd Number  : "+ isOdd(value1));
        
        s1.close();
    }
}