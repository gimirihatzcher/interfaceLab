import java.util.ArrayList;
//Dorin Tihon
public class DemoTurners {
    public static void main(String[] args) {
        ArrayList<Turner> list = new ArrayList<>();

        list.add(new Leaf());
        list.add(new Document(0,3,"1100","01/01/2020"));
        list.add(new Pancake());
        list.add(new Streetlight());


        for(int x = 0; x<3; x++) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).turn());

            }
            System.out.println("\n");
        }



        System.out.println(((Document)list.get(1)).returnIdDate());
    }
}

