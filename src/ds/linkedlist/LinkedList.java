/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.linkedlist;

import ds.graph.Edge;

/**
 *
 * @author Carlos NG
 */
// Contains edges
public class LinkedList {

    Node first;
    public int size;
    Edge[] edgeArray;
    class Node {

        Edge edge;
        String name;
        public Node next;

        Node(Edge edge) {
            this.edge = edge;
            this.next = null;
        }
    }
    
    public LinkedList(){
        size = 0;
    }
    
    public Edge[] getEdges(){
        edgeArray = new Edge[size];
        if(first != null){
         Node aux = first;
         int i = 0;
         while(aux.next != null){
             if(aux.edge != null){
                 edgeArray[i] = aux.edge;
                 i++;
            }
             aux = aux.next;
         }
         if(aux.edge != null){
             edgeArray[i] = aux.edge;
         }
         return edgeArray;
        }
        return null;
    }

    public void addLast(Edge edge) { // Inserts last
        Node newNode = new Node(edge);
        Node last = null;
        if (first != null) {
            last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            size++;
        } else {
            first = newNode;
            size++;
        }
    }

    public boolean search(String destiny) {
        Node aux = first;
        if (first == null) {

        } else {
            while (aux != null) {

                if (aux.edge.getDestiny() == destiny) {
                    return true;
                }
                aux = aux.next;
            }
        }
        return false;
    }
    
    public String getFirstWeight(){
        return first.edge.getWeight();
    }

    public void add(Edge edge) {
        Node newNode = new Node(edge);
        Node aux;
        if (first == null) {
            first = newNode;
            size++;
        } else {
            newNode.next = first;
            first = newNode;
            size++;
        }
    }

    public void remove() {
        Node p = first, prev = null;

        if (first != null) {
            first = first.next;
            return;
        }

        while (p.next != null) {
            prev = p;
            p = p.next;
        }

        if (first == null) {
            System.out.println("List is empty.");
        }
        prev.next = p.next;
    }
    
   

    public String graph(String origin) {
        String str = "";
        Node aux = first;
        while (aux.next != null) {
            str += aux.edge.getDestiny() + "[label= \"" + aux.edge.getDestiny() + "\"];";
            str += origin + "->" + aux.edge.getDestiny() + "[label=\"" + aux.edge.getWeight() + "\"];";
            aux = aux.next;
        }
        if (aux != null) {
            str += aux.edge.getDestiny() + "[label= \"" + aux.edge.getDestiny() + "\"];";
            str += origin + "->" + aux.edge.getDestiny() + "[label=\"" + aux.edge.getWeight() + "\"];";
        }
        return str;
    }
}
