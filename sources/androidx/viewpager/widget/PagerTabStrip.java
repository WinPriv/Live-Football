package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import d0.a;

/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2499z;

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void b(float f, int i10) {
        getHeight();
        throw null;
    }

    public boolean getDrawFullUnderline() {
        return this.f2499z;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), 0);
    }

    public int getTabIndicatorColor() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.B) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float f = 0;
                    if (Math.abs(x10 - this.C) > f || Math.abs(y - this.D) > f) {
                        this.B = true;
                    }
                }
            } else {
                throw null;
            }
        } else {
            this.C = x10;
            this.D = y;
            this.B = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        boolean z10;
        super.setBackgroundColor(i10);
        if (!this.A) {
            if ((i10 & (-16777216)) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2499z = z10;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z10;
        super.setBackgroundDrawable(drawable);
        if (!this.A) {
            if (drawable == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2499z = z10;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        boolean z10;
        super.setBackgroundResource(i10);
        if (!this.A) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2499z = z10;
        }
    }

    public void setDrawFullUnderline(boolean z10) {
        this.f2499z = z10;
        this.A = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        if (i13 < 0) {
            i13 = 0;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(int i10) {
        this.y = i10;
        throw null;
    }

    public void setTabIndicatorColorResource(int i10) {
        Context context = getContext();
        Object obj = a.f27248a;
        setTabIndicatorColor(a.d.a(context, i10));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        super.setTextSpacing(i10);
    }
}
