package levflavien.tp;

import android.app.Activity;
import android.os.Bundle;

public class PlayActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grille);

        //this.getIntent().getExtras();
    }
}
