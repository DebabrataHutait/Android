package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestCentersList extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14, tv15, tv16, head;
    LinearLayout l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    String tag;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_centers_list);

        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        l3 = (LinearLayout) findViewById(R.id.l3);
        l4 = (LinearLayout) findViewById(R.id.l4);
        l5 = (LinearLayout) findViewById(R.id.l5);
        l6 = (LinearLayout) findViewById(R.id.l6);
        l7 = (LinearLayout) findViewById(R.id.l7);
        l8 = (LinearLayout) findViewById(R.id.l8);
        l9 = (LinearLayout) findViewById(R.id.l9);
        l10 = (LinearLayout) findViewById(R.id.l10);
        l11 = (LinearLayout) findViewById(R.id.l11);
        l12 = (LinearLayout) findViewById(R.id.l2);
        l13 = (LinearLayout) findViewById(R.id.l3);
        l14 = (LinearLayout) findViewById(R.id.l4);
        l15 = (LinearLayout) findViewById(R.id.l5);
        l16 = (LinearLayout) findViewById(R.id.l6);

        head = (TextView) findViewById(R.id.head);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);
        tv10 = (TextView) findViewById(R.id.tv10);
        tv11 = (TextView) findViewById(R.id.tv11);
        tv12 = (TextView) findViewById(R.id.tv12);
        tv13 = (TextView) findViewById(R.id.tv13);
        tv14 = (TextView) findViewById(R.id.tv14);
        tv15 = (TextView) findViewById(R.id.tv15);
        tv16 = (TextView) findViewById(R.id.tv16);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        tag = getIntent().getStringExtra("num").toString();
        head.setText(tag + " : ");
        if (tag.equals("Andra Pradesh")) {

            tv1.setText("Govt. Medical College, Ananthpur");
            tv2.setText("Guntur Medical College, Guntur");
            tv3.setText("Rajiv Gandi Institute of Medical Sciences, Kadapa");
            tv4.setText("Rangaraya Medical College, Kakinada");
            tv5.setText("Sidhartha Medical College, Vijaywada");
            tv6.setText("Sri Venkateswara Institute of Medical Sciences, Triupati");
            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
        } else if (tag.equals("Bihar")) {

            tv1.setText("Darbhanga Medical College, Darbhanga");
            tv2.setText("Indira Gandhi Institute Medical Sciences, Patna");
            tv3.setText("Patna Medical College, Patna");
            tv4.setText("Rajendra Memorial Research Institute of Medical Sciences, Patna");
            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
        } else if (tag.equals("Chhattisgarh")) {
            tv1.setText("All India Institute of Medical Sciences, Raipur");
            tv2.setText("Late Baliram Kashyap M Govt. Medical College, Jagdalpur");
            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
        } else if (tag.equals("Gujrat")) {
            tv1.setText("BJ Medical College, Ahmedabad");
            tv2.setText("Govt. Medical College, Bhavangar");
            tv3.setText("Govt. Medical College, Rajkot");
            tv4.setText("Govt. Medical College, Surat");
            tv4.setText("Govt. Medical College, Vadodara");
            tv5.setText("MP Shah Govt Medical College, Jamnagar");
            tv6.setText("Pangenomics International Pvt Ltd, Ellis Bridge, Ahmedabad");
            tv7.setText("SN GeneLab Pvt Ltd, President Plaza-A, Near Mahavir Hospital, Nanpura,Surat");
            tv8.setText("Supratech Mocropath Laboratory & Research Institute Pvt Ltd, Kedar, Ahmedabad");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
            l8.setVisibility(View.VISIBLE);
        } else if (tag.equals("Haryana")) {
            tv1.setText("BPS GOvt. Medical College, Sonipat");
            tv2.setText("Core Diagostics PVt Ltd, Udyog Vihar Phase-3, Gurgaon");
            tv3.setText("MoiIQ Laboratory, Plot 28,29; Sector 18(p), Electronic city, Udyog Vihar,Phase IV, Gurgoan");
            tv4.setText("Pathkind Diagnostics Pvt Ltd, Plot 55-56, Phase 4, Udyog Vihar, Sec 18, Gurgaon");
            tv5.setText("Pt. B.D. Sharma Post Graduate Inst. Of Med. Sciences ,Rohtak, Haryana");
            tv6.setText("SRL Limited, GP26, SEctor 18, Gurgaon");
            tv7.setText("Strand Life Sciences,A-17,Sector 34, Gurgram");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
        } else if (tag.equals("Himachal Pradesh")) {

            tv1.setText("Dr. Rajendra Prasad Govt. Medical College, Tanda");
            tv2.setText("Indira Ghandi Medical College, Shimla");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
        } else if (tag.equals("Jharkhand")) {
            tv1.setText("MGM Medical College & Hospital, Jamshedpur");
            tv2.setText("Rajendra Institute of Medical Sciences, Ranchi");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
        } else if (tag.equals("Madhya Pradesh")) {
            tv1.setText("Gajra Raja Medical College, Gwalior");
            tv2.setText("All India Institute of Medical Sciences, Bhopal");
            tv3.setText("Gandhi Medical College, Bhopal");
            tv4.setText("Mahatma Gandhi Memorial Medical College, Indore");
            tv4.setText("National Institute for Research on Tribal Health, Jabalpur");

            l2.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
        } else if (tag.equals("Maharashtra")) {
            tv1.setText("A.G. Diagnostics Pvt Ltd, Nayantara Building, Pune");
            tv2.setText("All India India of Medical Sciences, Nagpur");
            tv3.setText("Armed Forces Medical College, Pune");
            tv4.setText("BJ Medical College, Pune");
            tv5.setText("Dr. Jariwala Lab & Diagnostics LLP, 1st Floor, Rasraj Heights, Rokadia Lane,Off MandPeshwar Road, Borivil(W), Mumbai");
            tv6.setText("Government Medical College, Miraj");
            tv7.setText("Govt Medical College, Aurangabad");
            tv8.setText("Grant Medical College & Sir JJ Hospital, Mumbai");
            tv9.setText("Indira Gandhi Govt. Medical College");
            tv10.setText("InfeXn Laboratories Pvt Ltd, A/31, Therelek Compound, Road No23, Wagle Industrial Estate, Thane(W)");
            tv11.setText("Kasturba Hospital for Infectious Disease, Mumbai");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
            l8.setVisibility(View.VISIBLE);
            l9.setVisibility(View.VISIBLE);
            l10.setVisibility(View.VISIBLE);
            l11.setVisibility(View.VISIBLE);

        } else if (tag.equals("Nagaland")) {
            tv1.setText("");
            l1.setVisibility(View.VISIBLE);
        } else if (tag.equals("Odisha")) {
            tv1.setText("All India Institute of Medical Sciences, Bhubaneshwar");
            tv2.setText("Dept of Lab Services, Apollo Hospitals,Bhubaneswar");
            tv3.setText("Regional Medical Research Center, Bhubaneswar");
            tv4.setText("SCB Medical College and Hospital, Cuttack");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);

        } else if (tag.equals("Punjab")) {
            tv1.setText("Govt. Medical College, Amritsar");
            tv2.setText("govt. Medical College, Patiala");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
        } else if (tag.equals("Rajasthan")) {
            tv1.setText("All India Institute of Medical College, Jodhpur");
            tv2.setText("Dr. Sampurnan and Medical College, Jodhpur");
            tv3.setText("Govt. Medical College, Kota");
            tv4.setText("Jhalawar Medical College, Jhalawar");
            tv5.setText("RNT Medical College, Udaipur");
            tv6.setText("SP Medical College, Bikaner");
            tv7.setText("Saiwai Man Singh Medical College, Jaipur");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
        } else if (tag.equals("Tamil Nadu")) {

            tv1.setText("Coimbatore Medical College, Coimbatore");
            tv2.setText("Dept. of Laboratory Services, Apollo Hospitals Enterprise Ltd, Chennai");
            tv3.setText("Dept. of Clinical Virology, CMC, Vellore");
            tv4.setText("Govt. Medical College, Thiruvarur");
            tv5.setText("Govt. Medical College, Theni");
            tv6.setText("Hitech Diagnostic center- A Unit of Dr. Ganessn's Hitech Diagnostic Center Pvt Ltd, Poonamallee High Road, Chennai");
            tv7.setText("King Institute of Preventive Medicine & Research, Chennai");
            tv8.setText("Kumar mangalam Govt. Medical College, Salem");
            tv9.setText("MIOT Hospitals- Dept of Lab Medicine, 4/112, Mount Poonamallee Road, manapakkam, Chennai");
            tv10.setText("Madras Medical College, Chennai");
            tv11.setText("Madras Medical Mission Clinical Lab Services, 4-A, Dr. J. Jayalalitha nagar, mogappair East, Chennai");
            tv12.setText("Madurai Medical College, madurai");
            tv13.setText("Microbiology Lab, Veerakeralam Road, Coimbatore");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
            l8.setVisibility(View.VISIBLE);
            l9.setVisibility(View.VISIBLE);
            l10.setVisibility(View.VISIBLE);
            l11.setVisibility(View.VISIBLE);
            l12.setVisibility(View.VISIBLE);
            l13.setVisibility(View.VISIBLE);

        } else if (tag.equals("Trupura")) {
            tv1.setText("Govt. Medical College, Agartala");

            l1.setVisibility(View.VISIBLE);

        } else if (tag.equals("Uttar Pradesh")) {
            tv1.setText("Dept of Lab Medicine, Jaypee Hospital, Sector 128, Nodia");
            tv2.setText("Institute of Medical Sciences, Banaras Hindu University, Varanasi");
            tv3.setText("Jawaharlal Nehru Medical College");
            tv4.setText("King George Medical University, Lucknow");
            tv5.setText("Lala Lajpat Rai Memorial Medical College, Meerut");
            tv6.setText("RML Mehrotra Pathology Pvt Ltd, Nirala Nagar, Lucknow");
            tv7.setText("Uttar Pradesh University of Medical Sciences, Saifai");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
        } else if (tag.equals("Uttarakhand")) {
            tv1.setText("All India Institute of Medical Sciences, Rishikesh");
            tv2.setText("Dr. Ahuja's Pathology and Imaging Centre, 7-B, Astley Hall, Deradun");
            tv3.setText("Govt. Medical College, Haldwani");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
        } else if (tag.equals("West Bengal")) {
            tv1.setText("AMRI Hospitals, Dept of Lab Medichine, JC 16-17, Sector III, Salt Lake City, Kolkata");
            tv2.setText("Apollo Gleneagles Hospitals ,58 Canal Circular Road, Kolkata");
            tv3.setText("Institute of Post Graduate Medical Education & Research, Kolkata");
            tv4.setText("Laboratory Services, Peerless Hospitalx Hospital & Research Center, 360,Panchasayar, Kolkata");
            tv5.setText("Midnapore Medical College, Midnapore");
            tv6.setText("National Institute of Cholera & Enteric Disease, Kolkata");
            tv7.setText("North Bengal Medical College, Darjeeling");
            tv8.setText("Tata Medical Center, Rajarhat, Kolkata");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
            l8.setVisibility(View.VISIBLE);
        } else if (tag.equals("Andaman and Nicobar Islands")) {

            tv1.setText("Regional Medical Research Center, Port Blair");

            l1.setVisibility(View.VISIBLE);
        } else if (tag.equals("Chandigarh")) {

            tv1.setText("Govt. Medical College, Chandigarh");
            tv2.setText("Post Graduate Institute of Medical Education & Research, Chandigarh");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
        } else if (tag.equals("Karnataka")) {
            tv1.setText("Bangalore Medical College & Research Institute, Bengaluru");
            tv2.setText("Cancyte Technologies Pvt Ltd, Sri Shakara Research Center, Bengaluru");
            tv3.setText("Central Diagnostic Lab, Vydehi Institute of Medical Sciences and Research Center, #82, E.P.I.P Area,Whitefield, Bengaluru");
            tv4.setText("Gulbarga Institute of Medical Sciences, Gulbarga");
            tv5.setText("hassan Inst. Of Med. Sciences, Hassan");
            tv6.setText("Karnataka Institute of Medical Sciences, Hubli");
            tv7.setText("Mysore Medical College & Research Institute, Mysore");
            tv8.setText("National Institute of Virology, Bangalore Field Unit, Bengaluru");
            tv9.setText("Sakra World Hospital Lab services, Devarabeesanahalli VArthur Hobli, Bengaluru");
            tv10.setText("Shivamogga Institute of Medical Sciences, Shivamogga");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
            l8.setVisibility(View.VISIBLE);
            l9.setVisibility(View.VISIBLE);
            l10.setVisibility(View.VISIBLE);

        } else if (tag.equals("Kerala")) {
            tv1.setText("DDRC SRL Diagnostics Pvt Ltd, Panampilly Nagar, Ernakulam");
            tv2.setText("Govt. Medical College, Kozhikode");
            tv3.setText("Govt. Medical College, Thiruvanathapuram");
            tv4.setText("Govt. Medical College, Thrissur");
            tv5.setText("MIMS Lab Services, Gocindapuram, Kozhikode");
            tv6.setText("National Institute of Virology, Field Unit, Allapuzzha");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
        } else if (tag.equals("Sikkim")) {

            tv1.setText("Sir Thutob Namgyal Memorial, Gangtok");

            l1.setVisibility(View.VISIBLE);
        } else if (tag.equals("Meghalaya")) {

            tv1.setText("North Eastern Indira Ghandi Regional Institute of Health & Medical Sciences, Shillong, Meghalaya");

            l1.setVisibility(View.VISIBLE);
        } else if (tag.equals("Manipur")) {

            tv1.setText("Jawaharlal Nehru Institute of Med. Sciences, ImphalEast, Manipur");
            tv2.setText("Regional Institute of Medical Sciences, Imphal");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
        } else if (tag.equals("Assam")) {

            tv1.setText("Fakkhruddin Ali Ahmed Medical College, Barpeta");
            tv2.setText("Gauhati Medical College, Guwahati");
            tv3.setText("Jorhat Medical College, Jorhat");
            tv4.setText("Regional Medical Research Center, Dibrugarh");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
        } else if (tag.equals("Arunachal Pradesh")) {
            tv1.setText("Tomo Riba Institute of Health & Medical Sciences, Naharlagun");

            l1.setVisibility(View.VISIBLE);
        } else if (tag.equals("Puducherry")) {

            tv1.setText("Jawarlal Institute of Postgraduate Medical Education & Research, Puducherry");

            l1.setVisibility(View.VISIBLE);
        } else if (tag.equals("Delhi")) {
            tv1.setText("All India Institute Medical Sciences");
            tv2.setText("City X-Ray & Scan Clinic Pvt Ltd, $B/18, Tilak Nagar, New Delhi");
            tv3.setText("Dr Dangs Lab, C-2/1, Safadarjung Development area, New Delhi");
            tv4.setText("Laboratory Services, Indraprastha Apollo Hospitals, Sarita vihar, New Delhi");
            tv5.setText("Lady Hardinga Medical College");
            tv6.setText("Lal Path Labs, Block -E, Sector 18, Rohini, Delhi");
            tv7.setText("Max Lab, Max Super Speciality Hospital, Saket, New-Delhi");
            tv8.setText("Oncquest Labs Ltd, #-Factory Road, New Delhi");
            tv9.setText("Prognosis Laboratories, 515-16, Sector 19, Dwarka");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);
            l5.setVisibility(View.VISIBLE);
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.VISIBLE);
            l8.setVisibility(View.VISIBLE);
            l9.setVisibility(View.VISIBLE);
        } else if (tag.equals("Jammu and Kashmir")) {

            tv1.setText("Command Hospital, Udhampur");
            tv2.setText("Govt Medical College, Jammu");
            tv3.setText("Govt Medical College, Srinagar");
            tv4.setText("Sher-i-Kashmir Institute of Medical Sciences, Srinagar");

            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            l3.setVisibility(View.VISIBLE);
            l4.setVisibility(View.VISIBLE);

        } else {

            tv1.setText("");

            l1.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void finish() {

        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
