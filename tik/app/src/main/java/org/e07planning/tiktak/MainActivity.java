package org.e07planning.tiktak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int cell1 =2;
    public int cell2 =2;
    public int cell3 =2;
    public int cell4 =2;
    public int cell5 =2;
    public int cell6 =2;
    public int cell7 =2;
    public int cell8 =2;
    public int cell9 =2;
    public boolean redOrYellow = true;

    public void red1(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed1);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell1 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            cell1 = 0;
        }

        if(cell1 == 1 && cell2 ==1 && cell3 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell1 == 1 && cell4 == 1 && cell7 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell1 == 0 && cell2 == 0 && cell3 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell1 == 0 && cell4 == 0 && cell7 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void red2(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed2);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell2 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell2 = 0;
        }

        if(cell1 == 1 && cell2 ==1 && cell3 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell2 == 1 && cell5 == 1 && cell8 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell1 == 0 && cell2 == 0 && cell3 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell2 == 0 && cell5 == 0 && cell8 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void red3(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed3);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell3 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell3 = 0;
        }

        if(cell1 == 1 && cell2 ==1 && cell3 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell3 == 1 && cell6 == 1 && cell9 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell1 == 0 && cell2 == 0 && cell3 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell3 == 0 && cell6 == 0 && cell9 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void red4(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed4);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell4 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell4 = 0;
        }
        if(cell4 == 1 && cell5 ==1 && cell6 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell1 == 1 && cell4 == 1 && cell7 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell4 == 0 && cell5 == 0 && cell6 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell1 == 0 && cell4 == 0 && cell7 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void red5(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed5);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell5 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell5 = 0;
        }
        if(cell4 == 1 && cell5 ==1 && cell6 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell5 == 1 && cell2 == 1 && cell8 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell4 == 0 && cell5 == 0 && cell6 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell5 == 0 && cell2 == 0 && cell8 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void red6(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed6);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell6 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell6 = 0;
        }

        if(cell4 == 1 && cell5 ==1 && cell6 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell3 == 1 && cell6 == 1 && cell9 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell4 == 0 && cell5 == 0 && cell6 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell3 == 0 && cell6 == 0 && cell9 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void red7(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed7);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell7 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell7 = 0;
        }
        if(cell7 == 1 && cell8 ==1 && cell9 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell1 == 1 && cell4 == 1 && cell7 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell7 == 0 && cell8 == 0 && cell9 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell1 == 0 && cell4 == 0 && cell7 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }
    public void red8(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed8);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell8 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell8 = 0;
        }
        if(cell7 == 1 && cell8 ==1 && cell9 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell8 == 1 && cell5 == 1 && cell2 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell7 == 0 && cell8 == 0 && cell9 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell8 == 0 && cell5 == 0 && cell2 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void red9(View view){
        ImageView red = (ImageView) findViewById(R.id.imageViewRed9);

//        red.animate().translationY(-2000).setDuration(0);
        red.setTranslationY(-2000);

        if(redOrYellow == true){
            red.setImageResource(R.drawable.red);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            redOrYellow = false;
            red.setEnabled(false);
            cell9 = 1;
        } else{
            red.setImageResource(R.drawable.yellow);
            red.animate().alpha(1).setDuration(0);
            red.animate().translationY(0).setDuration(1000);
            Log.i("Log","red 1 pressed");
            red.setEnabled(false);
            redOrYellow = true;
            cell9 = 0;
        }
        if(cell7 == 1 && cell8 ==1 && cell9 ==1 ){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell9 == 1 && cell6 == 1 && cell3 == 1){
            //win red
            Toast.makeText(getApplicationContext(), "Red Wins!", Toast.LENGTH_SHORT).show();
        }else if(cell7 == 0 && cell8 == 0 && cell9 == 0 ){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        } else if(cell3 == 0 && cell6 == 0 && cell9 == 0){
            //win yellow
            Toast.makeText(getApplicationContext(), "Yellow Wins!", Toast.LENGTH_SHORT).show();
        }


    }

    public void reset(View view){
        ImageView red1 = (ImageView) findViewById(R.id.imageViewRed1);
        ImageView red2 = (ImageView) findViewById(R.id.imageViewRed2);
        ImageView red3 = (ImageView) findViewById(R.id.imageViewRed3);
        ImageView red4 = (ImageView) findViewById(R.id.imageViewRed4);
        ImageView red5 = (ImageView) findViewById(R.id.imageViewRed5);
        ImageView red6 = (ImageView) findViewById(R.id.imageViewRed6);
        ImageView red7 = (ImageView) findViewById(R.id.imageViewRed7);
        ImageView red8 = (ImageView) findViewById(R.id.imageViewRed8);
        ImageView red9 = (ImageView) findViewById(R.id.imageViewRed9);

        red1.setEnabled(true);
        red2.setEnabled(true);
        red3.setEnabled(true);
        red4.setEnabled(true);
        red5.setEnabled(true);
        red6.setEnabled(true);
        red7.setEnabled(true);
        red8.setEnabled(true);
        red9.setEnabled(true);

        red1.animate().alpha(0);
        red2.animate().alpha(0);
        red3.animate().alpha(0);
        red4.animate().alpha(0);
        red5.animate().alpha(0);
        red6.animate().alpha(0);
        red7.animate().alpha(0);
        red8.animate().alpha(0);
        red9.animate().alpha(0);
        redOrYellow = true;

        cell1 = 2;
        cell2 = 2;
        cell3 = 2;
        cell4 = 2;
        cell5 = 2;
        cell6 = 2;
        cell7 = 2;
        cell8 = 2;
        cell9 = 2;


    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView red1 = (ImageView) findViewById(R.id.imageViewRed1);
       // red1.animate().translationY(-2000).setDuration(0);
    }
}