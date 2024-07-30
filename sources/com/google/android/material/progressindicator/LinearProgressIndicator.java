package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import y6.h;
import y6.m;
import y6.n;
import y6.o;
import y6.q;
import y6.t;
import y6.u;

/* loaded from: classes2.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<u> {
    public static final /* synthetic */ int F = 0;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        m tVar;
        Context context2 = getContext();
        u uVar = (u) this.f20936s;
        o oVar = new o(uVar);
        if (uVar.f36829g == 0) {
            tVar = new q(uVar);
        } else {
            tVar = new t(context2, uVar);
        }
        setIndeterminateDrawable(new n(context2, uVar, oVar, tVar));
        setProgressDrawable(new h(getContext(), uVar, new o(uVar)));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final u a(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final void b(int i10, boolean z10) {
        S s10 = this.f20936s;
        if (s10 != 0 && ((u) s10).f36829g == 0 && isIndeterminate()) {
            return;
        }
        super.b(i10, z10);
    }

    public int getIndeterminateAnimationType() {
        return ((u) this.f20936s).f36829g;
    }

    public int getIndicatorDirection() {
        return ((u) this.f20936s).f36830h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.f20936s;
        u uVar = (u) s10;
        boolean z11 = true;
        if (((u) s10).f36830h != 1) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if ((c0.e.d(this) != 1 || ((u) s10).f36830h != 2) && (c0.e.d(this) != 0 || ((u) s10).f36830h != 3)) {
                z11 = false;
            }
        }
        uVar.f36831i = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        n<u> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        h<u> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        S s10 = this.f20936s;
        if (((u) s10).f36829g == i10) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((u) s10).f36829g = i10;
        ((u) s10).a();
        if (i10 == 0) {
            n<u> indeterminateDrawable = getIndeterminateDrawable();
            q qVar = new q((u) s10);
            indeterminateDrawable.E = qVar;
            qVar.f36804a = indeterminateDrawable;
        } else {
            n<u> indeterminateDrawable2 = getIndeterminateDrawable();
            t tVar = new t(getContext(), (u) s10);
            indeterminateDrawable2.E = tVar;
            tVar.f36804a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((u) this.f20936s).a();
    }

    public void setIndicatorDirection(int i10) {
        S s10 = this.f20936s;
        ((u) s10).f36830h = i10;
        u uVar = (u) s10;
        boolean z10 = true;
        if (i10 != 1) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if ((c0.e.d(this) != 1 || ((u) s10).f36830h != 2) && (c0.e.d(this) != 0 || i10 != 3)) {
                z10 = false;
            }
        }
        uVar.f36831i = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((u) this.f20936s).a();
        invalidate();
    }
}
