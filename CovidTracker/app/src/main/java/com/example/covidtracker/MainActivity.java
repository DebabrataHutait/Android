package com.example.covidtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar, tool;
    AppBarLayout appBarLayout;
    Intent intent;
    private long backPressTime;
    private Toast toast;
    Button button;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----Collapsing Toolbar----//

        toolbar = findViewById(R.id.toolBar);
        collapsingToolbarLayout = findViewById(R.id.collToolbar);
        appBarLayout = findViewById(R.id.appBar);
        relativeLayout=findViewById(R.id.rltool);

        collapsingToolbar();

    }

    public void popUp(View view){

        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.item_menu);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()){

            case R.id.share:
                share();
                return true;
            case R.id.about:
                openDialog();
                return true;
            default:
                return  false;
        }

    }

    public void openDialog() {

        final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        View mview=getLayoutInflater().inflate(R.layout.activity_dialog,null);

        TextView cancel=mview.findViewById(R.id.btn);
        builder.setView(mview);

        final AlertDialog alertDialog=builder.create();
        alertDialog.setCanceledOnTouchOutside(false);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }

    public void share(){

        intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/Plain");
        String shareBody="Install :https://drive.google.com/drive/folders/1TVrz91L4SoWcL3kOVUM747jqlZ2k0zos?usp=sharing";
        String shareSub="Video";
        intent.putExtra(Intent.EXTRA_TEXT,shareBody);
        intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);

        startActivity(Intent.createChooser(intent,"share using "));
    }

    public void collapsingToolbar() {

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;


            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {

                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + i == 0) {
                    relativeLayout.setVisibility(View.GONE);
                    collapsingToolbarLayout.setTitle("CovidTracker");
                    isShow = false;
                } else {
                    relativeLayout.setVisibility(View.VISIBLE);
                    collapsingToolbarLayout.setTitle("");
                    isShow=true;
                }
            }
        });

    }

    public void callLayout(View view) {

        intent = new Intent(MainActivity.this, CallActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void messageLayout(View view) {

        intent = new Intent(MainActivity.this, MessageActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void statsLayout(View view) {

        intent = new Intent(MainActivity.this, StatisticsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void testCentersLayout(View view) {

        intent = new Intent(MainActivity.this, HospitalsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void symptomsChecker(View view) {

        intent = new Intent(MainActivity.this, SymptomsChecker.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void faqLayout(View view) {

        intent = new Intent(MainActivity.this, FAQActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void newsFeed(View view){

        intent=new Intent(MainActivity.this,NewsFeed.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onBackPressed() {

        if (backPressTime + 1500 > System.currentTimeMillis()) {

            toast.cancel();
            super.onBackPressed();
            return;
        } else {

            toast = Toast.makeText(getBaseContext(), "press again to exit", Toast.LENGTH_SHORT);
            toast.show();
        }

        backPressTime = System.currentTimeMillis();
    }
}
