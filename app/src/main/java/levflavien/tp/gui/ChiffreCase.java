package levflavien.tp.gui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;


public class ChiffreCase {

    int size;
    int chiffre;
    int offset;
    int spacement;
    Rect r;
    private Paint paint;

    public ChiffreCase(int size, int chiffre) {
        this.size = size;
        this.chiffre = chiffre;
        paint = new Paint();
        paint.setStrokeWidth(5);
        paint.setTextSize(40);

        offset = size / 9;
        spacement = 6;

        r = new Rect(offset*(chiffre-1)+ spacement, Math.round(size*1.1f), offset*(chiffre-1) + offset, Math.round(size*1.1f) + offset);
    }

    public void draw(Canvas canvas) {

        paint.setColor(Color.BLACK);
        canvas.drawRect(r, paint);
        paint.setColor(Color.GREEN);
        canvas.drawText(String.valueOf(chiffre), offset*(chiffre-1)+ spacement*2, Math.round(size*1.1 + offset / 1.5), paint);

    }
}
