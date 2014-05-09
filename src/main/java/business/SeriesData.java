/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

/**
 *
 * @author jpicklyk
 * @param <Object>
 * @param <Number>
 */
public class SeriesData<Object, Number> {
    public final Object x;
    public final Number y;
    
    public SeriesData(Object x, Number y) {
        this.x = x;
        this.y = y;
    }

    public Object getX() {
        return x;
    }

    public Number getY() {
        return y;
    }
        
}
