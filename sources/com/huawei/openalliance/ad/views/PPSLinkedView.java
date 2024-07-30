package com.huawei.openalliance.ad.views;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fv;
import com.huawei.hms.ads.jr;
import com.huawei.hms.ads.jx;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class PPSLinkedView extends RelativeLayout implements fv.a, jx {

    /* renamed from: s, reason: collision with root package name */
    public MaterialClickInfo f23846s;

    /* renamed from: t, reason: collision with root package name */
    public int f23847t;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    private void setDestViewClickable(PPSDestView pPSDestView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pPSDestView);
        a(arrayList);
    }

    private void setSkipBtnDelayTime(AdContentData adContentData) {
        if (adContentData != null) {
            adContentData.y0();
        }
    }

    private void setSplashViewClickable(SplashLinkedVideoView splashLinkedVideoView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(splashLinkedVideoView);
        a(arrayList);
    }

    @Override // com.huawei.hms.ads.fv.a
    public final void B() {
        ex.V("PPSLinkedView", "onViewShownBetweenFullAndPartial: ");
    }

    @Override // com.huawei.hms.ads.fv.a
    public final void Code() {
        ex.V("PPSLinkedView", "onViewShowStartRecord");
    }

    @Override // com.huawei.hms.ads.fv.a
    public final void I() {
        ex.V("PPSLinkedView", "onViewFullShown: ");
    }

    @Override // com.huawei.hms.ads.fv.a
    public final void V() {
        ex.V("PPSLinkedView", "onViewPhysicalShowStart");
    }

    @Override // com.huawei.hms.ads.fv.a
    public final void Z() {
        ex.V("PPSLinkedView", "onViewPartialHidden: ");
    }

    public final void a(List<View> list) {
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null) {
                    view.setOnClickListener(null);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int Code = jr.Code(motionEvent);
            if (Code == 0) {
                this.f23846s = jr.Code(this, motionEvent);
            }
            if (1 == Code) {
                jr.Code(this, motionEvent, null, this.f23846s);
            }
        } catch (Throwable th) {
            ex.I("PPSLinkedView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.hms.ads.jx
    public String getSplashViewSlotPosition() {
        return gb.u.c(null);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List boundingRects;
        boolean z10 = true;
        int i10 = Build.VERSION.SDK_INT;
        ex.V("PPSLinkedView", "onApplyWindowInsets, sdk: %s", Integer.valueOf(i10));
        int i11 = gb.u.f28631a;
        if (i10 < 28) {
            z10 = false;
        }
        if (z10 && windowInsets != null) {
            displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                boundingRects = displayCutout.getBoundingRects();
                if (!androidx.transition.n.h(boundingRects)) {
                    this.f23847t = ((Rect) boundingRects.get(0)).height();
                }
            } else {
                ex.V("PPSLinkedView", "DisplayCutout is null");
            }
        }
        if (this.f23847t <= 0 && i10 >= 26 && cl.Code(null).Code(getContext())) {
            this.f23847t = Math.max(this.f23847t, cl.Code(null).Code(this));
        }
        ex.V("PPSLinkedView", "notchHeight:" + this.f23847t);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ex.Code("PPSLinkedView", "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ex.Code("PPSLinkedView", "onDetechedFromWindow");
        gb.w.d(null);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        ex.Code("PPSLinkedView", "onVisibilityChanged:");
    }

    public void setLinkedAdActionListener(ga.a aVar) {
        ex.V("PPSLinkedView", "setLinkedAdActionListener. ");
    }

    @Override // com.huawei.hms.ads.fv.a
    public final void Code(long j10, int i10) {
        ex.V("PPSLinkedView", "onViewShowEndRecord");
        gb.w.d(null);
        throw null;
    }

    @Override // com.huawei.hms.ads.fv.a
    public final void V(long j10, int i10) {
        ex.V("PPSLinkedView", "onViewPhysicalShowEnd: ");
        gb.w.d(null);
        ex.Code("PPSLinkedView", "onViewPhysicalShowEnd, noPhyImp: %s. ", Boolean.FALSE);
        if (i10 <= 0) {
            return;
        }
        ex.Code("PPSLinkedView", "report phyImp. ");
        System.currentTimeMillis();
        throw null;
    }

    private void setPlaying(boolean z10) {
    }

    public void setMuteOnlyOnLostAudioFocus(boolean z10) {
    }

    public void setOnLinkedAdClickListener(a aVar) {
    }

    public void setOnLinkedAdPreparedListener(b bVar) {
    }

    public void setOnLinkedAdSwitchListener(c cVar) {
    }
}
