package StarWarsProject;

public class Graph
{
    double adjMatrix [][];  //2D matrix
    int v; //vertices
    public Graph(int v){ //constructor
        this.v = v;
        adjMatrix = new double[v][v];
    }
    public void addEdge(int startingPoint, int endingPoint, double distance){ //add an Edge
        adjMatrix[startingPoint][endingPoint] = distance;
    }
    public void displayGraph (){ //prints Graph
        for (int i = 0; i < v; i++){
            System.out.println();
            for (int j = 0; j < v; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
        }
    }
    public void displayEdge (int x, int y){ //prints Edge
        System.out.println("Distance: " + adjMatrix[x][y] + " " + "parsecs");
    }
}

