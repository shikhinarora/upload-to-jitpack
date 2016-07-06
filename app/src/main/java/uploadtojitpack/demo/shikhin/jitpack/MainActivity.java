package uploadtojitpack.demo.shikhin.jitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import shikhin.demo.uploadtojitpack.mylibrary.TestLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestLibrary.getInstance().makeMeAwesome(this, "shikhin");
    }
}
