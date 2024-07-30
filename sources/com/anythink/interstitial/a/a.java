package com.anythink.interstitial.a;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.BaseAdActivity;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.n;
import com.anythink.core.common.h;
import com.anythink.core.common.k.g;
import com.anythink.core.common.k.s;
import com.anythink.core.common.res.b;
import com.anythink.core.common.v;
import com.anythink.expressad.foundation.h.i;
import com.anythink.interstitial.api.ATInterstitialAutoLoadListener;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a extends com.anythink.core.common.f<e> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12536a = "a";

    /* renamed from: n, reason: collision with root package name */
    Runnable f12537n;
    private View o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicBoolean f12538p;

    /* renamed from: com.anythink.interstitial.a.a$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements View.OnTouchListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.anythink.interstitial.a.a$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f12551a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12552b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12553c;

        public AnonymousClass3(WeakReference weakReference, String str, int i10) {
            this.f12551a = weakReference;
            this.f12552b = str;
            this.f12553c = i10;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            Log.e(a.f12536a, "load: image load fail:".concat(String.valueOf(str2)));
            ImageView imageView = (ImageView) this.f12551a.get();
            if (TextUtils.equals(this.f12552b, str) && imageView != null) {
                imageView.setImageResource(this.f12553c);
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            ImageView imageView = (ImageView) this.f12551a.get();
            if (TextUtils.equals(this.f12552b, str) && imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.interstitial.a.a$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements b.InterfaceC0061b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f12556a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12557b;

        public AnonymousClass5(d dVar, String str) {
            this.f12556a = dVar;
            this.f12557b = str;
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a(boolean z10) {
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void b() {
            d dVar = this.f12556a;
            if (dVar != null) {
                dVar.onInterstitialAdVideoStart();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void c() {
            d dVar = this.f12556a;
            if (dVar != null) {
                dVar.onInterstitialAdVideoEnd();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void e() {
            com.anythink.basead.e.b.a().b(this.f12557b);
            d dVar = this.f12556a;
            if (dVar != null) {
                dVar.onInterstitialAdClose();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a() {
            d dVar = this.f12556a;
            if (dVar != null) {
                dVar.onInterstitialAdShow();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a(com.anythink.basead.c.e eVar) {
            d dVar = this.f12556a;
            if (dVar != null) {
                dVar.onInterstitialAdVideoError(eVar.a(), eVar.b());
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void a(int i10) {
            d dVar = this.f12556a;
            if (dVar != null) {
                dVar.onInterstitialAdClicked();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0061b
        public final void d() {
        }
    }

    private a(Context context, String str) {
        super(context, str);
        this.f12538p = new AtomicBoolean(false);
        this.f12537n = new Runnable() { // from class: com.anythink.interstitial.a.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (!a.this.j()) {
                    return;
                }
                a.this.a(n.a().E(), 4, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null, (Map<String, Object>) null);
            }
        };
    }

    private void p() {
        n.a().a(this.f12537n, ((long) Math.pow(2.0d, this.f5769h)) * 1000);
    }

    @Override // com.anythink.core.common.f
    public final String a() {
        return "3";
    }

    @Override // com.anythink.core.common.f
    public final boolean j() {
        return v.a().f(this.f5765c);
    }

    @Override // com.anythink.core.common.f
    public final void k() {
        n.a().c(this.f12537n);
    }

    @Override // com.anythink.core.common.f
    public final void l() {
        ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener;
        super.l();
        if (j() && (aTInterstitialAutoLoadListener = b.a().f12561b) != null) {
            aTInterstitialAutoLoadListener.onInterstitialAutoLoaded(this.f5765c);
        }
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(e eVar) {
        e eVar2 = eVar;
        f fVar = new f(eVar2.a());
        fVar.a(eVar2.f6023d);
        return fVar;
    }

    @Override // com.anythink.core.common.f
    public final void b(AdError adError) {
        super.b(adError);
        if (j()) {
            n.a().a(this.f12537n, ((long) Math.pow(2.0d, this.f5769h)) * 1000);
            ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener = b.a().f12561b;
            if (aTInterstitialAutoLoadListener != null) {
                aTInterstitialAutoLoadListener.onInterstitialAutoLoadFail(this.f5765c, adError);
            }
        }
    }

    public static a a(Context context, String str) {
        com.anythink.core.common.f b10 = v.a().b(str);
        if (b10 == null || !(b10 instanceof a)) {
            b10 = new a(context, str);
            v.a().a(str, b10);
        }
        return (a) b10;
    }

    public final synchronized void a(final Activity activity, final String str, final ATInterstitialListener aTInterstitialListener, final ATEventInterface aTEventInterface, final Map<String, Object> map) {
        if (this.f12538p.get()) {
            return;
        }
        final com.anythink.core.common.e.b a10 = a((Context) activity, false, true, map);
        if (a10 == null || !(a10.e() instanceof CustomInterstitialAdapter)) {
            if (a((ATAdStatusInfo) null)) {
                a(n.a().E(), 7, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null, map);
            }
            return;
        }
        a(a10);
        f();
        a10.a(a10.d() + 1);
        final int ae = a10.e().getUnitGroupInfo().ae();
        if (ae > 0) {
            this.f12538p.set(true);
        }
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.interstitial.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                final CustomInterstitialAdapter customInterstitialAdapter = (CustomInterstitialAdapter) a10.e();
                Activity activity2 = activity;
                if (activity2 != null) {
                    customInterstitialAdapter.refreshActivityContext(activity2);
                }
                final com.anythink.core.common.e.e trackingInfo = a10.e().getTrackingInfo();
                long currentTimeMillis = System.currentTimeMillis();
                if (trackingInfo != null) {
                    trackingInfo.f5600v = ((com.anythink.core.common.f) a.this).f5768g;
                    trackingInfo.C = str;
                    trackingInfo.h(g.a(trackingInfo.X(), trackingInfo.x(), currentTimeMillis));
                    s.a(((com.anythink.core.common.f) a.this).f5764b, trackingInfo);
                    s.a((Map<String, Object>) map, trackingInfo);
                }
                com.anythink.core.common.a.a().a(((com.anythink.core.common.f) a.this).f5764b, a10);
                com.anythink.core.common.j.a.a(((com.anythink.core.common.f) a.this).f5764b).a(13, trackingInfo, a10.e().getUnitGroupInfo(), currentTimeMillis);
                if (ae > 0) {
                    n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.a(a.this, activity);
                        }
                    });
                }
                n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.a.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        customInterstitialAdapter.setScenario(str);
                        IExHandler b10 = n.a().b();
                        if (b10 != null) {
                            CustomInterstitialAdapter customInterstitialAdapter2 = customInterstitialAdapter;
                            customInterstitialAdapter2.setAdDownloadListener(b10.createDownloadListener(customInterstitialAdapter2, null, aTEventInterface));
                        }
                        if (customInterstitialAdapter.getMixedFormatAdType() == 0) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.a(a.this, activity, new d(customInterstitialAdapter, aTInterstitialListener), a10.f(), trackingInfo, str);
                        } else {
                            CustomInterstitialAdapter customInterstitialAdapter3 = customInterstitialAdapter;
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            customInterstitialAdapter3.internalShow(activity, new d(customInterstitialAdapter3, aTInterstitialListener));
                        }
                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                        if (ae > 0 && a.this.f12538p.get()) {
                            if (a.this.o != null) {
                                ((ViewGroup) a.this.o.getParent()).removeView(a.this.o);
                            }
                            a.this.f12538p.set(false);
                        }
                    }
                }, ae);
            }
        });
    }

    private void a(Activity activity) {
        if (activity == null) {
            return;
        }
        com.anythink.core.c.a h10 = l.h(com.anythink.core.c.b.a(this.f5764b));
        String n10 = h10.n();
        String m10 = h10.m();
        if (this.o == null) {
            this.o = LayoutInflater.from(activity.getApplicationContext()).inflate(com.anythink.core.common.k.h.a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
        }
        this.o.setOnTouchListener(new AnonymousClass2());
        ImageView imageView = (ImageView) this.o.findViewById(com.anythink.core.common.k.h.a(activity, "interstitial_iv_loading", "id"));
        TextView textView = (TextView) this.o.findViewById(com.anythink.core.common.k.h.a(activity, "interstitial_tv_loading", "id"));
        int a10 = com.anythink.core.common.k.h.a(activity, 30.0f);
        imageView.setMinimumWidth(a10);
        imageView.setMinimumHeight(a10);
        int a11 = com.anythink.core.common.k.h.a(activity, 90.0f);
        imageView.setMaxWidth(a11);
        imageView.setMaxHeight(a11);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int a12 = com.anythink.core.common.k.h.a(activity, "interstitial_loading_default", i.f10125c);
        if (TextUtils.isEmpty(n10)) {
            imageView.setImageResource(a12);
        } else {
            com.anythink.core.common.res.b.a(activity.getApplicationContext()).a(new com.anythink.core.common.res.e(3, n10), new AnonymousClass3(new WeakReference(imageView), n10, a12));
        }
        if (!TextUtils.isEmpty(m10)) {
            textView.setText(m10);
        } else {
            textView.setText(com.anythink.core.common.k.h.a(activity, "interstitial_text_loading_default", i.f10128g));
        }
        View view = this.o;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.o.getParent()).removeView(this.o);
        }
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.o, new FrameLayout.LayoutParams(-1, -1));
    }

    private static void m() {
    }

    private static void n() {
    }

    private static void o() {
    }

    public final void a(Context context, int i10, com.anythink.core.common.b.a aVar, com.anythink.core.common.b.b bVar, Map<String, Object> map) {
        e eVar = new e();
        eVar.a(context);
        eVar.f6023d = i10;
        eVar.f6024e = bVar;
        eVar.f6025g = map;
        super.a(this.f5764b, "3", this.f5765c, (String) eVar, aVar);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static h a2(e eVar) {
        f fVar = new f(eVar.a());
        fVar.a(eVar.f6023d);
        return fVar;
    }

    @Override // com.anythink.core.common.f
    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        ATAdStatusInfo a10 = super.a(context, map);
        if (!c() && a(a10)) {
            a(context, 5, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null, map);
        }
        return a10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Activity activity, d dVar, BaseAd baseAd, com.anythink.core.common.e.e eVar, String str) {
        if (baseAd != 0 && (baseAd instanceof com.anythink.core.common.e.a.e)) {
            com.anythink.core.common.e.a.b bVar = new com.anythink.core.common.e.a.b((com.anythink.core.common.e.a.e) baseAd);
            com.anythink.core.common.e.a.c cVar = new com.anythink.core.common.e.a.c((com.anythink.core.common.e.a.a) baseAd, eVar, Integer.parseInt("3"));
            String a10 = com.anythink.core.common.f.a(cVar);
            com.anythink.basead.e.b.a().a(a10, new AnonymousClass5(dVar, a10));
            com.anythink.basead.d.i.a().a(a10, baseAd);
            com.anythink.core.basead.b.a aVar = new com.anythink.core.basead.b.a();
            aVar.f4692c = bVar;
            aVar.f4693d = a10;
            aVar.f4690a = 3;
            aVar.f4696h = cVar;
            aVar.f4694e = com.anythink.core.common.k.d.g(activity);
            aVar.f4691b = str;
            BaseAdActivity.a(activity, aVar);
            return;
        }
        Log.e("anythink", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject");
        if (dVar != null) {
            dVar.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail,AdCache return illegal type adObject");
        }
    }

    public static /* synthetic */ void a(a aVar, Activity activity) {
        if (activity != null) {
            com.anythink.core.c.a h10 = l.h(com.anythink.core.c.b.a(aVar.f5764b));
            String n10 = h10.n();
            String m10 = h10.m();
            if (aVar.o == null) {
                aVar.o = LayoutInflater.from(activity.getApplicationContext()).inflate(com.anythink.core.common.k.h.a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
            }
            aVar.o.setOnTouchListener(new AnonymousClass2());
            ImageView imageView = (ImageView) aVar.o.findViewById(com.anythink.core.common.k.h.a(activity, "interstitial_iv_loading", "id"));
            TextView textView = (TextView) aVar.o.findViewById(com.anythink.core.common.k.h.a(activity, "interstitial_tv_loading", "id"));
            int a10 = com.anythink.core.common.k.h.a(activity, 30.0f);
            imageView.setMinimumWidth(a10);
            imageView.setMinimumHeight(a10);
            int a11 = com.anythink.core.common.k.h.a(activity, 90.0f);
            imageView.setMaxWidth(a11);
            imageView.setMaxHeight(a11);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int a12 = com.anythink.core.common.k.h.a(activity, "interstitial_loading_default", i.f10125c);
            if (TextUtils.isEmpty(n10)) {
                imageView.setImageResource(a12);
            } else {
                com.anythink.core.common.res.b.a(activity.getApplicationContext()).a(new com.anythink.core.common.res.e(3, n10), new AnonymousClass3(new WeakReference(imageView), n10, a12));
            }
            if (!TextUtils.isEmpty(m10)) {
                textView.setText(m10);
            } else {
                textView.setText(com.anythink.core.common.k.h.a(activity, "interstitial_text_loading_default", i.f10128g));
            }
            View view = aVar.o;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) aVar.o.getParent()).removeView(aVar.o);
            }
            ((ViewGroup) activity.getWindow().getDecorView()).addView(aVar.o, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(a aVar, Activity activity, d dVar, BaseAd baseAd, com.anythink.core.common.e.e eVar, String str) {
        if (baseAd != 0 && (baseAd instanceof com.anythink.core.common.e.a.e)) {
            com.anythink.core.common.e.a.b bVar = new com.anythink.core.common.e.a.b((com.anythink.core.common.e.a.e) baseAd);
            com.anythink.core.common.e.a.c cVar = new com.anythink.core.common.e.a.c((com.anythink.core.common.e.a.a) baseAd, eVar, Integer.parseInt("3"));
            String a10 = com.anythink.core.common.f.a(cVar);
            com.anythink.basead.e.b.a().a(a10, new AnonymousClass5(dVar, a10));
            com.anythink.basead.d.i.a().a(a10, baseAd);
            com.anythink.core.basead.b.a aVar2 = new com.anythink.core.basead.b.a();
            aVar2.f4692c = bVar;
            aVar2.f4693d = a10;
            aVar2.f4690a = 3;
            aVar2.f4696h = cVar;
            aVar2.f4694e = com.anythink.core.common.k.d.g(activity);
            aVar2.f4691b = str;
            BaseAdActivity.a(activity, aVar2);
            return;
        }
        Log.e("anythink", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject");
        dVar.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail,AdCache return illegal type adObject");
    }
}
