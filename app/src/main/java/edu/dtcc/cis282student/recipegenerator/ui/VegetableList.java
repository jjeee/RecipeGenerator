package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class VegetableList extends AppCompatActivity implements View.OnClickListener{
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        Button btnGarlic=(Button) findViewById(R.id.btn_vegetable_Garlic);
        Button btnLettuce=(Button) findViewById(R.id.btn_vegetable_Lettuce);
        Button btnCarrot=(Button) findViewById(R.id.btn_vegetable_Carrot);
        Button btnTomato=(Button) findViewById(R.id.btn_vegetable_Tomato);
        Button btnBellPepper=(Button) findViewById(R.id.btn_vegetable_BellPep);
        Button btnCorn=(Button) findViewById(R.id.btn_vegetable_Corn);
        Button btnPotato=(Button) findViewById(R.id.btn_vegetable_Potato);
        Button btnOnion=(Button) findViewById(R.id.btn_vegetable_Onion);
        Button btnKidneyBean=(Button) findViewById(R.id.btn_vegetable_KidneyBeans);



        btnGarlic.setOnClickListener(this);
        btnLettuce.setOnClickListener(this);
        btnCarrot.setOnClickListener(this);
        btnTomato.setOnClickListener(this);
        btnBellPepper.setOnClickListener(this);
        btnCorn.setOnClickListener(this);
        btnPotato.setOnClickListener(this);
        btnOnion.setOnClickListener(this);
        btnKidneyBean.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_vegetable_Garlic:
                if (categoryListActivity.ingredientsList[9]==null)
                    categoryListActivity.ingredientsList[9]="garlic";
                else
                    categoryListActivity.ingredientsList[9]=null;
                break;

            case R.id.btn_vegetable_Lettuce:
                if (categoryListActivity.ingredientsList[10]==null)
                    categoryListActivity.ingredientsList[10]="lettuce";
                else
                    categoryListActivity.ingredientsList[10]=null;
                break;

            case R.id.btn_vegetable_Carrot:
                if (categoryListActivity.ingredientsList[11]==null)
                    categoryListActivity.ingredientsList[11]="carrot";
                else
                    categoryListActivity.ingredientsList[11]=null;
                break;

            case R.id.btn_vegetable_Tomato:
                if (categoryListActivity.ingredientsList[12]==null)
                    categoryListActivity.ingredientsList[12]="tomato";
                else
                    categoryListActivity.ingredientsList[12]=null;
                break;

            case R.id.btn_vegetable_BellPep:
                if (categoryListActivity.ingredientsList[13]==null)
                    categoryListActivity.ingredientsList[13]="bell pepper";
                else
                    categoryListActivity.ingredientsList[13]=null;
                break;

            case R.id.btn_vegetable_Corn:
                if (categoryListActivity.ingredientsList[14]==null)
                    categoryListActivity.ingredientsList[14]="corn";
                else
                    categoryListActivity.ingredientsList[14]=null;
                break;

            case R.id.btn_vegetable_Potato:
                if (categoryListActivity.ingredientsList[15]==null)
                    categoryListActivity.ingredientsList[15]="potato";
                else
                    categoryListActivity.ingredientsList[15]=null;
                break;

            case R.id.btn_vegetable_Onion:
                if (categoryListActivity.ingredientsList[16]==null)
                    categoryListActivity.ingredientsList[16]="onion";
                else
                    categoryListActivity.ingredientsList[16]=null;
                break;

            case R.id.btn_vegetable_KidneyBeans:
                if (categoryListActivity.ingredientsList[17]==null)
                    categoryListActivity.ingredientsList[17]="kidney beans";
                else
                    categoryListActivity.ingredientsList[17]=null;
                break;
        }
    }
}
