import java.util.*;

public class PhoneDirectory {
    HashMap<String, ArrayList<String>> ar;

    public PhoneDirectory() {
        ar = new HashMap<>();
    }

    public void add(String surName, String number) {
        if (ar.containsKey(surName)) {
            ArrayList<String> arNum = new ArrayList<>();
            for (int i = 0; i < (ar.get(surName)).size(); i++) {
                String helper = ar.get(surName).get(i);
                arNum.add(helper);
            }
            arNum.add(number);
            ar.remove(surName);
            ar.put(surName, arNum);
        } else {
            ArrayList<String> arN = new ArrayList<>();
            arN.add(number);
            ar.put(surName, arN);
        }
    }

    public void get(String surName) {
        System.out.print("Numbers of " + surName + ":\t");
        System.out.println(ar.get(surName));
    }
}