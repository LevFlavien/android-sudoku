package levflavien.tp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class main extends Activity implements View.OnClickListener {

    Activity context;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        context = this;

        Button btn1 = (Button) findViewById(R.id.ButtonLevel1);
        Button btn2 = (Button) findViewById(R.id.ButtonLevel2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        Intent defineIntent = new Intent(context, LevelList.class);
        defineIntent.putExtra("level",""+b.getText().charAt(b.length()-1));
        context.startActivity(defineIntent);
    }
}