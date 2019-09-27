package Clases_Interfaz;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import Clases_Interfaz.Herencia_de_Compuertas_LOGICA.Gate_type;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
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
    
    public static ToolBar BarraDeHerramientas = new ToolBar();
    
    private static String Valores = new String();
    
    private static int indexPrev = 0;
    
    public static TableView Tabla = new TableView();
    
    private static int Combinaciones;
    
    
    
    
    
    
	public static final void OnDragDetected(MouseEvent e, ImageView ImageView, String Nombre){
        Dragboard db= ImageView.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        Main.Center.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Eventos_De_Botones.OnDragDropped(event, ImageView,Nombre);
            }
        });
        content.putString(Nombre);
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
	public static void Window() {
		Stage stage = new Stage();
		BorderPane Panel = new BorderPane();
		Panel.setLeft(BarraDeHerramientas);
		Panel.setCenter(Tabla);
		Tabla.setPlaceholder(new Label("No hay Compuertas en el Circuito"));
		BarraDeHerramientas.setOrientation(Orientation.VERTICAL);
		stage.setTitle("Set Inputs | Truth Table ");
		stage.setScene(new Scene(Panel, 450, 450));				
		stage.initModality(Modality.APPLICATION_MODAL);
		
		stage.showAndWait();
	
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

	public static void OnDragDropped(DragEvent e,ImageView ImageView,String Nombre){
	       rectangle=new Rectangle(140,50);
	       rectangle.setFill(new ImagePattern(ImageView.getImage()));
	       rectangle.setCursor(Cursor.MOVE);
	       rectangle.setX(e.getSceneX());
	       rectangle.setY(e.getSceneY());
	       rectangle.setOnMousePressed(RectangleOnMousePressedEventHandler);
	       rectangle.setOnMouseDragged(RectangleOnMouseDraggedEventHandler);
	       if(Nombre == "NOT"){
	    	   Botones.TotalEntradas++;
	       }else {
	    	   Botones.TotalEntradas++;
	    	   Botones.TotalEntradas++;
	       }
	       AddEntradas(BarraDeHerramientas, Nombre); 
	       Main.root.getChildren().add(rectangle);
	    }
	
	public static void SetEntradas(int Entrada_Uno, int Entrada_Dos , String Name) {
		if(Name == "AND") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.AND, Entrada_Uno, Entrada_Dos);
		}else if(Name == "OR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.OR, Entrada_Uno, Entrada_Dos);
		}else if(Name == "NOT") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.NOT, Entrada_Uno, Entrada_Dos);
		}else if(Name == "NAND") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.NAND, Entrada_Uno, Entrada_Dos);
		}else if(Name == "NOR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.NOR, Entrada_Uno, Entrada_Dos);
		}else if(Name == "XOR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.XOR, Entrada_Uno, Entrada_Dos);
		}else if(Name == "XNOR") {
			compuerta.setLogica_en_Compuertas(compuerta, Gate_type.XNOR, Entrada_Uno, Entrada_Dos);
		}
	}
	
	public static void AddEntradas(ToolBar ToolBar, String Name) {
		Botones EntradaUno = new Botones();
		Botones SetEntradaUno = new Botones();
		Botones SetEntradaDos = new Botones();
		EntradaUno.SetMenuB(EntradaUno, MenuB_Enum.Entradas, SetEntradaUno , SetEntradaDos, MenuItemType.Entrada_Uno, MenuItemType.Entrada_Dos , Name);
		
		ToolBar.getItems().add(EntradaUno.getMenuB());
		ToolBar.setStyle("-fx-background-color: #5C5858");
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void AgregarColumnas(TableView TableView) {
		TableView.getItems().clear();
		TableColumn InputsGroupColumn = new TableColumn("Entradas");
		InputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
		TableColumn OutputsGroupColumn = new TableColumn("Salidas");
		InputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
		for (int i = 0; i < Botones.TotalEntradas; i++) {
            String name = "Entrada " + i;
            TableColumn<ObservableList<String>, String> InputColumn = new TableColumn<>(name);
            InputColumn.setCellValueFactory(new PropertyValueFactory<>("Entrada uno"));
            ObservableList<Object> Datos = FXCollections.observableArrayList();
            InputsGroupColumn.getColumns().add(InputColumn);
        }
		for(double Counter = Math.pow(2, Botones.TotalEntradas); Counter>0; Counter--) {
        	TableView.getItems().add(new Herencia_de_Compuertas_LOGICA("1"));
        	System.out.println("1 añadido");
        }
        

		TableView.getColumns().addAll(InputsGroupColumn, OutputsGroupColumn);
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

