package n6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.hamkho.livefoot.R;
import d7.g;
import d7.j;
import d7.n;
import g0.a;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f33432a;

    /* renamed from: b, reason: collision with root package name */
    public j f33433b;

    /* renamed from: c, reason: collision with root package name */
    public int f33434c;

    /* renamed from: d, reason: collision with root package name */
    public int f33435d;

    /* renamed from: e, reason: collision with root package name */
    public int f33436e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f33437g;

    /* renamed from: h, reason: collision with root package name */
    public int f33438h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f33439i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f33440j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f33441k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f33442l;

    /* renamed from: m, reason: collision with root package name */
    public g f33443m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33446q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f33448s;

    /* renamed from: t, reason: collision with root package name */
    public int f33449t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33444n = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33445p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f33447r = true;

    public a(MaterialButton materialButton, j jVar) {
        this.f33432a = materialButton;
        this.f33433b = jVar;
    }

    public final n a() {
        RippleDrawable rippleDrawable = this.f33448s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f33448s.getNumberOfLayers() > 2) {
                return (n) this.f33448s.getDrawable(2);
            }
            return (n) this.f33448s.getDrawable(1);
        }
        return null;
    }

    public final g b(boolean z10) {
        RippleDrawable rippleDrawable = this.f33448s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f33448s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void c(j jVar) {
        this.f33433b = jVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(jVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(jVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        MaterialButton materialButton = this.f33432a;
        int f = c0.e.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = c0.e.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f33436e;
        int i13 = this.f;
        this.f = i11;
        this.f33436e = i10;
        if (!this.o) {
            e();
        }
        c0.e.k(materialButton, f, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        g gVar = new g(this.f33433b);
        MaterialButton materialButton = this.f33432a;
        gVar.i(materialButton.getContext());
        a.b.h(gVar, this.f33440j);
        PorterDuff.Mode mode = this.f33439i;
        if (mode != null) {
            a.b.i(gVar, mode);
        }
        float f = this.f33438h;
        ColorStateList colorStateList = this.f33441k;
        gVar.f27403s.f27420k = f;
        gVar.invalidateSelf();
        g.b bVar = gVar.f27403s;
        if (bVar.f27414d != colorStateList) {
            bVar.f27414d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f33433b);
        gVar2.setTint(0);
        float f10 = this.f33438h;
        if (this.f33444n) {
            i10 = a0.a.K0(R.attr.colorSurface, materialButton);
        } else {
            i10 = 0;
        }
        gVar2.f27403s.f27420k = f10;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        g.b bVar2 = gVar2.f27403s;
        if (bVar2.f27414d != valueOf) {
            bVar2.f27414d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f33433b);
        this.f33443m = gVar3;
        a.b.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(a7.a.c(this.f33442l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f33434c, this.f33436e, this.f33435d, this.f), this.f33443m);
        this.f33448s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b10 = b(false);
        if (b10 != null) {
            b10.j(this.f33449t);
            b10.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        g b10 = b(false);
        g b11 = b(true);
        if (b10 != null) {
            float f = this.f33438h;
            ColorStateList colorStateList = this.f33441k;
            b10.f27403s.f27420k = f;
            b10.invalidateSelf();
            g.b bVar = b10.f27403s;
            if (bVar.f27414d != colorStateList) {
                bVar.f27414d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f10 = this.f33438h;
                if (this.f33444n) {
                    i10 = a0.a.K0(R.attr.colorSurface, this.f33432a);
                }
                b11.f27403s.f27420k = f10;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                g.b bVar2 = b11.f27403s;
                if (bVar2.f27414d != valueOf) {
                    bVar2.f27414d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
