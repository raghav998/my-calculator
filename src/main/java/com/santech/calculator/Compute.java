package com.santech.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Compute extends Activity {

    int k=0;
    TextView output,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondot,
     button0,buttoneqa,buttondel,buttondiv,buttonmul,buttonsub,buttonadd;
    float value1,value2;
    boolean div,mul,sub,add,chk,dot;
    TextView char1;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(75);
                Toast.makeText(this,"settings not yet developed",Toast.LENGTH_SHORT).show();
                break;

            case R.id.about:
                Intent about = new Intent("com.santech.calculator.ABOUT");
                startActivity(about);
                break;
            case R.id.exit:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compute);
        output=(TextView)findViewById(R.id.textView);
        char1=(TextView)findViewById(R.id.no);
        button1=(TextView)findViewById(R.id.textView1);
        button2=(TextView)findViewById(R.id.textView2);
        button3=(TextView)findViewById(R.id.textView3);
        button4=(TextView)findViewById(R.id.textView4);
        button5=(TextView)findViewById(R.id.textView5);
        button6=(TextView)findViewById(R.id.textView6);
        button7=(TextView)findViewById(R.id.textView7);
        button8=(TextView)findViewById(R.id.textView8);
        button9=(TextView)findViewById(R.id.textView9);
        buttondot=(TextView)findViewById(R.id.textView10);
        button0=(TextView)findViewById(R.id.textView11);
        buttoneqa=(TextView)findViewById(R.id.textView12);
        buttondel=(TextView)findViewById(R.id.textView13);
        buttondiv=(TextView)findViewById(R.id.textView14);
        buttonmul=(TextView)findViewById(R.id.textView15);
        buttonsub=(TextView)findViewById(R.id.textView16);
        buttonadd=(TextView)findViewById(R.id.textView17);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"1");
                char1.setText(char1.getText() + "1");
                chk=true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"2");
                char1.setText(char1.getText() + "2");
                chk=true;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"3");
                char1.setText(char1.getText() + "3");
                chk=true;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"4");
                char1.setText(char1.getText() + "4");
                chk=true;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"5");
                char1.setText(char1.getText() + "5");
                chk=true;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"6");
                char1.setText(char1.getText() + "6");
                chk=true;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"7");
                char1.setText(char1.getText() + "7");
                chk=true;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"8");
                char1.setText(char1.getText() + "8");
                chk=true;
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "9");
                char1.setText(char1.getText() + "9");
                chk=true;
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dot==false){
                output.setText(output.getText() + ".");
                char1.setText(char1.getText() + ".");
                chk=true;
                dot=true;}
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "0");
                char1.setText(char1.getText() + "0");
                chk=true;
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk == false){
                    output.setText("");
                }else{
                    value1 = Float.parseFloat(output.getText() + "");
                    div = true;
                    dot=false;
                    char1.setText(null);
                    output.setText(output.getText() + "÷");
                }
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk == false){
                    output.setText("");
                }else{
                    value1 = Float.parseFloat(output.getText() + "");
                    mul = true;
                    dot=false;
                    char1.setText(null);
                    output.setText(output.getText()+"x");
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk == false){
                    output.setText("");
                }else{
                    value1 = Float.parseFloat(output.getText() + "");
                    sub = true;
                    dot=false;
                    char1.setText(null);
                    output.setText(output.getText()+"-");
                }
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk==false)
                {
                    output.setText(" ");
                } else {
                    value1 = Float.parseFloat((String) output.getText());
                    add = true;
                    dot=false;
                    char1.setText(null);
                    output.setText(output.getText()+"+");
                }
            }
        });
        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
                chk=false;
                dot=false;
            }
        });
        buttoneqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output != null)
                {
                    value2=Float.parseFloat(char1.getText()+"");
                    if(div==true){
                        output.setText(value1/value2+"");
                        div=false;
                    }
                    if(mul==true){
                        output.setText(value1*value2+"");
                        mul=false;
                    }
                    if(sub==true){
                        output.setText(value1-value2+"");
                        sub=false;
                    }
                    if(add==true){
                        output.setText(value1 + value2+"");
                        add=false;
                    }
                }
                else {
                    output.setText("");
                }
            }
        });
    }

    @Override
    public void onBackPressed() {

        k++;
        if (k==1){
            Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(100);
            Toast.makeText(getApplicationContext(),"press again to exit",Toast.LENGTH_SHORT).show();
            Thread timer = new Thread(){
                public void run(){
                    try {
                        sleep(1500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }finally {
                        k=0;
                    }
                }
            };
           timer.start();
        }
        else{
            finish();
        }
    }
}