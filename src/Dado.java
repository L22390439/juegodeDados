public class Dado {
    public byte puntos;
    public void lanzar(){
        //Simular el lanzamiento
        this.puntos = (byte) (Math.random() * (7 - 1));
    }

}
