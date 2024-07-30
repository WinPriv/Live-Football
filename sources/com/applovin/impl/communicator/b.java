package com.applovin.impl.communicator;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.y;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b, reason: collision with root package name */
    private final String f17478b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<AppLovinCommunicatorSubscriber> f17479c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f17477a = true;

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f17480d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f17481e = new Object();

    public b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f17478b = str;
        this.f17479c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    public String a() {
        return this.f17478b;
    }

    public AppLovinCommunicatorSubscriber b() {
        return this.f17479c.get();
    }

    public boolean c() {
        return this.f17477a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f17479c.get();
        b bVar = (b) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = bVar.f17479c.get();
        if (a().equals(bVar.a())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f17478b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f17479c.get();
        int i11 = hashCode * 31;
        if (appLovinCommunicatorSubscriber != null) {
            i10 = appLovinCommunicatorSubscriber.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        boolean z10;
        if (b() == null) {
            y.i("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f17481e) {
            if (!this.f17480d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f17480d.add(communicatorMessageImpl.getUniqueId());
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f17477a = z10;
    }
}
