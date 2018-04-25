package tour.app.english.com.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment_Air extends Fragment {

    Button question1;
    LinearLayout layout;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_air, null);

        question1 = view.findViewById(R.id.Q1);
        layout = view.findViewById(R.id.layout_fragment_question);

        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //버튼에 글자넣기
                ((QuestionActivity) getActivity()).question_text = "I'd /like/ to book/ a flight/ to New York.";
                //버튼 생성
                ((QuestionActivity) getActivity()).createbutton();

                ((QuestionActivity) getActivity()).questionlayout.setVisibility(View.VISIBLE);
                layout.setVisibility(View.GONE);
            }
        });

        return view;
    }
}
