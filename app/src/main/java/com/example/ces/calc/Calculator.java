package com.example.ces.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;



public class Calculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        int opt1,opt2;
        String str[];
        final Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,dot,plus,minus,div,mul,eq,reset;
        final TextView edt;
        edt=findViewById(R.id.edt1);
        bt1=findViewById(R.id.btn1);
        bt2=findViewById(R.id.btn2);
        bt3=findViewById(R.id.btn3);
        bt4=findViewById(R.id.btn4);
        bt5=findViewById(R.id.btn5);
        bt6=findViewById(R.id.btn6);
        bt7=findViewById(R.id.btn7);
        bt8=findViewById(R.id.btn8);
        bt9=findViewById(R.id.btn9);
        bt0=findViewById(R.id.btn0);
        dot=findViewById(R.id.btndot);
        plus=findViewById(R.id.btnadd);
        minus=findViewById(R.id.btnsub);
        div=findViewById(R.id.btndiv);
        mul=findViewById(R.id.btnmul);
        eq=findViewById(R.id.btneq);
        reset=findViewById(R.id.rst);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"1");
                var.checkop = false;
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"2");
                var.checkop = false;
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"3");
                var.checkop = false;
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"4");
                var.checkop = false;
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"5");
                var.checkop = false;
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"6");
                var.checkop = false;
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"7");
                var.checkop = false;
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"8");
                var.checkop = false;
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"9");
                var.checkop = false;
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"0");
                var.checkop = false;
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt.getText().toString().equals(""))
                {
                    edt.setText(edt.getText() + "+");
                    var.checkop=true;
                    var.check = false;
                }

                else if(var.checkop==false) {
                    edt.setText(edt.getText() + " + ");
                    var.checkop=true;
                    var.check = false;
                }
                else
                {
                    String s=edt.getText().toString();
                    String s2=s.substring(0,s.length()-2);
                    Log.d("Else",""+s2);
                    edt.setText(s2+"+ ");
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt.getText().toString().equals(""))
                {
                    edt.setText(edt.getText() + "-");
                    var.checkop=true;
                    var.check = false;
                }
                else if(var.checkop==false) {
                    edt.setText(edt.getText() + " - ");
                    var.checkop=true;
                    var.check = false;
                }
                else
                {
                    String s=edt.getText().toString();
                    String s2=s.substring(0,s.length()-2);
                    Log.d("Else",""+s2);
                    edt.setText(s2+"- ");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT);
                }
                else if(var.checkop==false) {
                    edt.setText(edt.getText() + " ÷ ");
                    var.checkop=true;
                    var.check = false;
                }
                else
                {
                    String s=edt.getText().toString();
                    String s2=s.substring(0,s.length()-2);
                    Log.d("Else",""+s2);
                    edt.setText(s2+"÷ ");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT);
                }
                else if(var.checkop==false) {
                    edt.setText(edt.getText() + " X ");
                    var.checkop=true;
                    var.check = false;
                }
                else
                {
                    String s=edt.getText().toString();
                    String s2=s.substring(0,s.length()-2);
                    Log.d("Else",""+s2);
                    edt.setText(s2+"X ");
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(var.check==false) {
                    edt.setText(edt.getText() + ".");
                    var.check = true;
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText("");
                var.checkop = false;
                var.check = false;
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //edt.setText("");
                String txt = edt.getText().toString();
                Log.d("checkingstring ",txt);
                double result=calc(txt);
                if (result==-3.14159) {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_SHORT);
                }
                edt.setText(""+result);

            }
        });
    }


    public double calc(String txt) {
        String[] exp = txt.split(" ");
        ArrayList<String> expr = new ArrayList<String>(Arrays.asList(exp));
        Log.d("ArrayList contents", "" + expr);
        double op1, op2, op3;
        int i, size = expr.size();

        if(!txt.equals("")) {
            while (size != 1) {

                Log.d("ArrayList in while", "" + expr);
                if (expr.contains("÷")) {
                    i = expr.indexOf("÷");
                    op1 = Double.parseDouble(expr.get(i - 1));
                    op2 = Double.parseDouble(expr.get(i + 1));
                    op3 = op1 / op2;
                    expr.set(i - 1, "" + op3);
                    expr.remove(i);
                    i = i - 1;
                    expr.remove(i + 1);
                    size = size - 2;

                } else if (expr.contains("X")) {
                    i = expr.indexOf("X");
                    op1 = Double.parseDouble(expr.get(i - 1));
                    op2 = Double.parseDouble(expr.get(i + 1));
                    op3 = op1 * op2;
                    expr.set(i - 1, "" + op3);
                    expr.remove(i);
                    i = i - 1;
                    expr.remove(i + 1);
                    size = size - 2;

                } else if (expr.contains("+")) {

                    i = expr.indexOf("+");
                    op1 = Double.parseDouble(expr.get(i - 1));
                    op2 = Double.parseDouble(expr.get(i + 1));
                    op3 = op1 + op2;
                    expr.set(i - 1, "" + op3);
                    expr.remove(i);
                    i = i - 1;
                    expr.remove(i + 1);
                    size = size - 2;
                }

                else if (expr.contains("-")) {
                    i = expr.indexOf("-");
                    op1 = Double.parseDouble(expr.get(i - 1));
                    op2 = Double.parseDouble(expr.get(i + 1));
                    op3 = op1 - op2;
                    expr.set(i - 1, "" + op3);
                    expr.remove(i);
                    i = i - 1;
                    expr.remove(i + 1);
                    size = size - 2;
                }
            }
            Log.d("ArrayList in while", "" + expr);
            return Double.parseDouble(expr.get(0));
        }
        else
        {
            return -3.14159;
        }


    }


}
class var{
    static boolean check=false;
    static boolean checkop=false;
}