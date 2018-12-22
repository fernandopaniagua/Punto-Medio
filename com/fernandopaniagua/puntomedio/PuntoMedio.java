/**
 * Implementación del algoritmo de punto medio para circunferencias<br>
 * <br>
 * Ver explicación del algoritmo del punto medio en
 * <a href="https://es.wikipedia.org/wiki/Algoritmo_del_punto_medio_para_circunferencias" target="_blank">Wikipedia</a><br>
 * <br>
 * Programado por
 * <a href="http://www.fernandopaniagua.com" target="_blank">Fernando
 * Paniagua</a><br>
 * <br>
 *
 * @version 1.0.
 * @since 2016
 * @author Fernando Paniagua (fernando.paniagua@gmail.com)
 */
package com.fernandopaniagua.puntomedio;

/**
 * Clase principal, instancia el JFrame y lo hace visible.
 * 
 * @author Fernando Paniagua
 */
public class PuntoMedio {

    /**
     * Método principal del proyecto
     * 
     * @param args Sin uso
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFPuntoMedio jfp = new JFPuntoMedio();
        jfp.setTitle("Algoritmo del punto medio - Fernando Paniagua");
        jfp.setBounds(100,100,500,530);
        jfp.setVisible(true);
    }
    
}
