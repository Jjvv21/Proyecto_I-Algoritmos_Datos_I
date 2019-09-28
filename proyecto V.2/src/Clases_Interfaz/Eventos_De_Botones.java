package Clases_Interfaz;



import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
    

    public static TableView Tabla = new TableView();
    

    
    
    
    
    
    
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
	       SetEntradas(0,0, Nombre);
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
		ToolBar.setStyle("-fx-background-color:#F4F2F5");
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void AgregarColumnas(TableView TableView) {
		TableView.getItems().clear();
		TableColumn InputsGroupColumn = new TableColumn("Inputs Column");
		InputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
		TableColumn OutputsGroupColumn = new TableColumn("Outputs Column");
		OutputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
		int u = Botones.TotalEntradas;
		int temp = u-1;
		int temp1 = 0;
		String [][] Values = new String[u][(int) Math.pow(2, u)];
		for (int x = 0; x < u; x++) {
			double temp2 = Math.pow(2, u)-1;
			System.out.println("Entra For");
			String name = "Input "+x;
			 TableColumn InputColumn = new TableColumn(name);
	            InputColumn.setCellValueFactory(new PropertyValueFactory<>("Input"+x));
	            for(int y = 0; y < Math.pow(2,temp1); y++) {
	            	System.out.println("Entra For2");
	            	for(int w = 0; w < Math.pow(2,temp); w++) {
	            		System.out.println("Entra For3");
	            		Values[temp][(int) temp2] = "1";
	            		if(temp2!=0) {
	            			temp2--;
	            		}
	            	}
	            	for(int z = 0; z < Math.pow(2,temp); z++) {
	            		System.out.println("Entra For4");
	            		Values[temp][(int) temp2] = "0";
	            		if(temp2!=0) {
	            			temp2--;
	            		}
	            	}
	            }
	            temp--;
	            temp1++;
	            InputsGroupColumn.getColumns().add(InputColumn);
		}
		for (int j=0; j < Values.length; j++) {
            for (int h=0; h < Values[j].length; h++) {
              System.out.println (Values[j][h]);
            }
		}
		int x = 0;
		for(int y=0;y<Math.pow(2, u);y++) {
			if(u==0) {
				System.out.println("No Existen Compuertas");
			}else if(u==1) {
				TableView.getItems().add(new Tabla_de_verdad(Values[x][y],"","","",""));
			}else if(u==2) {
				TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],"","",""));
			}else if(u==3) {
				TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],Values[x+2][y],"",""));
			}else if(u==4) {
				TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],""));
			}else if(u==5) {
				TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y]));
			}
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

/*
 * 	TableView.getItems().clear();
		TableColumn InputsGroupColumn = new TableColumn("Inputs Column");
		InputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
		TableColumn OutputsGroupColumn = new TableColumn("Outputs Column");
		InputsGroupColumn.setMinWidth(TableView.getMaxWidth()/2);
		int u = Botones.TotalEntradas;
		int temp = u-1;
		int temp1 = 0;
		
		String [][] Values = new String[u][(int) Math.pow(2, u)];
		for (int x = 0; x < u; x++) {
			double temp2 = Math.pow(2, u)-1;
			System.out.println("Entra For");
			String name = "Input "+x;
            TableColumn InputColumn = new TableColumn(name);
            InputColumn.setCellValueFactory(new PropertyValueFactory<>("Input"+x));
            for(int y = 0; y < Math.pow(2,temp1); y++) {
            	System.out.println("Entra For2");
            	for(int w = 0; w < Math.pow(2,temp); w++) {
            		System.out.println("Entra For3");
            		Values[temp][(int) temp2] = "1";
            		if(temp2!=0) {
            			temp2--;
            		}
                } 
            	for(int z = 0; z < Math.pow(2,temp); z++) {
            		System.out.println("Entra For4");
            		Values[temp][(int) temp2] = "0";
            		if(temp2!=0) {
            			temp2--;
            		}
            	}
                
            }
            temp--;
            temp1++;
            InputsGroupColumn.getColumns().add(InputColumn);
            
        }
		for (int j=0; j < Values.length; j++) {
            for (int h=0; h < Values[j].length; h++) {
              System.out.println (Values[j][h]);
            }
          }
			int x = 0;
			for(int y=0;y<Math.pow(2, u);y++) {
				if(u==0) {
					System.out.println("No Existen Compuertas");
				}else if(u==1) {
					TableView.getItems().add(new Tabla_de_verdad(Values[x][y],"","","",""));
				}else if(u==2) {
					TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],"","",""));
				}else if(u==3) {
					TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],Values[x+2][y],"",""));
				}else if(u==4) {
					TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],""));
				}else if(u==5) {
					TableView.getItems().add(new Tabla_de_verdad(Values[x][y],Values[x+1][y],Values[x+2][y],Values[x+3][y],Values[x+4][y]));
				}
		}
		TableView.getColumns().addAll(InputsGroupColumn, OutputsGroupColumn);
		
 */

