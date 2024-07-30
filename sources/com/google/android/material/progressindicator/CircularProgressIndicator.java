package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.hamkho.livefoot.R;
import y6.c;
import y6.f;
import y6.g;
import y6.h;
import y6.n;

/* loaded from: classes2.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<g> {
    public static final /* synthetic */ int F = 0;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        g gVar = (g) this.f20936s;
        setIndeterminateDrawable(new n(context2, gVar, new c(gVar), new f(gVar)));
        setProgressDrawable(new h(getContext(), gVar, new c(gVar)));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final g a(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((g) this.f20936s).f36792i;
    }

    public int getIndicatorInset() {
        return ((g) this.f20936s).f36791h;
    }

    public int getIndicatorSize() {
        return ((g) this.f20936s).f36790g;
    }

    public void setIndicatorDirection(int i10) {
        ((g) this.f20936s).f36792i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s10 = this.f20936s;
        if (((g) s10).f36791h != i10) {
            ((g) s10).f36791h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f20936s;
        if (((g) s10).f36790g != max) {
            ((g) s10).f36790g = max;
            ((g) s10).getClass();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((g) this.f20936s).getClass();
    }
}
