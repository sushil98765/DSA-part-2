import java.util.*;

public class sap20 {

    static class Edge{
        int src;
        int dest;
        int wt;
         public Edge (int s, int d, int wt){
             this.src=s;
             this.dest=d;
             this.wt=wt;
         }
    }

    public static void createGraph( ArrayList<Edge>  graph[]){
        for (int i=0; i< graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge>  graph[] ,int V,boolean vis[],int start){
        Queue<Integer> q =new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print( curr +" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size(); i++){
                    Edge e =graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>  graph[], int curr,boolean vis[]){
        System.out.print(curr + " ");
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(vis[e.dest]==false) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void  printallpaths(ArrayList<Edge>  graph[], int curr,boolean vis[],String path,int tar){
        if(curr==tar){
            System.out.print (path + " ");
            return;
        }
        for ( int i=0; i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                vis[curr]=true;
                printallpaths(graph ,e.dest,vis,path+e.dest, tar);
                vis[curr]=false;

            }
        }
    }




    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>  graph[]=new ArrayList[V];
        createGraph(graph);

        boolean vis[]=new boolean[V];

        int src=0;
        int tar=5;
        printallpaths(graph,src,vis, "0" ,tar);

        //dfs(graph,0,vis);

//        for (int i=0; i<V;i++){
//            if(vis[i]==false){
//                dfs(graph,i,vis);
//            }
//        }
//
//        System.out.println( );

//        for(int i=0; i<graph[4].size(); i++){
//            Edge e=graph[4].get(i);
//            System.out.print(e.dest +" ");
//        }

    }
}
