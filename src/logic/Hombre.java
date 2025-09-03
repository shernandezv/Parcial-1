package logic;

public class Hombre extends Persona implements Calculos{

	public Hombre(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	public double resultadoTMB() {
		return 88.362 + (13.397*this.peso) + (4.799*this.altura) - (5.677*this.edad);
	}

	@Override
	public double calcularTMB() throws Exception {
		if (!((60 <= this.peso && this.peso <= 110) && (160 <= this.altura && this.altura <= 195) && (15 < this.edad))) {
			throw new Exception("Las características del hombre no la hacen apto para la prueba TMB");
		} else {
			return resultadoTMB();
		}
	}

}
