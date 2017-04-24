package edu.dtcc.cis282student.recipegenerator.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class FruitList extends AppCompatActivity implements View.OnClickListener {
    CategoryListActivity categoryListActivity=new CategoryListActivity();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        Button btnCherry=(Button) findViewById(R.id.btn_fruit_Cherry);
        Button btnWatermelon=(Button) findViewById(R.id.btn_fruit_Watermelon);
        Button btnCantaloupe=(Button) findViewById(R.id.btn_fruit_Cantaloupe);
        Button btnGrape=(Button) findViewById(R.id.btn_fruit_Grape);
        Button btnOrange=(Button) findViewById(R.id.btn_fruit_Orange);
        Button btnLemon=(Button) findViewById(R.id.btn_fruit_Lemon);
        Button btnStrawberry=(Button) findViewById(R.id.btn_fruit_Strawberry);
        Button btnBanana=(Button) findViewById(R.id.btn_fruit_Banana);
        Button btnApple=(Button) findViewById(R.id.btn_fruit_Apple);



        btnCherry.setOnClickListener(this);
        btnWatermelon.setOnClickListener(this);
        btnCantaloupe.setOnClickListener(this);
        btnGrape.setOnClickListener(this);
        btnOrange.setOnClickListener(this);
        btnLemon.setOnClickListener(this);
        btnStrawberry.setOnClickListener(this);
        btnBanana.setOnClickListener(this);
        btnApple.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_fruit_Cherry:
                if (categoryListActivity.ingredientsList[18]==null)
                    categoryListActivity.ingredientsList[18]="cherry";
                else
                    categoryListActivity.ingredientsList[18]=null;
                break;

            case R.id.btn_fruit_Watermelon:
                if (categoryListActivity.ingredientsList[19]==null)
                    categoryListActivity.ingredientsList[19]="watermelon";
                else
                    categoryListActivity.ingredientsList[19]=null;
                break;

            case R.id.btn_fruit_Cantaloupe:
                if (categoryListActivity.ingredientsList[20]==null)
                    categoryListActivity.ingredientsList[20]="cantaloupe";
                else
                    categoryListActivity.ingredientsList[20]=null;
                break;

            case R.id.btn_fruit_Grape:
                if (categoryListActivity.ingredientsList[21]==null)
                    categoryListActivity.ingredientsList[21]="grape";
                else
                    categoryListActivity.ingredientsList[21]=null;
                break;

            case R.id.btn_fruit_Orange:
                if (categoryListActivity.ingredientsList[22]==null)
                    categoryListActivity.ingredientsList[22]="orange";
                else
                    categoryListActivity.ingredientsList[22]=null;
                break;

            case R.id.btn_fruit_Lemon:
                if (categoryListActivity.ingredientsList[23]==null)
                    categoryListActivity.ingredientsList[23]="lemon";
                else
                    categoryListActivity.ingredientsList[23]=null;
                break;

            case R.id.btn_fruit_Strawberry:
                if (categoryListActivity.ingredientsList[24]==null)
                    categoryListActivity.ingredientsList[24]="strawberry";
                else
                    categoryListActivity.ingredientsList[24]=null;
                break;

            case R.id.btn_fruit_Banana:
                if (categoryListActivity.ingredientsList[25]==null)
                    categoryListActivity.ingredientsList[25]="banana";
                else
                    categoryListActivity.ingredientsList[25]=null;
                break;

            case R.id.btn_fruit_Apple:
                if (categoryListActivity.ingredientsList[26]==null)
                    categoryListActivity.ingredientsList[26]="apple";
                else
                    categoryListActivity.ingredientsList[26]=null;
                break;
        }
    }
}
