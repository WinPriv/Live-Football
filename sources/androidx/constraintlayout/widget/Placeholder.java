package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.anythink.expressad.exoplayer.k.p;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: s, reason: collision with root package name */
    public int f1428s;

    /* renamed from: t, reason: collision with root package name */
    public View f1429t;

    /* renamed from: u, reason: collision with root package name */
    public int f1430u;

    public View getContent() {
        return this.f1429t;
    }

    public int getEmptyVisibility() {
        return this.f1430u;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(p.f9095b, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f1428s == i10) {
            return;
        }
        View view = this.f1429t;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f1429t.getLayoutParams()).f1380f0 = false;
            this.f1429t = null;
        }
        this.f1428s = i10;
        if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f1430u = i10;
    }
}
