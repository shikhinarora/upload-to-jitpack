package shikhin.demo.uploadtojitpack.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by home on 7/6/2016.
 */
public class TestLibrary {
    private static TestLibrary ourInstance = new TestLibrary();

    public static TestLibrary getInstance() {
        return ourInstance;
    }

    private TestLibrary() {
    }

    public void makeMeAwesome(Context context, String message){
        Toast.makeText(context, "Awesome " + message, Toast.LENGTH_LONG).show();

    }
}
