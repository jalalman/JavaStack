import java.util.ArrayList;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> museum =new ArrayList<Art>();
        Painting p1=new Painting("oil","nature","jalal","landscape paint");
        museum.add(p1);
        Painting p2=new Painting("Watercolor","sea","jalal","blueish");
        museum.add(p2);
        Painting p3=new Painting("Acrylic","pretty women","jalal","black women");
        museum.add(p3);
        Sculpture s1=new Sculpture("Marble","Animal drawing","jalal","lion");
        museum.add(s1);
        Sculpture s2=new Sculpture("bronze","kid drawing","jalal","brown hair");
        museum.add(s2);
        s2.viewArt();
        for (Art art : museum) {
            art.viewArt();
        }



    }
}
