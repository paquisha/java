import java.util.*;


//clase para DFS
class Graph {
    private int Vertices;   // numero de vertices

    private LinkedList<Integer> adj_list[];

    Graph(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj_list[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj_list[v].add(w);
    }

    void DFS_helper(int v,boolean visited[]) {
        visited[v] = true;
        System.out.print(v+" ");

        Iterator<Integer> i = adj_list[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFS_helper(n, visited);
        }
    }


    void DFS(int v) {
        boolean visited[] = new boolean[Vertices];

        DFS_helper(v, visited);
    }
}

//clases para BFS
class GraphDos {
    private int Vertices;
    private LinkedList<Integer> adj_list[];

    GraphDos(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj_list[i] = new LinkedList();
    }

    void addEdge(int v,int w) {
        adj_list[v].add(w);
    }

    void BFS(int root_node)   {
        boolean visited[] = new boolean[Vertices];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[root_node]=true;
        queue.add(root_node);

        while (queue.size() != 0)  {
            root_node = queue.poll();
            System.out.print(root_node+" ");

            Iterator<Integer> i = adj_list[root_node].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
class Principal{
    public static void main(String args[])
    {
        //DFS
        Graph g = new Graph(6);
        g.addEdge(0, 0);
        g.addEdge(0, 3);
        g.addEdge(0, 1);
        g.addEdge(1, 4);
        g.addEdge(2, 2);
        g.addEdge(2, 5);
        System.out.println("DFS: ");
        g.DFS(0);


        //BFS
        GraphDos grafo = new GraphDos(6);
        grafo.addEdge(0, 0);
        grafo.addEdge(0, 3);
        grafo.addEdge(0, 1);
        grafo.addEdge(1, 4);
        grafo.addEdge(2, 2);
        grafo.addEdge(2, 5);
        System.out.println("\nBFS:");
        grafo.BFS(0);

    }
}