package COM.USC.UI;

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    
    
    PanelLogo LogoTriqui;
    PanelTablero tableroTriqui;
    PanelPuntaje puntajeTriqui;
    
    
    public static void main(String[] args){
    
        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setVisible(true);
        
}
    /* Constructor para establecer las caracteristicas de la ventana*/
    public VentanaPrincipal()
    {
  this.setTitle("Mi primera aplicacion con UI");
  this.setBackground(Color.BLACK);
  this.setSize(800,600);
  this.setResizable(false);
 LogoTriqui = new PanelLogo();  
 
 this.add(LogoTriqui);
 
   tableroTriqui= new PanelTablero();
   this.add(tableroTriqui);
   
   puntajeTriqui = new PanelPuntaje();
   this.add(puntajeTriqui);
   
    }
    
   
}
