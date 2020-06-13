package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class StatisticsActivity extends AppCompatActivity {

    TextView tvConfirmed, tvDeceased, tvActive, tvRecovered, tvConfirmednew, tvRecoverednew;
    PieChart pieChart;
    Intent intent;
    String country, url;
    Spinner spinnerCountries;
    private ArrayList<CountryData> mCountryList;
    private CountryAdapter mAdapter;
    ArrayList<String> countries;
    SimpleArcLoader simpleArcLoader;
    LinearLayout lay1, lay2, lay3;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        tvConfirmed = findViewById(R.id.tvConfirmed);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvActive = findViewById(R.id.tvACtive);
        tvDeceased = findViewById(R.id.tvDeceased);
        tvConfirmednew = findViewById(R.id.tvConfirmednew);
        tvRecoverednew = findViewById(R.id.tvRecoverednew);
        pieChart = findViewById(R.id.pieChart);
        spinnerCountries = findViewById(R.id.spinner_country);
        simpleArcLoader = findViewById(R.id.loader);
        lay1 = findViewById(R.id.lay1);
        lay2 = findViewById(R.id.lay2);
        lay3 = findViewById(R.id.lay3);
        countries = new ArrayList<>();
        country = "india";

        countryinit();
        mAdapter = new CountryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        spinner();
        fetchData();

    }


    private void fetchData() {

        if (country != "Global") {
            url = "https://corona.lmao.ninja/v2/countries/" + country;
        } else {
            url = "https://corona.lmao.ninja/v2/all";
        }

        lay1.setVisibility(View.GONE);
        lay2.setVisibility(View.GONE);
        lay3.setVisibility(View.GONE);
        simpleArcLoader.setVisibility(View.VISIBLE);
        simpleArcLoader.start();

        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response.toString());

                            tvConfirmed.setText(jsonObject.getString("cases"));
                            tvDeceased.setText(jsonObject.getString("deaths"));
                            tvActive.setText(jsonObject.getString("active"));
                            tvRecovered.setText(jsonObject.getString("recovered"));
                            tvConfirmednew.setText(jsonObject.getString("todayCases"));
                            tvRecoverednew.setText(jsonObject.getString("todayRecovered"));

                            pieChart.clearChart();
                            pieChart.addPieSlice(new PieModel("Cases", Integer.parseInt(tvConfirmed.getText().toString()), Color.parseColor("#ffaf49")));
                            pieChart.addPieSlice(new PieModel("Active", Integer.parseInt(tvActive.getText().toString()), Color.parseColor("#df55f2")));
                            pieChart.addPieSlice(new PieModel("Recovered", Integer.parseInt(tvRecovered.getText().toString()), Color.parseColor("#75e900")));
                            pieChart.addPieSlice(new PieModel("Deaths", Integer.parseInt(tvDeceased.getText().toString()), Color.parseColor("#E91E63")));
                            pieChart.startAnimation();

                            simpleArcLoader.stop();
                            simpleArcLoader.setVisibility(View.GONE);
                            lay1.setVisibility(View.VISIBLE);
                            lay2.setVisibility(View.VISIBLE);
                            lay3.setVisibility(View.VISIBLE);

                        } catch (JSONException e) {
                            e.printStackTrace();
                            simpleArcLoader.stop();
                            simpleArcLoader.setVisibility(View.GONE);
                            lay1.setVisibility(View.VISIBLE);
                            lay2.setVisibility(View.VISIBLE);
                            lay3.setVisibility(View.VISIBLE);
                            Toast.makeText(StatisticsActivity.this, "network issue..", Toast.LENGTH_LONG).show();

                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        simpleArcLoader.stop();
                        simpleArcLoader.setVisibility(View.GONE);
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        Toast.makeText(StatisticsActivity.this, "network issue...", Toast.LENGTH_LONG).show();

                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);

    }

    public void spinner() {

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryData clickedItem = (CountryData) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCountryName();
                country = countries.get(position);
                fetchData();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    private void countryinit() {

        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryData("INDIA", R.drawable.india));
        mCountryList.add(new CountryData("Global", R.drawable.global));
        mCountryList.add(new CountryData("USA", R.drawable.usa));
        mCountryList.add(new CountryData("BRAZIL", R.drawable.brazil));
        mCountryList.add(new CountryData("RUSSIA", R.drawable.russia));
        mCountryList.add(new CountryData("SPAIN", R.drawable.spain));
        mCountryList.add(new CountryData("UK", R.drawable.uk));
        mCountryList.add(new CountryData("ITALY", R.drawable.italy));
        mCountryList.add(new CountryData("PERU", R.drawable.peru));
        mCountryList.add(new CountryData("GERMANY", R.drawable.germany));
        mCountryList.add(new CountryData("TURKEY", R.drawable.turkey));
        mCountryList.add(new CountryData("IRAN", R.drawable.iran));
        mCountryList.add(new CountryData("FRANCE", R.drawable.france));
        mCountryList.add(new CountryData("CHILE", R.drawable.chile));
        mCountryList.add(new CountryData("MEXICO", R.drawable.maxico));
        mCountryList.add(new CountryData("MALAYSIA", R.drawable.malesiya));

        countries.add("India");
        countries.add("Global");
        countries.add("USA");
        countries.add("Brazil");
        countries.add("Russia");
        countries.add("Spain");
        countries.add("UK");
        countries.add("Italy");
        countries.add("Peru");
        countries.add("Germany");
        countries.add("Turkey");
        countries.add("Iran");
        countries.add("France");
        countries.add("Chile");
        countries.add("Mexico");
        countries.add("Malaysia");
    }

    public void back(View view) {

        intent = new Intent(StatisticsActivity.this, MainActivity.class);
        startActivity(intent);

    }

    @Override
    public void finish() {

        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
