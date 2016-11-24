/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchystrategia;

/**
 *
 * @author A5US
 */
public class StrategiaOdbiciaMuchyA implements StrategiaOdbiciaMuchy{
    
    /* Strategia A odbija od krawedzi pod takim samym katem */
    
    @Override
    public void odbicie(Mucha m) {
	if(m.x<0) { m.x =  -m.x; m.vx = -m.vx; }
	if(m.x>1) { m.x = 2-m.x; m.vx = -m.vx; }
	if(m.y<0) { m.y =  -m.y; m.vy = -m.vy; }
	if(m.y>1) { m.y = 2-m.y; m.vy = -m.vy; }
    }
}
