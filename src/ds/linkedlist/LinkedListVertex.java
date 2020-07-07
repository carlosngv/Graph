/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.linkedlist;

import ds.graph.Edge;
import ds.graph.Vertex;

/**
 *
 * @author Carlos NG
 */

// Contains all of vertices.

public class LinkedListVertex {

    Node first;
    int size;
    Vertex[] vertices;
    class Node {

        Vertex vertex;
        String name;
        public Node next;

        Node(Vertex vertex) {
            this.vertex = vertex;
            this.next = null;

        }
    }

    public LinkedListVertex() {
        this.size = 0;
    }
    
    public Vertex[] getVertices(){
        vertices = new Vertex[size];
         Node aux = first;
         int i = 0;
         while(aux.next != null){
             vertices[i] = aux.vertex;
             i++;
             aux = aux.next;
         }
         if(aux != null){
             vertices[i] = aux.vertex;
         }
         return vertices;
    }

    public void addLast(Vertex vertex) { // Inserts last
        Node newNode = new Node(vertex);
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

    public void addEdge(String name, Edge edge) {
        Node aux = first;
        if (first == null) {

        } else {
            while (aux != null) {

                if (aux.vertex.getName().equals(name)) {
                    aux.vertex.list.addLast(edge);
                }
                aux = aux.next;
            }
            if(aux != null){
                if (aux.vertex.getName().equals(name)) {
                    aux.vertex.list.addLast(edge);
                }
            }
        }

    }

    public void remove(String name) {
        Node aux = first;
        Node prev = null;
        while (aux.next != null && aux.vertex.getName().equals(name) == false) {
            prev = aux;
            aux = aux.next;
        }
        if (aux.vertex.getName().equals(name) == true) {
            if (first == aux) {
                first = aux.next;
            } else {
                prev.next = aux.next;
            }
        }
    }

    public boolean search(String name) {

        if (first == null) {

        } else {
            Node aux = first;
            while (aux != null) {

                if (aux.vertex.getName().equals(name)) {
                    return true;
                }
                aux = aux.next;
            }
        }
        return false;
    }
    public Vertex searchVertex(String value) {

        if (first == null) {

        } else {
            Node aux = first;
            while (aux != null) {

                if (aux.vertex.getName().equals(value)) {
                    return aux.vertex;
                }
                aux = aux.next;
            }
        }
        return null;
    }

    
    public boolean adjacency(String origin, String destiny) {
        Node aux = first;
        if (first != null) {
            while (aux != null) {

                if (aux.vertex.getName().equals(origin) == true) {
                    if (aux.vertex.list.search(destiny) == true) {
                        return true;
                    }
                }
                aux = aux.next;
            }
        }
        return false;
    }

    public String traversal() {
        Node aux = first;
        String str = "";
        while (aux.next != null) {
            if (aux.vertex.list.first != null) {
                str += aux.vertex.list.graph(aux.vertex.getName());
            }
            aux = aux.next;
        }
        if(aux != null){
            if (aux.vertex.list.first != null) {
                str += aux.vertex.list.graph(aux.vertex.getName());
            }
        }
        return str;
    }

}
