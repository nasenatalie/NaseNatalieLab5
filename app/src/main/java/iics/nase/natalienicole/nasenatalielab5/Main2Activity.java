package iics.nase.natalienicole.nasenatalielab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button buttonToMap2 = (Button) findViewById(R.id.buttonToMap2);

        buttonToMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmnIntentUri = Uri.parse("geo:4.1755,73.5093");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmnIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });
    }

    public void buttonToAct1(View view)
    {
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
