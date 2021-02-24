/**Universidad del Valle de Guatemala
 Fecha: 02/02/2021
 Nombre:
 Juan Carlos Bajan: 20109
 Clase Main
 */

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Esta es la clase principal en el programa, ella lleva el control de todo y brinda los datos necesarios
 * para cumplir con el objetivo. ES NECESARIO CAMBIAR DOS PARTES. EL PATH DEL ARCHIVO Y LA INSTANCIA DE LA
 * CALCULADORA. Aqui, se itera sobre todas las lineas del documento y se extrae la informacion para redirigirla
 * a la calculadora.
 * */


public class Main {

    public static void main(String[] args) {

    CalculadoraGeneral calculadora = new CalculadoraJuanBajan();
    Scanner scan = new Scanner(System.in);
    Traductor traductor = new Traductor<String>("AL");;

    System.out.println("Por favor ingrese el Stack que desea utilizar");
    System.out.println("AL para ArrayList");
    System.out.println("VE para Vector");
    System.out.println("DL para DoublyLinkedList");
    System.out.println("SL para SimpleLinkedList");



    boolean run = true;
    while (run) {
        String choice = scan.nextLine();
        if (choice == "AL" || choice == "VE" || choice == "DL" || choice == "SL") {
            traductor = new Traductor<String>(choice);
            run = false;
        } else {
            System.out.println("Por favor ingrese un valor correcto");
        }
    }

    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    String resp = "";

    try {
        archivo = new File ("C:\\Users\\juanc\\OneDrive\\Escritorio\\UVG\\Tareas\\Algoritmos y estructura de Datos\\Hoja de Trabajo3\\src\\archivo.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);

        String linea;
        while((linea=br.readLine())!=null) {
            String trad = traductor.infixToPostfix(linea);
            resp = calculadora.Calculo(trad);
            System.out.println(resp);
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }

    }
