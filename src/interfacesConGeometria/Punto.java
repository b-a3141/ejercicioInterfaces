package interfacesConGeometria;

import java.util.Objects;

public class Punto implements Desplazable, Comparable<Punto> {

	private double x;
	private double y;
	
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanciaCon(Punto otroPunto) {
		return Math.sqrt( Math.pow((this.x-otroPunto.x),2) + Math.pow((this.y-otroPunto.y),2) );
	}
	
	private double distanciaAlOrigen() {
		return Math.sqrt( Math.pow((this.x),2) + Math.pow((this.y),2) );
	}

	protected double getX() {
		return x;
	}

	protected double getY() {
		return y;
	}

	
	protected void setX(double x) {
		this.x = x;
	}

	protected void setY(double y) {
		this.y = y;
	}

	
		
	
	@Override
	public String toString() {
		return "("+ this.x + ", " + this.y + ")";
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.setX(this.getX() + deltaX);
		this.setY(this.getY() + deltaY);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	@Override
	public int compareTo(Punto o) {
		
		// si tienen mismo módulo && misma X && misma Y
		 if ( this.distanciaAlOrigen() == o.distanciaAlOrigen() &&
			 this.getX() == o.getX() &&
				 this.getY() == o.getY())  {
			 return 0; 
				 }
		 //si tienen mismo módulo y misma X pero Y de this es mayor
		 if ( this.distanciaAlOrigen() == o.distanciaAlOrigen() &&
				 this.getX() == o.getX() &&
				 (this.getY() > o.getY())   || 
		 // obien
		//si tienen mismo módulo && misma Y && X de this es mayor	
				 this.distanciaAlOrigen() == o.distanciaAlOrigen() &&
				 (this.getY() == o.getY()) &&
				 (this.getX() > o.getX())  ||
				 //o bien
		//si el módulo de this  es mayor	
				 this.distanciaAlOrigen() > o.distanciaAlOrigen() ) {
			 return 1;
			 }
		//if (this.distanciaAlOrigen() < o.distanciaAlOrigen()) {
			return  -1;
		
	} 
	

}
