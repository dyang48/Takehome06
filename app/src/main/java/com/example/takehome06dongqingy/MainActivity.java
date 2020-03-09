package com.example.takehome06dongqingy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Tip Calculator");
    }

    public void submitOrder(View view) {
        EditText editText = (EditText) findViewById(R.id.amount);
        String typeamount = editText.getText().toString();
        Double finalamount = Double.parseDouble(typeamount);
        EditText editText1 = (EditText) findViewById(R.id.tax);
        String typetax = editText1.getText().toString();
        Double finaltax = Double.parseDouble(typetax) * finalamount;
        EditText editText2 = (EditText) findViewById(R.id.tip);
        String typetip = editText2.getText().toString();
        Double finaltip = Double.parseDouble(typetip) * finalamount;
        Double total = finalamount + finaltax + finaltip;
        String tipmessage = createtipMessage(finalamount, finaltax, finaltip, total);
        Intent intent= new Intent(this, Act2.class);
        intent.putExtra("Key_String",tipmessage);
        startActivity(intent);


    }

    private String createtipMessage(Double finalamount, Double finaltax, Double finaltip, Double total) {

        String tipmessage = "\nAmount: " + finalamount;
        tipmessage += "\nSales tax: " + finaltax;
        tipmessage += "\nTip: " + finaltip;
        tipmessage += "\nGrand total: " + total;
        return tipmessage;

    }

}
