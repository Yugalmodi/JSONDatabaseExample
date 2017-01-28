package com.techpalle.jsondatabaseexample;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
//    Button button;
//    ListView listView;
//    MyTask myTask;
//    MyDatabase myDatabase;
//    SimpleCursorAdapter simpleCursorAdapter;
//    Cursor cursor;
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        myDatabase = new MyDatabase(getActivity());
//        myDatabase.open();
//    }
//
//    @Override
//    public void onDestroy() {
//        myDatabase.close();
//        super.onDestroy();
//    }
//
//    public class MyTask extends AsyncTask<String, Void, String> {
//        URL myUrl;
//        HttpURLConnection httpURLConnection;
//        InputStream inputStream;
//        InputStreamReader streamReader;
//        BufferedReader bufferedReader;
//        String line;
//        StringBuilder builder = new StringBuilder();
//        @Override
//        protected String doInBackground(String... strings) {
//            try {
//                myUrl = new URL(strings[0]);
//                httpURLConnection = (HttpURLConnection) myUrl.openConnection();
//                inputStream = httpURLConnection.getInputStream();
//                streamReader = new InputStreamReader(inputStream);
//                bufferedReader = new BufferedReader(streamReader);
//                line = bufferedReader.readLine();
//                while (line != null){
//                    builder.append(line);
//                    line = bufferedReader.readLine();
//                }
//                return builder.toString();
//            }
//            catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//            catch (SecurityException e) {
//                e.printStackTrace();
//            }
//            return "Some Thing Went Wrong";
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            try {
//                JSONObject jsonObject = new JSONObject(s);
//                JSONArray k = jsonObject.getJSONArray("contacts");
//                for (int i = 0; i<k.length(); i++){
//                    JSONObject m = k.getJSONObject(i);
//                    String name = m.getString("name");
//                    String email = m.getString("email");
//                    JSONObject phone = m.getJSONObject("phone");
//                    String mobile = phone.getString("mobile");
//                    myDatabase.insert(name, email, mobile);
//
//                }
//                cursor.requery();
//            } catch (JSONException e) {
//                e.printStackTrace();
//                Log.d("B34", "JSON PARSING ERROR");
//            }
//            super.onPostExecute(s);
//        }
//    }
//
//    public boolean checkConnection(){
//        ConnectivityManager manager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
//        if(networkInfo == null || networkInfo.isConnected() == false){
//            return false;
//        }
//        return true;
//    }

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {View v = inflater.inflate(R.layout.fragment_main, container, false);
//        button = (Button) v.findViewById(R.id.button);
//        listView = (ListView) v.findViewById(R.id.lv);
//        myTask = new MyTask();
//        cursor = myDatabase.queryContact();
//        simpleCursorAdapter = new SimpleCursorAdapter(getActivity(), R.layout.row, cursor,
//                new String[]{"_id", "name", "email", "mobile"},
//                new int[]{R.id.text_view_no, R.id.text_view_name, R.id.text_view_email,R.id.text_view_mobile}
//                );
//        listView.setAdapter(simpleCursorAdapter);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(checkConnection()){
//                    if(myTask.getStatus() == AsyncTask.Status.RUNNING || myTask.getStatus() == AsyncTask.Status.FINISHED){
//                        Toast.makeText(getActivity(), "Already Running, Please Wait......", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    myTask.execute("http://api.androidhive.info/contacts/");
//                }
//                else {
//                    Toast.makeText(getActivity(), "PLEASE Check Your Internet Connection", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        return v;
    }
}
