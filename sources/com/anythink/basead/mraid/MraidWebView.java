package com.anythink.basead.mraid;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.mbbanner.view.ATBannerWebView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MraidWebView extends ATBannerWebView {
    public static String TAG = "MraidWebView";

    /* renamed from: a, reason: collision with root package name */
    b f4043a;

    /* renamed from: b, reason: collision with root package name */
    boolean f4044b;

    /* renamed from: c, reason: collision with root package name */
    MraidVolumeChangeReceiver f4045c;

    /* renamed from: d, reason: collision with root package name */
    boolean f4046d;

    /* renamed from: com.anythink.basead.mraid.MraidWebView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements MraidVolumeChangeReceiver.VolumeChangeListener {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver.VolumeChangeListener
        public final void onVolumeChanged(double d10) {
            o.d(MraidWebView.TAG, "volume is : ".concat(String.valueOf(d10)));
            try {
                CallMraidJS.getInstance().fireAudioVolumeChange(MraidWebView.this, d10);
            } catch (Exception e10) {
                o.d(MraidWebView.TAG, e10.getMessage());
            }
        }
    }

    public MraidWebView(Context context) {
        super(context);
        this.f4044b = false;
    }

    private void b() {
        Object object = getObject();
        com.anythink.expressad.atsignalcommon.base.b baseWebViewClient = getBaseWebViewClient();
        if (object instanceof a) {
            Context context = getContext();
            if (context instanceof Activity) {
                ((a) object).f4050b = new WeakReference<>((Activity) context);
            }
            ((a) object).a(this.f4043a);
        }
        if (baseWebViewClient instanceof e) {
            ((e) baseWebViewClient).f4073c = this.f4043a;
        }
    }

    private void c() {
        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
        this.f4045c = mraidVolumeChangeReceiver;
        mraidVolumeChangeReceiver.registerReceiver();
        this.f4045c.getCurrentVolume();
        this.f4045c.setVolumeChangeListener(new AnonymousClass2());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r0.contains(com.anythink.core.common.res.d.a(com.anythink.core.common.b.n.a().g()).a()) != false) goto L14;
     */
    @Override // com.anythink.expressad.atsignalcommon.base.BaseWebView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L3f
            java.lang.String r0 = "../"
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 == 0) goto L12
        L10:
            r1 = r2
            goto L3f
        L12:
            java.lang.String r0 = "file"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L3f
            android.net.Uri r0 = android.net.Uri.parse(r5)
            java.lang.String r0 = r0.getPath()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L10
            com.anythink.core.common.b.n r3 = com.anythink.core.common.b.n.a()
            android.content.Context r3 = r3.g()
            com.anythink.core.common.res.d r3 = com.anythink.core.common.res.d.a(r3)
            java.lang.String r3 = r3.a()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L3f
            goto L10
        L3f:
            if (r1 == 0) goto L52
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "illegal URL: "
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = "anythink_express"
            android.util.Log.e(r0, r5)
            java.lang.String r5 = "about:blank"
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.mraid.MraidWebView.a(java.lang.String):java.lang.String");
    }

    public void prepare(Context context, b bVar) {
        this.f4043a = bVar;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.basead.mraid.MraidWebView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                try {
                    MraidWebView mraidWebView = MraidWebView.this;
                    if (!mraidWebView.f4044b) {
                        mraidWebView.getViewTreeObserver().removeOnPreDrawListener(this);
                        MraidWebView mraidWebView2 = MraidWebView.this;
                        mraidWebView2.f4044b = true;
                        int[] iArr = new int[2];
                        mraidWebView2.getLocationInWindow(iArr);
                        com.anythink.expressad.mbbanner.a.a.a.a(MraidWebView.this, iArr[0], iArr[1]);
                        MraidWebView mraidWebView3 = MraidWebView.this;
                        com.anythink.expressad.mbbanner.a.a.a.a(mraidWebView3, iArr[0], iArr[1], mraidWebView3.getWidth(), MraidWebView.this.getHeight());
                        MraidWebView.a(MraidWebView.this);
                        MraidWebView mraidWebView4 = MraidWebView.this;
                        if (mraidWebView4.f4046d) {
                            MraidWebView.b(mraidWebView4);
                        }
                        b bVar2 = MraidWebView.this.f4043a;
                        if (bVar2 != null) {
                            bVar2.a();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return false;
            }
        });
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView
    public void release() {
        super.release();
        setWebViewListener(null);
        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = this.f4045c;
        if (mraidVolumeChangeReceiver != null) {
            mraidVolumeChangeReceiver.unregisterReceiver();
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z10) {
        this.f4046d = z10;
    }

    public MraidWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4044b = false;
    }

    public MraidWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4044b = false;
    }

    public static /* synthetic */ void a(MraidWebView mraidWebView) {
        Object object = mraidWebView.getObject();
        com.anythink.expressad.atsignalcommon.base.b baseWebViewClient = mraidWebView.getBaseWebViewClient();
        if (object instanceof a) {
            Context context = mraidWebView.getContext();
            if (context instanceof Activity) {
                ((a) object).f4050b = new WeakReference<>((Activity) context);
            }
            ((a) object).a(mraidWebView.f4043a);
        }
        if (baseWebViewClient instanceof e) {
            ((e) baseWebViewClient).f4073c = mraidWebView.f4043a;
        }
    }

    public static /* synthetic */ void b(MraidWebView mraidWebView) {
        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(mraidWebView.getContext());
        mraidWebView.f4045c = mraidVolumeChangeReceiver;
        mraidVolumeChangeReceiver.registerReceiver();
        mraidWebView.f4045c.getCurrentVolume();
        mraidWebView.f4045c.setVolumeChangeListener(new AnonymousClass2());
    }
}
