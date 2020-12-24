package problema3;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para dibujar
 */
public class JPanelDibujo extends JPanel {

    /* 
   * Constructor del panel para dibujar
     */
    public JPanelDibujo() {
        this.setBackground(Color.WHITE);
    }

    // Reimplementa paint
    public void paint(Graphics g) {
        super.paint(g);
        int cant = (int) (Math.random()*5);

        //LINEAS
        g.drawLine(25,90,60,50); //dibuja una línea
        //OVALOS
        for (int i = 0; i <= cant; i++) {
            int x = (int) (Math.random()* 600+1);
            int y = (int) (Math.random()*150 + 22);
            int alto = (int) (Math.random()* 100 + 25);
            int ancho = (int) (Math.random() * 100 + 25);
            Ovalo o = new Ovalo(x, y, alto, ancho);
            o.setPosX(x);
            o.setPosY(y);
            o.setAlto(alto);
            o.setAncho(ancho);

            g.setColor(Color.blue);
            g.drawOval(o.getPosX(), o.getPosY(), o.getAlto(), o.getAncho());

        }
        //RECTANGULOS
        for (int i = 0; i < cant; i++) {
            int x = (int) (Math.random()* 600+1);
            int y = (int) (Math.random()* 150+22);
            int alto = (int) (Math.random()* 100*25);
            int ancho = (int) (Math.random()*100 * 25);
            Rectangulo rec = new Rectangulo(x, y, alto, ancho);
            rec.setPosX(x);
            rec.setPosY(y);
            rec.setAlto(alto);
            rec.setAncho(ancho);

            g.setColor(Color.black);
            g.drawRect(rec.getPosX(), rec.getPosY(), rec.getAlto(), rec.getAncho());
        }

        // STRINGS
        /* Font fuente = new Font("Arial", Font.BOLD, 15);
        g.setColor(Color.blue);
        g.setFont(fuente);
        g.drawString("Hola mundo!", 5, 360);
         */
        // ARCOS
        /* g.setColor(Color.yellow);
        g.fillArc(240, 340, 100, 100, 25, 300);
        g.setColor(Color.white);
        g.fillArc(240, 340, 100, 100, 15, 10);
        g.fillArc(240, 340, 100, 100, 325, 10);

        // POLIGONOS
        Polygon estrella = new Polygon();
        // Este no es estrella
        int cX[] = {420,440,460,480,500,420,420}; // Coordenada x de los puntos del polígono
        int cY[] = {470,430,450,430,490,490,470}; // Coordenada y de los puntos del polígono
        

        estrella.addPoint(510,355);
        estrella.addPoint(590,355);
        estrella.addPoint(525,415);
        estrella.addPoint(550,330);
        estrella.addPoint(580,415);

        g.setColor(Color.red);
        g.drawPolygon(estrella);
        g.setColor(Color.blue);
        g.fillPolygon(cX,cY,cX.length);
         */
    }

}
