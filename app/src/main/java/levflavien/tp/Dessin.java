package levflavien.tp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import levflavien.tp.gui.ChiffreCase;
import levflavien.tp.gui.Grille;

import java.util.LinkedList;

public class Dessin extends View implements View.OnTouchListener {

    Grille grille;
    LinkedList<ChiffreCase> chiffreCases;

    public Dessin(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        grille = new Grille(getWidth());
        grille.draw(canvas);

        chiffreCases = new LinkedList<>();

        for (int i = 1; i <= 9; i++) {
            chiffreCases.add(new ChiffreCase(getWidth(), i));
        }

        for (ChiffreCase chiffreCase : chiffreCases) {
            chiffreCase.draw(canvas);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent e) {
        int x = (int)e.getX();
        int y = (int)e.getY();
        int chiffre;
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("touched", String.valueOf(x));
                chiffre = getChiffreFromLocation(x, y);
                break;
            case MotionEvent.ACTION_UP:
                /*if (e.getX() e.getY());

                Cercle cercle = cercles.getLast();*/
                break;
        }
        this.invalidate();
        return true;
    }

    public int getChiffreFromLocation(int x, int y) {
        int size = getWidth();
        int offset = size / 9;
        int spacement = 6;
        int chiffre = 0;
        if (y >= Math.round(size * 1.1f) && y <= (Math.round(size * 1.1f) + offset)) {
            if (x >= offset*8) {
                chiffre = 9;
            } else if (x >= offset*7) {
                chiffre = 8;
            } else if (x >= offset*6) {
                chiffre = 7;
            } else if (x >= offset*5) {
                chiffre = 6;
            } else if (x >= offset*4) {
                chiffre = 5;
            } else if (x >= offset*3) {
                chiffre = 4;
            } else if (x >= offset*2) {
                chiffre = 3;
            } else if (x >= offset*1) {
                chiffre = 2;
            } else {
                chiffre = 1;
            }
        }
        Log.d("chiffre", String.valueOf(chiffre));
        return chiffre;

    }
}
