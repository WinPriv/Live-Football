package com.anythink.core.common.b;

import android.util.Log;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.AdError;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<ATAdSourceStatusListener> f4952a;

    public final void a(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (aTAdSourceStatusListener == null) {
            return;
        }
        this.f4952a = new WeakReference<>(aTAdSourceStatusListener);
    }

    public final void b(com.anythink.core.common.e.e eVar) {
        final j a10 = j.a(eVar, (d) null);
        n.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.2
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a11 = b.a(b.this);
                if (a11 != null) {
                    a11.onAdSourceBiddingFilled(a10);
                }
            }
        });
    }

    public final void c(com.anythink.core.common.e.e eVar) {
        final j a10 = j.a(eVar, (d) null);
        n.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a11 = b.a(b.this);
                if (a11 != null) {
                    a11.onAdSourceAttempt(a10);
                }
            }
        });
    }

    public final void d(com.anythink.core.common.e.e eVar) {
        final j a10 = j.a(eVar, (d) null);
        n.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.5
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a11 = b.a(b.this);
                if (a11 != null) {
                    a11.onAdSourceLoadFilled(a10);
                }
            }
        });
    }

    private ATAdSourceStatusListener a() {
        WeakReference<ATAdSourceStatusListener> weakReference = this.f4952a;
        if (weakReference == null) {
            return null;
        }
        ATAdSourceStatusListener aTAdSourceStatusListener = weakReference.get();
        if (aTAdSourceStatusListener == null) {
            Log.e("anythink", "ATAdSourceStatusListener had been released.");
        }
        return aTAdSourceStatusListener;
    }

    public final void b(com.anythink.core.common.e.e eVar, final AdError adError) {
        final j a10 = j.a(eVar, (d) null);
        n.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.6
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a11 = b.a(b.this);
                if (a11 != null) {
                    a11.onAdSourceLoadFail(a10, adError);
                }
            }
        });
    }

    public final void a(com.anythink.core.common.e.e eVar) {
        final j a10 = j.a(eVar, (d) null);
        n.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a11 = b.a(b.this);
                if (a11 != null) {
                    a11.onAdSourceBiddingAttempt(a10);
                }
            }
        });
    }

    public final void a(com.anythink.core.common.e.e eVar, final AdError adError) {
        final j a10 = j.a(eVar, (d) null);
        n.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.3
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a11 = b.a(b.this);
                if (a11 != null) {
                    a11.onAdSourceBiddingFail(a10, adError);
                }
            }
        });
    }

    public static /* synthetic */ ATAdSourceStatusListener a(b bVar) {
        WeakReference<ATAdSourceStatusListener> weakReference = bVar.f4952a;
        if (weakReference == null) {
            return null;
        }
        ATAdSourceStatusListener aTAdSourceStatusListener = weakReference.get();
        if (aTAdSourceStatusListener == null) {
            Log.e("anythink", "ATAdSourceStatusListener had been released.");
        }
        return aTAdSourceStatusListener;
    }
}
