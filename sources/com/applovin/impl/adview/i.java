package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class i extends View {

    /* renamed from: a, reason: collision with root package name */
    protected float f17148a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f17149b;

    /* loaded from: classes.dex */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* renamed from: e, reason: collision with root package name */
        private final int f17154e;

        a(int i10) {
            this.f17154e = i10;
        }

        public int a() {
            return this.f17154e;
        }
    }

    public i(Context context) {
        super(context);
        this.f17148a = 1.0f;
        this.f17149b = context;
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f17148a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f) {
        this.f17148a = f;
    }

    public static i a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new q(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new r(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new s(context);
        }
        return new y(context);
    }
}
