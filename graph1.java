
import java.util.Arrays;
 


public class Ques_4
{
    private int V, pathCount;
    private int[] path;     
    private int[][] graph;
 
    
    public void HamiltonCycle(int[][] g)
    {
        V = g.length;
        path = new int[V];
 
        Arrays.fill(path, -1);
        graph = g;        
        try
        {            
            path[0] = 0;
            pathCount = 1;            
            solve(0);
            System.out.println("No solution");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            display();
        }
    }
    
    public void solve(int vertex) throws Exception
    {
        
        if (graph[vertex][0] == 1 && pathCount == V)
            throw new Exception("Solution found");
        
        if (pathCount == V)
            return;
 
        for (int v = 0; v < V; v++)
        {
            
            if (graph[vertex][v] == 1 )
            {
                        
                path[pathCount++] = v;    
                         
                graph[vertex][v] = 0;
                graph[v][vertex] = 0;
 
               
                if (!isPresent(v))
                    solve(v);
 
               
                graph[vertex][v] = 1;
                graph[v][vertex] = 1;
                
                path[--pathCount] = -1;                    
            }
        }
    }    
    
   
    public static void main (String[] args) 
    {
        
        System.out.println("Hamiltonian Cycle Algorithm Test\n");
        
        Ques_4 hc = new Ques_4();
 
        
        int graph[][] = {{0, 1, 1, 0, 0}, 
			{1, 0, 1, 1, 1}, 
			{1, 1, 0, 1, 1}, 
			{0, 1, 1, 0, 1}, 
			{0, 1, 1, 1, 0}, 
		}; 
 
        hc.HamiltonianCycle(graph);        
    }    
}
