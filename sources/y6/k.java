package y6;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
public abstract class k extends Drawable implements Animatable {
    public static final a C = new a();
    public int B;

    /* renamed from: s, reason: collision with root package name */
    public final Context f36795s;

    /* renamed from: t, reason: collision with root package name */
    public final b f36796t;

    /* renamed from: v, reason: collision with root package name */
    public ValueAnimator f36798v;

    /* renamed from: w, reason: collision with root package name */
    public ValueAnimator f36799w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f36800x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public float f36801z;
    public final Paint A = new Paint();

    /* renamed from: u, reason: collision with root package name */
    public y6.a f36797u = new y6.a();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    public class a extends Property<k, Float> {
        public a() {
            super(Float.class, "growFraction");
        }

        @Override // android.util.Property
        public final Float get(k kVar) {
            return Float.valueOf(kVar.b());
        }

        @Override // android.util.Property
        public final void set(k kVar, Float f) {
            k kVar2 = kVar;
            float floatValue = f.floatValue();
            if (kVar2.f36801z != floatValue) {
                kVar2.f36801z = floatValue;
                kVar2.invalidateSelf();
            }
        }
    }

    public k(Context context, b bVar) {
        this.f36795s = context;
        this.f36796t = bVar;
        setAlpha(com.anythink.expressad.exoplayer.k.p.f9095b);
    }

    public final float b() {
        boolean z10;
        b bVar = this.f36796t;
        boolean z11 = true;
        if (bVar.f36773e != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (bVar.f == 0) {
                z11 = false;
            }
            if (!z11) {
                return 1.0f;
            }
        }
        return this.f36801z;
    }

    public final boolean c() {
        ValueAnimator valueAnimator = this.f36799w;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        ValueAnimator valueAnimator = this.f36798v;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean e(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        y6.a aVar = this.f36797u;
        ContentResolver contentResolver = this.f36795s.getContentResolver();
        aVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z12 && f > gl.Code) {
            z13 = true;
        } else {
            z13 = false;
        }
        return f(z10, z11, z13);
    }

    public boolean f(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z13;
        ValueAnimator valueAnimator3 = this.f36798v;
        a aVar = C;
        if (valueAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, gl.Code, 1.0f);
            this.f36798v = ofFloat;
            ofFloat.setDuration(500L);
            this.f36798v.setInterpolator(h6.a.f28769b);
            ValueAnimator valueAnimator4 = this.f36798v;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f36798v = valueAnimator4;
            valueAnimator4.addListener(new i(this));
        }
        if (this.f36799w == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, gl.Code);
            this.f36799w = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f36799w.setInterpolator(h6.a.f28769b);
            ValueAnimator valueAnimator5 = this.f36799w;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f36799w = valueAnimator5;
            valueAnimator5.addListener(new j(this));
        }
        boolean z14 = false;
        if (!isVisible() && !z10) {
            return false;
        }
        if (z10) {
            valueAnimator = this.f36798v;
        } else {
            valueAnimator = this.f36799w;
        }
        if (z10) {
            valueAnimator2 = this.f36799w;
        } else {
            valueAnimator2 = this.f36798v;
        }
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                boolean z15 = this.y;
                this.y = true;
                valueAnimator2.cancel();
                this.y = z15;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                boolean z16 = this.y;
                this.y = true;
                valueAnimator.end();
                this.y = z16;
            }
            return super.setVisible(z10, false);
        }
        if (z12 && valueAnimator.isRunning()) {
            return false;
        }
        if (z10 && !super.setVisible(z10, false)) {
            z13 = false;
        } else {
            z13 = true;
        }
        b bVar = this.f36796t;
        if (!z10 ? bVar.f != 0 : bVar.f36773e != 0) {
            z14 = true;
        }
        if (!z14) {
            boolean z17 = this.y;
            this.y = true;
            valueAnimator.end();
            this.y = z17;
            return z13;
        }
        if (!z11 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
        return z13;
    }

    public final void g(BaseProgressIndicator.d dVar) {
        ArrayList arrayList = this.f36800x;
        if (arrayList != null && arrayList.contains(dVar)) {
            this.f36800x.remove(dVar);
            if (this.f36800x.isEmpty()) {
                this.f36800x = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (!d() && !c()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.B = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return e(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}
