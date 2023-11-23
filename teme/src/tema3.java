import java.util.Scanner;
public class tema3 {
    public static void main(String[] args) {

        //1
        int i;
        for (i=1;i<=10;i++)
        {
            System.out.println (i);
        }
        System.out.println();


        //2
        int A = 10;
        int sum = 0;
        System.out.println("Primele " + A + " numere sunt : ");
        for (int a = 1; a <= A; a++) {
            System.out.println("a = " + a);
            sum += a;
        }
        System.out.println("Suma primelor " + A + " numere naturale este = " +sum);
        System.out.println();


        //3
        Scanner console = new Scanner(System.in);
        int factorial=1;
        int number;
        System.out.println("Introduceti un numar :");
        number = console.nextInt();
        for(int b=1;b<=number;b++) {
            factorial *= b;
        }
        System.out.println("Factorial of " +number+ " is: " +factorial);
        System.out.println();


        //4
        Scanner integers= new Scanner(System.in);

        System.out.println("The number of integers to be entered: ");
        int j = integers.nextInt();
        int k, par = 0, impar = 0;
        for (int c = 1; c<=j; c++) {
            System.out.println("Enter the number ("+ c +"):");
            k = integers.nextInt();
            if(k%2==0){
                par = par + k;
            } else {
                impar = impar + k;
            }
        }
        System.out.println("The sum of even integers = " +par);
        System.out.println("The sum of even odd = " +impar);
        System.out.println();


        //5



        //6
        int b, e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti baza: ");
        b = sc.nextInt();
        System.out.print("Introduceti exponentul: ");
        e = sc.nextInt();
        double power = Math.pow(b, e);
        System.out.println(b +" la puterea a " +e + " este: "+power);
        System.out.println();


        //7
        int x,y,z;
        System.out.print("Introduceti numarul de randuri dorit : ");
        Scanner in = new Scanner(System.in);
        z = in.nextInt();

        for(x=1;x<=z;x++)
        {
            for(y=1;y<=x;y++)
                System.out.print(y);

            System.out.println("");
        }
        System.out.println();



        //8



        //9
        System.out.print("Introduceti numarul de randuri dorit : ");
        y = in.nextInt();

        for(i=1;i<=y;i++) {
            for(j=1;j<=i;j++)
                System.out.print(i);
            System.out.println("");
        }
        System.out.println();


        //10
        int s = 7;
        int t = 1;
        int suma = 0;

        while(t <= s) {
            sum += t*t;
            t++;
        }

        System.out.println("Suma este: " + sum);
        System.out.println();


        //11
        int n = 0;
        System.out.print("Introduceti un numar: ");
        n = in.nextInt();
        for(int o = 1; o < n; o++) {
            if(n % o == 0) {
                suma = suma + o;
            }
        } if(suma == n) {
            System.out.println("Este un numar perfect");
        } else {
            System.out.println("Nu este un numar perfect");
        }
        System.out.println();


        //12



        //13
        int s1 = 0, s2 = 1;
        System.out.print("Enter the number of terms: ");
        int o=sc.nextInt();
        System.out.println("First " + o + " terms of fibonnaci series: ");
        for (int p = 1; p <= o; ++p)
        {
            System.out.print(s1 + " ");
            int Sum = s1 + s2;
            s1 = s2;
            s2 = Sum;
        }
        System.out.println();

    }

}
