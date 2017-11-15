package teampass.gympass.bean;

/**
 * Created by Cong Nhat on 11/10/2017.
 */

public class Exercise {
    private int id;
    private String tenbaitap;
    private String hinhanh;
    private String chitiet;
    private int id_nhom;
    private String id_workout;

    public Exercise() {
    }

    public Exercise(int id, String tenbaitap, String hinhanh, String chitiet, int id_nhom, String id_workout) {
        this.id = id;
        this.tenbaitap = tenbaitap;
        this.hinhanh = hinhanh;
        this.chitiet = chitiet;
        this.id_nhom = id_nhom;
        this.id_workout = id_workout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenbaitap() {
        return tenbaitap;
    }

    public void setTenbaitap(String tenbaitap) {
        this.tenbaitap = tenbaitap;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public int getId_nhom() {
        return id_nhom;
    }

    public void setId_nhom(int id_nhom) {
        this.id_nhom = id_nhom;
    }

    public String getId_workout() {
        return id_workout;
    }

    public void setId_workout(String id_workout) {
        this.id_workout = id_workout;
    }
}
