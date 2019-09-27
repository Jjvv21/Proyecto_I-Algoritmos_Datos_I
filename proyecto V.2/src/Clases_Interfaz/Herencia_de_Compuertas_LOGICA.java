package Clases_Interfaz;

import Clases_Interfaz.Herencia_de_Compuertas_LOGICA.Gates;

public class Herencia_de_Compuertas_LOGICA {
	
	Herencia_de_Compuertas_LOGICA compuerta; 
	
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
			CompuertaAND compuertaAND = new CompuertaAND();
			compuertaAND.setEntradaUno(Entrada_Uno);
			compuertaAND.setEntradaDos(Entrada_Dos);
			compuertaAND.setSalida(compuertaAND.getEntradaUno(), compuertaAND.getEntradaDos());
			System.out.println("salida para el NOR = "+compuertaAND.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.XNOR) {
			CompuertaAND compuertaAND = new CompuertaAND();
			compuertaAND.setEntradaUno(Entrada_Uno);
			compuertaAND.setEntradaDos(Entrada_Dos);
			compuertaAND.setSalida(compuertaAND.getEntradaUno(), compuertaAND.getEntradaDos());
			System.out.println("salida para el XNOR = "+compuertaAND.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.XOR) {
			CompuertaAND compuertaAND = new CompuertaAND();
			compuertaAND.setEntradaUno(Entrada_Uno);
			compuertaAND.setEntradaDos(Entrada_Dos);
			compuertaAND.setSalida(compuertaAND.getEntradaUno(), compuertaAND.getEntradaDos());
			System.out.println("salida para el XOR = "+compuertaAND.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.NOT) {
			CompuertaAND compuertaAND = new CompuertaAND();
			compuertaAND.setEntradaUno(Entrada_Uno);
			compuertaAND.setEntradaDos(Entrada_Dos);
			compuertaAND.setSalida(compuertaAND.getEntradaUno(), compuertaAND.getEntradaDos());
			System.out.println("salida para el NOT = "+compuertaAND.getSalida());
			
		}else if(tipo_Compuertas == Gate_type.NAND) {
			CompuertaAND compuertaAND = new CompuertaAND();
			compuertaAND.setEntradaUno(Entrada_Uno);
			compuertaAND.setEntradaDos(Entrada_Dos);
			compuertaAND.setSalida(compuertaAND.getEntradaUno(), compuertaAND.getEntradaDos());
			System.out.println("salida para el NAND = "+compuertaAND.getSalida());
			
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
