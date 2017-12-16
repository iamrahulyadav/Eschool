package sas.eschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClassRoom_teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_room_teacher);

        TextView attendence = findViewById(R.id.attendence);
        TextView pointt = findViewById(R.id.pointt);
        TextView eventt = findViewById(R.id.eventt);


        attendence.setOnClickListener(v -> {



        });

    }
}
