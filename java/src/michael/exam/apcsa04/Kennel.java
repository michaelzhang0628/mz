package michael.exam.apcsa04;

import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;
    
    public Kennel(ArrayList<Pet> petList) {
        super();
        this.petList = petList;
    }

    String allSpeakString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < petList.size(); i++) {
            Pet p = petList.get(i);
            sb.append(p.getName() + " " + p.speak() + "\n");
        }
        return sb.toString();
    }
    
    public void allSpeak() {
        System.out.println(this.allSpeakString());
    }
}
