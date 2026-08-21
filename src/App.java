import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*
        int a =5;
        int b =10; 
        boolean mayorDeEdad = true;
        boolean tieneCarnet= false;
        System.out.println("Hello, World!");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(mayorDeEdad && tieneCarnet);
        System.out.println(mayorDeEdad || tieneCarnet);
        System.out.println  (!mayorDeEdad);



        Scanner sc = new Scanner (System.in);
        System.out.println ("Como te llamas ?");
        String nombre = sc.nextLine();
        System.out.println("Cuantos años tienes");
        int edad = sc.nextInt();
        System.out.println("Hola,"+ nombre + ", tienes"+ edad + "años");

        System.out.print ("Nota 1:");
        int nota1 = sc.nextInt();
        System.out.print("Nota 2:");
        int nota2 = sc.nextInt();
        System.out.print("Nota 3:");
        int nota3 = sc.nextInt();
        int promedio = (nota1 + nota2 + nota3 ) /3;
        System.out.print("Tu promedio es  " + promedio  );
        sc.close ();
        */
        System.out.println("Cual es tu nota");
        int nota = sc.nextInt();
        if (nota >= 90){
            System.out.print("Excelente");
        } else if (nota >= 70){
            System.out.print ("Bueno");
        } else if (nota >=60 ){
            System.out.print ("Aprobado");
        } else {
            System.out.print ("Reprobado");
        }
        

    
    
        
        


    }
}
