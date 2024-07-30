package y6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import y6.b;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes2.dex */
public abstract class l<S extends b> {

    /* renamed from: a, reason: collision with root package name */
    public final S f36802a;

    /* renamed from: b, reason: collision with root package name */
    public k f36803b;

    public l(S s10) {
        this.f36802a = s10;
    }

    public abstract void a(Canvas canvas, Rect rect, float f);

    public abstract void b(Canvas canvas, Paint paint, float f, float f10, int i10);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();
}
