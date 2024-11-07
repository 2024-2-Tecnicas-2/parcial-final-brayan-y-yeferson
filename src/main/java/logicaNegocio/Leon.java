package logicaNegocio;

public class Leon extends Animal{

    @Override
    public String emitirSonido(){
       return "RUGIDO";
   }

    @Override
    public String obtenerDieta() {
        return "CARNIVORO";
    }
}
