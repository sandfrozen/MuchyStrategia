/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchystrategia;

import java.awt.Color;

/**
 *
 * @author A5US
 */
public class StrategiaLotuMuchyRandom implements StrategiaLotuMuchy {

    @Override
    public void lot(Mucha m) {
        m.vx = m.k * (Math.random() - Math.random());
        m.vy = m.k * (Math.random() - Math.random());
    }

    @Override
    public Color getColor() {
        return Color.orange;
    }

}
