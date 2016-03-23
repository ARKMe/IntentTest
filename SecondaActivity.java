package bello.andrea.intentstest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_2);

        String nome = getIntent().getExtras().getString(getString(R.string.intent_extra_name));

        if(nome.equals(""))
            ((TextView)findViewById(R.id.saluto)).setText("NON HAI MESSO IL NOME!");
        else
            ((TextView)findViewById(R.id.saluto)).setText("CIAO " + nome);
    }

}
