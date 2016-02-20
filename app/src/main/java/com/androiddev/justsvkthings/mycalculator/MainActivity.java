package com.androiddev.justsvkthings.mycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView res;
    String op, val;
    float v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        op = "=";
        val = "0";
        v1 = 0;
        v2 = 0;
        FloatingActionButton equals = (FloatingActionButton) findViewById(R.id.fab);
        res = (TextView)findViewById(R.id.output);
        Button one = (Button)findViewById(R.id.num1);
        Button two = (Button)findViewById(R.id.num2);
        Button three = (Button)findViewById(R.id.num3);
        Button four = (Button)findViewById(R.id.num4);
        Button five = (Button)findViewById(R.id.num5);
        Button six = (Button)findViewById(R.id.num6);
        Button seven = (Button)findViewById(R.id.num7);
        Button eight = (Button)findViewById(R.id.num8);
        Button nine = (Button)findViewById(R.id.num9);
        Button zero = (Button)findViewById(R.id.num0);
        Button plus = (Button)findViewById(R.id.opPlus);
        Button sub = (Button)findViewById(R.id.opSub);
        Button mul = (Button)findViewById(R.id.opMul);
        Button div = (Button)findViewById(R.id.opDiv);
        Button clear = (Button)findViewById(R.id.Clear);
        equals.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        plus.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        val = (String) res.getText();
        switch (v.getId()){
            case R.id.num0:
                if(!val.equals("0")){
                    val += "0";
                }
                res.setText(val);
                break;
            case R.id.num1:
                if(val.equals("0")){
                    val = "1";
                }else{
                    val+="1";
                }
                res.setText(val);
                break;
            case R.id.num2:
                if(val.equals("0")){
                    val = "2";
                }else{
                    val += "2";
                }
                res.setText(val);
                break;
            case R.id.num3:
                if(val.equals("0")){
                    val = "3";
                }else{
                    val += "3";
                }
                res.setText(val);
                break;
            case R.id.num4:
                if(val.equals("0")){
                    val = "4";
                }else{
                    val += "4";
                }
                res.setText(val);
                break;
            case R.id.num5:
                if(val.equals("0")){
                    val = "5";
                }else{
                    val += "5";
                }
                res.setText(val);
                break;
            case R.id.num6:
                if(val.equals("0")){
                    val = "6";
                }else{
                    val += "6";
                }
                res.setText(val);
                break;
            case R.id.num7:
                if(val.equals("0")){
                    val = "7";
                }else{
                    val += "7";
                }
                res.setText(val);
                break;
            case R.id.num8:
                if(val.equals("0")){
                    val = "8";
                }else{
                    val += "8";
                }
                res.setText(val);
                break;
            case R.id.num9:
                if(val.equals("0")){
                    val = "9";
                }else{
                    val += "9";
                }
                res.setText(val);
                break;
            case R.id.Clear:
                val = "0";
                res.setText(val);
                break;
            case R.id.opPlus:
                if(op.equals("=")) {
                    v1 = Float.parseFloat(val);
                    op = "+";
                    val = "0";
                    res.setText(val);
                }
                break;
            case R.id.opSub:
                if(op.equals("=")) {
                    v1 = Float.parseFloat(val);
                    op = "-";
                    val = "0";
                    res.setText(val);
                }
                break;
            case R.id.opMul:
                if(op.equals("=")) {
                    v1 = Float.parseFloat(val);
                    op = "*";
                    val = "0";
                    res.setText(val);
                }
                break;
            case R.id.opDiv:
                if(op.equals("=")) {
                    v1 = Float.parseFloat(val);
                    op = "/";
                    val = "0";
                    res.setText(val);
                }
                break;
            case R.id.fab:
                if(!op.equals("=")){
                    v2 = Float.parseFloat(val);
                    if(op.equals("+")){
                        res.setText(String.valueOf(v1 + v2));
                        v1 = 0;
                        v2 = 0;
                        op = "=";
                    }else if(op.equals("-")){
                        res.setText(String.valueOf(v1 - v2));
                        v1 = 0;
                        v2 = 0;
                        op = "=";
                    }else if(op.equals("*")){
                        res.setText(String.valueOf(v1 * v2));
                        v1 = 0;
                        v2 = 0;
                        op = "=";
                    }else if(op.equals("/")){
                        try{
                            res.setText(String.valueOf(v1 / v2));
                        }catch(ArithmeticException e){
                            res.setText("Can't divide by zero");
                        }finally {
                            v1 = 0;
                            v2 = 0;
                            op = "=";
                        }
                    }
                }
                break;
            default:
                System.out.println("Doesnt work");
        }
    }
}
