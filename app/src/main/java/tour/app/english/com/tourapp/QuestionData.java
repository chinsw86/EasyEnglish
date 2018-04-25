package tour.app.english.com.tourapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionData {

    Map<String, List<Map<String, String>>> question = new HashMap<String, List<Map<String, String>>>();

    List<Map<String, String>> questionDataList = new ArrayList<>();
    Map<String, String> questionDataMap = new HashMap<>();


    public List<Map<String, String>> putQuestiondata(String number, String questiondata) {
        questionDataMap = new HashMap<>();
        questionDataMap.put(number, questiondata);
        questionDataList.add(questionDataMap);

        return questionDataList;

    }

    public Map<String, List<Map<String, String>>> putQuestion(String Category, List<Map<String, String>> questionData) {
        question = new HashMap<>();
        question.put(Category, questionDataList);

        return question;
    }


}
