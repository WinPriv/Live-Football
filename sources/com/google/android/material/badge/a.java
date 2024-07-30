package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.h;
import com.google.android.material.internal.k;
import com.hamkho.livefoot.R;
import d7.g;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import z6.d;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes2.dex */
public final class a extends Drawable implements h.b {
    public float A;
    public float B;
    public float C;
    public WeakReference<View> D;
    public WeakReference<FrameLayout> E;

    /* renamed from: s, reason: collision with root package name */
    public final WeakReference<Context> f20482s;

    /* renamed from: t, reason: collision with root package name */
    public final g f20483t;

    /* renamed from: u, reason: collision with root package name */
    public final h f20484u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f20485v;

    /* renamed from: w, reason: collision with root package name */
    public final BadgeState f20486w;

    /* renamed from: x, reason: collision with root package name */
    public float f20487x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public int f20488z;

    public a(Context context, BadgeState.State state) {
        FrameLayout frameLayout;
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f20482s = weakReference;
        k.c(context, "Theme.MaterialComponents", k.f20882b);
        this.f20485v = new Rect();
        g gVar = new g();
        this.f20483t = gVar;
        h hVar = new h(this);
        this.f20484u = hVar;
        TextPaint textPaint = hVar.f20874a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (context3 != null && hVar.f != (dVar = new d(context3, R.style.TextAppearance_MaterialComponents_Badge)) && (context2 = weakReference.get()) != null) {
            hVar.b(dVar, context2);
            h();
        }
        BadgeState badgeState = new BadgeState(context, state);
        this.f20486w = badgeState;
        BadgeState.State state2 = badgeState.f20471b;
        this.f20488z = ((int) Math.pow(10.0d, state2.f20480x - 1.0d)) - 1;
        hVar.f20877d = true;
        h();
        invalidateSelf();
        hVar.f20877d = true;
        h();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(state2.f20476t.intValue());
        if (gVar.f27403s.f27413c != valueOf) {
            gVar.k(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f20477u.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.D;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.D.get();
            WeakReference<FrameLayout> weakReference3 = this.E;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            g(view, frameLayout);
        }
        h();
        setVisible(state2.D.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.h.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int e10 = e();
        int i10 = this.f20488z;
        BadgeState badgeState = this.f20486w;
        if (e10 <= i10) {
            return NumberFormat.getInstance(badgeState.f20471b.y).format(e());
        }
        Context context = this.f20482s.get();
        if (context == null) {
            return "";
        }
        return String.format(badgeState.f20471b.y, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f20488z), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean f = f();
        BadgeState badgeState = this.f20486w;
        if (f) {
            if (badgeState.f20471b.A == 0 || (context = this.f20482s.get()) == null) {
                return null;
            }
            int e10 = e();
            int i10 = this.f20488z;
            BadgeState.State state = badgeState.f20471b;
            if (e10 <= i10) {
                return context.getResources().getQuantityString(state.A, e(), Integer.valueOf(e()));
            }
            return context.getString(state.B, Integer.valueOf(i10));
        }
        return badgeState.f20471b.f20481z;
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.E;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f20483t.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                h hVar = this.f20484u;
                hVar.f20874a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.f20487x, this.y + (rect.height() / 2), hVar.f20874a);
            }
        }
    }

    public final int e() {
        if (f()) {
            return this.f20486w.f20471b.f20479w;
        }
        return 0;
    }

    public final boolean f() {
        if (this.f20486w.f20471b.f20479w != -1) {
            return true;
        }
        return false;
    }

    public final void g(View view, FrameLayout frameLayout) {
        this.D = new WeakReference<>(view);
        this.E = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f20486w.f20471b.f20478v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f20485v.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f20485v.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        View view;
        int intValue;
        int i10;
        int intValue2;
        float f;
        float f10;
        Context context = this.f20482s.get();
        WeakReference<View> weakReference = this.D;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.f20485v;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference<FrameLayout> weakReference2 = this.E;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean f11 = f();
            BadgeState badgeState = this.f20486w;
            if (f11) {
                intValue = badgeState.f20471b.H.intValue();
            } else {
                intValue = badgeState.f20471b.F.intValue();
            }
            int intValue3 = badgeState.f20471b.J.intValue() + intValue;
            BadgeState.State state = badgeState.f20471b;
            int intValue4 = state.C.intValue();
            if (intValue4 != 8388691 && intValue4 != 8388693) {
                this.y = rect3.top + intValue3;
            } else {
                this.y = rect3.bottom - intValue3;
            }
            int e10 = e();
            float f12 = badgeState.f20473d;
            if (e10 <= 9) {
                if (!f()) {
                    f12 = badgeState.f20472c;
                }
                this.A = f12;
                this.C = f12;
                this.B = f12;
            } else {
                this.A = f12;
                this.C = f12;
                this.B = (this.f20484u.a(b()) / 2.0f) + badgeState.f20474e;
            }
            Resources resources = context.getResources();
            if (f()) {
                i10 = R.dimen.mtrl_badge_text_horizontal_edge_offset;
            } else {
                i10 = R.dimen.mtrl_badge_horizontal_edge_offset;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i10);
            if (f()) {
                intValue2 = state.G.intValue();
            } else {
                intValue2 = state.E.intValue();
            }
            int intValue5 = state.I.intValue() + intValue2;
            int intValue6 = state.C.intValue();
            if (intValue6 != 8388659 && intValue6 != 8388691) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                if (c0.e.d(view) == 0) {
                    f10 = ((rect3.right + this.B) - dimensionPixelSize) - intValue5;
                } else {
                    f10 = (rect3.left - this.B) + dimensionPixelSize + intValue5;
                }
                this.f20487x = f10;
            } else {
                WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                if (c0.e.d(view) == 0) {
                    f = (rect3.left - this.B) + dimensionPixelSize + intValue5;
                } else {
                    f = ((rect3.right + this.B) - dimensionPixelSize) - intValue5;
                }
                this.f20487x = f;
            }
            float f13 = this.f20487x;
            float f14 = this.y;
            float f15 = this.B;
            float f16 = this.C;
            rect2.set((int) (f13 - f15), (int) (f14 - f16), (int) (f13 + f15), (int) (f14 + f16));
            float f17 = this.A;
            g gVar = this.f20483t;
            gVar.setShapeAppearanceModel(gVar.f27403s.f27411a.e(f17));
            if (!rect.equals(rect2)) {
                gVar.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        BadgeState badgeState = this.f20486w;
        badgeState.f20470a.f20478v = i10;
        badgeState.f20471b.f20478v = i10;
        this.f20484u.f20874a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
