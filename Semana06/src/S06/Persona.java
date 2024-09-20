package S06;

abstract class Persona {
   private String nombres;
   private char genero;

    public Persona(String nombres, char genero) {
        this.nombres = nombres;
        this.genero = genero;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
