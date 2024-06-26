package Jobsheet11.Tugas1;

public class Main {
    public static void main(String[] args) {
        SLL sll = new SLL();
        
        sll.addFirst(new Mahasiswa("111", "Anton"));
        sll.addLast(new Mahasiswa("113", "Yusuf"));
        sll.insertAfter("111", new Mahasiswa("112", "Prita"));
        sll.insertAt(3, new Mahasiswa("114", "Doni"));
        sll.addLast(new Mahasiswa("115", "Sari"));
        sll.print();

    }
}

