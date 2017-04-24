package edu.dtcc.cis282student.recipegenerator.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class MeatList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);

        Button btnChicken=(Button) findViewById(R.id.btn_meat_ChickenBreast);
        Button btnGrndBeef=(Button) findViewById(R.id.btn_meat_GrndBeef);
        Button btnPorkchop=(Button) findViewById(R.id.btn_meat_Porkchop);
        Button btnLamb=(Button) findViewById(R.id.btn_meat_Lamb);
        Button btnTurkey=(Button) findViewById(R.id.btn_meat_Turkey);
        Button btnBeefSteak=(Button) findViewById(R.id.btn_meat_beefSteak);
        Button btnSausage=(Button) findViewById(R.id.btn_meat_Sausage);
        Button btnBacon=(Button) findViewById(R.id.btn_meat_Bacon);
        Button btnVeal=(Button) findViewById(R.id.btn_meat_Veal);

        btnChicken.setOnClickListener(this);
        btnGrndBeef.setOnClickListener(this);
        btnPorkchop.setOnClickListener(this);
        btnLamb.setOnClickListener(this);
        btnTurkey.setOnClickListener(this);
        btnBeefSteak.setOnClickListener(this);
        btnSausage.setOnClickListener(this);
        btnBacon.setOnClickListener(this);
        btnVeal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_meat_ChickenBreast:
                if (categoryListActivity.ingredientsList[0]==null)
                    categoryListActivity.ingredientsList[0]="chicken breast";
                else
                    categoryListActivity.ingredientsList[0]=null;
                break;

            case R.id.btn_meat_GrndBeef:
                if (categoryListActivity.ingredientsList[1]==null)
                    categoryListActivity.ingredientsList[1]="ground beef";
                else
                    categoryListActivity.ingredientsList[1]=null;
                break;

            case R.id.btn_meat_Porkchop:
                if (categoryListActivity.ingredientsList[2]==null)
                    categoryListActivity.ingredientsList[2]="pork chop";
                else
                    categoryListActivity.ingredientsList[2]=null;
                break;

            case R.id.btn_meat_Lamb:
                if (categoryListActivity.ingredientsList[3]==null)
                    categoryListActivity.ingredientsList[3]="lamb";
                else
                    categoryListActivity.ingredientsList[3]=null;
                break;

            case R.id.btn_meat_Turkey:
                if (categoryListActivity.ingredientsList[4]==null)
                    categoryListActivity.ingredientsList[4]="turkey";
                else
                    categoryListActivity.ingredientsList[4]=null;
                break;

            case R.id.btn_meat_beefSteak:
                if (categoryListActivity.ingredientsList[5]==null)
                    categoryListActivity.ingredientsList[5]="beef steak";
                else
                    categoryListActivity.ingredientsList[5]=null;
                break;

            case R.id.btn_meat_Sausage:
                if (categoryListActivity.ingredientsList[6]==null)
                    categoryListActivity.ingredientsList[6]="sausage";
                else
                    categoryListActivity.ingredientsList[6]=null;
                break;

            case R.id.btn_meat_Bacon:
                if (categoryListActivity.ingredientsList[7]==null)
                    categoryListActivity.ingredientsList[7]="bacon";
                else
                    categoryListActivity.ingredientsList[7]=null;
                break;

            case R.id.btn_meat_Veal:
                if (categoryListActivity.ingredientsList[8]==null)
                    categoryListActivity.ingredientsList[8]="veal";
                else
                    categoryListActivity.ingredientsList[8]=null;
                break;
        }
    }
}
