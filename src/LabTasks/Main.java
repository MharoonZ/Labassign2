package LabTasks;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {


         Pc pc = new Pc();


        List<Pc> list = new ArrayList<>();
        list.add(0,new Pc(0, "octa core", "8gb", "512gb", "cool", "true"));
        list.add(1, new Pc(3, "octa core", "9gb", "512gb", "cool", "true"));
        list.add(2,new Pc(5, "octa core", "8gb", "512gb", "cool", "true"));
        list.add(3, new Pc(2, "octa core", "8gb", "512gb", "cool", "true"));
        list.add(4,new Pc(1, "octa core", "8gb", "512gb", "cool", "true"));



//        List<Pc> list2 = new ArrayList<>();
//        list2.addAll(list);
//        list2.addAll(list);

//        System.out.println("PCs in list1:");
//        for (Pc pcc : list) {
//            System.out.println(pcc);
//        }
//

//        for (int i=0; i< list.size();i++)
//        {
//            list.get(i).setId(list.get(i).getId()+2);
//        }

//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).setId((i + 1) * 2);
//        }


        Collections.sort(list);

        System.out.println("PCs in list 1:");
        for (Pc pcc : list) {

            System.out.println(pcc);

        }

        System.out.println("PCs in list 1:");
        for (Pc pcc : list) {
            pcc.reversed();
            System.out.println(pcc);

        }

       // list.set(3,new Pc(4, "octa core", "8gb", "512gb", "cool", "true"));
      //  list.remove(2);
      //  list.remove(new Pc(1, "octa core", "8gb", "512gb", "cool", "true"));

//        System.out.println("PCs in list1:");
//        for (Pc pcc : list) {
//            System.out.println(pcc);
//        }
        //System.out.println(list.contains(new Pc(3, "octa core", "8gb", "512gb", "cool", "true")));

    }
}
