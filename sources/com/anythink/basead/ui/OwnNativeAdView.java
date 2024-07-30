package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class OwnNativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    int f4331a;

    /* renamed from: b, reason: collision with root package name */
    int f4332b;

    /* renamed from: c, reason: collision with root package name */
    int f4333c;

    /* renamed from: d, reason: collision with root package name */
    int f4334d;

    /* renamed from: e, reason: collision with root package name */
    int f4335e;
    int f;

    /* renamed from: g, reason: collision with root package name */
    int f4336g;

    /* renamed from: h, reason: collision with root package name */
    int f4337h;

    /* renamed from: i, reason: collision with root package name */
    private a f4338i;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public OwnNativeAdView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f4333c = (int) motionEvent.getRawX();
                this.f4334d = (int) motionEvent.getRawY();
                this.f4336g = (int) motionEvent.getX();
                this.f4337h = (int) motionEvent.getY();
            }
        } else {
            this.f4331a = (int) motionEvent.getRawX();
            this.f4332b = (int) motionEvent.getRawY();
            this.f4335e = (int) motionEvent.getX();
            this.f = (int) motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.anythink.basead.c.a getAdClickRecord() {
        com.anythink.basead.c.a aVar = new com.anythink.basead.c.a();
        aVar.f3725a = this.f4331a;
        aVar.f3726b = this.f4332b;
        aVar.f3727c = this.f4333c;
        aVar.f3728d = this.f4334d;
        aVar.f3729e = this.f4335e;
        aVar.f = this.f;
        aVar.f3730g = this.f4336g;
        aVar.f3731h = this.f4337h;
        return aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setWindowEventListener(a aVar) {
        this.f4338i = aVar;
    }

    public OwnNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OwnNativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
