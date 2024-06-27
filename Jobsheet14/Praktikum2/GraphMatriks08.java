package Jobsheet14.Praktikum2;

public class GraphMatriks08 {
    int vertex;
    int[][] matriks;

    public GraphMatriks08(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i=0; i< vertex; i++) {
            System.out.println("Gedung "+(char) ('A'+i)+": ");
            for (int j=0; j<vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung "+(char) ('A'+j)+" ("+matriks[i][j]+" m), ");
                }
            }
            System.out.println();
            
        }
    }

    public void degree(int asal) {
        int inDegree = 0;
        int outDegree = 0;
        
        // Menghitung inDegree
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                inDegree++;
            }
        }
        
        // Menghitung outDegree
        for (int j = 0; j < vertex; j++) {
            if (matriks[asal][j] != 0) {
                outDegree++;
            }
        }
        
        // Menampilkan hasil
        System.out.println("Indegree dari Gedung "+(char) ('A'+asal)+": "+inDegree);
        System.out.println("Outdegree dari Gedung "+(char) ('A'+asal)+": "+outDegree);
        System.out.println("Degree dari Gedung "+(char) ('A'+asal)+": "+(inDegree + outDegree));
    }

    public void cekEdge(int asal, int tujuan) {
        if (matriks[asal][tujuan] != 0) {
            System.out.println("Terdapat edge dari Gedung "+(char) ('A'+asal)+" ke Gedung "+(char) ('A'+tujuan)+" dengan jarak "+matriks[asal][tujuan]+" m.");
        } else {
            System.out.println("Tidak terdapat edge dari Gedung "+(char) ('A'+asal)+" ke Gedung "+(char) ('A'+tujuan)+".");
        }
    }

    public void hitungEdge() {
        int count = 0;
        
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != 0) {
                    count++;
                }
            }
        }
        
        System.out.println("Jumlah edge dalam graph adalah: " + count);
    }
}
