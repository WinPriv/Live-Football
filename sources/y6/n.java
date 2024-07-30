package y6;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import y6.b;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class n<S extends b> extends k {
    public l<S> D;
    public m E;

    public n(Context context, b bVar, l<S> lVar, m mVar) {
        super(context, bVar);
        this.D = lVar;
        lVar.f36803b = this;
        this.E = mVar;
        mVar.f36804a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            l<S> lVar = this.D;
            Rect bounds = getBounds();
            float b10 = b();
            lVar.f36802a.a();
            lVar.a(canvas, bounds, b10);
            l<S> lVar2 = this.D;
            Paint paint = this.A;
            lVar2.c(canvas, paint);
            int i10 = 0;
            while (true) {
                m mVar = this.E;
                int[] iArr = (int[]) mVar.f36806c;
                if (i10 < iArr.length) {
                    l<S> lVar3 = this.D;
                    float[] fArr = (float[]) mVar.f36805b;
                    int i11 = i10 * 2;
                    lVar3.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
                    i10++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // y6.k
    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f = super.f(z10, z11, z12);
        if (!isRunning()) {
            this.E.c();
        }
        a aVar = this.f36797u;
        ContentResolver contentResolver = this.f36795s.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10 && z12) {
            this.E.h();
        }
        return f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.D.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.D.e();
    }
}
