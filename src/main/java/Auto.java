package test;

public class Auto {
	int cantidadCreados;

	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;

	int cantidadAsientos() {
		int numeroAsientos = 0;
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] instanceof Asiento) numeroAsientos++;
		}
		return numeroAsientos;
	}

	String verificarIntegridad() {
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] == null) continue;
			if (!(this.registro == this.asientos[i].registro && this.registro == this.motor.registro))
				return "Las piezas no son originales";
		}
		return "Auto original";
	}
}