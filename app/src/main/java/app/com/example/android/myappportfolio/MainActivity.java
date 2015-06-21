package app.com.example.android.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(getApplicationContext(), getString(R.string.button1_text), Toast.LENGTH_LONG);
                if (toast != null) {
                    toast.show();
                }
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(getApplicationContext(), getString(R.string.button2_text), Toast.LENGTH_LONG);
                if(toast != null){
                    toast.show();
                }
            }
        });

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(getApplicationContext(), getString(R.string.button3_text), Toast.LENGTH_LONG);
                if(toast != null){
                    toast.show();
                }
            }
        });

        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(getApplicationContext(), getString(R.string.button4_text), Toast.LENGTH_LONG);
                if(toast != null){
                    toast.show();
                }
            }
        });

        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(getApplicationContext(), getString(R.string.button5_text), Toast.LENGTH_LONG);
                if(toast != null){
                    toast.show();
                }
            }
        });

        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(getApplicationContext(), getString(R.string.button6_text), Toast.LENGTH_LONG);
                if(toast != null){
                    toast.show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
