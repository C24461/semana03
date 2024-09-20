package S06;

public class Alumno extends Persona {
    private String codigo;

    public Alumno(String codigo, String nombres, char genero) {
        super(nombres, genero);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
