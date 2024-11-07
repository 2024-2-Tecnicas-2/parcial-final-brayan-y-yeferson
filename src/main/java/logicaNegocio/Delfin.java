package logicaNegocio;

public class Delfin extends Animal{
    
    TipoHabitat tipoHabitat = TipoHabitat.ACUATICO;
    
    String emitirSonido() {
        return "Chirrido";
     
    }

  
    String obtenerDieta() {
        return "Pescado";
    }
    
}
