package com.example.volleytest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.text);

       // RequestQueue myRequest;
        //myRequest = Volley.newRequestQueue(this);
        RequestQueue queue;
        queue = MySingleton.getInstance(this.getApplicationContext()).getRequestQueue();

        JsonObjectRequest reply = new JsonObjectRequest(Request.Method.GET, "https://jsonplaceholder.typicode.com/todos/1", null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    Log.d("electramite", "Response: " + response.getString("title"));
                    t.setText(response.getString("title"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("electramite", "error occured while hitting API");
            }
        });
        //myRequest.add(reply);
        MySingleton.getInstance(this).addToRequestQueue(reply);
    }
}