package projekti.mobiili;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class palaute extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palaute);

        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();
            }
        });


    }

    @SuppressLint({"LongLogTag", "IntentReset"})
    private void sendEmail() {

            Log.i("Send email", "");
            String[] TO = {"t8foju00@students.oamk.fi"};
            String[] CC = {""};
            Intent emailIntent = new Intent(Intent.ACTION_SEND);

            emailIntent.setData(Uri.parse("mailto:"));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
            emailIntent.putExtra(Intent.EXTRA_CC, CC);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Palaute");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "");

            try {
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                finish();
                Log.i("Finished sending email", "Viesti lähetetty");
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(palaute.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }


    }



