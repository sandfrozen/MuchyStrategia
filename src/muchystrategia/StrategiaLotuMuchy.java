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
public interface StrategiaLotuMuchy {

    /* Strategia lotu modyfikuje wektor, czyli to w jakim kierunku mucha ma sie poruszac */
    
    void lot(Mucha m);
    
    Color getColor();

}
