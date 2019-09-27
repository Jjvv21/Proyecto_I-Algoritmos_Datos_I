package Clases_Interfaz;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application{
	
	private BorderPane Structure = new BorderPane();
	public static final Group root = new Group(); 
	public static final Pane Center = new Pane(root); 
	private ToolBar right_ToolBar = new ToolBar();
	private ToolBar Top_ToolBar = new ToolBar();
	private HBox rightBox = new HBox();
	private static Button buttonRun;
	/**
	 * Creacion De La Ventana Principal 
	 * @param Stage
	 */
	
	public void start(Stage Stage) throws Exception {
	
		/**
		 * BOTONES
		 */
		Botones simular = new Botones();
		Botones borrar = new Botones();
		Botones Guardar = new Botones();
		Botones Abrir  = new Botones();
		Botones Nuevo = new Botones();
		Botones AND = new Botones();
		Botones OR = new Botones();
		Botones NAND = new Botones();
		Botones XNOR = new Botones();
		Botones NOT = new Botones();
		Botones XOR = new Botones();
		Botones NOR = new Botones();	
		Botones Help = new Botones();
		Botones Tools = new Botones();
		Botones Back = new Botones();
		
		
		/**
		 * IMAGENES
		 */
		IMAGES imgAND = new IMAGES();
		imgAND.setImageView(imgAND,Img_Enum.and);
		
		IMAGES imgOR = new IMAGES();
		imgOR.setImageView(imgAND,Img_Enum.or);
		
		IMAGES imgXOR = new IMAGES();
		imgXOR.setImageView(imgAND,Img_Enum.xor);
		
		IMAGES imgXNOR = new IMAGES();
		imgXNOR.setImageView(imgAND,Img_Enum.xnor);
		
		IMAGES imgNOT = new IMAGES();
		imgNOT.setImageView(imgAND,Img_Enum.not);
		
		IMAGES imgNOR = new IMAGES();
		imgNOR.setImageView(imgAND,Img_Enum.nor);
		
		IMAGES imgNAND = new IMAGES();
		imgNAND.setImageView(imgAND,Img_Enum.nand);
		
		IMAGES imgPLAY = new IMAGES();
		imgPLAY.setImageView(imgAND,Img_Enum.simul);
		
		
		
		
		/**
		 * BOTONES PARA EL TOP PANEL 
		 */
		borrar.setButton(borrar, Button_Enum.Borrar);
		simular.setButton(simular, Button_Enum.Simular,imgPLAY.getImageView());
		Guardar.setButton(Guardar,Button_Enum.Guardar,Stage);
		Abrir.setButton(Abrir,Button_Enum.Abrir,Stage);
		Nuevo.setButton(Nuevo,Button_Enum.Nuevo);
		Help.setButton(Help, Button_Enum.Help);
		Tools.setButton(Tools, Button_Enum.Tools);
		Back.setButton(Back, Button_Enum.Retroceder);
		
		
		/** 
		 * COMPUERTAS
		 */
		AND.setButton(AND, Button_Enum.AND,imgAND.getImageView());
		OR.setButton(OR,Button_Enum.OR,imgOR.getImageView());
		XOR.setButton(XOR, Button_Enum.XOR, imgXOR.getImageView());
		NOR.setButton(NOR, Button_Enum.NOR, imgNOR.getImageView());
		NOT.setButton(NOT, Button_Enum.NOT, imgNOT.getImageView());
		NAND.setButton(NAND, Button_Enum.NAND, imgNAND.getImageView());
		XNOR.setButton(XNOR, Button_Enum.XNOR, imgXNOR.getImageView());
		
		
		
		
		
		 Center.setOnDragOver(new EventHandler<DragEvent>() {
	            @Override
	            public void handle(DragEvent event) {
	                event.acceptTransferModes(TransferMode.COPY_OR_MOVE); }
	        });
	       
		 
		
			
		/**
		 * RIGHT TOOLBAR 
		 * CAMBIOS EN LAS CARACTERISTICAS DE LOS BOTONES
		 * 
		 */
		simular.getButton().setTranslateX(80);
		
		Top_ToolBar.getItems().addAll(Guardar.getButton(),Abrir.getButton(),Nuevo.getButton(),Back.getButton(),Tools.getButton(),Help.getButton(),borrar.getButton());
		rightBox.getChildren().addAll(AND.getButton(),OR.getButton(),XOR.getButton(),NAND.getButton(),NOR.getButton(),XNOR.getButton(),NOT.getButton(),simular.getButton());
		rightBox.setSpacing(90);
		right_ToolBar.getItems().addAll(rightBox);
		right_ToolBar.setStyle("-fx-background-color:  #252423 ");

		
		
		
		
		
		
		Structure.setBottom(right_ToolBar);
		Structure.setTop(Top_ToolBar);
		Structure.setCenter(Center);


		Scene escena = new Scene(Structure,1800, 1000);
		Stage.setTitle("CIRCUIT DESIGNER");
		Stage.setScene(escena);
		Stage.show();
		
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
