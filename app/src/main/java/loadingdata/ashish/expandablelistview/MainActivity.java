package loadingdata.ashish.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WidgetInitailization();
        getingData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
    }

    private void WidgetInitailization() {
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
    }

    private void getingData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Android Version");
        listDataHeader.add("Places");
        listDataHeader.add("Books");

        // Adding child data
        List<String> android = new ArrayList<String>();
        android.add("Alpha Version ");
        android.add("Beta version");
        android.add("Cupcake");
        android.add("Donut");
        android.add("Eclairs");
        android.add("Froyo");
        android.add("GingerBread");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("Delhi");
        nowShowing.add("Hyderabad");
        nowShowing.add("Banglore");
        nowShowing.add("Chennai");
        nowShowing.add("Madras");
        nowShowing.add("Gurgaon");

        List<String> books = new ArrayList<String>();
        books.add("Science fiction");
        books.add("Drama");
        books.add("Romance");
        books.add("Mystery");
        books.add("Action and Adventure");

        listDataChild.put(listDataHeader.get(0), android); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), books);
    }
}
