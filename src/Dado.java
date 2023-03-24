public class Dado {
    public byte puntos;

    /**
     * Este metodo simula el lazamiento de un dado,
     mediante la funcion random y adignando el valor al atributo puntos
     */
    public void lanzar(){
        //Simular el lanzamiento
        this.puntos = (byte) (Math.random() * (7 - 1));
    }

}
