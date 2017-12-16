package sas.eschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class StudentsList_classRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_list);

        CardView student1 = findViewById(R.id.student1);

        student1.setOnClickListener(v ->
                startActivity(new Intent(StudentsList_classRoom.this, Studentdetails_classRoom.class)));

    }
}
