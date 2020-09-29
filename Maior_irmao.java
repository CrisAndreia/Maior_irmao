import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
		System.out.println("Inicio");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        String n = Integer.toString(s);

        char[] digitos = n.toCharArray();
        ArrayList<String> resultadoList = new ArrayList<>();
        for (char digito : digitos) {
            resultadoList.add(String.valueOf(digito));
        }
        resultadoList.sort(Collections.reverseOrder());
        StringBuilder resultado = new StringBuilder();
        resultadoList.forEach(resultado::append);

        //System.out.println(resultado.toString());
        System.out.println(Integer.parseInt(resultadoList));
  }
}
