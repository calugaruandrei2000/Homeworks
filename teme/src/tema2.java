import java.util.Scanner;
public class tema2 {
    public static void main(String[] args) {

        //1

        Scanner sc = new Scanner(System.in);
        System.out.print("Lungime: ");

        double l=sc.nextDouble();

        System.out.print("Latime: ");

        double L=sc.nextDouble();

        if(l==L) {
            System.out.println("Este patrat :)");
        }else {
            System.out.println("Nu este patrat :(");
        }



        //2

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " este un numar par");
        }else{
            System.out.println(num + " este un numar impar");
        }




        //3

        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Va rugam introduceti varsta: ");
        age = scan.nextInt();

        if(age>=18) {
            System.out.println("Esti eligibil de vot.");
        } else {
            System.out.println("Ne pare rau,nu puteti vota nu aveti varsta corespunzatoare.");
        }




        //6

        double l1, l2, l3;
        sc = new Scanner(System.in);
        System.out.println("Introduceti valorile laturilor: ");
        l1 = sc.nextDouble();
        l2 = sc.nextDouble();
        l3 = sc.nextDouble();

        if(l1 == l2 && l2 == l3) {
            System.out.println("Este un triunghi echilateral.");
        } else if(l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Este un triunghi isoscel.");
        } else {
            System.out.println("Este un triunghi oarecare.");
        }





    }
}
