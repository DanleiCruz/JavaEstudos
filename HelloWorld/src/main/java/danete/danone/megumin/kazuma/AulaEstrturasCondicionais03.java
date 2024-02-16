package danete.danone.megumin.kazuma;

public class AulaEstrturasCondicionais03 {
    public static void main(String[] args) {

//        double salario = 6000;
//        String mensagemDoar = "vou doar 500";
//        String mensagemNaoDoar = "Não posso doar";
//
//        if(salario >= 5000){
//            System.out.println(mensagemDoar);
//        }else{
//            System.out.println(mensagemNaoDoar);
//        }
        double salario = 4000;
        String resultado = salario >= 5000 ? "vou doar 500" : "não posso doar";
        System.out.println(resultado);
    }
}
