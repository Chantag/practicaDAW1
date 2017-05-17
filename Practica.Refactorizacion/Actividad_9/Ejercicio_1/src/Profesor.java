import java.util.*;
public class Profesor extends Persona{

	private String nombre;
	private int edad;
	private List <Prestamo> prestamos;
	
	public Profesor(String numeroDeTelefono){
		super(numeroDeTelefono);
		
	}
	public void printInformacionPersonal(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("telefono: " + numeroDeTelefono);
	}
	
	
	public void printTodaLaInformacion() {
		this.printInformacionPersonal();
		
		
		for (Prestamo p: prestamo){
			System.out.println(p);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
}
