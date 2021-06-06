public class Trabajador extends Persona{
    private double salario;

    /**
     *
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     *
     * @param nombre
     * @param edad
     * @param salario
     */
    public Trabajador(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }
}
