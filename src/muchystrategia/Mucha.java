/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchystrategia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author A5US
 */
public class Mucha {

    protected final double k = 0.01;
    public double x, y;         // pozycja muchy
    public double vx, vy;       // predkosc muchy
    StrategiaLotuMuchy strategiaLotu;
    StrategiaOdbiciaMuchy strategiaOdbicia;

    public Mucha(StrategiaLotuMuchy sl, StrategiaOdbiciaMuchy so) {
        x = Math.random();
        y = Math.random();
        vx = k * (Math.random() - Math.random());
        vy = k * (Math.random() - Math.random());
        strategiaLotu = sl;
        strategiaOdbicia = so;
    }

    public void draw(Graphics g) {
        g.setColor(strategiaLotu.getColor());
        Rectangle rc = g.getClipBounds();
        int a = (int) (x * rc.getWidth()),
                b = (int) (y * rc.getHeight());
        g.fillOval(a, b, 5, 5);
    }

    public void move() {
        strategiaOdbicia.odbicie(this);
        strategiaLotu.lot(this);
        x += vx;
        y += vy;
//      if(x<0) { vx = -vx; }
//	if(x>1) { vx = -vx; }
//	if(y<0) { vy = -vy; }
//	if(y>1) { vy = -vy; }
    }
}
