package s.haeusler15.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void calculate(View view) {

        EditText weightEdit = findViewById(R.id.weight);
        EditText sizeEdit = findViewById(R.id.size);
        TextView resultEdit = findViewById(R.id.textResult);

        float weight = Integer.parseInt(weightEdit.getText().toString());
        float size = Integer.parseInt(sizeEdit.getText().toString());
        float sizeInMeter = size / 100;
        float result = weight / (sizeInMeter * sizeInMeter);

        resultEdit.setText(String.valueOf(result));
    }
}
