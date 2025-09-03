package logic;

public class Mujer extends Persona implements Calculos{

	public Mujer(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	public double resultadoTMB() {
		return 447.593 + (9.247*this.peso) + (3.098*this.altura) - (4.33*this.edad);
	}

	@Override
	public double calcularTMB() throws Exception{
		if (!((40 <= this.peso && this.peso <= 80) && (140 <= this.altura && this.altura <= 180) && (15 < this.edad))) {
			throw new Exception("Las características de la mujer no la hacen apta para la prueba TMB");
		} else {
			return resultadoTMB();
		}
	}

}
