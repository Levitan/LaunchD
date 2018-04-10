package xyz.wildapp.android.launchd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent sendIntent = new Intent(Intent.ACTION_MAIN);
        startActivity(sendIntent);
        finish();
    }
}
