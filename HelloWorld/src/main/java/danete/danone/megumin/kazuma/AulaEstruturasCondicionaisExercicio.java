package danete.danone.megumin.kazuma;

public class AulaEstruturasCondicionaisExercicio {
    public static void main(String[] args) {

        double salario = 70000;
        double taxa = salario;
        if (salario <= 34700){
            taxa = salario * 0.097;
        } else if (salario > 34700 && salario <= 68507) {
            taxa = salario * 0.3735;
        } else {
            taxa = salario * 0.4950;
        }
        System.out.println("A taxa a ser paga é de "+taxa);
    }
}
