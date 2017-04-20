package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class SeaList extends AppCompatActivity implements View.OnClickListener {
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea);

        Button btnSalmon=(Button) findViewById(R.id.btn_sea_Salmon);
        Button btnTrout=(Button) findViewById(R.id.btn_sea_Trout);
        Button btnSeaBass=(Button) findViewById(R.id.btn_sea_SeaBass);
        Button btnShrimp=(Button) findViewById(R.id.btn_sea_Shrimp);
        Button btnTuna=(Button) findViewById(R.id.btn_sea_Tuna);
        Button btnTilapia=(Button) findViewById(R.id.btn_sea_Tilapia);
        Button btnHalibut=(Button) findViewById(R.id.btn_sea_Halibut);
        Button btnMackerel=(Button) findViewById(R.id.btn_sea_Mackerel);
        Button btnAnchovy=(Button) findViewById(R.id.btn_sea_Anchovy);



        btnSalmon.setOnClickListener(this);
        btnTrout.setOnClickListener(this);
        btnSeaBass.setOnClickListener(this);
        btnShrimp.setOnClickListener(this);
        btnTuna.setOnClickListener(this);
        btnTilapia.setOnClickListener(this);
        btnHalibut.setOnClickListener(this);
        btnMackerel.setOnClickListener(this);
        btnAnchovy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_sea_Salmon:
                if (categoryListActivity.ingredientsList[54]==null)
                    categoryListActivity.ingredientsList[54]="salmon";
                else
                    categoryListActivity.ingredientsList[54]=null;
                break;

            case R.id.btn_sea_Trout:
                if (categoryListActivity.ingredientsList[55]==null)
                    categoryListActivity.ingredientsList[55]="trout";
                else
                    categoryListActivity.ingredientsList[55]=null;
                break;

            case R.id.btn_sea_SeaBass:
                if (categoryListActivity.ingredientsList[56]==null)
                    categoryListActivity.ingredientsList[56]="sea bass";
                else
                    categoryListActivity.ingredientsList[56]=null;
                break;

            case R.id.btn_sea_Shrimp:
                if (categoryListActivity.ingredientsList[57]==null)
                    categoryListActivity.ingredientsList[57]="shrimp";
                else
                    categoryListActivity.ingredientsList[57]=null;
                break;

            case R.id.btn_sea_Tuna:
                if (categoryListActivity.ingredientsList[58]==null)
                    categoryListActivity.ingredientsList[58]="tuna";
                else
                    categoryListActivity.ingredientsList[58]=null;
                break;

            case R.id.btn_sea_Tilapia:
                if (categoryListActivity.ingredientsList[59]==null)
                    categoryListActivity.ingredientsList[59]="tilapia";
                else
                    categoryListActivity.ingredientsList[59]=null;
                break;

            case R.id.btn_sea_Halibut:
                if (categoryListActivity.ingredientsList[60]==null)
                    categoryListActivity.ingredientsList[60]="halibut";
                else
                    categoryListActivity.ingredientsList[60]=null;
                break;

            case R.id.btn_sea_Mackerel:
                if (categoryListActivity.ingredientsList[61]==null)
                    categoryListActivity.ingredientsList[61]="mackerel";
                else
                    categoryListActivity.ingredientsList[61]=null;
                break;

            case R.id.btn_sea_Anchovy:
                if (categoryListActivity.ingredientsList[62]==null)
                    categoryListActivity.ingredientsList[62]="anchovy";
                else
                    categoryListActivity.ingredientsList[62]=null;
                break;
        }
    }
}
