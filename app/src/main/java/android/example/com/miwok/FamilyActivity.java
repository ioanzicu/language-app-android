package android.example.com.miwok;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<FamilyMember> members = new ArrayList<FamilyMember>();

        members.add(new FamilyMember("father", "әpә"));
        members.add(new FamilyMember("mother", "әṭa"));
        members.add(new FamilyMember("son", "angsi"));
        members.add(new FamilyMember("daughter", "tune"));
        members.add(new FamilyMember("older brother", "taachi"));
        members.add(new FamilyMember("younger brother", "chalitti"));
        members.add(new FamilyMember("older sister", "teṭe"));
        members.add(new FamilyMember("younger sister", "kolliti"));
        members.add(new FamilyMember("grandmother", "ama"));
        members.add(new FamilyMember("grandfather", "paapa"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        FamilyAdapter adapter = new FamilyAdapter(this, members);

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
