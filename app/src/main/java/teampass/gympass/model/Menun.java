package teampass.gympass.model;

/**
 * Created by Admin on 9/16/2017.
 */

public class Menun {
    private int avatar;
    private String name;

    public Menun(int avatar, String name) {
        this.avatar = avatar;
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
