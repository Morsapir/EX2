package algo;

import api.DirectedWeightedGraph;
import api.EdgeData;
import api.NodeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class directedWightedGraph implements DirectedWeightedGraph {
    private HashMap<Integer, NodeData> nodeData;
    private HashMap<Integer, HashMap<Integer, EdgeData>> edges;
    private HashMap<Integer, HashMap<Integer, EdgeData>> edges1;
    private int edgeSize;
    private int mc;

    public directedWightedGraph(directedWightedGraph graph){
        this.nodeData = graph.nodeData;
        this.edges = graph.edges;
        this.edges1 = graph.edges1;
        this.edgeSize=graph.edgeSize;
        this.mc=graph.mc;
    }

    public directedWightedGraph(){
        this.nodeData = new HashMap<>();
        this.edges = new HashMap<>();
        this.edges1 = new HashMap<>();
        this.edgeSize = 0;
        this.mc = 0;
    }

    @Override
    public NodeData getNode(int key) {
        return this.nodeData.get(key);
    }

    @Override
    public EdgeData getEdge(int src, int dest) {
        return this.edges.get(src).get(dest);
    }

    @Override
    public void addNode(NodeData n) {
        this.nodeData.put(n.getKey(),n);
        this.mc++;
    }

    @Override
    public void connect(int src, int dest, double w) {
        if(nodeData.containsKey(src)||!nodeData.containsKey(dest)||src == dest) {
            throw new RuntimeException();
        }
        EdgeData e = new edgeData(src,dest,w," ",0);
        if(edges.containsKey(src))
            edges.get(src).put(dest,e);
        else
        {
            HashMap<Integer,EdgeData> p = new HashMap<Integer,EdgeData>();
            p.put(dest,e);
            edges.put(src,p);
        }
        if(edges1.containsKey(dest))
            edges1.get(dest).put(src,e);
        else
        {
            HashMap<Integer,EdgeData> p = new HashMap<Integer,EdgeData>();
            p.put(src,e);
            edges1.put(dest,p);
        }
        this.edgeSize++;
        this.mc++;
    }


    @Override
    public Iterator<NodeData> nodeIter() {
        int counter = mc;
        if(mc != counter)
            throw new RuntimeException(" the graph was changed since the iterator was constructed");
        return nodeData.values().iterator();
            }

    @Override
    public Iterator<EdgeData> edgeIter() {
            List<EdgeData> list = new ArrayList<>();
            Iterator<NodeData> i=nodeIter();
            while (i.hasNext()){
                Iterator<EdgeData> iE=edgeIter(i.next().getKey());
                while (iE.hasNext()){
                    list.add(iE.next());
                }
            }
            return list.iterator();
        }



    @Override
    public Iterator<EdgeData> edgeIter(int node_id) {
        return this.edges.get(node_id).values().iterator();     }

    @Override
    public NodeData removeNode(int key) {
        if(!this.nodeData.containsKey(key))
            return null;
        NodeData vertex = nodeData.remove(key);
        HashMap<Integer, EdgeData> e = edges.get(key);
        HashMap<Integer, EdgeData> e1 = edges1.get(key);
        Iterator<EdgeData> i = e.values().iterator();
        Iterator<EdgeData> k = e1.values().iterator();

        while (i.hasNext()){
            EdgeData runner = i.next();
            EdgeData eData = edges.get(runner.getSrc()).get(runner.getDest());
            edges1.get(eData.getDest()).remove(eData.getSrc());
            edgeSize --;
        }

        while (k.hasNext()){
            EdgeData runner = k.next();
            EdgeData eData = edges1.get(runner.getDest()).get(runner.getSrc());
            edges.get(eData.getSrc()).remove(eData.getDest());
            edgeSize --;

        }
        this.edges.remove(key);
        this.mc ++;
        return vertex;
    }

    @Override
    public EdgeData removeEdge(int src, int dest) {
            if (this.edges.get(src).containsKey(dest)){
                this.edges.get(src).remove(dest);
                this.edges1.get(dest).remove(src);
                this.edgeSize--;
                this.mc++;
            }
            return null;
        }

    @Override
    public int nodeSize() {
        return this.nodeData.size();
    }

    @Override
    public int edgeSize() {
        return this.edgeSize;
    }

    @Override
    public int getMC() {
        return this.mc;
    }
}
