package lecture2.ithub.com.alertdialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static lecture2.ithub.com.alertdialog.R.id.buttonMinus;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    TextView textViewResult;
    EditText editTextValue1;
    EditText editTextValue2;
    Button buttonPlus;
    Button mButtonMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

         textViewResult = (TextView)findViewById(R.id.textViewResult);
         editTextValue1 = (EditText)findViewById(R.id.editTextValue1);
         editTextValue2 = (EditText)findViewById(R.id.editTextValue2);
         buttonPlus = (Button)findViewById(R.id.buttonPlus);
        mButtonMinus = (Button)findViewById(R.id.buttonMinus);

        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = editTextValue1.getText().toString();
                String value2= editTextValue2.getText().toString();
                int v1 = Integer.parseInt(value1);
                int v2 = Integer.parseInt(value2);
                int v3 = v1 - v2;
                textViewResult.setText(v3+"");
                Toast.makeText(MainActivity.this, "My is ...",Toast.LENGTH_LONG).show();
            }
        });

    }


    public void onClickPlus(View view) {
        String value1 = editTextValue1.getText().toString();
        String value2= editTextValue2.getText().toString();
        int v1 = Integer.parseInt(value1);
        int v2 = Integer.parseInt(value2);
        int v3 = v1 + v2;

        textViewResult.setText(v3+"");

    }


}
