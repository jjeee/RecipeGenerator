package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class GrainList extends AppCompatActivity implements View.OnClickListener {
    public CategoryListActivity categoryListActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grain);

        categoryListActivity=new CategoryListActivity();
        Button btnFlour=(Button) findViewById(R.id.btn_grain_Flour);
        Button btnRice=(Button) findViewById(R.id.btn_grain_Rice);
        Button btnCornTortilla=(Button) findViewById(R.id.btn_grain_CornTortilla);
        Button btnBread=(Button) findViewById(R.id.btn_grain_Bread);
        Button btnPasta=(Button) findViewById(R.id.btn_grain_Pasta);
        Button btnSemolina=(Button) findViewById(R.id.btn_grain_Semolina);
        Button btnCereal=(Button) findViewById(R.id.btn_grain_Cereal);
        Button btnBagel=(Button) findViewById(R.id.btn_grain_Bagel);
        Button btnPita=(Button) findViewById(R.id.btn_grain_Pita);



        btnFlour.setOnClickListener(this);
        btnRice.setOnClickListener(this);
        btnCornTortilla.setOnClickListener(this);
        btnBread.setOnClickListener(this);
        btnPasta.setOnClickListener(this);
        btnSemolina.setOnClickListener(this);
        btnCereal.setOnClickListener(this);
        btnBagel.setOnClickListener(this);
        btnPita.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_grain_Flour:
                if (categoryListActivity.ingredientsList[45]==null)
                    categoryListActivity.ingredientsList[45]="flour";
                else
                    categoryListActivity.ingredientsList[45]=null;
                break;

            case R.id.btn_grain_Rice:
                if (categoryListActivity.ingredientsList[46]==null)
                    categoryListActivity.ingredientsList[46]="rice";
                else
                    categoryListActivity.ingredientsList[46]=null;
                break;

            case R.id.btn_grain_CornTortilla:
                if (categoryListActivity.ingredientsList[47]==null)
                    categoryListActivity.ingredientsList[47]="corn tortilla";
                else
                    categoryListActivity.ingredientsList[47]=null;
                break;

            case R.id.btn_grain_Bread:
                if (categoryListActivity.ingredientsList[48]==null)
                    categoryListActivity.ingredientsList[48]="bread";
                else
                    categoryListActivity.ingredientsList[48]=null;
                break;

            case R.id.btn_grain_Pasta:
                if (categoryListActivity.ingredientsList[49]==null)
                    categoryListActivity.ingredientsList[49]="pasta";
                else
                    categoryListActivity.ingredientsList[49]=null;
                break;

            case R.id.btn_grain_Semolina:
                if (categoryListActivity.ingredientsList[50]==null)
                    categoryListActivity.ingredientsList[50]="semolina";
                else
                    categoryListActivity.ingredientsList[50]=null;
                break;

            case R.id.btn_grain_Cereal:
                if (categoryListActivity.ingredientsList[51]==null)
                    categoryListActivity.ingredientsList[51]="cereal";
                else
                    categoryListActivity.ingredientsList[51]=null;
                break;

            case R.id.btn_grain_Bagel:
                if (categoryListActivity.ingredientsList[52]==null)
                    categoryListActivity.ingredientsList[52]="bagel";
                else
                    categoryListActivity.ingredientsList[52]=null;
                break;

            case R.id.btn_grain_Pita:
                if (categoryListActivity.ingredientsList[53]==null)
                    categoryListActivity.ingredientsList[53]="pita";
                else
                    categoryListActivity.ingredientsList[53]=null;
                break;
        }
    }
}
