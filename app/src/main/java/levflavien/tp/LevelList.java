package levflavien.tp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;


public class LevelList extends Activity implements AdapterView.OnItemClickListener {

    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levellist);
        context = this;

        ListView listGrille = (ListView) findViewById(R.id.listGrille);

        String level = (String) this.getIntent().getExtras().get("level");
        Log.d("level", level);

        // Valeurs générées selon le fichier de grilles
        ArrayList<vGrille> grilles = new ArrayList();

        for(int i = 0; i < Integer.parseInt(level) + 10; i++){
            grilles.add(new vGrille(Integer.parseInt(level),i,(int) (Math.random()*100)));
        }

        MyAdapter adapter = new MyAdapter(this, grilles);
        listGrille.setAdapter(adapter);
        listGrille.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent defineIntent = new Intent(context, PlayActivity.class);
        context.startActivity(defineIntent);
    }
}

