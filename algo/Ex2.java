package algo;

import algo.directedWeightedGraphAlgorithms;
import algo.directedWightedGraph;
import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;

/**
 * This class is the main class for algo.Ex2 - your implementation will be tested using this class.
 */
public class Ex2 {
    /**
     * This static function will be used to test your implementation
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    public static DirectedWeightedGraph getGrapg(String json_file) {
        DirectedWeightedGraph ans = new directedWightedGraph();
        directedWeightedGraphAlgorithms graph = new directedWeightedGraphAlgorithms();
        graph.init(ans);
        graph.load(json_file);
        return graph.getGraph();
    }
    /**
     * This static function will be used to test your implementation
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    public static DirectedWeightedGraphAlgorithms getGrapgAlgo(String json_file) {
        DirectedWeightedGraph ans = new directedWightedGraph();
        directedWeightedGraphAlgorithms graph = new directedWeightedGraphAlgorithms();
        graph.init(ans);
        graph.load(json_file);
        return graph;
    }
    /**
     * This static function will run your GUI using the json fime.
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     *
     */
    public static void runGUI(String json_file) {
        DirectedWeightedGraphAlgorithms alg = getGrapgAlgo(json_file);


    }
}