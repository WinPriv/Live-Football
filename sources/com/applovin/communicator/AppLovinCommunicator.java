package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.communicator.a;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: a, reason: collision with root package name */
    private static AppLovinCommunicator f12890a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12891b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private p f12892c;

    /* renamed from: d, reason: collision with root package name */
    private y f12893d;

    /* renamed from: e, reason: collision with root package name */
    private final a f12894e;
    private final MessagingServiceImpl f;

    private AppLovinCommunicator(Context context) {
        this.f12894e = new a(context);
        this.f = new MessagingServiceImpl(context);
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f12891b) {
            if (f12890a == null) {
                f12890a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f12890a;
    }

    public void a(p pVar) {
        this.f12892c = pVar;
        this.f12893d = pVar.L();
        a("Attached SDK instance: " + pVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f;
    }

    public boolean hasSubscriber(String str) {
        return this.f12894e.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f12892c.ab().c(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f12892c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (!this.f12894e.a(appLovinCommunicatorSubscriber, str)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f12894e.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f12893d == null || !y.a()) {
            return;
        }
        this.f12893d.b("AppLovinCommunicator", str);
    }
}
