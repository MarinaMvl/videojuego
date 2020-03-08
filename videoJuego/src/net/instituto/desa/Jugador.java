package net.instituto.desa;

public class Jugador {
	int y, x;
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";

	
	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void moverDerecha(String m){
	if (m.equalsIgnoreCase(DERECHA)) 
		setX(getX() + 1);
	}
	
	public void moverIzquierda(String m){
		if (m.equalsIgnoreCase(IZQUIERDA)) 
			setX(getX() - 1);
		}
	public void moverArriba(String m){
		if (m.equalsIgnoreCase(ARRIBA)) 
			setY(getY() - 1);
		}
	public void moverAbajo(String m){
		if (m.equalsIgnoreCase(ABAJO)) 
			setY(getY() + 1);
		}
		
}