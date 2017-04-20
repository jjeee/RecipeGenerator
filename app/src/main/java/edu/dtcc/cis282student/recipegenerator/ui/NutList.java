package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class NutList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut);

        Button btnPeanut=(Button) findViewById(R.id.btn_nut_Peanut);
        Button btnCashew=(Button) findViewById(R.id.btn_nut_Cashew);
        Button btnWalnut=(Button) findViewById(R.id.btn_nut_Walnut);
        Button btnPistachio=(Button) findViewById(R.id.btn_nut_Pistachio);
        Button btnAlmond=(Button) findViewById(R.id.btn_nut_Almond);
        Button btnPeanutButter=(Button) findViewById(R.id.btn_nut_PeanutButter);
        Button btnHazelnut=(Button) findViewById(R.id.btn_nut_Hazelnut);
        Button btnMacadamia=(Button) findViewById(R.id.btn_nut_Macadamia);
        Button btnPecan=(Button) findViewById(R.id.btn_nut_Pecan);



        btnPeanut.setOnClickListener(this);
        btnCashew.setOnClickListener(this);
        btnWalnut.setOnClickListener(this);
        btnPistachio.setOnClickListener(this);
        btnAlmond.setOnClickListener(this);
        btnPeanutButter.setOnClickListener(this);
        btnHazelnut.setOnClickListener(this);
        btnMacadamia.setOnClickListener(this);
        btnPecan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_nut_Peanut:
                if (categoryListActivity.ingredientsList[36]==null)
                    categoryListActivity.ingredientsList[36]="peanut";
                else
                    categoryListActivity.ingredientsList[36]=null;
                break;

            case R.id.btn_nut_Cashew:
                if (categoryListActivity.ingredientsList[37]==null)
                    categoryListActivity.ingredientsList[37]="cashew";
                else
                    categoryListActivity.ingredientsList[37]=null;
                break;

            case R.id.btn_nut_Walnut:
                if (categoryListActivity.ingredientsList[38]==null)
                    categoryListActivity.ingredientsList[38]="walnut";
                else
                    categoryListActivity.ingredientsList[38]=null;
                break;

            case R.id.btn_nut_Pistachio:
                if (categoryListActivity.ingredientsList[39]==null)
                    categoryListActivity.ingredientsList[39]="pistachio";
                else
                    categoryListActivity.ingredientsList[39]=null;
                break;

            case R.id.btn_nut_Almond:
                if (categoryListActivity.ingredientsList[40]==null)
                    categoryListActivity.ingredientsList[40]="almond";
                else
                    categoryListActivity.ingredientsList[40]=null;
                break;

            case R.id.btn_nut_PeanutButter:
                if (categoryListActivity.ingredientsList[41]==null)
                    categoryListActivity.ingredientsList[41]="peanut butter";
                else
                    categoryListActivity.ingredientsList[41]=null;
                break;

            case R.id.btn_nut_Hazelnut:
                if (categoryListActivity.ingredientsList[42]==null)
                    categoryListActivity.ingredientsList[42]="hazelnut";
                else
                    categoryListActivity.ingredientsList[42]=null;
                break;

            case R.id.btn_nut_Macadamia:
                if (categoryListActivity.ingredientsList[43]==null)
                    categoryListActivity.ingredientsList[43]="macadamia";
                else
                    categoryListActivity.ingredientsList[43]=null;
                break;

            case R.id.btn_nut_Pecan:
                if (categoryListActivity.ingredientsList[44]==null)
                    categoryListActivity.ingredientsList[44]="pecan";
                else
                    categoryListActivity.ingredientsList[44]=null;
                break;
        }
    }
}
