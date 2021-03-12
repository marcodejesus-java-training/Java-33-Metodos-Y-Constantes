public class Main {
    public static void main(String[] args) {
        // Creamos el objeto salario de tipo SalarioMinimo
        SalarioMinimo salario = new SalarioMinimo();

        // Modificamos el estado de la propiedad tabulador de la clase SalarioMinimo
        salario.setTabuladorConSalarioMinimo();
        // Obtenemos un Objeto de tipo TabuladorSalario
        TabuladorSalario tabulador = salario.getTabuladorConSalarioMinimo();

        // Leemos el valor de la propiedad nuevoSalario de la clase TabuladorSalario
        System.out.println(tabulador.getNuevoSalario());
    }
}
