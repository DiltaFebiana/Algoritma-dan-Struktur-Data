/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author HP
 */
public class Graph {
   int vertex;
   boolean typeGraph;
   LinkedList List[];
   
   public Graph(int vertex, boolean typegraph) {
       this.vertex = vertex;
       this.typeGraph = typeGraph;
       List= new LinkedList[vertex];
       for (int i =0; i < vertex; i++) {
           List[i] = new LinkedList();    
        }
   }

   public void addEdge(int source, int destination){
       if (graphtype(typeGraph)){
           List[source].addFirst(destination);
           
       }else{
       //add edge
       List[source].addFirst(destination);
       
       //add back edge (for undirected)
       List[destination].addFirst(source);
      }
   }
    public void degree(int source) throws Exception{
        if (graphtype(typeGraph)){
            //degree directed graph
            //inDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++ ){
                for (int j = 0; j < List[i].size(); j++){
                    if (List[i].get(j) == source){
                        ++totalIn;
                    }
                }
                //outDegree
                for (k = 0; k < List[source].size(); k++){
                    List[source].get(k);
                }
                totalOut = k;
            }
            //degree undirected graph
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("OutDegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    } else {
            System.out.println("degree vertex " + source + " : " + List[source].size());
        }
    }
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < vertex; i++){
            if(i == destination){
                List[source].remove(destination);
            }
        }
    }
    public void removeAllEdges(){
        for (int i=0; i<vertex;i++){
            List[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++){
            if (List[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < List[i].size(); j++) {
                    System.out.print(List[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    boolean graphtype(boolean pilih){
        return pilih;
    }
        
}
