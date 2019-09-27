package Clases_Interfaz;

import Clases_Interfaz.Herencia_de_Compuertas_LOGICA.Gates;

public class Herencia_de_Compuertas_LOGICA {
	
	Herencia_de_Compuertas_LOGICA compuerta; 
	private String EntradaUno = "";
	public Herencia_de_Compuertas_LOGICA() {
	}
	public String getInput1() {
		return EntradaUno;
	}
	public void setInput1(String Entrada) {
		EntradaUno = Entrada;
	}
	public Herencia_de_Compuertas_LOGICA(String EntradaUno) {
		this.EntradaUno = EntradaUno;
	}
	/**
	 * Interface para las compuertas que hereda los metodos Getters and Setters de Inputs y Outputs
	 */
	interface Gates extends Compuertas_LOGICA{
		
	}
	class CompuertaAND implements Gates{
		private int EntradaUno;
		private int EntradaDos;
		private int Salida;
		
		public void setEntradaUno(int EntradaUno) {
			this.EntradaUno = EntradaUno; 
	
		}
		@Override
		public int getEntradaUno() {
			return EntradaUno; 
		}
		@Override
		public int getEntradaDos() {
			return EntradaDos;
			
		}
		@Override
		public int getSalida() {
			return Salida;
		
			
		}
		@Override
		public void setEntradaDos(int EntradaDos) {
			this.EntradaDos = EntradaDos; 

			
		}
		@Override
		public void setSalida(int EntradaUno, int EntradaDos) {
			int Val = 0;
			if (EntradaUno == 1 && EntradaDos == 1) {
				Val = 1; 
			}
			this.Salida = Val; 
			
			
		}
	}
	class CompuertaOR implements Gates{
		private int EntradaUno;
		private int EntradaDos;
		private int Salida;
		
		public void setEntradaUno(int EntradaUno) {
			this.EntradaUno = EntradaUno; 
		}
		@Override
		public int getEntradaUno() {
			return EntradaUno; 
		}
		@Override
		public int getEntradaDos() {
			return EntradaDos;
			
		}
		@Override
		public int getSalida() {
			return Salida;
		
			
		}
		@Override
		public void setEntradaDos(int EntradaDos) {
			this.EntradaDos = EntradaDos; 

			
		}
		@Override
		public void setSalida(int EntradaUno, int EntradaDos) {
			int Val = 0;
			if (EntradaUno == 1 || EntradaDos == 1) {
				Val = 1; 
			}
			this.Salida = Val; 
			
			
		}
	}
	class CompuertaNOT implements Gates{
		private int EntradaUno;
		private int EntradaDos;
		private int Salida;
		
		public void setEntradaUno(int EntradaUno) {
			this.EntradaUno = EntradaUno; 
		}
		@Override
		public int getEntradaUno() {
			return EntradaUno; 
		}
		@Override
		public int getEntradaDos() {
			return EntradaDos;
			
		}
		@Override
		public int getSalida() {
			return Salida;
		
			
		}
		@Override
		public void setEntradaDos(int EntradaDos) {
			this.EntradaDos = EntradaDos; 

			
		}
		@Override
		public void setSalida(int EntradaUno, int EntradaDos) {
			int Val = 0;
			if (EntradaUno == 1) {
				Val = 0; 
			}else {
				Val = 1; 
			}
			this.Salida = Val; 
			
			
		}
	}
	class CompuertaXOR implements Gates{
		private int EntradaUno;
		private int EntradaDos;
		private int Salida;
		
		public void setEntradaUno(int EntradaUno) {
			this.EntradaUno = EntradaUno; 
		}
		@Override
		public int getEntradaUno() {
			return EntradaUno; 
		}
		@Override
		public int getEntradaDos() {
			return EntradaDos;
			
		}
		@Override
		public int getSalida() {
			return Salida;
		
			
		}
		@Override
		public void setEntradaDos(int EntradaDos) {
			this.EntradaDos = EntradaDos; 

			
		}
		@Override
		public void setSalida(int EntradaUno, int EntradaDos) {
			int Val = 0;
			if((EntradaUno == 1 && EntradaDos == 0) || (EntradaUno == 0 && EntradaDos == 1)) {
				Val = 1;
			}
			this.Salida = Val;
			
			
		}
	}
	class CompuertaXNOR implements Gates{
		private int EntradaUno;
		private int EntradaDos;
		private int Salida;
		
		public void setEntradaUno(int EntradaUno) {
			this.EntradaUno = EntradaUno; 
		}
		@Override
		public int getEntradaUno() {
			return EntradaUno; 
		}
		@Override
		public int getEntradaDos() {
			return EntradaDos;
			
		}
		@Override
		public int getSalida() {
			return Salida;
		
			
		}
		@Override
		public void setEntradaDos(int EntradaDos) {
			this.EntradaDos = EntradaDos; 

			
		}
		@Override
		public void setSalida(int EntradaUno, int EntradaDos) {
			int Val = 1;
			if((EntradaUno == 1 && EntradaDos == 0) || (EntradaUno == 0 && EntradaDos == 1)) {
				Val = 0;
			}
			this.Salida = Val;
			
			
		}
	}
	class CompuertaNAND implements Gates{
		private int EntradaUno;
		private int EntradaDos;
		private int Salida;
		
		public void setEntradaUno(int EntradaUno) {
			this.EntradaUno = EntradaUno; 
		}
		@Override
		public int getEntradaUno() {
			return EntradaUno; 
		}
		@Override
		public int getEntradaDos() {
			return EntradaDos;
			
		}
		@Override
		public int getSalida() {
			return Salida;
		
			
		}
		@Override
		public void setEntradaDos(int EntradaDos) {
			this.EntradaDos = EntradaDos; 

			
		}
		@Override
		public void setSalida(int EntradaUno, int EntradaDos) {
			int Val = 1;
			if(EntradaUno == 1 && EntradaDos == 1) {
				Val = 0;
			}
			this.Salida = Val;
			
			
		}
	}
	class CompuertaNOR implements Gates{
		private int EntradaUno;
		private int EntradaDos;
		private int Salida;
		
		public void setEntradaUno(int EntradaUno) {
			this.EntradaUno = EntradaUno; 
		}
		@Override
		public int getEntradaUno() {
			return EntradaUno; 
		}
		@Override
		public int getEntradaDos() {
			return EntradaDos;
			
		}
		@Override
		public int getSalida() {
			return Salida;
		
			
		}
		@Override
		public void setEntradaDos(int EntradaDos) {
			this.EntradaDos = EntradaDos; 

			
		}
		@Override
		public void setSalida(int EntradaUno, int EntradaDos) {
			int Val = 1;
			if(EntradaUno == 1 || EntradaDos == 1) {
				Val = 0;
			}
			this.Salida = Val; 
			
		}
	}
	public void setLogica_en_Compuertas(Herencia_de_Compuertas_LOGICA compuerta, Gate_type tipo_Compuertas,int Entrada_Uno, int Entrada_Dos) {
		if(tipo_Compuertas == Gate_type.AND ) {
			CompuertaAND compuertaAND = new CompuertaAND();
			compuertaAND.setEntradaUno(Entrada_Uno);
			compuertaAND.setEntradaDos(Entrada_Dos);
			compuertaAND.setSalida(compuertaAND.getEntradaUno(), compuertaAND.getEntradaDos());
			System.out.println("salida para el AND = "+compuertaAND.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.OR) {
			CompuertaOR compuertaOR = new CompuertaOR();
			compuertaOR.setEntradaUno(Entrada_Uno);
			compuertaOR.setEntradaDos(Entrada_Dos);
			compuertaOR.setSalida(compuertaOR.getEntradaUno(), compuertaOR.getEntradaDos());
			System.out.println("salida para el OR = "+compuertaOR.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.NOR) {
			CompuertaNOR compuertaNOR = new CompuertaNOR();
			compuertaNOR.setEntradaUno(Entrada_Uno);
			compuertaNOR.setEntradaDos(Entrada_Dos);
			compuertaNOR.setSalida(compuertaNOR.getEntradaUno(), compuertaNOR.getEntradaDos());
			System.out.println("salida para el NOR = "+compuertaNOR.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.XNOR) {
			CompuertaXNOR compuertaXNOR = new CompuertaXNOR();
			compuertaXNOR.setEntradaUno(Entrada_Uno);
			compuertaXNOR.setEntradaDos(Entrada_Dos);
			compuertaXNOR.setSalida(compuertaXNOR.getEntradaUno(), compuertaXNOR.getEntradaDos());
			System.out.println("salida para el XNOR = "+compuertaXNOR.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.XOR) {
			CompuertaXOR compuertaXOR = new CompuertaXOR();
			compuertaXOR.setEntradaUno(Entrada_Uno);
			compuertaXOR.setEntradaDos(Entrada_Dos);
			compuertaXOR.setSalida(compuertaXOR.getEntradaUno(), compuertaXOR.getEntradaDos());
			System.out.println("salida para el XOR = "+compuertaXOR.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.NOT) {
			CompuertaNOT compuertaNOT = new CompuertaNOT();
			compuertaNOT.setEntradaUno(Entrada_Uno);
			compuertaNOT.setEntradaDos(Entrada_Dos);
			compuertaNOT.setSalida(compuertaNOT.getEntradaUno(), compuertaNOT.getEntradaDos());
			System.out.println("salida para el NOT = "+compuertaNOT.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.NAND) {
			CompuertaNAND compuertaNAND = new CompuertaNAND();
			compuertaNAND.setEntradaUno(Entrada_Uno);
			compuertaNAND.setEntradaDos(Entrada_Dos);
			compuertaNAND.setSalida(compuertaNAND.getEntradaUno(), compuertaNAND.getEntradaDos());
			System.out.println("salida para el NAND = "+compuertaNAND.getSalida());
			
		}
		this.compuerta = compuerta; 
	}
	enum Gate_type{
		AND,OR,NOT,NOR,XNOR,XOR,NAND 
	}
	public Herencia_de_Compuertas_LOGICA getcompuerta() {
		return compuerta;
	}
	

}
