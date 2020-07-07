/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.graph;

import ds.linkedlist.LinkedList;

/**
 *
 * @author Carlos NG
 */
public class Vertex{
    
    private String name;
    private int vertNum;
    public  LinkedList list; // linked list for edges (Neighbors of each vertex).
    public int minDistance = Integer.MAX_VALUE;

    
    public Vertex(String name) {
        this.name = name;
        this.vertNum = -1;
        list = new LinkedList();
    }
        
    public int getDistance(){
        return minDistance;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVertNum() {
        return vertNum;
    }

    public void setVertNum(int vertNum) {
        this.vertNum = vertNum;
    }

    public String toString() {
        return name + " (" + vertNum + ") ";
    }
    
}
