package logicaNegocio;

public class Perro extends Animal implements Domestico{
    
    TipoHabitat habitat = TipoHabitat.TERRESTRE;

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }
    
    

    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }

    @Override
    public String emitirSonido() {
        return "Ladrido";
       
    }

    @Override
    public String obtenerDieta() {
        return "Omnívoro";
    }
    
}
