package danete.danone.megumin.kazuma;

import java.util.Scanner;

public class AulaEstruturasCondicionais02 {
    public static void main (String[] args){
        // idade < 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulto

        // Scanner scanner = new Scanner(System.in);
        // int idade = scanner.nextInt();

        int idade = 16;
        String categoria;

        if (idade < 15){
            categoria = "Categoria infantil";

        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";

        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
