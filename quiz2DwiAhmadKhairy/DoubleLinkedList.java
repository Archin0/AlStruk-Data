package quiz2DwiAhmadKhairy;

public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
        System.out.println("berhasil ditambahkan.");
    } 
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
        System.out.println("berhasil dihapus.");
    }
    void print(){
        Node tmp = head;
        System.out.println("----------------------");
        System.out.println("Linked Lists: ");
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    }

    //Soal No 1 Kode Ganjil
    void addLast(int data){ // method untuk menambahkan List baru di akhir
        Node newNd = new Node(data); // menginstansiasi newNd untuk digunakan pada method
        if (isEmpty()) { // jika kosong, maka akan diarahkan ke method addFirst(data)
            addFirst(data);
        } else { // sementara jika tidak kosong, maka data akan ditambahkan di bagian akhir.
            newNd.p = tail; // newNd.previous adalah tail
            tail.n = newNd; // tail.next adalah newNd
            tail = newNd;   // dan diakhir akan dinyatakan statement tail adalah newNd.
        }
        size++; // menambahkan 1 value pada variable size
        System.out.println("berhasil ditambahkan."); // berhasil ditambah.
    }

    //Soal No 1 Kode Genap
    // void deleteLast(){
       
    // }

    //Soal No 2 Kode Ganjil dan Genap
    void printFromTail(){ // method untuk menampilkan Linked Lists dari Tail
        Node tmp = tail; // statement untuk menyatakan tmp adalah tail
        System.out.println("-----------------------");
        System.out.println("Linked Lists(dari tail): ");
        while(tmp!=null){ // Loop untuk menampilkan Lists diimana jika tmp(tail) tidak sama dengan null,
                          // maka akan mengeksekusi program didalamnya yang akan menampilkan lists tersebut.
            System.out.print(""+tmp.data+"-");
            tmp = tmp.p; // statement untuk menggerakkan tmp ke previous list(list sebelumnya)
        }
        System.out.println("");
    }
    
}