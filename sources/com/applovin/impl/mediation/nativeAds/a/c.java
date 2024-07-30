package com.applovin.impl.mediation.nativeAds.a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<View, Integer> f18389a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final Object f18390b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f18391c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    private boolean f18392d = false;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<View> f18393e;
    private final ViewTreeObserver.OnPreDrawListener f;

    /* renamed from: g, reason: collision with root package name */
    private a f18394g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, int i11);
    }

    public c(View view) {
        this.f18393e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.mediation.nativeAds.a.c.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    c.this.b();
                    return true;
                }
            };
            this.f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f18392d) {
            return;
        }
        this.f18392d = true;
        this.f18391c.postDelayed(new Runnable() { // from class: com.applovin.impl.mediation.nativeAds.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this.f18390b) {
                    c.this.f18392d = false;
                    int i10 = -1;
                    int i11 = -1;
                    for (Map.Entry entry : c.this.f18389a.entrySet()) {
                        if (c.this.b((View) entry.getKey())) {
                            Integer num = (Integer) entry.getValue();
                            if (i10 == -1 && i11 == -1) {
                                i10 = num.intValue();
                                i11 = num.intValue();
                            } else {
                                i10 = Math.min(i10, ((Integer) entry.getValue()).intValue());
                                i11 = Math.max(i11, ((Integer) entry.getValue()).intValue());
                            }
                        }
                    }
                    if (c.this.f18394g != null) {
                        c.this.f18394g.a(i10, i11);
                    }
                }
            }
        }, 100L);
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f18394g = null;
        View view = this.f18393e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f18393e.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a(a aVar) {
        this.f18394g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f18390b) {
            this.f18389a.put(view, Integer.valueOf(i10));
            b();
        }
    }

    public void a(View view) {
        synchronized (this.f18390b) {
            this.f18389a.remove(view);
        }
    }
}
