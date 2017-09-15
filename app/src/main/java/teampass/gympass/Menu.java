package teampass.gympass;


/**
 * Created by DELL on 9/15/2017.
 */

public class Menu {
        private String name;
        private int color;


        public Menu(String name, int color ) {
            this.name = name;
            this.color = color;
        }


    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;

        }


}