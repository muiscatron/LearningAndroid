package com.immersivealbum.tempbuildsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean handled = true;

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_other:
                onClickMenuOther(item);
                handled = true;
                break;
            case R.id.action_exit:
                onClickMenuExit(item);
                handled = true;
                break;
            case R.id.action_settings:
                handled = true;
                break;
            default:
                handled = super.onOptionsItemSelected(item);
        }

        return handled;
    }

    public void onClickMenuOther(MenuItem item) {
        Toast toast = Toast.makeText(this, "Other note text changed", Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickMenuExit(MenuItem item) {
        this.finish();
    }


}
