package Jobsheet14.Praktikum1;

public class Graph08 {
    int vertex;
    DoubleLinkedList list[];

    public Graph08(int v) {
        vertex = v;
        list = new DoubleLinkedList[v];
        for (int i=0; i<v; i++)  {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak); //directed graph
        // list[tujuan].addFirst(tujuan, jarak); //undirected graph
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        // for (int i=0; i<vertex; i++) {
        //     //inDegree
        //     for (int j=0; j<list[i].size(); j++) {
        //         if (list[i].get(j) ==  asal) {
        //             ++totalIn;
        //         }
        //     }
        //     // outDegree
        //     for (k=0; k<list[asal].size(); k++) {
        //         list[asal].get(k);
        //     }
        //     totalOut = k;
        // }

        // Calculating in-degree and out-degree
        for (int i = 0; i < vertex; i++) {
            totalOut += list[asal].size(); // Calculate out-degree directly for each vertex
            for (int j = 0; j < vertex; j++) {
                // Calculate in-degree by checking each list in the graph
                for (int k = 0; k < list[j].size(); k++) {
                    if (list[j].get(k) == asal) {
                        totalIn++;
                    }
                }
            }
        }
        System.out.println("InDegree dari Gedung "+(char) ('A'+asal)+": "+totalIn);
        System.out.println("OutDegree dari Gedung "+(char) ('A'+asal)+": "+totalOut);
        System.out.println("Degree dari Gedung "+(char) ('A'+asal)+": "+(totalIn+totalOut)); //directed graph
        // System.out.println("Degree dari Gedung "+(char) ('A'+asal)+": "+list[asal].size()); //undirected graph
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        // for (int i=0; i<vertex; i++) {
        //     if (i == tujuan) {
        //         list[asal].remove(tujuan);
        //     }
        // }
        if (asal < 0 || asal >= vertex || tujuan < 0 || tujuan >= vertex) {
            throw new Exception("Invalid vertex index");
        }

        list[asal].remove(tujuan);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan.");
    }

    public void printGraph() throws Exception {
        for (int i=0; i< vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung "+(char) ('A'+i)+" terhubung dengan: ");
                for (int j=0; j<list[i].size(); j++) {
                    int tujuan = list[i].get(j);
                    int jarak = list[i].getJarak(j);
                    System.out.print((char) ('A'+tujuan)+" ("+jarak+" m)");
                    if (j < list[i].size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }

    public boolean isAdjacent(int asal, int tujuan) {
        return list[asal].contains(tujuan);
    }

    public void updateJarak(int asal, int tujuan, int newJarak) throws Exception {
        list[asal].updateJarak(asal, tujuan, newJarak);
    }
}
