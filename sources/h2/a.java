package h2;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.anythink.expressad.exoplayer.k.p;
import s2.f;

/* compiled from: LPaint.java */
/* loaded from: classes.dex */
public final class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = f.f35110a;
            setColor((Math.max(0, Math.min(p.f9095b, i10)) << 24) | (color & 16777215));
        } else {
            PointF pointF2 = f.f35110a;
            super.setAlpha(Math.max(0, Math.min(p.f9095b, i10)));
        }
    }

    public a(int i10) {
        super(i10);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(PorterDuff.Mode mode, int i10) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
