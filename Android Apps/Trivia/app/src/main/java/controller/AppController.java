package controller;

import android.app.Application;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class AppController extends Application {
    public  static  final String TAG = AppController.class.getSimpleName();
    private static AppController mInstance;
    private RequestQueue mrequestQueue;
    public static synchronized AppController getInstance(Context context) {

        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
    public RequestQueue getRequestQueue() {
        if (mrequestQueue == null) {
            mrequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mrequestQueue;
    }
    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }
}
