package edu.dtcc.cis282student.recipegenerator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import edu.dtcc.cis282student.recipegenerator.R;

public class CategoryListActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "CategoryListActivity";
    static String[] ingredientsList=new String[81];
    static int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Log.d(TAG, "====== onCreate() called ======");

        // Buttons
        Button btnMeat = (Button) findViewById(R.id.btn_categories_meat);
        Button btnVeg = (Button) findViewById(R.id.btn_categories_veg);
        Button btnFruit = (Button) findViewById(R.id.btn_categories_fruit);
        Button btnDairy = (Button) findViewById(R.id.btn_categories_dairy);
        Button btnNut = (Button) findViewById(R.id.btn_categories_nut);
        Button btnGrain = (Button) findViewById(R.id.btn_categories_grain);
        Button btnSea = (Button) findViewById(R.id.btn_categories_sea);
        Button btnSpice = (Button) findViewById(R.id.btn_categories_spice);
        Button btnOil = (Button) findViewById(R.id.btn_categories_oil);
        Button btnBack = (Button) findViewById(R.id.btn_all_back);
        Button btnFind = (Button) findViewById(R.id.btn_all_find);
        Button btnClear = (Button) findViewById(R.id.btn_all_clear);

        // Button listeners
        btnMeat.setOnClickListener(this);
        btnVeg.setOnClickListener(this);
        btnFruit.setOnClickListener(this);
        btnDairy.setOnClickListener(this);
        btnNut.setOnClickListener(this);
        btnGrain.setOnClickListener(this);
        btnSea.setOnClickListener(this);
        btnSpice.setOnClickListener(this);
        btnOil.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnFind.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "====== onStart() called ======");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "====== onResume() called ======");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "====== onPause() called ======");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "====== onStop() called ======");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "====== onDestroy() called ======");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_categories_meat:
                Intent meatIntent=new Intent(this,MeatList.class);
                startActivity(meatIntent);
                break;

            case R.id.btn_categories_veg:
                Intent vegIntent=new Intent(this,VegetableList.class);
                startActivity(vegIntent);
                break;

            case R.id.btn_categories_fruit:
                Intent fruitIntent=new Intent(this,FruitList.class);
                startActivity(fruitIntent);
                break;

            case R.id.btn_categories_dairy:
                Intent dairyIntent=new Intent(this,DairyList.class);
                startActivity(dairyIntent);
                break;

            case R.id.btn_categories_nut:
                Intent nutIntent=new Intent(this,NutList.class);
                startActivity(nutIntent);
                break;

            case R.id.btn_categories_grain:
                Intent grainIntent=new Intent(this,GrainList.class);
                startActivity(grainIntent);
                break;

            case R.id.btn_categories_sea:
                Intent seaIntent=new Intent(this,SeaList.class);
                startActivity(seaIntent);
                break;

            case R.id.btn_categories_spice:
                Intent spiceIntent=new Intent(this,SpiceList.class);
                startActivity(spiceIntent);
                break;

            case R.id.btn_categories_oil:
                Intent oilIntent=new Intent(this,OilList.class);
                startActivity(oilIntent);
                break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, MenuActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_find:
                break;

            case R.id.btn_all_clear:
                break;

            default:
                break;
        }
    }
}
