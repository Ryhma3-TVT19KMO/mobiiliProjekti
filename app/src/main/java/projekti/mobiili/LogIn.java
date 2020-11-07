package projekti.mobiili;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_activity);

        textView = (TextView)findViewById(R.id.textViewRegister) ;
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogIn.this, SignUp.class) ;
                startActivity(intent) ;

                Toast.makeText(LogIn.this, "You clicked on the text", Toast.LENGTH_LONG).show();
            }
        });



    }
}






