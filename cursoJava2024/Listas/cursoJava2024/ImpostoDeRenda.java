package cursoJava2024;

public class ImpostoDeRenda {

    public static double calcularImposto(double salario) {
        double imposto = 0;
        if (salario > 1903.98) {
            if (salario <= 2826.65) {
                imposto = (salario - 1903.98) * 0.075; 
            } else if (salario <= 3751.05) {
                imposto = (salario - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
            } 
        }
        return imposto;
    }

    public static void main(String[] args) {
        double salario = 2500; 
        double imposto = calcularImposto(salario);
        System.out.println("Imposto de renda para salário de R$" + salario + ": R$" + imposto);
    }
}