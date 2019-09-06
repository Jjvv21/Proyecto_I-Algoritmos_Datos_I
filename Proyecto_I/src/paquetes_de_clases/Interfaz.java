package paquetes_de_clases;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Interfaz extends Application {

  //  public void init() throws Exception {
     //   super.init();
      //  System.out.println("Realice las inicializaciones necesarias aquí.");
    //}

    public void start(Stage primaryStage) throws Exception {
    	//COLUMNA VERTICAL 
    	
    	Insets insets = new Insets(10);
        BorderPane Estructura = new BorderPane();

  
        /**
    	 * Esta es la estructura de la interfaz con respecto a la parte izquierda de la ventana 
    	 * Se utiliza una VBox y cinco Botones
    	 */
        VBox Caja_izquierda = new VBox(); 
        Caja_izquierda.setSpacing(20);
        Caja_izquierda.setTranslateY(200);
        Button simular = new Button("Simular");
        simular.setStyle("-fx-padding: 30 34 30 30;");
        Button Limpiar = new Button("Limpiar");
        Limpiar.setStyle("-fx-padding: 30 34 30 30;");
        Button Nuevo_Proyecto = new Button("Nuevo");
        Nuevo_Proyecto.setStyle("-fx-padding: 30 39 30 30;");
        Button Borrar_un_elemento = new Button("Eliminar");
        Borrar_un_elemento.setStyle("-fx-padding: 30 30 30 30;");
        Button Retroceder = new Button("Anterior");
        Retroceder.setStyle("-fx-padding: 30 30 30 30;");
        
        /**
    	 * Esta es la estructura de la interfaz con respecto a la parte Derecha de la ventana 
    	 */
        VBox Caja_Derecha = new VBox(); 
        
        /**
    	 * Esta es la estructura de la interfaz con respecto a la parte de arriba en la ventana 
    	 * Se utiliza una HBox y cinco Botones
    	 */

        Button abrir_archivo = new Button("Abrir");
        abrir_archivo.setStyle("-fx-padding: 10 10 10 10;");
        Button guardar = new Button("Guardar");
        guardar.setStyle("-fx-padding: 10 10 10 10;");
        Button agregar_circuito = new Button("Añadir Circuito");
        agregar_circuito.setStyle("-fx-padding: 10 10 10 10;");
        Button herramientas = new Button("Herramientas");
        herramientas.setStyle("-fx-padding: 10 10 10 10;");
        Button ayuda = new Button("Ayuda");
        ayuda.setStyle("-fx-padding: 10 10 10 10;");
        ayuda.setTranslateX(1340);
        /**
    	 * ComboBox integrada en la caja de herramientas superior(SELECCION DEL NIVEL DE DIFICULTAD)
    	 */
        
        String Niveles[] = 
            { "BASICO", "AVANZADO" }; 
        ComboBox Basico_Avanzado = new ComboBox(FXCollections.observableArrayList(Niveles)); 
        Basico_Avanzado.setPrefSize(120,40);
        Basico_Avanzado.setTranslateX(945);
        TilePane Caja_Del_comboBox = new TilePane(Basico_Avanzado);
        Caja_Del_comboBox.setTranslateX(200);
        
        
        Label lvl = new Label("Nivel");
        lvl.setTranslateX(500);
      
        
        /**
    	 * Una caja de herramientas para los botones de la parte superior, que a su vez se encuentra dentro de una HBox, ya creada anteriormente 
    	 */
        ToolBar ToolBar_superior = new ToolBar();
        ToolBar_superior.getItems().addAll(abrir_archivo,guardar,agregar_circuito,herramientas,ayuda,Caja_Del_comboBox,lvl);

        /**
    	 *La parte izquierda de la ventana tiene un "ToolBar" con una orientacion vertical y los botones dentro de este panel se encuentran dentro de 
    	 *un VBox que se desplaza junto con los 5 botones.  
    	 */
        ToolBar ToolBar_izquierda = new ToolBar();
        Caja_izquierda.getChildren().addAll(simular,Limpiar,Nuevo_Proyecto,Borrar_un_elemento,Retroceder);
        ToolBar_izquierda.getItems().add(Caja_izquierda);
        ToolBar_izquierda.setOrientation(Orientation.VERTICAL);
        
        
        
        
        
        
        // INSETS tiene el numero para el margen 
        BorderPane.setMargin(Caja_izquierda, insets);
        Estructura.setLeft(ToolBar_izquierda);
        Estructura.setTop(ToolBar_superior);
        Estructura.setRight(Caja_Derecha);
        
        
        
        
        Scene scene = new Scene(Estructura, 1800, 1000);
        primaryStage.setTitle("Compuertas Logicas By JJVV");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //public void stop() throws Exception {
       // super.stop();
        //System.out.println("Destruye los recursos. Realice limpieza.");
    //}
    public static void main(String[] args) {
        launch(args);
    }
}