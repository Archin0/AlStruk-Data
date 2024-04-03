package Jobsheet7.StringSearching;

public class PencarianBuku08 {
    Buku08 listBk[] = new Buku08[5];
    int idx;

    void tambah(Buku08 m) {
        if(idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    public void tampil() {
        for(Buku08 m : listBk) {
                m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = -1; 
        for(int j=0; j<listBk.length; j++) {
            if(listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos) {
        if(pos!=-1) {
            System.out.println("Data "+ x +" ditemukan pada indeks "+ pos);
        } else {
            System.out.println("Data "+ x +" tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
        if(pos!=-1) {
            System.out.println("Kode Buku\t : "+x);
            System.out.println("Judul\t         : "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : "+listBk[pos].pengarang);
            System.out.println("Stok\t         : "+listBk[pos].stock);
        } else {
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }

    public Buku08 findBuku(String cari) {
        Buku08 bukuFound = null;

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                bukuFound = listBk[i];
                break;
            }
        }
        return bukuFound;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        while (right >= right) {
            int mid = (right + left) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid;
            } else if (listBk[left].kodeBuku.compareTo(cari) <= 0 && cari.compareTo(listBk[mid].kodeBuku) <= 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
