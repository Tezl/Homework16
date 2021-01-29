package ArrayList;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {

        String[] arrayStrings = new String[10];
        ArrayList<String> arrayListStrings = new ArrayList<>();

        for (int i = 0; i < arrayStrings.length; i++) {
            arrayStrings[i] = "array: " + i;
            arrayListStrings.add(i, "arrayList: " + i);
        }

        String s = arrayListStrings.get(3);

        arrayListStrings.set(4, "new arrayList is: " + 4);

        arrayListStrings.remove(6);

        arrayListStrings.add(5, "Add to the middle");

        System.out.println(arrayListStrings.toString());
    }



}
