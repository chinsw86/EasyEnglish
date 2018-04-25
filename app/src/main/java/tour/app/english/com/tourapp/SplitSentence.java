package tour.app.english.com.tourapp;

import java.util.ArrayList;
import java.util.List;

public class SplitSentence {
    public List<String> splitString(String splitsentence) {

        List<String> list = new ArrayList<>();

        String[] stringArr = splitsentence.split("/");

        for (int i = 0; i < stringArr.length; i++) {
            list.add(stringArr[i]);
        }

        return list;
    }

}
