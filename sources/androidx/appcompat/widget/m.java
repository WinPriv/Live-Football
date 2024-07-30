package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import g0.a;
import n0.c0;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f1200d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1201e;
    public ColorStateList f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1202g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1203h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1204i;

    public m(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.f1202g = null;
        this.f1203h = false;
        this.f1204i = false;
        this.f1200d = seekBar;
    }

    @Override // androidx.appcompat.widget.k
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1200d;
        Context context = seekBar.getContext();
        int[] iArr = a0.a.I;
        m0 m10 = m0.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        n0.c0.k(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f1206b, R.attr.seekBarStyle);
        Drawable f = m10.f(0);
        if (f != null) {
            seekBar.setThumb(f);
        }
        Drawable e10 = m10.e(1);
        Drawable drawable = this.f1201e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1201e = e10;
        if (e10 != null) {
            e10.setCallback(seekBar);
            a.c.b(e10, c0.e.d(seekBar));
            if (e10.isStateful()) {
                e10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m10.l(3)) {
            this.f1202g = x.c(m10.h(3, -1), this.f1202g);
            this.f1204i = true;
        }
        if (m10.l(2)) {
            this.f = m10.b(2);
            this.f1203h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1201e;
        if (drawable != null) {
            if (this.f1203h || this.f1204i) {
                Drawable mutate = drawable.mutate();
                this.f1201e = mutate;
                if (this.f1203h) {
                    a.b.h(mutate, this.f);
                }
                if (this.f1204i) {
                    a.b.i(this.f1201e, this.f1202g);
                }
                if (this.f1201e.isStateful()) {
                    this.f1201e.setState(this.f1200d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        int i10;
        if (this.f1201e != null) {
            int max = this.f1200d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1201e.getIntrinsicWidth();
                int intrinsicHeight = this.f1201e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f1201e.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1201e.draw(canvas);
                    canvas.translate(width, gl.Code);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
