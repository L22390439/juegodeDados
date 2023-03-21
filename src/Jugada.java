public class Jugada {
    Jugador jugador1;
    Jugador jugador2;
    Dado dado1;
    Dado dado2;

    //Este método hace la función del constructor
    public void iniciarJugada(Jugador jugador1, Jugador jugador2, Dado dado1, Dado dado2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    public void determinarGanador(){
        turnarJugador(this.jugador1);
        turnarJugador(this.jugador2);
        //return
    }

    private void turnarJugador(Jugador jugadorEnTurno){
        jugadorEnTurno.lanzaDados(this.dado1, this.dado2);
    }

}
