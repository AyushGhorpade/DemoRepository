import java.util.Scanner;
class Armstromg
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the no :-");
        int no = s.nextInt();
        int t1 = no;
        int leng = 0;
        while(t1 != 0)
        {
            t1 = t1 / 10;
            leng = leng + 1; 
        }
        int t2 = no;
        int rem;int arm = 0;
        while(t2 != 0)
        {
            rem = t2%10;
            int mul = 1;
            for(int i =1;i<=leng;i++)
            {
                mul = mul*rem;
            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if(no == arm)
        {
            System.out.println("no is Armstrong");
        }
        else
        {
            System.out.println("is not an Armstrong no");
        }
    }
}