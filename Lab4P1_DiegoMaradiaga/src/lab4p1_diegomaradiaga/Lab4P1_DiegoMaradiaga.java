package lab4p1_diegomaradiaga;

import java.util.Scanner;

public class Lab4P1_DiegoMaradiaga {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println(">>>>>>     MENU     <<<<<<");
            System.out.println("1) Sumador binario           ");
            System.out.println("2) Contains                  ");
            System.out.println("3) Alpha                     ");
            System.out.println("4) Salida                    ");
            System.out.print("Ingrese su opcion: ");
            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    String cadena1,
                     cadena2;
                    System.out.println("Ingrese el primer numero: ");
                    cadena1 = leer.next();
                    System.out.println("Ingrese el segundo numero: ");
                    cadena2 = leer.next();

                    int contador = 0;
                    for (int i = 0; i < cadena1.length(); i++) {
                        char letra = cadena1.charAt(i);
                        if (letra != '0' || letra != '1') {
                            System.out.println("El primer numero contiene caracteres distintos de '0' y '1");
                        }//Fin if
                        contador = contador + 1;
                    }//Fin for

                    int contador2 = 0;
                    for (int i = 0; i < cadena2.length(); i++) {
                        char letra2 = cadena2.charAt(i);
                        if (letra2 != '0' || letra2 != '1') {
                            System.out.println("El segundo numero contiene caracteres distintos de '0' y '1");
                        }//Fin if
                        contador2 = contador2 + 1;
                    }//Fin for

                    while (contador != contador2) {
                        System.out.println("Los números deben de tener el mismo número de bits.");
                        System.out.println("Ingrese el primer numero: ");
                        cadena1 = leer.next();
                        System.out.println("Ingrese el segundo numero: ");
                        cadena2 = leer.next();
                    }//Fin while

                    break;
                case 2:
                    String frase1,
                     frase2;
                    System.out.println("Ingrese la primera cadena: ");
                    leer.nextLine();
                    frase1 = leer.nextLine();
                   
                    System.out.println("Ingrese la segunda cadena: ");
                    frase2 = leer.nextLine();
                   
                    contains(frase1,frase2);
                    break;
                case 3:
                    String cadena;
                    System.out.println("Ingrese la cadena que desea evaluar: ");
                    cadena = leer.next().toLowerCase();
                    alpha(cadena);
                    break;
            }//Fin switch

        } while (opcion != 4);

    }//Fin main

    public static void sumadorbinario(String cadena1, String cadena2) {
        for (int i = cadena1.length(); i >= 0; i--) {

        }
        for (int i = cadena2.length(); i >= 0; i--) {

        }
    }//Metodo sumadorbinario

    public static void contains(String frase1, String frase2) {
       
        String contenedor = "";
        String contenedor2 = "";
       
        for (int i = 0; i < frase2.length(); i++) {
            char c22=' ';
            char c2 = frase2.charAt(i);
            if(i!=frase2.length()-1){
                c22 = frase2.charAt(i+1);
            }
            
            

            for (int j = 0; j < frase1.length(); j++) {
                char c1 = frase1.charAt(j);
                char c11 =' ';
                if(j!=frase1.length()-1){
                   c11 = frase1.charAt(j+1);
                }
                
                 
              
                if (c2 == c1 &&c22==c11) {
                    contenedor = contenedor + c1;
                } 
            }//Fin for j
        }//Fin for i
        int size = frase2.length()-1;
        contenedor2 = contenedor2 + frase1.charAt(size);
        System.out.println(frase2);
        System.out.println(contenedor);
        System.out.println(contenedor2);
        if (contenedor.equals(frase2)) {
           System.out.println("La cadena " + frase1 + " contiene a la cadena " + frase2 + ". ");
        } else {
            
            System.out.println("La cadena " + frase1 + " no contiene a la cadena " + frase2 + ". ");
        }
       

    }//Metodo contains

    public static void alpha(String cadena) {
        boolean c;
        c = true;

        for (int j = 0; j < cadena.length(); j++) {
            char letra = cadena.charAt(j);
            if ((int) letra >= 97 && (int) letra < 123) {
                c = true;
            }//Fin if
        }//Fin for interno

        if (c) {
            System.out.println("La cadena sólo contiene letras.");
        } else {
            System.out.println("La cadena contiene caracteres que no son letras");
        }
    }//Metodo alpha
}//Fin clase
