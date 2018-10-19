package iics.nase.natalienicole.nasenatalielab5;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToMap = (Button) findViewById(R.id.buttonToMap);

        buttonToMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmnIntentUri = Uri.parse("geo:40.7128,-74.0060");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmnIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });
    }

    public void buttonToAct2(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

}
