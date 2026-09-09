import java.util.Scanner;

public class App {
    
/* 
            //Arreglos
            int [] arreglo1 = {1,2,3,4,5};
            //mostrar elemento de un arreglo
            System.out.println(arreglo1[2]);
            //iterar un arreglo arreglo1
            for(int i=0; i<arreglo1.length; i++){
                System.out.println("El numero es: "+arreglo1[i]);

            }
  
*/

/*Ejercicio 1
Crea un programa que tenga un arreglo con 5 elementos enteros y 
muestren toddos los numeros que sean divisibles entre 2
 */

public void ejercicio1(){
    int arreglo2[] = {1,2,3,4,5};
    for(int i=0; i<arreglo2.length; i++){
        if (arreglo2[i] % 2 == 0){
            System.out.println("Los numeros divisibles entre 2 son: "+arreglo2[i]);
        }
    }
}

/*Crea un arreglo de 10 elementos, el programa debe recorrer el arrehlo y calular la 
suma de todos los numeros contenidos en el arreglo, debe mostrar la cantidad total asi
 como el promedio**/
public void ejercicio2(){

    int arreglo3[] = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;
        for(int i = 0; i<arreglo3.length; i++){
        System.out.println(arreglo3[i]);
        suma += arreglo3[i];
        }
            System.out.println("La suma de los numeros es: "+suma);
            System.out.println("El promedio de los numeros es: "+suma/10);
}
    //hecho por el profesor Roland
    public void ejercicio2_2(){
        double [] calificaciones = {7,7,7,7,9,10,8,5,5,5};
        double suma = 0;
        double promedio = 0;
            for(int i = 0; i<calificaciones.length; i++){
            suma += calificaciones[i];
        }
        promedio = suma/calificaciones.length;
        System.out.println("La suma total es: "+suma);
        System.out.println("El promedio es: "+promedio);
}

/*Crea un arreglo de 8 numeros y determina cual es el numero mayor */

    public void ejercicio3(){
        int numM = 0;
        int arreglo3[] = {100,23,3,4,15,6,7,8};
        for (int i = 0; i<arreglo3.length; i++){
         
            if (arreglo3[i]>numM){
                numM = arreglo3[i];
            }
        }
        System.out.println("El numero mayor es: "+numM);
    }

/*rea un arreglo de 10 números enteros.
Después, solicita al usuario que introduzca un número mediante el tecla */

        public void ejercicio4(){
        Scanner entrada = new Scanner(System.in);

        int arreglo4[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Introduce algun numero: ");
        int numero = entrada.nextInt();
        int encontrado = 0;

        for(int i=0; i<arreglo4.length; i++){

            if(arreglo4[i] == numero){

                encontrado++;
            }
        }
        if(encontrado > 0){
            System.out.println("El numero fue encontrado");
        }else{
            System.out.println("El numero no se encuentra");
        }
    }

/*Crea un arreglo de 10 números enteros.
El programa deberá recorrer todos los elementos del arreglo y determinar cuántos números son pares y cuántos son impares.
Para determinar si un número es par o impar deberás utilizar el operador módulo o residuo (%). */
    public void ejercicio5(){

    int arreglo5[] = {1,2,3,4,5,6,7,8,9,10};

    int pares = 0;
    int impares = 0;

    for(int i=0; i<arreglo5.length; i++){

        if(arreglo5[i] % 2 == 0){
            pares++;
        }else{
            impares++;
        }

    }

    System.out.println("Pares: "+pares);
    System.out.println("Impares: "+impares);

}
        public static void main(String[] args) throws Exception {
        App app = new App();
        app.ejercicio4();
        
    }



}