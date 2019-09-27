package Clases_Interfaz;


/**
 * Sobre esta clase se desarollan los metodos que utilizará 
 * una compuerta en general, se podria decir que es el constructor 
 * de una compuerta en especifico
 */
	
public interface Compuertas_LOGICA{
		
		
		/**
	     * Metodo para obtener el valor de la entrada 1
	     * @return
	     */
		public int getEntradaUno();
		
		
		
		 /**
	     * Metodo para obtener el valor de la entrada 2
	     * @return entrada - Valor de la entrada
	     */
		public int getEntradaDos();
		
		
		
		 /**
	     * Metodo para obtener la salida de la operacion logica
	     * @return - Resultado de la operacion logica
	     */
		public int getSalida();
		
		
		
		/**
	     * Metodo para establecer el valor de la entrada 1
	     * @param entrada - Valor de la entrada
	     */
		public void setEntradaUno(int EntradaUno);
		
		
		/**
	     * Metodo para establecer el valor de la segunda entrada
	     * @param EntradaDos - Valor de la entrada
	     */
		public void setEntradaDos(int EntradaDos);
		
		
		
		/**
	     * Metodo para establecer el valor de la salida
	     * @param Input1
	     * @param Input2
	     */
		public void setSalida(int EntradaUno,int EntradaDos);
		
			
}
