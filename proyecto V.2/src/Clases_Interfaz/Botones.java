package Clases_Interfaz;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Botones {
	private Button button_A; 
	
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
			new_Button.setOnAction(new EventHandler<ActionEvent>(){
	             @Override
	             public void handle(ActionEvent event) {
	                 Main.root.getChildren().clear();
	             }
	         });
			
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
	 */
	public void setButton(Botones button, Button_Enum Type, ImageView ImageView) {
		
		Button buttonC = new Button();
		
		if(Type == Button_Enum.AND){
			buttonC.setGraphic(ImageView);
			
		}else if(Type == Button_Enum.OR) {
			buttonC.setGraphic(ImageView);
		}else if(Type == Button_Enum.XNOR) {
			buttonC.setGraphic(ImageView);
		}else if(Type == Button_Enum.XOR) {
			buttonC.setGraphic(ImageView);
		}else if(Type == Button_Enum.NOT) {
			buttonC.setGraphic(ImageView);
		}else if(Type == Button_Enum.NAND) {
			buttonC.setGraphic(ImageView);
		}else if(Type == Button_Enum.NOR) {
			buttonC.setGraphic(ImageView);
		}else if(Type == Button_Enum.Simular) {
			buttonC.setGraphic(ImageView);
		}else {
			buttonC.setText("Default");
		
		}
		buttonC.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Eventos_De_Botones.OnDragDetected(event,ImageView,"AND");
            }});
				this.button_A = buttonC;
	}
	
}
