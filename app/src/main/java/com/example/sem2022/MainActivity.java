package com.example.sem2022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText ed1 , ed2, ed3 ,ed4 , ed5 ,ed6 ,ed7 ,ed8 ,ed9 ,ed10 ,ed11 ,ed12 , ed13 ,ed14 , ed15 ,ed16 ,ed17 ,ed18 ,ed19 ,ed20 ,ed21 ,ed22 ;
TextView show1 , show2 , show3 ,show4 ,show5 ,show6 ,show7 ,show8 ,showfinal ;
Button calc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ed1.getText().toString().equals("") || ed2.getText().toString().equals("") ||
                        ed3.getText().toString().equals("") || ed4.getText().toString().equals("") ||
                        ed5.getText().toString().equals("") || ed6.getText().toString().equals("") ||
                        ed7.getText().toString().equals("") || ed8.getText().toString().equals("") ||
                        ed9.getText().toString().equals("") || ed10.getText().toString().equals("") ||
                        ed11.getText().toString().equals("") || ed12.getText().toString().equals("") ||
                        ed13.getText().toString().equals("") || ed14.getText().toString().equals("") ||
                        ed15.getText().toString().equals("") || ed16.getText().toString().equals("") ||
                        ed17.getText().toString().equals("") || ed18.getText().toString().equals("") ||
                        ed19.getText().toString().equals("") || ed20.getText().toString().equals("") ||
                        ed21.getText().toString().equals("") || ed22.getText().toString().equals("")) {

              showWarningDialog();
                } else {
                    double value1 = Double.parseDouble(ed1.getText().toString());
                    double value2 = Double.parseDouble(ed2.getText().toString());
                    double value3 = Double.parseDouble(ed3.getText().toString());
                    double value4 = Double.parseDouble(ed4.getText().toString());
                    double value5 = Double.parseDouble(ed5.getText().toString());
                    double value6 = Double.parseDouble(ed6.getText().toString());
                    double value7 = Double.parseDouble(ed7.getText().toString());
                    double value8 = Double.parseDouble(ed8.getText().toString());
                    double value9 = Double.parseDouble(ed9.getText().toString());
                    double value10 = Double.parseDouble(ed10.getText().toString());
                    double value11 = Double.parseDouble(ed11.getText().toString());
                    double value12= Double.parseDouble(ed12.getText().toString());
                    double value13 = Double.parseDouble(ed13.getText().toString());
                    double value14 = Double.parseDouble(ed14.getText().toString());
                    double value15= Double.parseDouble(ed15.getText().toString());
                    double value16 = Double.parseDouble(ed16.getText().toString());
                    double value17 = Double.parseDouble(ed17.getText().toString());
                    double value18= Double.parseDouble(ed18.getText().toString());
                    double value19 = Double.parseDouble(ed19.getText().toString());
                    double value20 = Double.parseDouble(ed20.getText().toString());
                    double value21= Double.parseDouble(ed21.getText().toString());
                    double value22 = Double.parseDouble(ed22.getText().toString());

                    double result = CalcAnalyse(value1, value2, value3);
                    String formattedResult = String.format("%.2f", result / 5); // Formater le résultat avec deux décimales
                    show1.setText(formattedResult);

                    double result1 = Calcpoo(value4, value5, value6);
                    String formattedResul1 = String.format("%.2f", result1 / 4); // Formater le résultat avec deux décimales
                    show2.setText(formattedResul1);


                    double result2 = calcproba(value7, value8, value9);
                    String formattedResul2 = String.format("%.2f", result2 / 4); // Formater le résultat avec deux décimales
                    show3.setText(formattedResul2);


                    double result3 = calclogique(value10, value11, value12);
                    String formattedResul3 = String.format("%.2f", result3 / 4); // Formater le résultat avec deux décimales
                    show4.setText(formattedResul3);



                    double result4 = calcoptique(value13, value14, value15);
                    String formattedResul4 = String.format("%.2f", result4 / 3); // Formater le résultat avec deux décimales
                    show5.setText(formattedResul4);



                    double result5 = calcisi(value16, value17, value18);
                    String formattedResul5 = String.format("%.2f", result5 / 3); // Formater le résultat avec deux décimales
                    show6.setText(formattedResul5);


                    double result6 = calcangalis(value19, value20, value21);
                    String formattedResul6 = String.format("%.2f", result6 / 2); // Formater le résultat avec deux décimales
                    show7.setText(formattedResul6);

                    double result7 = calcprojet(value22);
                    String formattedResul7 = String.format("%.2f", result7 / 4); // Formater le résultat avec deux décimales
                    show8.setText(formattedResul7);


                    double showfinal3 = result + result1 + result2 + result3 + result4 + result5 + result6 + result7 ;
                    String formattedResul8 = String.format("%.2f", showfinal3 / 29); // Formater le résultat avec deux décimales

                    showfinal.setText(formattedResul8);
                }


            }
        });


    }
    public  void  init(){
        showfinal =findViewById(R.id.showfinal);
        calc = findViewById(R.id.calc);
          ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        ed6 = findViewById(R.id.ed6);
        ed7 = findViewById(R.id.ed7);
        ed8 = findViewById(R.id.ed8);
        ed9 = findViewById(R.id.ed9);
        ed10 = findViewById(R.id.ed10);
        ed11 = findViewById(R.id.ed11);
        ed12 = findViewById(R.id.ed12);
        ed13 = findViewById(R.id.ed13);
        ed14 = findViewById(R.id.ed14);
        ed15 = findViewById(R.id.ed15);
        ed16 = findViewById(R.id.ed16);
        ed17 = findViewById(R.id.ed17);
        ed18 = findViewById(R.id.ed18);
        ed19 = findViewById(R.id.ed19);
        ed20 = findViewById(R.id.ed20);
        ed21 = findViewById(R.id.ed21);
        ed22 = findViewById(R.id.ed22);
        show1 = findViewById(R.id.show1);
        show2 = findViewById(R.id.show2);
        show3 = findViewById(R.id.show3);
        show4 = findViewById(R.id.show4);
        show5 = findViewById(R.id.show5);
        show6 = findViewById(R.id.show6);
        show7 = findViewById(R.id.show7);
        show8 = findViewById(R.id.show8);






    }


    public static Double CalcAnalyse(double ed1, double ed2, double ed3) {
        return (((ed1 + ed2 + ed3) / 3) * 5);
    }

    public static Double Calcpoo(double ed4, double ed5, double ed6) {
        return (((ed4 + ed5 + ed6) / 3) * 4);
    }

    public static Double calcproba(double ed7, double ed8, double ed9) {
        return (((ed7 + ed8 + ed9) / 3) * 4);
    }

    public static Double calclogique(double ed10, double ed11, double ed12) {
        return (((ed10 + ed11 + ed12) / 3) * 4);
    }

    public static Double calcoptique(double ed13, double ed14, double ed15) {
        return (((ed13 + ed14 + ed15) / 3) * 3);
    }

    public static Double calcisi(double ed16, double ed17, double ed18) {
        return (((ed16 + ed17 + ed18) / 3) * 3);
    }

    public static Double calcangalis(double ed19, double ed20, double ed21) {
        return (((ed19 + ed20 + ed21) / 3) * 2);
    }

    public static Double calcprojet(double ed22) {
        return (ed22 * 4);
    }


    private void showWarningDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning")
                .setMessage("This is a warning message!")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Action to perform when OK button is clicked
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}