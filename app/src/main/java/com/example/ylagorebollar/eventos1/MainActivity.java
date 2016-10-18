package com.example.ylagorebollar.eventos1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = (Button) findViewById(R.id.botonStart);


    }

    public void eventoBoton(View arg){
        Toast.makeText(getApplicationContext(),"Hola Mundo",Toast.LENGTH_SHORT).show();
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
}
/*    final String[] seleccion = {"", "", "", "", "", ""};

    //String [] rand = randomNumbers();
    private Button start;
    private Button num1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);

        start = (Button) findViewById(R.id.botonStart);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Toast.makeText(getApplicationContext(), randomNumbers().toString(), Toast.LENGTH_SHORT).show();
            }


        });
    }


    public String randomNumbers(){
        int [] num = new int [5];
        for (int x=0;x<num.length;x++) {
            num[x] = (int) (Math.random() * 5) + 0;
        }
            String numeros = num[];
        return numeros;
    }

}*/
