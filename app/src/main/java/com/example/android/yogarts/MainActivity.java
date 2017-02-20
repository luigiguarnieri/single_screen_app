package com.example.android.yogarts;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.content.Intent;
        import android.net.Uri;

/**
 * This app displays a new page every time one of the button of the main page is clicked.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMap(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?q=Yogarts a.s.d.," +
                        " Via Quintino Cataudella 8, 95123 Catania CT"));
        startActivity(intent);
    }
}

