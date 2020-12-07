public class prime {
    public static void main(String[] args)
    {
        int number=83,prime=0;
        int armNumber=153;
        if(number==0 || number==1)
        {
            System.out.println("not prime");
        }
        else
        {
            for(int i=2;i<number;i++) {
                if (number % i == 0) {
prime=1;
break;
                }
            }
            if(prime==0)
            {
                System.out.println(number+"  is prime");
            }
            else {
                System.out.println(number+"  not prime");
            }
        }
        //armstrong

        int c=0,a,temp;
        int n=356;//It is the number to check armstrong

        temp=n;
        while(n>0)
        {
            a=n%10;
            System.out.println(a);
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");

        int i, j, row = 6;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=2*(row-i); j>=0; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
}
