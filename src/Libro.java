public class Libro {
    private String nombre;
    private String editorial;
    private int anyo;
    private String autor;
    private boolean prestado;

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     *
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     *
     * @return anyo
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     *
     * @param anyo
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    /**
     *
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     *
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     *
     * @return prestado
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     *
     * @param prestado
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    /**
     *
     * @param nombre
     * @param editorial
     * @param anyo
     * @param autor
     * @param prestado
     */
    public Libro(String nombre, String editorial, int anyo, String autor, boolean prestado) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.anyo = anyo;
        this.autor = autor;
        this.prestado = prestado;
    }
}
