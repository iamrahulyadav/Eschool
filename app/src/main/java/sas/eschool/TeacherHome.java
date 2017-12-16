package sas.eschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TeacherHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home);

        ImageView event_cl = findViewById(R.id.event_cl);
        ImageView class_cl = findViewById(R.id.class_cl);
        ImageView mesg_cl = findViewById(R.id.mesg_cl);


        mesg_cl.setOnClickListener(v -> {
            startActivity(new Intent(TeacherHome.this , StudentList.class));
        });

        class_cl.setOnClickListener(v -> {

            startActivity(new Intent(TeacherHome.this , ClassRoom_teacher.class));

        });

        event_cl.setOnClickListener(v -> {
            startActivity(new Intent(TeacherHome.this, EventList.class));
        });
    }
}
