package logicaNegocio;

public class Leon extends Animal{

    TipoHabitat tipoHabitat = TipoHabitat.TERRESTRE;

    @Override
    String emitirSonido(){
       return "RUGIDO";
   }

    @Override
    String obtenerDieta() {
        return "CARNIVORO";
    }
}
