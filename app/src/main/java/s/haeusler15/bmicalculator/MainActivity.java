package s.haeusler15.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private EditText weight, size, result;
//    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void calculate(View view) {
//        result.setText(weight.getText());

        EditText weightEdit = findViewById(R.id.weight);
        EditText sizeEdit = findViewById(R.id.size);
        EditText resultEdit = findViewById(R.id.result);

        float weight = Integer.parseInt(weightEdit.getText().toString());
        float size = Integer.parseInt(sizeEdit.getText().toString());
        float sizeInMeter = size / 100;
        float result = weight / (sizeInMeter * sizeInMeter);

//        Toast.makeText(getApplicationContext(), "weight: "+weight, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(), "size: "+size, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(), "sizeInMeter: "+sizeInMeter, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(), "result: "+result, Toast.LENGTH_SHORT).show();

        resultEdit.setText(String.valueOf(result));
    }
}
