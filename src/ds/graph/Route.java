/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.graph;

/**
 *
 * @author Carlos NG
 */
public class Route {
    private String origin;
    private String destiny;
    private String time;

    public Route(String origin, String destiny, String time) {
        this.origin = origin;
        this.destiny = destiny;
        this.time = time;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    
    
    
}
