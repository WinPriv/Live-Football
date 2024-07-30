package y6;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import u0.a;
import y6.b;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class h<S extends b> extends k {
    public static final a I = new a();
    public l<S> D;
    public final u0.e E;
    public final u0.d F;
    public float G;
    public boolean H;

    /* compiled from: DeterminateDrawable.java */
    /* loaded from: classes2.dex */
    public class a extends u0.c {
        public a() {
            super("indicatorLevel", 0);
        }

        @Override // u0.c
        public final float d(Object obj) {
            return ((h) obj).G * 10000.0f;
        }

        @Override // u0.c
        public final void e(Object obj, float f) {
            h hVar = (h) obj;
            hVar.G = f / 10000.0f;
            hVar.invalidateSelf();
        }
    }

    public h(Context context, b bVar, l<S> lVar) {
        super(context, bVar);
        this.H = false;
        this.D = lVar;
        lVar.f36803b = this;
        u0.e eVar = new u0.e();
        this.E = eVar;
        eVar.f35743b = 1.0f;
        eVar.f35744c = false;
        eVar.f35742a = Math.sqrt(50.0f);
        eVar.f35744c = false;
        u0.d dVar = new u0.d(this);
        this.F = dVar;
        dVar.f35739r = eVar;
        if (this.f36801z != 1.0f) {
            this.f36801z = 1.0f;
            invalidateSelf();
        }
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
            this.D.b(canvas, paint, gl.Code, this.G, a0.a.C0(this.f36796t.f36771c[0], this.B));
            canvas.restore();
        }
    }

    @Override // y6.k
    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f = super.f(z10, z11, z12);
        y6.a aVar = this.f36797u;
        ContentResolver contentResolver = this.f36795s.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f10 == gl.Code) {
            this.H = true;
        } else {
            this.H = false;
            float f11 = 50.0f / f10;
            u0.e eVar = this.E;
            eVar.getClass();
            if (f11 > gl.Code) {
                eVar.f35742a = Math.sqrt(f11);
                eVar.f35744c = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
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

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.F.c();
        this.G = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10 = this.H;
        u0.d dVar = this.F;
        if (z10) {
            dVar.c();
            this.G = i10 / 10000.0f;
            invalidateSelf();
        } else {
            dVar.f35726b = this.G * 10000.0f;
            dVar.f35727c = true;
            float f = i10;
            if (dVar.f) {
                dVar.f35740s = f;
            } else {
                if (dVar.f35739r == null) {
                    dVar.f35739r = new u0.e(f);
                }
                u0.e eVar = dVar.f35739r;
                double d10 = f;
                eVar.f35749i = d10;
                double d11 = (float) d10;
                if (d11 <= Float.MAX_VALUE) {
                    float f10 = dVar.f35730g;
                    if (d11 >= f10) {
                        double abs = Math.abs(dVar.f35732i * 0.75f);
                        eVar.f35745d = abs;
                        eVar.f35746e = abs * 62.5d;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            boolean z11 = dVar.f;
                            if (!z11 && !z11) {
                                dVar.f = true;
                                if (!dVar.f35727c) {
                                    dVar.f35726b = dVar.f35729e.d(dVar.f35728d);
                                }
                                float f11 = dVar.f35726b;
                                if (f11 <= Float.MAX_VALUE && f11 >= f10) {
                                    ThreadLocal<u0.a> threadLocal = u0.a.f;
                                    if (threadLocal.get() == null) {
                                        threadLocal.set(new u0.a());
                                    }
                                    u0.a aVar = threadLocal.get();
                                    ArrayList<a.b> arrayList = aVar.f35711b;
                                    if (arrayList.size() == 0) {
                                        if (aVar.f35713d == null) {
                                            aVar.f35713d = new a.d(aVar.f35712c);
                                        }
                                        a.d dVar2 = aVar.f35713d;
                                        dVar2.f35717b.postFrameCallback(dVar2.f35718c);
                                    }
                                    if (!arrayList.contains(dVar)) {
                                        arrayList.add(dVar);
                                    }
                                } else {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
            }
        }
        return true;
    }
}
