import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.joanisaac.listperfomance.Model;
import com.example.joanisaac.listperfomance.R;

import java.util.ArrayList;

/**
 * Created by JoanIsaac on 22/05/2015.
 */
public class CustomAdapter extends ArrayAdapter<Model> {
    public CustomAdapter(Context context, ArrayList<Model> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Model model = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_item_template, parent, false);
        }
        // Lookup view for data population
        ImageView image = (ImageView) convertView.findViewById(R.id.imageItem);
        TextView tvName = (TextView) convertView.findViewById(R.id.textTitle);
        TextView tvHome = (TextView) convertView.findViewById(R.id.description);
        // Populate the data into the template view using the data object
        image.setImageResource(model.getPicture());
        tvName.setText(model.getTitle());
        tvHome.setText(model.getDescription());
        // Return the completed view to render on screen
        return convertView;
    }
}