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
public class StrategiaLotuMuchyA implements StrategiaLotuMuchy {

    /* Strategia lotu A lot po prostej*/
    
    @Override
    public void lot(Mucha m){
// nic nie zmienia - mucha ma lecieć po prostej

    }

    @Override
    public Color getColor() {
        return Color.black;
    }
    
}











//	if(m.x<0) { m.vx = -m.vx; }
//	if(m.x>1) { m.vx = -m.vx; }
//	if(m.y<0) { m.vy = -m.vy; }
//	if(m.y>1) { m.vy = -m.vy; }