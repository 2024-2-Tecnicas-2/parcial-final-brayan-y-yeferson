package logicaNegocio;

public abstract class Animal {
    
    private TipoHabitat habitat;

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }
    
    

    public Animal() {
    }
    
    
    public abstract String emitirSonido();
    
    public abstract String  obtenerDieta();
        
}
