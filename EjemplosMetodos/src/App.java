public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double resDiv = dividir(23, 35);

        int r = (int) dividir(23, 35);

        double resDiv1 = dividir(256, 35.8);
        double resDiv2 = dividir(2366, 35);
        double resDiv3 = dividir(21231233, 35);
        double resDiv4 = dividir(23242343, 35);

        int a = 23, b = 4545, c = 34234234;
        int max = maximo3(a, b, c);


    }

    public static double dividir(double a, double b){
        double division = 0.0;
        if(b > 0){
            division = a / b;
        }
        else{
            System.out.println("No se puede dividir por 0");
        }


        return division;
    }

    public static int maximo3(int num1, int num2, int num3){
        return maximo2(num3, maximo2(num1, num2));
    }

    public static int maximo2(int num1, int num2)
    {
        return Math.max(num1, num2);
    }

}
