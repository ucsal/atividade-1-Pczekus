package br.com.mariojp.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public static final String TAG = "MINHA_APP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "minha app",  "estou no oncreate");
    }
    @Override
    protected  void onStart(){
        super.onStart();
        Log.d( "MINHA_APP", "onStart");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("MINHA_APP",  "onResume");
        Toast.makeText(this,R.string.alo_msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onStop() {
        super.onStop();
        Log.d("MINHA_APP", "onStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("MINHA_APP",  "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MINHA_APP", "onRestart");
    }
}
