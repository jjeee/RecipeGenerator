package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class OilList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil);

        Button btnOliveOil=(Button) findViewById(R.id.btn_oil_OliveOil);
        Button btnCanolaOil=(Button) findViewById(R.id.btn_oil_CanolaOil);
        Button btnVegetableOil=(Button) findViewById(R.id.btn_oil_VegetableOil);
        Button btnPeanutOil=(Button) findViewById(R.id.btn_oil_PeanutOil);
        Button btnCookingSpray=(Button) findViewById(R.id.btn_oil_CookingSpray);
        Button btnShortening=(Button) findViewById(R.id.btn_oil_Shortening);
        Button btnRedPepperSauce=(Button) findViewById(R.id.btn_oil_RedPepSauce);
        Button btnTomatoPaste=(Button) findViewById(R.id.btn_oil_TomatoPaste);
        Button btnTomatoSauce=(Button) findViewById(R.id.btn_oil_TomatoSauce);



        btnOliveOil.setOnClickListener(this);
        btnCanolaOil.setOnClickListener(this);
        btnVegetableOil.setOnClickListener(this);
        btnPeanutOil.setOnClickListener(this);
        btnCookingSpray.setOnClickListener(this);
        btnShortening.setOnClickListener(this);
        btnRedPepperSauce.setOnClickListener(this);
        btnTomatoPaste.setOnClickListener(this);
        btnTomatoSauce.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_oil_OliveOil:
                if (categoryListActivity.ingredientsList[72]==null)
                    categoryListActivity.ingredientsList[72]="olive oil";
                else
                    categoryListActivity.ingredientsList[72]=null;
                break;

            case R.id.btn_oil_CanolaOil:
                if (categoryListActivity.ingredientsList[73]==null)
                    categoryListActivity.ingredientsList[73]="canola oil";
                else
                    categoryListActivity.ingredientsList[73]=null;
                break;

            case R.id.btn_oil_VegetableOil:
                if (categoryListActivity.ingredientsList[74]==null)
                    categoryListActivity.ingredientsList[74]="vegetable oil";
                else
                    categoryListActivity.ingredientsList[74]=null;
                break;

            case R.id.btn_oil_PeanutOil:
                if (categoryListActivity.ingredientsList[75]==null)
                    categoryListActivity.ingredientsList[75]="peanut oil";
                else
                    categoryListActivity.ingredientsList[75]=null;
                break;

            case R.id.btn_oil_CookingSpray:
                if (categoryListActivity.ingredientsList[76]==null)
                    categoryListActivity.ingredientsList[76]="cooking spray";
                else
                    categoryListActivity.ingredientsList[76]=null;
                break;

            case R.id.btn_oil_Shortening:
                if (categoryListActivity.ingredientsList[77]==null)
                    categoryListActivity.ingredientsList[77]="shortening";
                else
                    categoryListActivity.ingredientsList[77]=null;
                break;

            case R.id.btn_oil_RedPepSauce:
                if (categoryListActivity.ingredientsList[78]==null)
                    categoryListActivity.ingredientsList[78]="red pepper sauce";
                else
                    categoryListActivity.ingredientsList[78]=null;
                break;

            case R.id.btn_oil_TomatoPaste:
                if (categoryListActivity.ingredientsList[79]==null)
                    categoryListActivity.ingredientsList[79]="tomato paste";
                else
                    categoryListActivity.ingredientsList[79]=null;
                break;

            case R.id.btn_oil_TomatoSauce:
                if (categoryListActivity.ingredientsList[80]==null)
                    categoryListActivity.ingredientsList[80]="tomato sauce";
                else
                    categoryListActivity.ingredientsList[80]=null;
                break;
        }
    }
}
