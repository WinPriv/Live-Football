package com.huawei.openalliance.ad.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fo;
import com.huawei.hms.ads.fp;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.id;
import com.huawei.hms.ads.ka;
import com.huawei.hms.ads.kc;
import com.huawei.hms.ads.km;
import com.huawei.hms.ads.ko;
import com.huawei.hms.ads.splash.R;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.r0;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class SmartScreenSplashView extends RelativeLayout implements ka, km {
    public int A;
    public a B;
    public float C;

    /* renamed from: s, reason: collision with root package name */
    public int f24096s;

    /* renamed from: t, reason: collision with root package name */
    public AdSlotParam f24097t;

    /* renamed from: u, reason: collision with root package name */
    public ga.b f24098u;

    /* renamed from: v, reason: collision with root package name */
    public fo f24099v;

    /* renamed from: w, reason: collision with root package name */
    public SloganView f24100w;

    /* renamed from: x, reason: collision with root package name */
    public View f24101x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public kc f24102z;

    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<kc> f24103a;

        public a(kc kcVar) {
            this.f24103a = new WeakReference<>(kcVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kc kcVar;
            if (intent != null && com.huawei.openalliance.ad.constant.w.f22148cb.equals(intent.getAction()) && (kcVar = this.f24103a.get()) != null && (kcVar instanceof PPSVideoView)) {
                PPSVideoView pPSVideoView = (PPSVideoView) kcVar;
                ex.V("PPSVideoView", "unMuteCustomized");
                VideoView videoView = pPSVideoView.J;
                if (videoView != null) {
                    float f = pPSVideoView.f24004h0;
                    if (f > gl.Code) {
                        ex.V("BaseVideoView", "unmute, volume: %s", Float.valueOf(f));
                        videoView.f23665f0.V(f);
                    }
                }
            }
        }
    }

    private void setVisibleAndBringToFont(View view) {
        if (view != null) {
            view.setVisibility(0);
            view.bringToFront();
        }
    }

    @Override // com.huawei.hms.ads.ka
    public final Integer Code(AdContentData adContentData) {
        return null;
    }

    @Override // com.huawei.hms.ads.ka
    public final void I(int i10) {
        ex.Code("SmartScreenSplashView", "update left time, total: %s, left: %s", 0L, Integer.valueOf(i10));
    }

    @Override // com.huawei.hms.ads.ka
    public final kc V(int i10) {
        if (i10 == 2) {
            return new PPSImageView(getContext());
        }
        if (i10 != 9) {
            return null;
        }
        PPSVideoView pPSVideoView = new PPSVideoView(getContext(), this.f24097t.v(), 0, this.f24097t.p());
        pPSVideoView.setHideSoundIcon(true);
        pPSVideoView.setIgnoreSoundCtrl(false);
        pPSVideoView.setStartVol(this.C);
        return pPSVideoView;
    }

    @Override // com.huawei.hms.ads.km
    public final void destroyView() {
        ex.V("SmartScreenSplashView", "destroyView ");
        kc kcVar = this.f24102z;
        if (kcVar != null) {
            kcVar.destroyView();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ex.V("SmartScreenSplashView", "dispatchKeyEvent:" + keyEvent.getKeyCode() + ", " + keyEvent.getAction());
        return true;
    }

    public ga.b getAdListener() {
        return this.f24098u;
    }

    @Override // com.huawei.hms.ads.ka
    public AdSlotParam getAdSlotParam() {
        AdSlotParam adSlotParam = this.f24097t;
        if (adSlotParam != null) {
            adSlotParam.h(18);
        }
        return this.f24097t;
    }

    @Override // com.huawei.hms.ads.ka
    public int getAdType() {
        return 18;
    }

    @Override // com.huawei.hms.ads.ka
    public int getAudioFocusType() {
        return 0;
    }

    public float getStartMaxVol() {
        return this.C;
    }

    public String getUniqueId() {
        return null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ex.V("SmartScreenSplashView", "onKeyDown, keyCode: %s", Integer.valueOf(keyEvent.getKeyCode()));
        return false;
    }

    @Override // com.huawei.hms.ads.km
    public final void pauseView() {
        ex.V("SmartScreenSplashView", "pauseView ");
        kc kcVar = this.f24102z;
        if (kcVar != null) {
            kcVar.pauseView();
        }
        if (getContext() != null) {
            try {
                if (this.B != null) {
                    getContext().unregisterReceiver(this.B);
                    this.B = null;
                }
            } catch (Throwable th) {
                ex.I("SmartScreenSplashView", "unregister err: %s", th.getClass().getSimpleName());
            }
        }
    }

    @Override // com.huawei.hms.ads.km
    public final void resumeView() {
        ex.V("SmartScreenSplashView", "resumeView ");
        kc kcVar = this.f24102z;
        if (kcVar != null) {
            kcVar.resumeView();
        }
    }

    public void setAdActionListener(ga.a aVar) {
        fo foVar = this.f24099v;
        if (foVar != null) {
            foVar.Code((ga.a) null);
        }
    }

    public void setAdListener(ga.b bVar) {
        this.f24098u = bVar;
        throw null;
    }

    public void setAdSlotParam(AdSlotParam adSlotParam) {
        int k10;
        int a10;
        if (!r0.c(getContext())) {
            return;
        }
        Context context = getContext();
        if (adSlotParam.v() == 0) {
            k10 = gb.z.a(context);
        } else {
            k10 = gb.z.k(context);
        }
        Context context2 = getContext();
        if (adSlotParam.v() == 0) {
            a10 = gb.z.k(context2);
        } else {
            a10 = gb.z.a(context2);
        }
        adSlotParam.A(k10);
        adSlotParam.b(a10);
        adSlotParam.r(8);
        adSlotParam.t(Integer.valueOf(this.f24096s));
        int i10 = 0;
        adSlotParam.B(0);
        if (!HiAd.c(getContext()).isNewProcess() || !gb.z.g(getContext())) {
            i10 = 1;
        }
        adSlotParam.c(Integer.valueOf(i10));
        this.f24097t = adSlotParam;
        fa.j a11 = fa.j.a(getContext());
        if (a11 instanceof fa.j) {
            a11.getClass();
            adSlotParam.F();
            a11.getClass();
        }
    }

    public void setAudioFocusType(int i10) {
        this.A = i10;
        kc kcVar = this.f24102z;
        if (kcVar != null) {
            kcVar.setAudioFocusType(i10);
        }
    }

    public void setLinkedSupportMode(int i10) {
        this.f24096s = i10;
    }

    public void setLogo(View view) {
        this.y = view;
        view.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSloganResId(int r4) {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            boolean r0 = gb.r0.c(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            android.content.Context r0 = r3.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L24
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L24
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            if (r0 == 0) goto L2f
            java.lang.String r4 = "SmartScreenSplashView"
            java.lang.String r0 = "setSloganResId - activity finished, not add view"
            com.huawei.hms.ads.ex.I(r4, r0)
            return
        L2f:
            com.huawei.openalliance.ad.beans.parameter.AdSlotParam r0 = r3.f24097t
            if (r0 == 0) goto L51
            com.huawei.openalliance.ad.views.SloganView r0 = r3.f24100w
            if (r0 == 0) goto L38
            return
        L38:
            com.huawei.openalliance.ad.views.SloganView r0 = new com.huawei.openalliance.ad.views.SloganView
            android.content.Context r1 = r3.getContext()
            com.huawei.openalliance.ad.beans.parameter.AdSlotParam r2 = r3.f24097t
            int r2 = r2.v()
            r0.<init>(r1, r2, r4)
            r3.f24100w = r0
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r0 = -1
            r4.<init>(r0, r0)
            r4 = 0
            throw r4
        L51:
            com.huawei.hms.ads.dq r4 = new com.huawei.hms.ads.dq
            java.lang.String r0 = "Must invoke SplashAdView's setAdSlotParam method before invoke setSloganResId method"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.SmartScreenSplashView.setSloganResId(int):void");
    }

    public void setSloganView(View view) {
        if (view != null) {
            this.f24101x = view;
            view.setVisibility(8);
        }
    }

    public void setStartMaxVol(float f) {
        if (f >= gl.Code) {
            float f10 = 1.0f;
            if (f <= 1.0f) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                ex.V("SmartScreenSplashView", "music max %s, current %s， maxVol： %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
                float f11 = streamVolume;
                float f12 = streamMaxVolume * 1.0f * f;
                if (f11 * 1.0f >= f12) {
                    f10 = Float.valueOf(f12 / f11).floatValue();
                }
                if (ex.Code()) {
                    ex.Code("SmartScreenSplashView", "maxVol end: %s", Float.valueOf(f10));
                }
                this.C = f10;
                return;
            }
        }
        ex.I("SmartScreenSplashView", "valid max vol is from 0.0 to 1.0");
    }

    @Override // com.huawei.hms.ads.ka
    public final void Code(int i10) {
        fo Code = fp.Code(i10, this);
        this.f24099v = Code;
        Code.Code(this.f24098u);
        this.f24099v.Code((ga.a) null);
        this.f24099v.Code(this.f24096s);
        this.f24099v.V(0L);
        this.f24099v.l();
    }

    @Override // com.huawei.hms.ads.ka
    public final void V() {
        SloganView sloganView = this.f24100w;
        if (sloganView != null) {
            sloganView.setVisibility(8);
        }
        View view = this.f24101x;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.huawei.hms.ads.ka
    public final void Code(int i10, int i11, String str, boolean z10, Integer num) {
    }

    @Override // com.huawei.hms.ads.ka
    public final void Code(int i10, boolean z10) {
    }

    @Override // com.huawei.hms.ads.ka
    public final void Code(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // com.huawei.hms.ads.ka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Code(com.huawei.hms.ads.kc r5, java.lang.Integer r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.getContext()
            int r0 = gb.u.f28631a
            boolean r0 = r6 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L1c
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L1c
            boolean r6 = r6.isDestroyed()
            if (r6 == 0) goto L1a
            goto L1c
        L1a:
            r6 = r1
            goto L1d
        L1c:
            r6 = 1
        L1d:
            java.lang.String r0 = "SmartScreenSplashView"
            if (r6 == 0) goto L27
            java.lang.String r5 = "showAdView - activity finished, not add view"
            com.huawei.hms.ads.ex.I(r0, r5)
            return
        L27:
            if (r5 == 0) goto L81
            boolean r6 = r5 instanceof android.view.View
            if (r6 != 0) goto L2e
            goto L81
        L2e:
            r6 = r5
            android.view.View r6 = (android.view.View) r6
            r4.f24102z = r5
            int r2 = r4.A
            r5.setAudioFocusType(r2)
            com.huawei.hms.ads.kc r5 = r4.f24102z
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.media.VOLUME_CHANGED_ACTION"
            r2.addAction(r3)
            com.huawei.openalliance.ad.views.SmartScreenSplashView$a r3 = r4.B
            if (r3 != 0) goto L4f
            com.huawei.openalliance.ad.views.SmartScreenSplashView$a r3 = new com.huawei.openalliance.ad.views.SmartScreenSplashView$a
            r3.<init>(r5)
            r4.B = r3
        L4f:
            android.content.Context r5 = r4.getContext()
            com.huawei.openalliance.ad.views.SmartScreenSplashView$a r3 = r4.B
            r5.registerReceiver(r3, r2)
            android.view.ViewParent r5 = r6.getParent()
            if (r5 != 0) goto L62
            r6.setVisibility(r1)
            return
        L62:
            boolean r1 = r5 instanceof android.view.ViewGroup
            if (r1 != 0) goto L67
            return
        L67:
            java.lang.String r1 = "showAdView, remove adView."
            com.huawei.hms.ads.ex.V(r0, r1)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeView(r6)
            r5 = 0
            r4.setVisibleAndBringToFont(r5)
            android.view.View r6 = r4.y
            r4.setVisibleAndBringToFont(r6)
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r0 = -1
            r6.<init>(r0, r0)
            throw r5
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.SmartScreenSplashView.Code(com.huawei.hms.ads.kc, java.lang.Integer):void");
    }

    @Override // com.huawei.hms.ads.ka
    public final void Code(ko koVar) {
        View view = this.f24101x;
        if (view != null) {
            view.setVisibility(0);
            new id(null, koVar).V();
            return;
        }
        SloganView sloganView = this.f24100w;
        if (sloganView == null) {
            ex.V("SmartScreenSplashView", "create default slogan");
            setSloganResId(R.drawable.hiad_default_slogan);
            sloganView = this.f24100w;
            if (sloganView == null) {
                return;
            }
        }
        sloganView.setSloganShowListener(koVar);
        this.f24100w.a();
    }

    @Override // com.huawei.hms.ads.ka
    public final void Code(AdContentData adContentData, int i10) {
        ex.Code("SmartScreenSplashView", "showLabelView and logo.");
    }

    @Override // com.huawei.hms.ads.gk
    public View getOpenMeasureView() {
        return this;
    }
}
