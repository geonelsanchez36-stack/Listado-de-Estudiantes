public class Estudiante {
    private String Ci;
    private String nombre;
    private String apellido;
    private String sexo;
    private String mesCumple;
    private int año;
    private boolean esMilitanteUJC;
    private boolean esBecado;

    public Estudiante(String ci, String nombre, String apellido, String sexo,
                      String mesCumple, int año, boolean esMilitanteUJC, boolean esBecado) {
        Ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.mesCumple = mesCumple;
        this.año = año;
        this.esMilitanteUJC = esMilitanteUJC;
        this.esBecado = esBecado;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String ci) {
        Ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMesCumple() {
        return mesCumple;
    }

    public void setMesCumple(String mesCumple) {
        this.mesCumple = mesCumple;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isEsMilitanteUJC() {
        return esMilitanteUJC;
    }

    public void setEsMilitanteUJC(boolean esMilitanteUJC) {
        this.esMilitanteUJC = esMilitanteUJC;
    }

    public boolean isEsBecado() {
        return esBecado;
    }

    public void setEsBecado(boolean esBecado) {
        this.esBecado = esBecado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Ci='" + Ci + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sexo='" + sexo + '\'' +
                ", mesCumple='" + mesCumple + '\'' +
                ", año='" + año + '\'' +
                ", esMilitanteUJC=" + esMilitanteUJC +
                ", esBecado=" + esBecado +
                '}';
    }
}
