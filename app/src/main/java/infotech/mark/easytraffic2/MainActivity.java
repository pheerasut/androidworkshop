package infotech.mark.easytraffic2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createListview();
    }

    private void createListview() {
        MyData objMydata = new MyData();
        int[] intIcon = objMydata.icon();
        String[] strTitle = objMydata.title();
        MyAdapter objMyadapter = new MyAdapter(MainActivity.this,intIcon,strTitle);
        ListView myListView=(ListView)findViewById(R.id.listView);
        myListView.setAdapter(objMyadapter);


    }

    public void click_test(View view) {
        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("http://pheerasut.bugs3.com"));
        startActivity(objIntent);
    }//click


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
