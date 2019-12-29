package android.example.com.miwok;

import android.util.Log;
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

        Log.i("NumbersActivity", words.get(0));
        Log.i("NumbersActivity", words.get(1));
        Log.i("NumbersActivity", words.get(2));
        Log.i("NumbersActivity", words.get(3));
        Log.i("NumbersActivity", words.get(4));
        Log.i("NumbersActivity", words.get(5));
        Log.i("NumbersActivity", words.get(6));
        Log.i("NumbersActivity", words.get(7));
        Log.i("NumbersActivity", words.get(8));
        Log.i("NumbersActivity", words.get(9));

    }
}
