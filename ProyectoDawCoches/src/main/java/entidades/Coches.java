package entidades;

/**
 * @author ADRIAN
 *
 */
public class Coches {


	public Coches() {
		// TODO Auto-generated constructor stub
	}

	public int getIdcoches() {
		return idcoches;
	}
	public void setIdcoches(int idcoches) {
		this.idcoches = idcoches;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	private int idcoches;
	private String modelo;
	private Double precio;
	private String color; 
}
