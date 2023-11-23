public class Main {
    public static void main(String[] args) {

        //1
        System.out.printf("Hello, \n %s si am varsta de %d  \n","Ma cheama Andrei", 23);

        System.out.println("Hello");
        System.out.println("Andrei");
            System.out.println("\n");


        //2

        int y = 10;
        int z = 2;
        System.out.println(y / z);
            System.out.println("\n");


        //3

        int a = 8;
        int b = 9;
        int c = 5;
        int d = 4;
        System.out.println(a * b - c / d);

        int e = 31;
        int f = 3;
        d = 4;
        System.out.println((e % f) % d);

        e = 31;
        f = 3;
        d = 4;
        System.out.println(e% (f % d));

        int g = 7;
        int h = 1;
        d = 4;
        f = 3;
        z = 2;
        System.out.println(g % h +d / f * z - z % z);
            System.out.println("\n");


        //4

        int Fahrenheit, Celsius;

        Fahrenheit = 72;
        Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.println("Temperatura in Celsius este de: " +Celsius);
            System.out.println("\n");


        //5

        float inch, metru;

        inch = 72;
        metru = (float) (inch * 0.03);
        System.out.println(+metru);



    }

}