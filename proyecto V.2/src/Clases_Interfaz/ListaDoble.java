package Clases_Interfaz;


public class ListaDoble {
	private Nodos inicio,fin; 
	public ListaDoble() {
		inicio=fin=null; 
		
	}
	//METODO PARA SABER CUANDO LA LISTA ESTA VACIA 
	public boolean estVacia() {
		return inicio==null; 
	}
	//METODO PARA AGREGAR NODOS AL FINAL 
	public void agregarALFinal(int el) {
		if(!estVacia()) {
			fin = new Nodos(el,null,fin);
			fin.anterior.siguiente=fin; 
			
		}else {
			inicio=fin=new Nodos(el);
		}
	}
	//METODO PARA AGREGAR AL INICIO 
	public void agregarALInicio(int el) {
		if(!estVacia()) {
			inicio = new Nodos(el,inicio,null);
			inicio.siguiente.anterior=inicio; 
			
		}else {
			inicio=fin=new Nodos(el);
		}
		
	}
	//METODO PARA MOSTRAR LA LISTA DE INICIO A FIN 
	public void mostrarListaInicioFin() {
		if(!estVacia()) {
			String datos="<=>";
			Nodos auxiliar= inicio;
			while(auxiliar!=null) {
				datos = datos +"["+auxiliar.dato+"]<=>";
				auxiliar = auxiliar.siguiente;
			}

		}
		
	}
	//METODO PARA MOSTRAR LA LISTA 
	public void mostarLaListaFinInicio() {
		if(!estVacia()) {
			String datos="<=>";
			Nodos auxiliar= fin;
			while(auxiliar!=null) {
				datos = datos +"["+auxiliar.dato+"]<=>";
				auxiliar = auxiliar.anterior;
			}

		}
		
	}
	

}

