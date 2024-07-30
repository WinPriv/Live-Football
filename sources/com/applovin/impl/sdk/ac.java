package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    private final p f18540a;

    /* renamed from: b, reason: collision with root package name */
    private final y f18541b;

    /* renamed from: c, reason: collision with root package name */
    private final View f18542c;

    public ac(View view, p pVar) {
        this.f18540a = pVar;
        this.f18541b = pVar.L();
        this.f18542c = view;
    }

    public long a(com.applovin.impl.mediation.a.e eVar) {
        long j10;
        if (y.a()) {
            this.f18541b.b("ViewabilityTracker", "Checking visibility...");
        }
        if (!this.f18542c.isShown()) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        } else {
            j10 = 0;
        }
        if (this.f18542c.getAlpha() < eVar.M()) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f18542c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f18542c.getParent() == null) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f18542c.getContext(), this.f18542c.getWidth());
        if (pxToDp < eVar.K()) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f18542c.getContext(), this.f18542c.getHeight());
        if (pxToDp2 < eVar.L()) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Point a10 = com.applovin.impl.sdk.utils.h.a(this.f18542c.getContext());
        Rect rect = new Rect(0, 0, a10.x, a10.y);
        int[] iArr = {-1, -1};
        this.f18542c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f18542c.getWidth() + i10, this.f18542c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity a11 = this.f18540a.w().a();
        if (a11 != null && !Utils.isViewInTopActivity(this.f18542c, a11)) {
            if (y.a()) {
                this.f18541b.e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (y.a()) {
            this.f18541b.b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
