/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;


/**
 *
 * @author 50663
 */
public class mapa extends javax.swing.JFrame  {

    /**
     * Creates new form mapa
     */
    public ImageIcon imagenes[]= new ImageIcon[8];
    
    public mapa() {
        initComponents();
        
        for(int i=0; i<8; i++){
            imagenes[i]= new ImageIcon(getClass().getResource("/imagenes/image"+i+".png"));
        }
        
        
        Imagen.setIcon(imagenes[0]);
    }
    public ImageIcon[] getImagenes(){
        return this.imagenes;
    }

    /*
     public void mouseEntered(MouseEvent evt){
        
      Component source= (Component) evt.getSource();
      
   
      if( evt.getX() > 24 && evt.getX() < 176  && evt.getY() > 100 && evt.getY() < 169){
          
      Imagen.setIcon(imagenes[6]);
              
      }
      
    }
    */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Imagen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ImagenMouseMoved(evt);
            }
        });
        Imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImagenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenMouseMoved
  
          Component source= (Component) evt.getSource();
      
   
      if( evt.getX() > 24 && evt.getX() < 176  && evt.getY() > 100 && evt.getY() < 169){
          
      Imagen.setIcon(imagenes[5]);   
      
      } 
      else if(evt.getX() > 158 && evt.getX() < 288  && evt.getY() > 44 && evt.getY() < 103){
           Imagen.setIcon(imagenes[2]);   
      }
      else if(evt.getX() > 326 && evt.getX() < 421  && evt.getY() > 194 && evt.getY() < 247){
          Imagen.setIcon(imagenes[4]);
      }
      
    }//GEN-LAST:event_ImagenMouseMoved

    private void ImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenMouseExited
       Imagen.setIcon(imagenes[0]);
    }//GEN-LAST:event_ImagenMouseExited

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    // End of variables declaration//GEN-END:variables
}
