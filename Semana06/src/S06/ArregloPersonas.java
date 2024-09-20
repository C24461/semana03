package S06;

public class ArregloPersonas {
    private Persona[] personas = new Persona[5];
    private int index;

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public void setPersona(Persona p){
        personas[index] = p;
        index++;
    }
    
    public Persona getPersona(int index){
        return personas[index];
    }
    
    
    
}
