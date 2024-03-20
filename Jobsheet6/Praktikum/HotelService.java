package Jobsheet6.Praktikum;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambah(Hotel h){
        if(idx<rooms.length){
            rooms[idx] = h;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll(){
        for(Hotel h : rooms){
            h.tampilAll();
            System.out.println("------------------------");

        }
    }

    // bubbleHarga(asc)
    void bubbleHarga(){
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i; j++){
                if(rooms[j].harga < rooms[j-1].harga){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    // selectionHarga(asc)
    void selectionHarga(){
        for(int i=0; i<rooms.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<rooms.length; j++){
                if(rooms[j].harga < rooms[idxMin].harga){
                    idxMin = j;
                }
            }
            //swap
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }

    // bubbleRating(desc)
    void bubbleRating(){
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i; j++){
                if(rooms[j].bintang > rooms[j-1].bintang){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    // selectionRating(desc)
    void selectionRating(){
        for(int i=0; i<rooms.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<rooms.length; j++){
                if(rooms[j].bintang > rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            //swap
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
