package br.edu.ifes.vi.eletrica.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //variaveis da classe - podem ser utilizadas em qualquer parte do codigo
    EditText editText;
    String emailUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //variaveis locais ao metodo e somente podem ser visualizada aqui

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bottomClick (View v) {
        editText = (EditText) findViewById(R.id.editText);
        emailUsuario = String.valueOf(editText.getText());

        Log.i("info","email do usuario: " + emailUsuario);
    }
}
