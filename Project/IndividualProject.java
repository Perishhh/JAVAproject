import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class IndividualProject {
    private static boolean loadStatus = false, get8Status = false, cycleStatus, connectedStatus=true;
    private static int[][] adjacencyMatrix;
    private static String[] vertexs;
    private static int[] order;


    public static void printMenu(){
        System.out.println("");
        System.out.println("Action Menu: ");
        System.out.println("1. Load the graph from graph.txt.");
        System.out.println("2. Find a spanning tree of the current graph with a specified root.");
        System.out.println("3. Is the current graph contains cycle?");
        System.out.println("4. Is the current graph connected?");
        System.out.println("5. Add an edge to the current graph.");
        System.out.println("6. Print the adjacency list of the current graph.");
        System.out.println("7. Save the adjacency list of the current graph.");
        System.out.println("8. Exit");
        System.out.println("");
    }

    public static String getAction(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Please specify an action: ");
        String action = kb.nextLine();
        while(!action.equals("1") && !action.equals("2") &&
              !action.equals("3") && !action.equals("4") &&
              !action.equals("5") && !action.equals("6") &&
              !action.equals("7") && !action.equals("8")){
            System.out.println("Invalid action.");
            System.out.print("Please specify an action: ");
            action = kb.nextLine();
        }
        return action;
    }
    public static void printAdj(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            int place = order[i];
            System.out.print(vertexs[place]+": ");
            for (int j = 0; j < matrix[0].length; j++) {
                int j_place = order[j];
                if(matrix[place][j_place] == 1) System.out.print(vertexs[j_place]+", ");
            }
            System.out.print("\b\b"+"  \n");
        }
    }
    public static int[] getIndexArray(String[] nodes){
        String[] sortedStrings = Arrays.copyOf(nodes, nodes.length);
        Arrays.sort(sortedStrings);
        int[] indexes = new int[nodes.length];
        for (int i = 0; i < indexes.length; i++) {
            for (int j = 0; j < indexes.length; j++) {
                if(sortedStrings[i]==nodes[j]){
                    indexes[i] = j;
                }
            }
        }
        return indexes;  
    }
    public static int[][] Initialization(String root) {
        int[][] G = new int[vertexs.length][vertexs.length];
        int rootPlace = 0;
        for (int i = 0; i < vertexs.length; i++) {
            if(vertexs[i].equals(root)){
                rootPlace = i;
            }
        }
        if(loadStatus){
            for (int i = 0; i < vertexs.length; i++) {
                for (int j = 0; j < vertexs.length; j++) {
                    G[i][j] = 0;
                }
            }
            buildSpanningTreeRecur(G, rootPlace);
            for (int i = 0; i < vertexs.length; i++) {
                int disconnectedFlag = 1;
                for (int j = 0; j < vertexs.length; j++) {
                    if(G[i][j]==0)  disconnectedFlag *=1;
                    else if(G[i][j]==1) disconnectedFlag *=0;
                }
                if(disconnectedFlag==1) connectedStatus = false;
            }
            
        }else System.out.println("The graph is not loaded yet.");
        return G;
    }
    
    public static void buildSpanningTreeRecur(int[][] G, int u) {

        for (int v = 0; v < vertexs.length; v++) {
            if(adjacencyMatrix[u][v]==1){
                //if v does not in G
                int vinG = 0;
                for (int j = 0; j < vertexs.length; j++) {
                    vinG += G[v][j];
                }
                if(vinG==0){
                    //add edge
                    G[u][v]=1;
                    G[v][u]=1;
                    buildSpanningTreeRecur(G, v);
                }else if(G[u][v]==0){
                    cycleStatus = true;
                }
            }
        }
    }


    public static void performAction(int action){
        switch(action){
            case 1:
                try {
                    File file = new File("graph.txt");
                    Scanner fileReader = new Scanner(file);
                    loadStatus = true; cycleStatus = false;
                    //how many vertexs
                    int vertex = 0, edge = 0;
                    while(fileReader.hasNext()){
                        fileReader.nextLine();
                        vertex++;
                    }
                    fileReader.close();
                    //vertexs list
                    Scanner fileReader2 = new Scanner(file);
                    vertexs = new String[vertex];
                    for (int i = 0; i < vertexs.length; i++) {
                        vertexs[i] = fileReader2.nextLine().split(": ")[0];
                    }
                    fileReader2.close();
                    order = getIndexArray(vertexs);
                    //adj list
                    Scanner fileReader3 = new Scanner(file);
                    adjacencyMatrix = new int[vertex][vertex];
                    for (int i = 0; i < adjacencyMatrix[0].length; i++) {
                        for (int j = 0; j < adjacencyMatrix[0].length; j++) {
                            adjacencyMatrix[i][j] = 0;
                        }
                    }
                    for (int i = 0; i < adjacencyMatrix[0].length; i++) {
                        String line = fileReader3.nextLine();
                        String[] arr = line.split(": ")[1].split(", ");
                        for (int j = 0; j < arr.length; j++) {
                            for (int k = 0; k < vertexs.length; k++) {
                                if(vertexs[k].equals(arr[j])){
                                    adjacencyMatrix[i][k] = 1;
                                }
                            }
                            edge++;
                        }
                    }
                    edge = edge/2;
                    /* 
                    for (int i = 0; i < vertexs.length; i++) {
                        for (int j = 0; j < vertexs.length; j++) {
                            System.out.print(adjacencyMatrix[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    */
                    System.out.printf("#vertex: %d, #edges: %d\n",vertex,edge);
                    fileReader3.close();

                } catch (FileNotFoundException e) {
                    System.out.println("Error on loading graph from file.");
                    e.printStackTrace();
                }
                break;
            case 2:
                if(loadStatus){
                    Scanner kb = new Scanner(System.in);
                    System.out.print("Please specify a root: ");
                    String root = kb.nextLine();
                    int[][] G = Initialization(root);
                    if(connectedStatus) printAdj(G);
                    else System.out.println("Spanning tree cannot be found because the graph is not connected.");
                }else System.out.println("The graph is not loaded yet.");
                break;
            case 3:
                if(loadStatus){
                    Initialization("1");
                    if(cycleStatus) System.out.println("Yes");
                    else System.out.println("No");
                }else System.out.println("The graph is not loaded yet.");
                break;
            case 4:
                if(loadStatus){
                    Initialization("1");
                    if(connectedStatus) System.out.println("Yes");
                    else System.out.println("No");
                }else System.out.println("The graph is not loaded yet.");
                break;
            case 5:
                if(loadStatus){
                    Scanner kb = new Scanner(System.in);
                    System.out.print("Enter the first endpoint id: ");
                    String u_node = kb.nextLine(); int u = -1;
                    for (int i = 0; i < vertexs.length; i++) {
                        if(vertexs[i].equals(u_node)){
                            u = i;
                        }
                    }
                    System.out.print("Enter the second endpoint id: ");
                    String v_node = kb.nextLine(); int v = -1;
                    for (int i = 0; i < vertexs.length; i++) {
                        if(vertexs[i].equals(v_node)){
                            v = i;
                        }
                    }
                    if(u==-1||v==-1){
                        int num = 0;
                        if(u==-1){
                            //u is a new node
                            num+=1;
                            u = vertexs.length;
                            String[] newVertexes = new String[vertexs.length+1];
                            for(int i = 0; i < vertexs.length; i++){
                                newVertexes[i] = vertexs[i];
                            }
                            newVertexes[vertexs.length] = u_node;
                            vertexs = newVertexes;
                        }
                        if(v==-1){
                            //v is a new node
                            num+=1;
                            v = vertexs.length;
                            String[] newVertexes = new String[vertexs.length+1];
                            for(int i = 0; i < vertexs.length; i++){
                                newVertexes[i] = vertexs[i];
                            }
                            newVertexes[vertexs.length] = v_node;
                            vertexs = newVertexes;
                        }
                        
                        //reset adj
                        int[][] newAdjacencyMatrix = new int[vertexs.length][vertexs.length];
                        for (int i = 0; i < vertexs.length; i++) {
                            for (int j = 0; j < vertexs.length; j++) {
                                newAdjacencyMatrix[i][j]=0;
                            }
                        }
                        for (int i = 0; i < vertexs.length-num; i++) {
                            for (int j = 0; j < vertexs.length-num; j++) {
                                newAdjacencyMatrix[i][j]=adjacencyMatrix[i][j];
                            }
                        }
                        newAdjacencyMatrix[u][v] = 1;
                        newAdjacencyMatrix[v][u] = 1;
                        adjacencyMatrix = newAdjacencyMatrix;
                        //reorder
                        int[] newOrder = getIndexArray(vertexs);
                        order = newOrder;

                    }else{
                        if(adjacencyMatrix[u][v]==0){
                            adjacencyMatrix[u][v]=1;
                            adjacencyMatrix[v][u]=1;
                            System.out.println("New edge is added successfully.");
                        }else if(adjacencyMatrix[u][v]==1){
                            System.out.println("Edge already exists.");
                        }
                    }
                    
                    //reset the status
                    cycleStatus = false; connectedStatus = true;
                    Initialization("1");
                }else System.out.println("The graph is not loaded yet.");
                break;
            case 6:
                if(loadStatus){
                    printAdj(adjacencyMatrix);
                }else System.out.println("The graph is not loaded yet.");
                break; 
            case 7:
                if(loadStatus){
                    Scanner kb = new Scanner(System.in);
                    System.out.print("Where to save the adjacency list of the current graph? ");
                    String path = kb.nextLine();
                    try{
                        FileWriter outputFile = new FileWriter(path);
                        for (int i = 0; i < adjacencyMatrix.length; i++) {
                            
                            String line = "";
                            int place = order[i];
                            line += vertexs[place]+": ";
                            for (int j = 0; j < adjacencyMatrix.length; j++) {
                                if(adjacencyMatrix[place][j] == 1) line += vertexs[j]+", ";
                            }
                            line = line.substring(0,line.length()-2);
                            line += "\n";
                            outputFile.write(line);
                        }
                        outputFile.close();
                        System.out.println("The adjacency list is successfully saved to the specified file.");
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }else System.out.println("The graph is not loaded yet.");
                break;
            case 8:
                System.out.println("Bye bye!");
                get8Status = true;
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to this social network analysis system.");
        while(!get8Status){
            printMenu();
            int action = Integer.parseInt(getAction());
            performAction(action);
        }
    }
}