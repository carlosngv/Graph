/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.graph;
import ds.graph.Vertex;
import ds.graph.Edge;
import ds.graph.Route;
import ds.linkedlist.LinkedListVertex;
/**
 *
 * @author carlosngv
 */
public class Graph {
    Vertex[] adjTable;
    int maxSize;
    LinkedListVertex lsVertex;

    public Graph() {
    }

    public void addVertex(String name) {

        if (lsVertex.search(name) == false) {
            Vertex vertex = new Vertex(name);
            lsVertex.addLast(vertex);
        } else {
            System.out.println("Vetice is already added.");
        }
    }

    public void addRoute(Route route) {
        addVertex(route.getDestiny());
        addVertex(route.getOrigin());
        addEdge(route.getOrigin(), route.getDestiny(), route.getTime());
    }

    public void addEdge(String origin, String destiny, String weight) {
        if (lsVertex.adjacency(origin, destiny) == false) {
            Edge newEdge = new Edge(destiny, weight, lsVertex.searchVertex(destiny));
            lsVertex.addEdge(origin, newEdge);
        } else {
            System.out.println("Edge already exists!");
        }

    }
}
