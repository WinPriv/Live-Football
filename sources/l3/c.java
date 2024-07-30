package l3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.activity.n;
import java.util.ArrayList;
import l3.g;

/* compiled from: GifDrawable.java */
/* loaded from: classes.dex */
public final class c extends Drawable implements g.b, Animatable {
    public Paint A;
    public Rect B;

    /* renamed from: s, reason: collision with root package name */
    public final a f32358s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32359t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32360u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32361v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32362w;

    /* renamed from: x, reason: collision with root package name */
    public int f32363x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f32364z;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final g f32365a;

        public a(g gVar) {
            this.f32365a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f32362w = true;
        this.y = -1;
        n.n0(aVar);
        this.f32358s = aVar;
    }

    @Override // l3.g.b
    public final void a() {
        int i10;
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g.a aVar = this.f32358s.f32365a.f32376i;
        if (aVar != null) {
            i10 = aVar.f32385w;
        } else {
            i10 = -1;
        }
        if (i10 == r0.f32369a.c() - 1) {
            this.f32363x++;
        }
        int i11 = this.y;
        if (i11 != -1 && this.f32363x >= i11) {
            stop();
        }
    }

    public final void b() {
        n.m0("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f32361v);
        a aVar = this.f32358s;
        if (aVar.f32365a.f32369a.c() == 1) {
            invalidateSelf();
            return;
        }
        if (!this.f32359t) {
            this.f32359t = true;
            g gVar = aVar.f32365a;
            if (!gVar.f32377j) {
                ArrayList arrayList = gVar.f32371c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !gVar.f) {
                        gVar.f = true;
                        gVar.f32377j = false;
                        gVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f32361v) {
            return;
        }
        if (this.f32364z) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.B == null) {
                this.B = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.B);
            this.f32364z = false;
        }
        g gVar = this.f32358s.f32365a;
        g.a aVar = gVar.f32376i;
        if (aVar != null) {
            bitmap = aVar.y;
        } else {
            bitmap = gVar.f32379l;
        }
        if (this.B == null) {
            this.B = new Rect();
        }
        Rect rect = this.B;
        if (this.A == null) {
            this.A = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.A);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f32358s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f32358s.f32365a.f32383q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f32358s.f32365a.f32382p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f32359t;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f32364z = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.A == null) {
            this.A = new Paint(2);
        }
        this.A.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.A == null) {
            this.A = new Paint(2);
        }
        this.A.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        n.m0("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f32361v);
        this.f32362w = z10;
        if (!z10) {
            this.f32359t = false;
            g gVar = this.f32358s.f32365a;
            ArrayList arrayList = gVar.f32371c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f = false;
            }
        } else if (this.f32360u) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f32360u = true;
        this.f32363x = 0;
        if (this.f32362w) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f32360u = false;
        this.f32359t = false;
        g gVar = this.f32358s.f32365a;
        ArrayList arrayList = gVar.f32371c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f = false;
        }
    }
}
