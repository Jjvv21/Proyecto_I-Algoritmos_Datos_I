package Clases_Interfaz;

import javafx.scene.control.TableColumn;

public class Tabla_de_verdad {
	private TableColumn tableColumn;
	private String Entrada0 = "";
	private String Entrada1 = "";
	private String Entrada2 = "";
	private String Entrada3 = "";
	private String Entrada4 = "";

	
	public Tabla_de_verdad() {
		
	}
	/**
	 * Constructor para la Tabla de verdad, Recibe cada uno de los inputs 
	 * @param Input0
	 * @param Input1
	 * @param Input2
	 * @param Input3
	 * @param Input4
	 * @param Input5
	 */
	public Tabla_de_verdad(String Input0, String Input1, String Input2, String Input3, String Input4) {
		
	this.Entrada0 = Input0;
	this.Entrada1 = Input1;
	this.Entrada2 = Input2;
	this.Entrada3 = Input3;
	this.Entrada4 = Input4;
	
	}
	
	
	public String getEntrada0() {
		return Entrada0;
	}
	public void setEntrada0(String entrada0) {
		Entrada0=entrada0;
	}
	public String getEntrada1() {
		return Entrada1;
	}
	public void setEntrada1(String entrada1) {
		 Entrada1=entrada1;
	}
	public String getEntrada2() {
		return Entrada2;
	}
	public void setEntrada2(String entrada2) {
		 Entrada2=entrada2;
	}
	public String getEntrada3() {
		return Entrada3;
	}
	public void setEntrada3(String entrada3) {
		 Entrada3=entrada3;
	}
	public String getEntrada4() {
		return Entrada4;
	}
	public void setEntrada4(String entrada4) {
		 Entrada4=entrada4;
	
	}
}
