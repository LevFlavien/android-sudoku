package levflavien.tp.gui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;

import java.util.LinkedList;


public class Grille {

    int size;
    private Paint paint;

    public Grille(int size) {
        this.size = size;
        paint = new Paint();
        paint.setStrokeWidth(5);
    }

    public void draw(Canvas canvas) {

        //grid background
        paint.setColor(Color.rgb(235,113,92));
        Rect r = new Rect(0, 0, size, size);
        canvas.drawRect(r, paint);


        LinkedList<Rect> cases = new LinkedList<>();

        int offset = size / 9;
        int spacement = 2;

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                cases.add(new Rect(offset*x + spacement, offset*y + spacement, offset*x + offset, offset*y + offset));
            }
        }

        paint.setColor(Color.WHITE);
        for (Rect rect: cases) {
            canvas.drawRect(rect, paint);
        }

    }
}
