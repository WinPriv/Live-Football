package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class h extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private PointF f17147a;

    public h(Context context) {
        super(context);
        this.f17147a = new PointF();
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f17147a;
        this.f17147a = new PointF();
        return pointF;
    }

    public PointF getLastClickLocation() {
        return this.f17147a;
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f17147a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
