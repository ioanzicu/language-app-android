package android.example.com.miwok;

import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("tree");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find LinearLayout with the id "rootView"
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int index = 0;

        while(index < words.size()) {
            // Create TextView element
            TextView wordView = new TextView(this);
            // Set view text
            wordView.setText(words.get(index));
            // Append child view to the root view
            rootView.addView(wordView);

            index++;
        }

    }
}
