package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.dtcc.cis282student.recipegenerator.R;

public class SpiceList extends AppCompatActivity implements View.OnClickListener {
    CategoryListActivity categoryListActivity=new CategoryListActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spice);

        Button btnSalt=(Button) findViewById(R.id.btn_spice_Salt);
        Button btnBlackPepper=(Button) findViewById(R.id.btn_spice_BlackPep);
        Button btnBasil=(Button) findViewById(R.id.btn_spice_Basil);
        Button btnParsley=(Button) findViewById(R.id.btn_spice_Parsley);
        Button btnOregano=(Button) findViewById(R.id.btn_spice_Oregano);
        Button btnCumin=(Button) findViewById(R.id.btn_spice_Cumin);
        Button btnChiliPowder=(Button) findViewById(R.id.btn_spice_ChiliPowder);
        Button btnGarlicPowder=(Button) findViewById(R.id.btn_spice_GarlicPowder);
        Button btnOnionPowder=(Button) findViewById(R.id.btn_spice_OnionPowder);



        btnSalt.setOnClickListener(this);
        btnBlackPepper.setOnClickListener(this);
        btnBasil.setOnClickListener(this);
        btnParsley.setOnClickListener(this);
        btnOregano.setOnClickListener(this);
        btnCumin.setOnClickListener(this);
        btnChiliPowder.setOnClickListener(this);
        btnGarlicPowder.setOnClickListener(this);
        btnOnionPowder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_spice_Salt:
                if (categoryListActivity.ingredientsList[63]==null)
                    categoryListActivity.ingredientsList[63]="salt";
                else
                    categoryListActivity.ingredientsList[63]=null;
                break;

            case R.id.btn_spice_BlackPep:
                if (categoryListActivity.ingredientsList[64]==null)
                    categoryListActivity.ingredientsList[64]="black pepper";
                else
                    categoryListActivity.ingredientsList[64]=null;
                break;

            case R.id.btn_spice_Basil:
                if (categoryListActivity.ingredientsList[65]==null)
                    categoryListActivity.ingredientsList[65]="basil";
                else
                    categoryListActivity.ingredientsList[65]=null;
                break;

            case R.id.btn_spice_Parsley:
                if (categoryListActivity.ingredientsList[66]==null)
                    categoryListActivity.ingredientsList[66]="parsley";
                else
                    categoryListActivity.ingredientsList[66]=null;
                break;

            case R.id.btn_spice_Oregano:
                if (categoryListActivity.ingredientsList[67]==null)
                    categoryListActivity.ingredientsList[67]="oregano";
                else
                    categoryListActivity.ingredientsList[67]=null;
                break;

            case R.id.btn_spice_Cumin:
                if (categoryListActivity.ingredientsList[68]==null)
                    categoryListActivity.ingredientsList[68]="ground cumin";
                else
                    categoryListActivity.ingredientsList[68]=null;
                break;

            case R.id.btn_spice_ChiliPowder:
                if (categoryListActivity.ingredientsList[69]==null)
                    categoryListActivity.ingredientsList[69]="chili powder";
                else
                    categoryListActivity.ingredientsList[69]=null;
                break;

            case R.id.btn_spice_GarlicPowder:
                if (categoryListActivity.ingredientsList[70]==null)
                    categoryListActivity.ingredientsList[70]="garlic powder";
                else
                    categoryListActivity.ingredientsList[70]=null;
                break;

            case R.id.btn_spice_OnionPowder:
                if (categoryListActivity.ingredientsList[71]==null)
                    categoryListActivity.ingredientsList[71]="onion powder";
                else
                    categoryListActivity.ingredientsList[71]=null;
                break;
        }
    }
}
