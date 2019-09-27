package Clases_Interfaz;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import Clases_Interfaz.Herencia_de_Compuertas_LOGICA.Gate_type;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Clase usada para organizar los eventos 
 */
public class Eventos_De_Botones {
	private static Rectangle rectangle;
	private static double orgSceneX,orgSceneY;
    private static double orgTranslateX,orgTranslateY;
    static Herencia_de_Compuertas_LOGICA compuerta = new Herencia_de_Compuertas_LOGICA(); 
    private static Desktop desktop = Desktop.getDesktop();
  
    
	public static final void OnDragDetected(MouseEvent e, ImageView ImageView, String Name){
        Dragboard db= ImageView.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        Main.Center.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Eventos_De_Botones.OnDragDropped(event, ImageView);
            }
        });
        content.putString(Name);
        db.setContent(content);
        e.consume();
        
	}
	public static void  AbrirEvento(ActionEvent a , Stage Stage, Button Abrir) {
		Abrir.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(final ActionEvent a) {
		    	FileChooser fileChooser = new FileChooser();
		        File file = fileChooser.showOpenDialog(Stage);
		        if (file != null) {
		            openFile(file);
		        }
		    }
		});
	}
	
	public static void GuardarEvento(ActionEvent a , Stage Stage, Button Guardar) {
		Guardar.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(final ActionEvent a) {
		    	FileChooser fileChooser = new FileChooser();
		        File file = fileChooser.showOpenDialog(Stage);
		        if (file != null) {
		            openFile(file);
		        }
		    }
		});
	}
	
	
	private static void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
        	System.out.println("Error 01");
            
        }
    }
	
	
	private static EventHandler<MouseEvent> RectangleOnMouseDraggedEventHandler = new EventHandler<MouseEvent>() {
	    @Override
	    public void handle(MouseEvent t) {
	        double offsetX = t.getSceneX() - orgSceneX;
	        double offsetY = t.getSceneY() - orgSceneY;
	        double newTranslateX = orgTranslateX + offsetX;
	        double newTranslateY = orgTranslateY + offsetY;
	
	        ((Rectangle)(t.getSource())).setTranslateX(newTranslateX);
	        ((Rectangle)(t.getSource())).setTranslateY(newTranslateY);
	    }
	};

	public static void OnDragDropped(DragEvent e,ImageView ImageView){
	       rectangle=new Rectangle(140,50);
	       rectangle.setFill(new ImagePattern(ImageView.getImage()));
	       rectangle.setCursor(Cursor.MOVE);
	       rectangle.setX(e.getSceneX());
	       rectangle.setY(e.getSceneY());
	       rectangle.setOnMousePressed(RectangleOnMousePressedEventHandler);
	       rectangle.setOnMouseDragged(RectangleOnMouseDraggedEventHandler);

	       Main.root.getChildren().add(rectangle);
	    }
	public static void SetInputs(int EntradaUno, int EntradaDos , String Name) {
		if(Name == "AND") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.AND, EntradaUno, EntradaDos);
		}else if(Name == "OR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.OR, EntradaUno, EntradaDos);
		}else if(Name == "NOT") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.NOT, EntradaUno, EntradaDos);
		}else if(Name == "NAND") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.NAND, EntradaUno, EntradaDos);
		}else if(Name == "NOR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.NOR, EntradaUno, EntradaDos);
		}else if(Name == "XOR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.XOR, EntradaUno, EntradaDos);
		}else if(Name == "XNOR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.XNOR, EntradaUno, EntradaDos);
		}
	}
	// VAMOS POR AQUI
	public static void AddInputs(ToolBar ToolBar, String Name) {
		Botones Input1 = new Botones();
		Botones setInput1 = new Botones();
		Botones setInput2 = new Botones();
		Input1.setMenuButton(Input1, MenuButtonType.Input, setInput1 , MenuItemType.Input1, setInput2, MenuItemType.Input2 , Name);
		ToolBar.getItems().add(Input1.getMenuButton());
	}

	private static EventHandler<MouseEvent> RectangleOnMousePressedEventHandler = new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent t) {
                    orgSceneX = t.getSceneX();
                    orgSceneY = t.getSceneY();
                    orgTranslateX = ((Rectangle)(t.getSource())).getTranslateX();
                    orgTranslateY = ((Rectangle)(t.getSource())).getTranslateY();
                }
            };
}

