package algo;

import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.NodeData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class directedWeightedGraphAlgorithms implements DirectedWeightedGraphAlgorithms {
    public DirectedWeightedGraph graph;

    public directedWeightedGraphAlgorithms() {
        this.graph = new directedWightedGraph();
    }
    @Override
    public void init(DirectedWeightedGraph g) {
        this.graph=g;
    }

    @Override
    public DirectedWeightedGraph getGraph() {
        return this.graph;
    }

    @Override
    public DirectedWeightedGraph copy() {
        DirectedWeightedGraph copy = this.graph;
        return copy;
    }

    @Override
    public boolean isConnected() {
        if (graph.nodeSize() == 1 || graph.nodeSize() == 0) {
            return true;
        }
        if (graph.edgeSize()==0)
        {
            return false;
        }
        return graph.nodeSize()*(graph.nodeSize()-1)==graph.edgeSize();
    }
    @Override
    public double shortestPathDist(int src, int dest) {
        if (graph == null || graph.getNode(src) == null || graph.getNode(dest) == null) {
            return -1;
        }
        if (src == dest) {
            return 0;
        }
        return 0;
    }

    @Override
    public List<NodeData> shortestPath(int src, int dest) {
        return null;
    }

    @Override
    public NodeData center() {
        double min = Integer.MAX_VALUE;
        NodeData answer = null;
        DirectedWeightedGraph g = new directedWightedGraph();
        Iterator<NodeData> iter = this.graph.nodeIter();
            while (iter.hasNext()) {
                NodeData cen = iter.next();
                if (cen.getTag() != -1) {
                    cen.setTag(-1);
                    double min2 = 0;
                    Iterator<NodeData> iter2 = this.graph.nodeIter();
                    while (iter2.hasNext()) {
                        NodeData temp = iter2.next();
                        if (temp.getTag() != -1) {
                            temp.setTag(-1);
                            min2 =min2+shortestPathDist(cen.getKey(), temp.getKey());
                        }
                    }
                    if (min> min2) {
                        min = min2;
                        answer = cen;
                    }
                    System.out.println("The path is " + min2);

                }
            }
        return answer;

    }


    @Override
    public List<NodeData> tsp(List<NodeData> cities) {

            if (cities.isEmpty()) {
                return null;
            }
            ArrayList<NodeData> x = new ArrayList<>();
            NodeData start = cities.get(0);
            cities.remove(start);
            x.add(start);
            while (cities.size() > 0) {
                int c = -1;
                double min = Double.MAX_VALUE;
                for (int i = 0; i < cities.size(); i++) {
                    double min1 = shortestPathDist(start.getKey(), (cities.get(i).getKey()));
                    if (min1 < min) {
                        min = min1;
                        c = i;
                    }
                }
                List<NodeData> x1 = (shortestPath(start.getKey(), cities.get(c).getKey()));
                x1.remove(0);
                x.addAll(x1);
                start = cities.get(c);
                cities.remove(start);
            }
            return x;

        }

    @Override
    public boolean save(String file) {
       return true;
        }



    @Override
    public boolean load(String file) {
        return false;
    }
}

