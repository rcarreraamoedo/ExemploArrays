package exemploarrays;

import java.util.Scanner;

public class Metodo {

    int[] numeros = new int[1];

    public void crearArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = PedirDatos.pedirInt();
        }
    }

    public void amosar() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    //recibimos o array como parámetro
    public void visualizar(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("*** " + lista[i]);
        }
    }

    public int[] encherArray(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = PedirDatos.pedirInt();
        }
        return lista;
    }

    public void buscar() {
        Scanner sc = new Scanner(System.in);
        String [] numeros = {"uno", "dos", "tres", "cuatro", "cinco"};
        String num;
        int n;

        System.out.println("Ingrese un número en letra:");
        num = sc.next();

        for (n = 0; n < numeros.length; n++) {
            if(num.equals(numeros[n])){
                System.out.println("Está en la lista");
            }else{
                System.out.println("No aparece en la lista");
            }break;
        }
    }
}
