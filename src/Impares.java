import java.util.Scanner;

public class Impares {


    public static void main(String[] args) {
        int numero=0;

        double suma;
        int par=0;
        int impar=0;
        Scanner num;
        num = new Scanner(System.in);

        System.out.println("Numero:");
        numero = num.nextInt();
        for(int i=0;1<numero; i++ )
            if (numero%2==0)

            {
                par = numero + 2;

                System.out.println("Resultado de la suma:"+par);
                {

                }
            }
            else{
                impar = numero+1;
                System.out.println("Resultado de la suma:"+impar);
            }



    }


}