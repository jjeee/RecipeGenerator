package edu.dtcc.cis282student.recipegenerator.ui;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class DairyList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        Button btnEgg=(Button) findViewById(R.id.btn_dairy_Egg);
        Button btnMilk=(Button) findViewById(R.id.btn_dairy_Milk);
        Button btnHeavyCream=(Button) findViewById(R.id.btn_dairy_HeavyCream);
        Button btnButter=(Button) findViewById(R.id.btn_dairy_Butter);
        Button btnSourCream=(Button) findViewById(R.id.btn_dairy_SourCream);
        Button btnCheddar=(Button) findViewById(R.id.btn_dairy_Cheddar);
        Button btnCreamCheese=(Button) findViewById(R.id.btn_dairy_CreamCheese);
        Button btnYogurt=(Button) findViewById(R.id.btn_dairy_Yogurt);
        Button btnCream=(Button) findViewById(R.id.btn_dairy_Cream);



        btnEgg.setOnClickListener(this);
        btnMilk.setOnClickListener(this);
        btnHeavyCream.setOnClickListener(this);
        btnButter.setOnClickListener(this);
        btnSourCream.setOnClickListener(this);
        btnCheddar.setOnClickListener(this);
        btnCreamCheese.setOnClickListener(this);
        btnYogurt.setOnClickListener(this);
        btnCream.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_dairy_Egg:
                if (categoryListActivity.ingredientsList[27]==null)
                    categoryListActivity.ingredientsList[27]="egg";
                else
                    categoryListActivity.ingredientsList[27]=null;
                break;

            case R.id.btn_dairy_Milk:
                if (categoryListActivity.ingredientsList[28]==null)
                    categoryListActivity.ingredientsList[28]="milk";
                else
                    categoryListActivity.ingredientsList[28]=null;
                break;

            case R.id.btn_dairy_HeavyCream:
                if (categoryListActivity.ingredientsList[29]==null)
                    categoryListActivity.ingredientsList[29]="heavy cream";
                else
                    categoryListActivity.ingredientsList[29]=null;
                break;

            case R.id.btn_dairy_Butter:
                if (categoryListActivity.ingredientsList[30]==null)
                    categoryListActivity.ingredientsList[30]="butter";
                else
                    categoryListActivity.ingredientsList[30]=null;
                break;

            case R.id.btn_dairy_SourCream:
                if (categoryListActivity.ingredientsList[31]==null)
                    categoryListActivity.ingredientsList[31]="sour cream";
                else
                    categoryListActivity.ingredientsList[31]=null;
                break;

            case R.id.btn_dairy_Cheddar:
                if (categoryListActivity.ingredientsList[32]==null)
                    categoryListActivity.ingredientsList[32]="cheddar";
                else
                    categoryListActivity.ingredientsList[32]=null;
                break;

            case R.id.btn_dairy_CreamCheese:
                if (categoryListActivity.ingredientsList[33]==null)
                    categoryListActivity.ingredientsList[33]="cream cheese";
                else
                    categoryListActivity.ingredientsList[33]=null;
                break;

            case R.id.btn_dairy_Yogurt:
                if (categoryListActivity.ingredientsList[34]==null)
                    categoryListActivity.ingredientsList[34]="yogurt";
                else
                    categoryListActivity.ingredientsList[34]=null;
                break;

            case R.id.btn_dairy_Cream:
                if (categoryListActivity.ingredientsList[35]==null)
                    categoryListActivity.ingredientsList[35]="cream";
                else
                    categoryListActivity.ingredientsList[35]=null;
                break;
        }
    }
}
