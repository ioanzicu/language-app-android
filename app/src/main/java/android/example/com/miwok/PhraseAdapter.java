package android.example.com.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter {

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param phrases A List of Word objects to display in a list
     */
    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the PhraseAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, phrases);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Get the {@link Word} object located at this position in the list
        Phrase currentWord = (Phrase) getItem(position);

        // Find the TextView in the list_item.xml layout with ID miwok_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok translation from the current PhraseAdapter object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the current PhraseAdapter object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getmDefaultTranslation());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
