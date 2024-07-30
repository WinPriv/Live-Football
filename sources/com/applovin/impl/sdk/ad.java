package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ad {

    /* renamed from: a, reason: collision with root package name */
    private final y f18543a;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f18547e;
    private final ViewTreeObserver.OnPreDrawListener f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<View> f18548g;

    /* renamed from: h, reason: collision with root package name */
    private final long f18549h;

    /* renamed from: k, reason: collision with root package name */
    private int f18552k;

    /* renamed from: l, reason: collision with root package name */
    private float f18553l;

    /* renamed from: m, reason: collision with root package name */
    private float f18554m;

    /* renamed from: n, reason: collision with root package name */
    private long f18555n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18544b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f18545c = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f18550i = new WeakReference<>(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<View> f18551j = new WeakReference<>(null);
    private long o = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f18546d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public ad(final View view, p pVar, a aVar) {
        this.f18543a = pVar.L();
        this.f18549h = ((Long) pVar.a(com.applovin.impl.sdk.c.b.ch)).longValue();
        this.f18548g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f18547e = new Runnable() { // from class: com.applovin.impl.sdk.ad.1
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup viewGroup;
                View view2 = (View) ad.this.f18548g.get();
                if (view2 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view2;
                } else {
                    viewGroup = null;
                }
                View view3 = (View) ad.this.f18551j.get();
                if (viewGroup != null && view3 != null) {
                    if (ad.this.b(viewGroup, view3)) {
                        y unused = ad.this.f18543a;
                        if (y.a()) {
                            ad.this.f18543a.b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                        }
                        ad.this.a();
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.onLogVisibilityImpression();
                            return;
                        }
                        return;
                    }
                    ad.this.b();
                }
            }
        };
        this.f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.ad.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ad.this.b();
                ad.this.b(view);
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f18546d.postDelayed(this.f18547e, this.f18549h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (!a(view, view2)) {
            return false;
        }
        if (this.o == Long.MIN_VALUE) {
            this.o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.o >= this.f18555n;
    }

    public void a(com.applovin.impl.mediation.a.e eVar) {
        View C;
        if (eVar instanceof com.applovin.impl.mediation.a.b) {
            C = eVar.q();
        } else if (!(eVar instanceof com.applovin.impl.mediation.a.d)) {
            return;
        } else {
            C = ((com.applovin.impl.mediation.a.d) eVar).C();
        }
        a(eVar.N(), eVar.O(), eVar.Q(), eVar.T(), C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        ViewTreeObserver viewTreeObserver = this.f18550i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f);
            } else if (y.a()) {
                this.f18543a.b("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (y.a()) {
            this.f18543a.b("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f18550i.clear();
    }

    public void a(int i10, float f, float f10, long j10, View view) {
        synchronized (this.f18544b) {
            if (y.a()) {
                this.f18543a.b("VisibilityTracker", "Tracking visibility for " + view);
            }
            a();
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.f18551j = weakReference;
            this.f18552k = i10;
            this.f18553l = f;
            this.f18554m = f10;
            this.f18555n = j10;
            a(weakReference.get());
        }
    }

    public void a() {
        synchronized (this.f18544b) {
            this.f18546d.removeMessages(0);
            b(this.f18548g.get());
            this.o = Long.MIN_VALUE;
            this.f18551j.clear();
        }
    }

    private void a(View view) {
        View rootView = Utils.getRootView(this.f18548g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView == null) {
            if (y.a()) {
                this.f18543a.b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            if (y.a()) {
                this.f18543a.d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else {
            this.f18550i = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f);
        }
    }

    private boolean a(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f18545c)) {
            return false;
        }
        long pxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f18545c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f18545c.width());
        if (pxToDp < this.f18552k) {
            return false;
        }
        if ((((float) pxToDp) / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f18553l) {
            return false;
        }
        return (((float) ((long) (this.f18545c.height() * this.f18545c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f18554m;
    }
}
