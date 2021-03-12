public class SalarioMinimo {
    // Creamos Constantes Globales SALARIO_MINIMO_ACTUAL, ENDPOINT y APPLICATION_URL
    public static final double SALARIO_MINIMO_ACTUAL = 128.36;
    public static final String ENDPOINT = "/listOfEmployees";
    public static final String APPLICATION_URL = "www.google.com";

    // Creamos variables de instancia.
    // La variable tabulador que es de tipo TabuladorSalario
    private TabuladorSalario tabulador;
    // La variable resultado que es de tipo int
    private int resultado;

    // Creamos un objeto de tipo TabuladorSalario en el constructor
    public SalarioMinimo(){
        tabulador = new TabuladorSalario();
    }

    // Mostramos la estructura de un método que regresa un valor void (nada).
    public void Sumar(int numero1, int numero2){
        resultado = numero1 + numero2;
    }

    // Mostramos la estructura de un método que regresa un valor entero
    public int SumarConResultado(){
        return resultado;
    }

    // Ejemplo de un get con un tipo de dato personalizado basado en la clase TabuladorSalario
    public TabuladorSalario getTabuladorConSalarioMinimo(){
        return this.tabulador;
    }

    // Ejemplo de un set con un tipo de dato personalizado basado en la clase TabuladorSalario
    // haciendo un cálculo con el uso de la constante SALARIO_MINIMO_ACTUAL
    public void setTabuladorConSalarioMinimo(){
        tabulador.setNuevoSalario(SALARIO_MINIMO_ACTUAL * 100);
    }
}
