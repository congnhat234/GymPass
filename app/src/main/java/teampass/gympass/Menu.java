package teampass.gympass;


/**
 * Created by DELL on 9/15/2017.
 */

public class Menu {
        private int imgTheHinh;
        private String name;

    public Menu(int imgTheHinh, String name) {
        this.imgTheHinh = imgTheHinh;
        this.name = name;
    }

    public int isImgTheHinh() {
        return imgTheHinh;
    }

    public void setImgTheHinh(int imgTheHinh) {
        this.imgTheHinh = imgTheHinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}