package paquetes_de_clases;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
	Button ayuda; 

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
        FileInputStream AND_img = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Proyecto_I\\Imagenes\\AND2.png"); 
        Image AND_image = new Image(AND_img); 
        ImageView A = new ImageView(AND_image); 
        Label AND = new Label("", A); 
        
        FileInputStream NAND_img = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Proyecto_I\\Imagenes\\NAND.png"); 
        Image NAND_image = new Image(NAND_img); 
        ImageView B = new ImageView(NAND_image); 
        Label NAND = new Label("", B); 
        
        FileInputStream NOR_img = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Proyecto_I\\Imagenes\\NOR.png"); 
        Image NOR_image = new Image(NOR_img); 
        ImageView C = new ImageView(NOR_image); 
        Label NOR = new Label("", C); 
        
        FileInputStream XNOR_img = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Proyecto_I\\Imagenes\\XNOR.png"); 
        Image XNOR_image = new Image(XNOR_img); 
        ImageView D = new ImageView(XNOR_image); 
        Label XNOR = new Label("", D); 
        
        FileInputStream NOT_img = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Proyecto_I\\Imagenes\\NOT.png"); 
        Image NOT_image = new Image(NOT_img); 
        ImageView E = new ImageView(NOT_image); 
        Label NOT = new Label("", E); 
        
        FileInputStream XOR_img = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Proyecto_I\\Imagenes\\XOR.png"); 
        Image XOR_image = new Image(XOR_img); 
        ImageView F = new ImageView(XOR_image); 
        Label XOR = new Label("", F); 
        
        FileInputStream OR_img = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Proyecto_I\\Imagenes\\OR.png"); 
        Image OR_image = new Image(OR_img); 
        ImageView G = new ImageView(OR_image); 
        Label OR = new Label("", G); 
       
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
        ayuda = new Button("Ayuda");
        //ayuda.setOnAction(e-> ButtonClicked(e));
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
        Caja_izquierda.getChildren().addAll(Limpiar,Nuevo_Proyecto,Borrar_un_elemento,Retroceder);
        ToolBar_izquierda.getItems().add(Caja_izquierda);
        ToolBar_izquierda.setOrientation(Orientation.VERTICAL);
        

        /**
    	 *La parte "Derecha" de la ventana tiene un "ToolBar" con una orientacion vertical y las imagenes dentro de este panel se encuentran dentro de 
    	 *un VBox que se desplaza junto con las 5 imagenes.  
    	 */
        ToolBar ToolBar_derecha = new ToolBar();
        Caja_Derecha.getChildren().addAll(AND,NOT,XOR,XNOR,NOR,NAND,OR,simular);
        Caja_Derecha.setSpacing(20);
        ToolBar_derecha.getItems().add(Caja_Derecha);
        ToolBar_derecha.setOrientation(Orientation.VERTICAL);
        
        
        
        
        // INSETS tiene el numero para el margen 
        BorderPane.setMargin(Caja_izquierda, insets);
        Estructura.setLeft(ToolBar_izquierda);
        Estructura.setTop(ToolBar_superior);
        Estructura.setRight(ToolBar_derecha);
        
        
        
        
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