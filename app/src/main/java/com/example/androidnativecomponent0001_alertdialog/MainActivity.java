package com.example.androidnativecomponent0001_alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view) {

        // Instanciar AlertDialog
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        // Configurar titulo e mensagem
        alertDialog.setTitle("Título do AlertDialog");
        alertDialog.setMessage("Mensagem do AlertDialog");

        // Configurar cancelamneto
        alertDialog.setCancelable(false);

        // configurar icone
        alertDialog.setIcon(android.R.drawable.ic_menu_help);

        // Configurar acoes para sim e para nao
        alertDialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface alertDialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Você escolheu a opção sim",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        alertDialog.setNegativeButton("Não Obrigado", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface alertDialog, int wich) {
                Toast.makeText(
                        getApplicationContext(),
                        "Você escolheu a opção não",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Criar e exibir AlertDialog
        alertDialog.create();
        alertDialog.show();

    }

}
