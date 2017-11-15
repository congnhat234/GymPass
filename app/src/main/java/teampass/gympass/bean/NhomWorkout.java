package teampass.gympass.bean;

/**
 * Created by Cong Nhat on 11/15/2017.
 */

public class NhomWorkout {
    private String id;
    private String tennhom;
    private String hinhanh;

    public NhomWorkout() {
    }

    public NhomWorkout(String id, String tennhom, String hinhanh) {
        this.id = id;
        this.tennhom = tennhom;
        this.hinhanh = hinhanh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTennhom() {
        return tennhom;
    }

    public void setTennhom(String tennhom) {
        this.tennhom = tennhom;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
}
