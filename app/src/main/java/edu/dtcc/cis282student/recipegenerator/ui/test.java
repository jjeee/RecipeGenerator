package edu.dtcc.cis282student.recipegenerator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

import edu.dtcc.cis282student.recipegenerator.R;

/**
 * Created by Big Osiris on 4/24/2017.
 */

public class test extends AppCompatActivity{
    RecipeListObjects recipeListObjects=new RecipeListObjects();
    CategoryListActivity categoryListActivity=new CategoryListActivity();
    String count,surname,age,username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
    }

    @Override
    public void onStart(){
        super.onStart();

        String match=recipeListObjects.compareList(categoryListActivity.ingredientsList);
        String[] matchList=match.split("\t");

        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        String type="testing";

        if (matchList.length==1)
            count=matchList[0];
        else if (matchList.length==2){
            count=matchList[0];
            surname=matchList[1];
        }
        else if (matchList[2]!=null){
            count=matchList[0];
            surname=matchList[1];
            age=matchList[2];
        }
        else if (matchList[3]!=null) {
            count = matchList[0];
            surname = matchList[1];
            age = matchList[2];
            username = matchList[3];
        }
        else if (matchList[4]!=null) {
            count=matchList[0];
            surname=matchList[1];
            age=matchList[2];
            username = matchList[3];
            password=matchList[4];
        }


        backgroundWorker.execute(type,count,surname,age,username,password);
    }
}
