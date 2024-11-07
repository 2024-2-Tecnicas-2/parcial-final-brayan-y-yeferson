package logicaNegocio;

public class Perro extends Animal implements Domestico{
    
    

    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }

    @Override
    String emitirSonido() {
        return "Ladrido";
       
    }

    @Override
    String obtenerDieta() {
        return "Omnívoro";
    }
    
}
