package net.instituto.desa;

public class Game {
	Jugador j;
 
public void movimiento(String m) {
	j.moverDerecha(m);
	j.moverIzquierda(m);
	j.moverArriba(m);
	j.moverAbajo(m);
		}

	}