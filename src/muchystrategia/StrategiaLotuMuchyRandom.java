/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchystrategia;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author A5US
 */
public class StrategiaLotuMuchyRandom implements StrategiaLotuMuchy {

    @Override
    public void lot(Mucha m) {
        double kat = new Random().nextDouble() * 0.9 - 0.45;//new Random().nextDouble() * 0.2;
        double vx2 = (m.vx * (Math.cos(kat))) - (m.vy * (Math.sin(kat)));
        double vy2 = (m.vx * (Math.sin(kat))) + (m.vy * (Math.cos(kat)));
        m.vx = vx2;
        m.vy = vy2;
    }

    @Override
    public Color getColor() {
        return Color.orange;
    }

}
