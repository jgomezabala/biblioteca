public class Socio extends Persona {
    private int tfno;
    private Libro libroPrestado;

    /**
     *
     * @param nombre
     * @param edad
     * @param tfno
     */
    public Socio(String nombre, int edad, int tfno) {
        super(nombre, edad);
        this.tfno = tfno;
    }

    /**
     *
     * @return libroPrestado
     */
    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    /**
     *
     * @param libroPrestado
     */
    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    /**
     *
     * @param nombre
     * @param edad
     * @param tfno
     * @param libro
     */
    public Socio(String nombre, int edad, int tfno, Libro libro) {
        super(nombre, edad);
        this.tfno = tfno;
        this.libroPrestado = libro;
    }

    /**
     *
     * @return tfno
     */
    public int getTfno() {
        return tfno;
    }

    /**
     *
     * @param tfno
     */
    public void setTfno(int tfno) {
        this.tfno = tfno;
    }
}
