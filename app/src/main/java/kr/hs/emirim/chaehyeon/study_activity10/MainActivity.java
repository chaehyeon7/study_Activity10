package kr.hs.emirim.chaehyeon.study_activity10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_name, edit_age;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_name = findViewById(R.id.edit_name);
        edit_age = findViewById(R.id.edit_age);
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //이름과 나이를 sub로 전달
                String name = edit_name.getText().toString();
                String age = edit_age.getText().toString();

                Intent intent = new Intent (MainActivity.this, MainActivity.class);

                    //intent에 값을 저장
                    intent.putExtra("m_name", name);
                    intent.putExtra("m_age", age);

                    startActivity(intent);

            }
        });

    }
}