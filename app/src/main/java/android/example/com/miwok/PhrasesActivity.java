package android.example.com.miwok;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        phrases.add(new Phrase("Where are you going?", "minto wuksus"));
        phrases.add(new Phrase("What is your name?", "tinnә oyaase'nә"));
        phrases.add(new Phrase("My name is...", "oyaaset..."));
        phrases.add(new Phrase("How are you feeling?", "michәksәs?"));
        phrases.add(new Phrase("I’m feeling good.", "kuchi achit"));
        phrases.add(new Phrase("Are you coming?", "әәnәs'aa?"));
        phrases.add(new Phrase("Yes, I’m coming.", "hәә’ әәnәm"));
        phrases.add(new Phrase("I’m coming.", "әәnәm"));
        phrases.add(new Phrase("Let’s go.", "yoowutis"));
        phrases.add(new Phrase("Come here.", "әnni'nem"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        PhraseAdapter adapter = new PhraseAdapter(this, phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
