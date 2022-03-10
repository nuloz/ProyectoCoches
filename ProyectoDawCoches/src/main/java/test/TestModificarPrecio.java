package test;

import dao.DaoCoches;

public class TestModificarPrecio {

	public TestModificarPrecio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DaoCoches dao = new DaoCoches();
		dao.modificarPrecio(1, (double) 12000);
	}
}
