package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import edu.dtcc.cis282student.recipegenerator.R;

/**
 * Created by Big Osiris on 4/24/2017.
 */

public class test extends AppCompatActivity implements View.OnClickListener{
    RecipeListObjects recipeListObjects=new RecipeListObjects();
    CategoryListActivity categoryListActivity=new CategoryListActivity();
    String count,surname,age,username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        String match=recipeListObjects.compareList(categoryListActivity.ingredientsList);
        String[] matchList=match.split("\t");

        for (int i=0;i<matchList.length;i++){
            if (matchList[i].equals("Chili"))
                count=matchList[i];
            else if (matchList[i].equals("Baked salmon"))
                surname=matchList[i];
            else if (matchList[i].equals("Spaghetti sauce with ground beef"))
                age=matchList[i];
            else if (matchList[i].equals("Lemon pepper chicken"))
                username=matchList[i];
            else if (matchList[i].equals("Kofta"))
                password=matchList[i];
            TextView textbox=(TextView) findViewById(R.id.textView);
            textbox.setText(count+"\t"+surname+"\t"+age+"\t"+username+"\t"+password);
        }
    }

    public void onStart(){
        super.onStart();
        //TextView textbox=(TextView) findViewById(R.id.textView);
        //textbox.setText(count+"\t"+surname+"\t"+age+"\t"+username+"\t"+password);

    }

    @Override
    public void onClick(View view) {
        String type="testing";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,count,surname,age,username,password);
    }
}
