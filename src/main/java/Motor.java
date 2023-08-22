package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;

	void cambiarRegistro(String registro) {
		this.registro = registro;
	}

	void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasoline") this.tipo = tipo;
	}
}