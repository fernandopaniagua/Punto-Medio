/**
 * Implementación del algoritmo de punto medio para circunferencias<br>
 * <br>
 * Ver explicación del algoritmo del punto medio en <a href="https://es.wikipedia.org/wiki/Algoritmo_del_punto_medio_para_circunferencias" target="_blank">Wikipedia</a><br>
 * <br>
 * Programado por <a href="http://www.fernandopaniagua.com" target="_blank">Fernando Paniagua</a><br>
 * <br>
 * @version 1.0.
 * @since 2016
 * @author Fernando Paniagua (fernando.paniagua@gmail.com)
 */
package com.fernandopaniagua.puntomedio;
/**
 * JFrame principal
 * 
 * @author Paniagua
 */
public class JFPuntoMedio extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public JFPuntoMedio() {
        initComponents();
        this.setBounds(100,100,300,300);
        JPPuntoMedio jpp = new JPPuntoMedio();
        this.getContentPane().add(jpp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}