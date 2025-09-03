package logic;

public abstract class Persona {
	// Atributos
	protected double peso;
	protected double altura;
	protected int edad;
	
	//Métodos
	public abstract double calcularTMB() throws Exception;
	
	//Constructor
	public Persona(double peso, double altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
}
