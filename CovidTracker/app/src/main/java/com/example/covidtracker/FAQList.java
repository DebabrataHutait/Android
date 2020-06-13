package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FAQList extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    LinearLayout l1, l2, l3, l4, l5, l6, tag;
    String val;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_list);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);

        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        l3 = (LinearLayout) findViewById(R.id.l3);
        l4 = (LinearLayout) findViewById(R.id.l4);
        l5 = (LinearLayout) findViewById(R.id.l5);
        l6 = (LinearLayout) findViewById(R.id.l6);

        try {
            val = getIntent().getStringExtra("val").toString();
        } catch (Exception e) {
            val = "";
        }

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if (val.equals("About")) {

            tv1.setText("1) What is COVID-19?");
            tv2.setText("2)What is the difference between SARS and COVID-19?");
            tv3.setText("3)What is the difference between MERS and COVID-19?");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);

            l1.setTag("11");
            l2.setTag("12");
            l3.setTag("13");
        } else if (val.equals("Symptoms")) {

            tv1.setText("1) How long dose it takes for symptoms to appear?");
            tv2.setText("2) Can symptoms of COVID-19 present even after 14 days?");
            tv3.setText("3) Who is at higher risk of severe illness with COVID-19?");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);

            l1.setTag("21");
            l2.setTag("22");
            l3.setTag("23");
        } else if (val.equals("Spread")) {

            tv1.setText("1) Why dose the coronavirus spread relatively easily between people?");
            tv2.setText("2) Can someone spread the virus without being sick?");
            tv3.setText("3) What is close contact?");
            tv4.setText("4) How long dose the virus survive on surfaces?");
            tv5.setText("5) If a colleague gets infected, what should be done?");
            tv6.setText("6) can I get sick with COVID-19 from touch ing food, the food packaging, or food contact surfaces, if the coronavirus was present on it?");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);

            l1.setTag("31");
            l2.setTag("32");
            l3.setTag("33");
            l4.setTag("34");
            l5.setTag("35");
            l6.setTag("36");

        } else if (val.equals("Prevention")) {

            tv1.setText("1) What dose social distancing mean?");
            tv2.setText("2) What steps should I take to prevent COVID-19?");
            tv3.setText("3) Are hand sanitizers better than soap in order to kill the virus?");
            tv4.setText("4) What is difference between isolation and  quarantine?");
            tv5.setText("5) What is the duration of home quarantine?");
            tv6.setText("6) I am on home quarantine and i notice symptom appearing, what should I do?");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);

            l1.setTag("41");
            l2.setTag("42");
            l3.setTag("43");
            l4.setTag("44");
            l5.setTag("45");
            l6.setTag("46");

        } else if (val.equals("Treatment")) {

            tv1.setText("1) Is there a treatment for the COVID-19?");
            tv2.setText("2) Is there a vaccine available to prevent COVID-19?");
            tv3.setText("3) Am I protected against COVID-19 if I had the influenza vaccine this year?");
            tv4.setText("4) Will a pneumococcal vaccine help protect me against coronavirus?");
            tv5.setText("5) Are antibiotics affective in treating of preventing COVID-19?");
            tv6.setText("6) Can antivirals such as Oseltamavir or other antivirals help treat COVID-19?");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);

            l1.setTag("51");
            l2.setTag("52");
            l3.setTag("53");
            l4.setTag("54");
            l5.setTag("55");
            l6.setTag("56");

        } else if (val.equals("Relapse")) {

            tv1.setText("1) Can a person who has had coronavirus get infected again?");

            l1.setVisibility(View.VISIBLE);

            l1.setTag("61");

        } else if (val.equals("Animals Related")) {

            tv1.setText("1) Can humans become infected with the COVID-19 from an animal source?");
            tv2.setText("2) Should I avoid contact with pet or other animal if I am sick with COVID-19?");
            tv3.setText("3) Can eating chicken or eggs cause COVID-19?");
            tv4.setText("4) Should non vegetarian food be avoided?");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);

            l1.setTag("71");
            l2.setTag("72");
            l3.setTag("73");
            l4.setTag("74");

        } else if (val.equals("Myths")) {

            tv1.setText("1) What is the Mortality rate for Corona virus?");
            tv2.setText("2) Can disinfectant sprays or wipes be used on my skin to prevent of COVID-19?");
            tv3.setText("3) Will warm weather stop the outbreak of COVID-19?");
            tv4.setText("4) How effective are thermal scanners in detecting people infected with the new coronavirus?");
            tv5.setText("5) Will I die if I get COVID-19?");
            tv6.setText("6) How can I clean or disinfect my phone to protect myself from new corona virus?");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);

            l1.setTag("81");
            l2.setTag("82");
            l3.setTag("83");
            l4.setTag("84");
            l5.setTag("85");
            l6.setTag("86");

        } else {
        }

    }

    public void faqAnswer(View view) {

        tag = (LinearLayout) view;
        Intent intent = new Intent(FAQList.this, FAQAnswer.class);
        intent.putExtra("num", tag.getTag().toString());
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    @Override
    public void finish() {

        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
