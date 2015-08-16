package io.github.seniorzhai.databindingdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"static", "observale", "recycler", "grid", "fragment"}));
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        StaticActivity.start(MainActivity.this);
                        break;
                    case 1:
                        ObservaleActivity.start(MainActivity.this);
                        break;
                    case 2:
                        RecyclerActivity.start(MainActivity.this);
                        break;
                    case 3:
                        GridActivity.start(MainActivity.this);
                        break;
                    case 4:
                        FragmentActivity.start(MainActivity.this);
                        break;
                }
            }
        });
    }


}
