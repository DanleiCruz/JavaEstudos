package danete.danone.megumin.kazuma;

public class AulaEstruturasCondicionais {
    public static void main (String[] args){
        int idade = 16;
        boolean autorizado = idade >= 18;

        if (autorizado){
            System.out.println("Autorizado");
        }
        if (!autorizado){
            System.out.println("Não Autorizado");
        }
    }
}
