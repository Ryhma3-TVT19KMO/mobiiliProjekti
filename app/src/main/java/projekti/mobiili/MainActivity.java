package projekti.mobiili;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button menuNappi, karttaNappi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuNappi = (Button) findViewById(R.id.menuNappi);
        karttaNappi = (Button) findViewById(R.id.karttaNappi);

        menuNappi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openMenu();
            }
        });

        karttaNappi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openMap();
            }
        });
    }

    public void openMenu(){
        Intent intent = new Intent(this, Ruokalista.class);
            startActivity(intent);
    }

    public void openMap(){
        Intent intent = new Intent(this, Ruokalista.class);
        startActivity(intent);
    }
}