package levflavien.tp.gui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


class Cercle {

    int xc, yc, rayon;
    private Paint paint;

    public Cercle(int x, int y, int r) {
        xc = x;
        yc = y;
        rayon = r;
        paint = new Paint();
        paint.setColor(Color.rgb((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(xc, yc, rayon, paint);
    }
}
