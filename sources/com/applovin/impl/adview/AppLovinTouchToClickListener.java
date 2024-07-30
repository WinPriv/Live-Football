package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f16936a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16937b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16938c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f16939d;

    /* renamed from: e, reason: collision with root package name */
    private long f16940e;
    private PointF f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16941g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f16942h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f16943i;

    /* loaded from: classes.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: classes.dex */
    public interface OnClickListener {
        void onClick(View view, PointF pointF);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.p pVar, com.applovin.impl.sdk.c.b<Integer> bVar, Context context, OnClickListener onClickListener) {
        this.f16936a = ((Long) pVar.a(com.applovin.impl.sdk.c.b.aX)).longValue();
        this.f16937b = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.aY)).intValue();
        this.f16938c = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.f18708ba)).intValue());
        this.f16939d = ClickRecognitionState.values()[((Integer) pVar.a(bVar)).intValue()];
        this.f16942h = context;
        this.f16943i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f16943i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.f16941g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f16941g && this.f16939d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f16941g && this.f16939d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f16939d == ClickRecognitionState.DISABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16940e;
                float a10 = a(this.f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f16941g) {
                    long j10 = this.f16936a;
                    if ((j10 < 0 || elapsedRealtime < j10) && ((i10 = this.f16937b) < 0 || a10 < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f16939d == ClickRecognitionState.ACTION_DOWN) {
            if (a(motionEvent)) {
                a(view, motionEvent);
            }
        } else {
            this.f16940e = SystemClock.elapsedRealtime();
            this.f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f16941g = false;
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f10 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f * f)));
    }

    private float a(float f) {
        return f / this.f16942h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f16938c <= 0) {
            return true;
        }
        Point a10 = com.applovin.impl.sdk.utils.h.a(this.f16942h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f16938c;
        return rawX >= ((float) i10) && rawY >= ((float) i10) && rawX <= ((float) (a10.x - i10)) && rawY <= ((float) (a10.y - i10));
    }
}
