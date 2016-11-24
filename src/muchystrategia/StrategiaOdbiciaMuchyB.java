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
public class StrategiaOdbiciaMuchyB implements StrategiaOdbiciaMuchy{

    /* Strategia B nieodbija od krawedzi - mucha wylatuje z drugiej strony */

    @Override
    public void odbicie(Mucha m) {
	if(m.x<0) { m.x = 1.0; }
	if(m.x>1) { m.x = 0.0; }
	if(m.y<0) { m.y = 1.0; }
	if(m.y>1) { m.y = 0.0; }
    }
    
}
