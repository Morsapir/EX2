# EX2
 *Contributers: Mor Sapir
     *
     * in this project I'm assigned to implement a Directed Weighted Graph,
     * and run algorithms on it. and asked to build a GUI were you could load graphs using a JSON file.
     * in this project I was asked to be able to generate large graphs up to 1,000,000 Nodes and 10,000,000 Edges
     *
     *
     *
     * class-
     * edgeData interface EdgeData-

     * 	public int getSrc();
     * 	public int getDest();
     * 	public double getWeight();
     * 	public String getInfo();
     * 	public void setInfo(String s);
     * 	public int getTag();
     * 	public void setTag(int t);
     *
     *
     * nodeData interface NodeData-
     *
     *  public int getKey();
     * 	public void setLocation(GeoLocation p);
     * 	public double getWeight();
     * 	public void setWeight(double w);
     * 	public String getInfo();
     * 	public void setInfo(String s);
     * 	public int getTag();
     * 	public void setTag(int t);

     *  geoLocation interface Geolocation
     *
     *  public double x();
     *  public double y();
     *  public double z();
     *  public double distance(GeoLocation g);
     *
     *  directedWeightedGraph interface DirectedWeightedGraph
     *
     *  public NodeData getNode(int key);
     * 	public EdgeData getEdge(int src, int dest);
     * 	public void addNode(NodeData n);
     * 	public void connect(int src, int dest, double w);
     * 	public Iterator<NodeData> nodeIter();
     * 	public Iterator<EdgeData> edgeIter();
     * 	public Iterator<EdgeData> edgeIter(int node_id);
     * 	public NodeData removeNode(int key);
     * 	public EdgeData removeEdge(int src, int dest);
     * 	public int nodeSize();
     * 	public int edgeSize();
     * 	public int getMC();


     *  directedWeightedGraphAlgorithms interface DirectedWeightedGraphAlgorithms
     *
     *  public void init(DirectedWeightedGraph g);
     *  public DirectedWeightedGraph getGraph();
     *  public DirectedWeightedGraph copy();
     *  public boolean isConnected();
     *  public double shortestPathDist(int src, int dest);
     *  public List<NodeData> shortestPath(int src, int dest);
     *  public NodeData center();
     *  List<NodeData> tsp(List<NodeData> cities);
     *  public boolean save(String file);
     *  public boolean load(String file);
     *
     *
     *
     */

}
