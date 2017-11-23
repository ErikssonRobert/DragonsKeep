package roberteriksson12.gmail.com.dragonskeep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayButtonPressed(View view){
        Intent intent = new Intent(this, SetupCharacterActivity.class);
        startActivity(intent);
    }

    public void onExitButtonClick(View view){
        finish();
    }
}
