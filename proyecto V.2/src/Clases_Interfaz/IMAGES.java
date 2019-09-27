package Clases_Interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IMAGES {
	private ImageView ImageView;
	private Image img;
	
	/**
	 * Metodo que retorna una imagen
	 * @return Image
	 */
	public Image getImage() {
		return this.img; 
	}
	
	/**
	 * Metodo Para Propocionar una img 
	 * @param Img
	 * @param Type
	 * @throws FileNotFoundException
	 */
	public void SetImg(IMAGES img, Img_Enum Type) throws FileNotFoundException {
		if(Type == Img_Enum.and) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\AND.png");
			Image imagenN = new Image(inputFileN);       
			this.img = imagenN;
			
		}else if(Type == Img_Enum.xnor) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\XNOR.png");
			Image imagenN = new Image(inputFileN);       
			this.img = imagenN;
			
		}else if(Type == Img_Enum.nand) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\NAND.png");
			Image imagenN = new Image(inputFileN);       
			this.img = imagenN;
			
		}else if(Type == Img_Enum.not) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\NOT.png");
			Image imagenN = new Image(inputFileN);       
			this.img = imagenN;
			
		}else if(Type == Img_Enum.or) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\OR.png");
			Image imagenN = new Image(inputFileN);       
			this.img = imagenN;
			
		}else if(Type == Img_Enum.xor) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\XOR.png");
			Image imagenN = new Image(inputFileN);       
			this.img = imagenN;
		
		}else if(Type == Img_Enum.nor) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\NOR.png");
			Image imagenN = new Image(inputFileN);       
			this.img = imagenN;	
			
		}
		
	}
	/**
	 * Metodo para obtener un ImageView 
	 * 
	 */
	public ImageView getImageView() {
			return ImageView;
	
			
	}
	public void setImageView(IMAGES show, Img_Enum Type)  throws FileNotFoundException {
		
		if(Type == Img_Enum.and) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\AND.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
			
		}else if(Type == Img_Enum.xnor) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\XNOR.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		
		}else if(Type == Img_Enum.nand) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\NAND.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
			
		}else if(Type == Img_Enum.not) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\NOT.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
			
		}else if(Type == Img_Enum.or) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\OR.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
			
		}else if(Type == Img_Enum.xor) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\XOR.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
			
		}else if(Type == Img_Enum.nor) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\NOR.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
			

		}else if(Type == Img_Enum.simul) {
			FileInputStream inputFileN = new FileInputStream("C:\\Users\\Julio\\git\\Proyecto_v2\\Imagenes\\PLAY.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
			
		}
		
		
	}
	
}
