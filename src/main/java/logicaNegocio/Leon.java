package logicaNegocio;

public class Leon extends Animal{

    TipoHabitat habitat = TipoHabitat.TERRESTRE;

  
    
    

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }

   
    
    

    @Override
    public String emitirSonido(){
       return "RUGIDO";
   }

    @Override
    public String obtenerDieta() {
        return "CARNIVORO";
    }
}
