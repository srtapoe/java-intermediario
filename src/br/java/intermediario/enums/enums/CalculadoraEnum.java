package br.java.intermediario.enums.enums;

public enum CalculadoraEnum {

        SOMAR("+"), SUBTRAIR("-"), MULTIPLICAR("*"), DIVIDIR("/");

        private final String simbolo;

        CalculadoraEnum(String simbolo){
            this.simbolo = simbolo;
        }

    @Override
    public String toString() {
        return "CalculadoraEnum{" +
                "simbolo='" + simbolo + '\'' +
                '}';
    }

   public double execeutarOperacao(double numeroUm, double numeroDois){
            double resultado = 0;
       switch (simbolo) {
           case "+" -> {
               System.out.println(CalculadoraEnum.SOMAR);
               resultado = numeroUm + numeroDois;
               System.out.println(resultado);
           }
           case "-" -> {
               System.out.println(CalculadoraEnum.SUBTRAIR);
               resultado = numeroUm - numeroDois;
               System.out.println(resultado);
           }
           case "*" -> {
               System.out.println(CalculadoraEnum.MULTIPLICAR);
               resultado = numeroUm * numeroDois;
               System.out.println(resultado);
           }
           case "/" -> {
               System.out.println(CalculadoraEnum.DIVIDIR);
               resultado = numeroUm / numeroDois;
               System.out.println(resultado);
           }
           default -> System.out.println("Operação não identificada!");
       }
       return resultado;
   }
}
