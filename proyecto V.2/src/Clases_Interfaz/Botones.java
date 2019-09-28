	package Clases_Interfaz;



import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Botones {
	public static int TotalEntradas = 0; 
	private Button button_A; 
	private MenuButton menuB; 
	private int EntradaUno = 0; 
	private int EntradaDos = 0; 
	
	
	/**
	 * Metodo que retorna un Boton
	 * @return Button
	 */
	public Button getButton() {
		return button_A;
	}
	/**
	 * Metodo para Crear Botones 
	 *@param button 
	 *@param Type
	*/
	public void setButton(Botones button, Button_Enum type) {
		Button new_Button = new Button();
		
		if (type == Button_Enum.Abrir) {
			new_Button.setText("Abrir");
		
		}else if (type == Button_Enum.Borrar) {
			new_Button.setText("Borrar");
			new_Button.setOnAction(new EventHandler<ActionEvent>(){
	             @Override
	             public void handle(ActionEvent event) {
	                 Main.root.getChildren().clear();
	                 Eventos_De_Botones.BarraDeHerramientas.getItems().clear();
	                 TotalEntradas = 0; 
	             }
	         });
			
		}else if (type == Button_Enum.Guardar) {
			new_Button.setText("Guardar");
			
			
		}else if (type == Button_Enum.Simular) {
			new_Button.setText("Simular");
			 

		}else if (type == Button_Enum.Nuevo) {
			new_Button.setText("Nuevo");
			
		}else if (type == Button_Enum.AND) {
			new_Button.setText("AND");
			
		}else if (type == Button_Enum.NOR) {
			new_Button.setText("NOR");
			
		}else if (type == Button_Enum.OR) {
			new_Button.setText("OR");
			
		}else if (type == Button_Enum.XOR) {
			new_Button.setText("XOR");
			
		}else if (type == Button_Enum.NOT) {
			new_Button.setText("NOT");
			
		}else if (type == Button_Enum.NAND) {
			new_Button.setText("NAND");
			
		}else if (type == Button_Enum.XNOR) {
			new_Button.setText("XNOR");
			
		}else if (type == Button_Enum.Retroceder) {
			new_Button.setText("Retroceder");
			
		}else if (type == Button_Enum.Help) {
			new_Button.setText("Help");
			new_Button.setOnAction(new EventHandler<ActionEvent>() {
				   @Override public void handle(ActionEvent e) {
				        try {
				            Desktop.getDesktop().browse(new URI("https://github.com/Jjvv21/Proyecto_I-Algoritmos_Datos_I/wiki/Help"));
				        } catch (IOException leer) {
				        	leer.printStackTrace();
				        } catch (URISyntaxException leer) {
				        	leer.printStackTrace();
				        }
				        }
				    }
				);
		}else if (type == Button_Enum.Tools) {
			new_Button.setText("Tools");
			
			
		}
		this.button_A = new_Button;

	}
	
	/**
	 * Implementa el Stage que necesita para mostrar una ventana dentro del mismo stage  
	 * @param Button 
	 * @param Button_Enum 
	 * @param stage 
	 */
	public void setButton(Botones button, Button_Enum type,Stage Stage) {
		Button new_Button = new Button();
		
		if (type == Button_Enum.Abrir) {
			new_Button.setText("Abrir");
			new_Button.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Eventos_De_Botones.GuardarEvento(event, Stage ,new_Button );
				}
			});
		
		}else if (type == Button_Enum.Borrar) {
			new_Button.setText("Borrar");
			
			
		}else if (type == Button_Enum.Guardar) {
			new_Button.setText("Guardar");
			new_Button.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Eventos_De_Botones.GuardarEvento(event, Stage ,new_Button );
				}
			});
			
		}else if (type == Button_Enum.Simular) {
			new_Button.setText("Simular");

		}else if (type == Button_Enum.Nuevo) {
			new_Button.setText("Nuevo");
			
		}else if (type == Button_Enum.AND) {
			new_Button.setText("AND");
			
		}else if (type == Button_Enum.NOR) {
			new_Button.setText("NOR");
			
		}else if (type == Button_Enum.OR) {
			new_Button.setText("OR");
			
		}else if (type == Button_Enum.XOR) {
			new_Button.setText("XOR");
			
		}else if (type == Button_Enum.NOT) {
			new_Button.setText("NOT");
			
		}else if (type == Button_Enum.NAND) {
			new_Button.setText("NAND");
			
		}else if (type == Button_Enum.XNOR) {
			new_Button.setText("XNOR");
			
		}else if (type == Button_Enum.Retroceder) {
			new_Button.setText("Retroceder");
			
		}else if (type == Button_Enum.Help) {
			new_Button.setText("Help");
			
		}else if (type == Button_Enum.Tools) {
			new_Button.setText("Tools");
			
			
		}
		this.button_A = new_Button;
		
	}
	/**
	 * Metodo para crear un Button con Image
	 * @param button
	 * @param Type
	 * @param ImageView
	 * @throws FileNotFoundException 
	 */
	public void setButton(Botones button, Button_Enum Type, ImageView ImageView) throws FileNotFoundException {
		
		Button buttonC = new Button();
		
		if(Type == Button_Enum.AND){
			IMAGES ImageAND = new IMAGES();
	        ImageAND.setImageView(ImageAND,Img_Enum.and);
	        buttonC.setGraphic(ImageAND.getImageView());
	        buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
				 @Override
		            public void handle(MouseEvent event) {
		                Eventos_De_Botones.OnDragDetected(event,ImageAND.getImageView(),"AND");
		            }});	
			
		}else if(Type == Button_Enum.OR) {
			IMAGES ImageOR = new IMAGES();
			ImageOR.setImageView(ImageOR,Img_Enum.or);
	        buttonC.setGraphic(ImageOR.getImageView());
	        buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
				 @Override
		            public void handle(MouseEvent event) {
		                Eventos_De_Botones.OnDragDetected(event,ImageOR.getImageView(),"OR");
		            }});	
		}else if(Type == Button_Enum.XNOR) {
			IMAGES ImageXNOR = new IMAGES();
			ImageXNOR.setImageView(ImageXNOR,Img_Enum.xnor);
	        buttonC.setGraphic(ImageXNOR.getImageView());
	        buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
				 @Override
		            public void handle(MouseEvent event) {
		                Eventos_De_Botones.OnDragDetected(event,ImageXNOR.getImageView(),"XNOR");
		            }});	
		}else if(Type == Button_Enum.XOR) {
			IMAGES ImageXOR = new IMAGES();
			ImageXOR.setImageView(ImageXOR,Img_Enum.xor);
	        buttonC.setGraphic(ImageXOR.getImageView());
	        buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
				 @Override
		            public void handle(MouseEvent event) {
		                Eventos_De_Botones.OnDragDetected(event,ImageXOR.getImageView(),"XOR");
		            }});	
		}else if(Type == Button_Enum.NOT) {
			IMAGES ImageNOT = new IMAGES();
			ImageNOT.setImageView(ImageNOT,Img_Enum.not);
	        buttonC.setGraphic(ImageNOT.getImageView());
	        buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
				 @Override
		            public void handle(MouseEvent event) {
		                Eventos_De_Botones.OnDragDetected(event,ImageNOT.getImageView(),"NOT");
		            }});	
		}else if(Type == Button_Enum.NAND) {
			IMAGES ImageNAND = new IMAGES();
			ImageNAND.setImageView(ImageNAND,Img_Enum.nand);
	        buttonC.setGraphic(ImageNAND.getImageView());
	        buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
				 @Override
		            public void handle(MouseEvent event) {
		                Eventos_De_Botones.OnDragDetected(event,ImageNAND.getImageView(),"NAND");
		            }});	
		}else if(Type == Button_Enum.NOR) {
			IMAGES ImageNOR = new IMAGES();
			ImageNOR.setImageView(ImageNOR,Img_Enum.nor);
	        buttonC.setGraphic(ImageNOR.getImageView());
	        buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
				 @Override
		            public void handle(MouseEvent event) {
		                Eventos_De_Botones.OnDragDetected(event,ImageNOR.getImageView(),"NOR");
		            }});	
		}else if(Type == Button_Enum.Simular) {
			IMAGES ImageRUN = new IMAGES();
	        ImageRUN.setImageView(ImageRUN,Img_Enum.simul);
			buttonC.setGraphic(ImageRUN.getImageView());
			buttonC.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					Eventos_De_Botones.Tabla.getColumns().clear();
					Eventos_De_Botones.AgregarColumnas(Eventos_De_Botones.Tabla);
					Eventos_De_Botones.Window();			        
				}
			});
		}else {
			buttonC.setText("Default");
		
		}
		buttonC.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
            	buttonC.setCursor(Cursor.HAND);
            }
        });
				this.button_A = buttonC;
		
	}
	/**
	 * Metodo para Agregar un MenuButton Con dos menuItems 
	 */
	public MenuButton getMenuB(){
		return menuB; 
	}
	public void SetMenuB(Botones menuB,MenuB_Enum Type,Botones MenuItem, Botones MenuItem2,MenuItemType Type2,MenuItemType Type3,String Nombre) {
		
		MenuButton newMenuB = new MenuButton();
		if(Type==MenuB_Enum.Entradas) {
			newMenuB.setText(Nombre+"Entradas"+TotalEntradas);
			
		}else {
			newMenuB.setText("PorDefecto");
			
		}
		MenuItem newMenuI = new MenuItem();
		if(Type2 == MenuItemType.Entrada_Uno) {
			
			newMenuI.setText("Ingrese Entrada Uno = "+EntradaUno);
			newMenuI.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(EntradaUno == 0) {
						EntradaUno = 1;
						newMenuI.setText("Inserte Entrada Uno = "+EntradaUno);
						Eventos_De_Botones.SetEntradas(EntradaUno, EntradaDos, Nombre);
					}else {
						EntradaUno = 0;
						newMenuI.setText("Inserte Entrada Uno = "+EntradaUno);
						Eventos_De_Botones.SetEntradas(EntradaUno, EntradaDos, Nombre);
					}
				}
			});
			
		}else {
			newMenuI.setText("Default");
		}
		MenuItem NewMenuI2 = new MenuItem();
		if(Type3 == MenuItemType.Entrada_Dos) {
			NewMenuI2.setText("Inserte Entrada Dos = "+EntradaDos);
			NewMenuI2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(EntradaDos == 0) {
						EntradaDos = 1;
						NewMenuI2.setText("Inserte Entrada Dos = "+EntradaDos);
						Eventos_De_Botones.SetEntradas(EntradaUno, EntradaDos, Nombre);
					}else {
						EntradaDos = 0;
						NewMenuI2.setText("Inserte Entrada Dos = "+EntradaDos);
						Eventos_De_Botones.SetEntradas(EntradaUno, EntradaDos, Nombre);
					}
				}
			});
		}else {
			NewMenuI2.setText("Default");
		}
		if(Nombre == "NOT" ) {
			newMenuB.getItems().addAll(newMenuI);
		}else {
			newMenuB.getItems().addAll(newMenuI,NewMenuI2);
		}
		this.menuB = newMenuB;
	}
	
}
