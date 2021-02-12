import java.util.ArrayList;

public class MainClass {

    /* FIRST TASK */
    public static void showResult(ArrayList<String> ar, ArrayList<Integer> numOfWords, ArrayList<String> unique) {
        System.out.println("Unique words:");
        for (int i = 0; i < unique.size(); i++) {
            System.out.print(unique.get(i) + " ");
        }
        System.out.println();
        System.out.println("Quantity of words:");
        for (int j = 0; j < ar.size(); j++) {
            System.out.print(ar.get(j) + " " + numOfWords.get(j) + "\t\t");
        }
        System.out.println();
    }

    public static void checkDuplicates(ArrayList<String> ar) {
        String helper;
        int counter = 0;
        ArrayList<Integer> arNumberOfWord = new ArrayList<Integer>();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < ar.size(); i++) {
            helper = ar.get(i);
            for (int j = 0; j < ar.size(); j++) {
                if (helper.equals(ar.get(j))) {
                    counter++;
                }
            }
            if (counter == 1) {
                arr.add(helper);
                arNumberOfWord.add(i, 1);
            } else {
                arNumberOfWord.add(i, counter);
            }
            counter = 0;
        }
        showResult(ar, arNumberOfWord, arr);
    }

    public static void init1Task() {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("One");
        ar.add("Two");
        ar.add("Three");
        ar.add("Four");
        ar.add("Five");
        ar.add("Six");
        ar.add("Six");
        ar.add("Three");
        ar.add("Five");
        ar.add("Seven");
        checkDuplicates(ar);
    }

    /* SECOND TASK */
    public static void init2Task() {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Brown", "89254545676");
        phoneDirectory.add("Gray", "89165433454");
        phoneDirectory.add("Pink", "9996765665");
        phoneDirectory.add("Black", "89996663311");
        phoneDirectory.add("Brown", "89157899887");
        phoneDirectory.add("Black", "89876543210");
        phoneDirectory.add("Brown", "89286756567");
        phoneDirectory.add("Brown", "89206576545");
        phoneDirectory.get("Brown");
        phoneDirectory.get("Black");
    }

    public static void main(String[] args) {
        init1Task();
        init2Task();
    }
}
