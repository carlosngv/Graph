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
public class Edge {
    Vertex target;
    private String destiny;
    private String weight;

    
    
    public Edge(String destiny, String weight, Vertex target){
        this.target = target;
        this.destiny = destiny;
        this.weight = weight;
    }

    public Vertex getTarget() {
        return target;
    }
    
    
    
    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    public boolean equals(Object obj){
        Edge edge = (Edge)obj;
        return destiny == edge.destiny;
    }
}
