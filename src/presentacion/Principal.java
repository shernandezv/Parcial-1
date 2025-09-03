package presentacion;
import logic.Persona;
import logic.Hombre;
import logic.Mujer;

public class Principal {
	Persona p;
	public Principal() {
		caso1();
		caso2();
	}
	
	public void caso1() {
		//no arroja excepción
		 this.p = new Hombre(80, 180, 18);
		 
		 try {
			System.out.println("El TMB calculado es de " + p.calcularTMB());
		} catch (Exception e) {
			e.printStackTrace();
		}
		 this.p = new Mujer(60, 150, 20);
		 
		 try {
			System.out.println("El TMB calculado es de " + p.calcularTMB());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void caso2() {
		//si arroja excepción
		 //this.p = new Mujer(90, 150, 18);
		 //try {
			//System.out.println("El TMB calculado es de " + p.calcularTMB());
		//} catch (Exception e) {
			//e.printStackTrace();
		//}
		 this.p = new Hombre(90, 130, 18);
		 try {
			System.out.println("El TMB calculado es de " + p.calcularTMB());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
