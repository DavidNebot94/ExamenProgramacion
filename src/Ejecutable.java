import java.util.*;

public class Ejecutable{
    public static void main(String[]args){
        int numeroDePass;
        Scanner tec=new Scanner(System.in);
        System.out.println("Ingrese el numero de contraseñas");
        numeroDePass=tec.nextInt();
        Password pass[]=new Password[numeroDePass];
        String cond,fuerte;
        int longitud;

        for(int i=0;i<numeroDePass;i++){
            System.out.println("¿Que longitud? ");
            cond=tec.next();
            if(cond.toLowerCase().equals("si")){
                System.out.println("Indica la longitud para saber la contraseña");
                longitud=tec.nextInt();
                pass=new Password(longitud);

            }else{
                pass=new Password();
                System.out.println("Escriba su contraseña de  8 caracteres:");
                pass.setContrasenia(tec.next());
            }
        }
        for(int i=0;i<numeroDePass;i++){
            if(pass.isEsFuerte(pass.getContrasenia())==true){
                fuerte="fuerte!";

            }else{
                fuerte="debil";
            }

            System.out.println("la contraseña Nº: "+(i+1)+" es igual a: "+pass.getContrasenia()+" "+" " +fuerte);

        }


    }

}