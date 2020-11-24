package np.com.binabh.mostest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import np.com.binabh.common.MyCommonClass;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText num1 ;
    private EditText num2 ;
    private Button addButton;
    private TextView sum ;
    private MyCommonClass myCommonClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addButton = findViewById(R.id.addButton);
                addButton.setOnClickListener(this);
        sum = findViewById(R.id.sum);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.addButton){
            myCommonClass = new MyCommonClass(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()));
            myCommonClass.add();
            Log.i("sum",myCommonClass.getSum());
        }
    }
}