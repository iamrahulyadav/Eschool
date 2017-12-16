package sas.eschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EventList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        ImageView lov1 = findViewById(R.id.lov1);
        ImageView lov2 = findViewById(R.id.lov2);
        ImageView lov3 = findViewById(R.id.lov3);


        lov1.setOnClickListener(v -> lov1.setImageResource(R.drawable.like2));
        lov2.setOnClickListener(v -> lov2.setImageResource(R.drawable.like));
        lov3.setOnClickListener(v -> lov3.setImageResource(R.drawable.like2));

    }
}
