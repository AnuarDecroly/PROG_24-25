import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int dinero = 0;

        int n500 = 0, n200 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce la cantidad (debe ser multiplo de 5)");
        dinero = reader.nextInt();

        if(dinero % 5 != 0)
        {
            System.out.println("Gañan te he dicho q sea multiplo de 5");
        }
        else{

            int dineroRestante = dinero;

            if(dineroRestante >= 500){
                n500 = dineroRestante / 500;
                dineroRestante = dineroRestante - (n500 * 500);
            }

            if(dineroRestante >= 200){
                n200 = dineroRestante / 200;
                dineroRestante = dineroRestante - (n200 * 200);
            }

            if(dineroRestante >= 100){
                n100 = dineroRestante / 100;
                dineroRestante = dineroRestante - (n100 * 100);
            }

            if(dineroRestante >= 50){
                n50 = dineroRestante / 50;
                dineroRestante = dineroRestante - (n50 * 50);
            }

            if(dineroRestante >= 20){
                n20 = dineroRestante / 20;
                dineroRestante = dineroRestante - (n20 * 20);
            }

            if(dineroRestante >= 10){
                n10 = dineroRestante / 10;
                dineroRestante = dineroRestante - (n10 * 10);
            }

            if(dineroRestante >= 5){
                n5 = dineroRestante / 5;
                dineroRestante = dineroRestante - (n5 * 5);
            }
            
        }

        System.out.println("Billetes de 500: "+n500);
        System.out.println("Billetes de 200: "+n200);
        System.out.println("Billetes de 100: "+n100);
        System.out.println("Billetes de 50: "+n50);
        System.out.println("Billetes de 20: "+n20);
        System.out.println("Billetes de 10: "+n10);
        System.out.println("Billetes de 5: "+n5);


    }
}
