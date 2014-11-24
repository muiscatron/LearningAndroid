package com.immersivealbum.interactiveuiproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        boolean handled = false;

        int id = item.getItemId();

        switch (id) {
            case R.id.action_other:
                onClickMenuOther(item);
                break;
            case R.id.action_exit:
                onClickMenuExit(item);
                break;
            default:
                handled = super.onOptionsItemSelected(item);

        }


        return handled;
    }


    public void onClickMenuOther(MenuItem item) {
        Toast toast = Toast.makeText(this, getString(R.string.message_other_clicked), Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickMenuExit(MenuItem item) {
        finish();
    }



}
