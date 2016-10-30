package com.example.byoungjune.quickcoding2;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /*****
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private TextView var; //전역변수로 사용
    private TextView var2;
    private TextView var3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.//random nextInt
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        var = (TextView) findViewById(R.id.textView); // var라는 텍스트 뷰 변수를 만듦 id는 해당 id
        var2 = (TextView) findViewById(R.id.textView2);
        var3 = (TextView) findViewById(R.id.textView3);


    }



    int min =0;
    int max =500;
    int count =0;
    int rd = 250;


    public void ClickS(View v) {


        max = rd;


        count = count+1;

        var2.setText(max+"이하");
        var3.setText(min+"이상");
        rd = (int)(Math.random()*(max+1-min)+min);
        var.setText("당신의 숫자는? : "+rd);// 텍스트메소드 호출


    }

    public void ClickB(View v) {

        min = rd;


        count = count+1;

        var2.setText(max+"이하");
        var3.setText(min+"이상");
        rd = (int)(Math.random()*(max+1-min)+min);
        var.setText("당신의 숫자는? : "+rd);



    }

    public void ClickBG(View v) {

        Toast.makeText(getApplicationContext(), "BingGo! "  + count +" 회의 시도끝에 맞췄습니다! ", Toast.LENGTH_LONG).show();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}//주석
