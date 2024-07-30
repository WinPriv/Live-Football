package com.applovin.impl.communicator;

import android.content.Context;
import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17474a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f17475b = new HashSet(32);

    /* renamed from: c, reason: collision with root package name */
    private final Object f17476c = new Object();

    public a(Context context) {
        this.f17474a = context;
    }

    public boolean a(String str) {
        synchronized (this.f17476c) {
            Iterator<b> it = this.f17475b.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().a())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        b a10;
        if (!StringUtils.isValidString(str)) {
            return;
        }
        synchronized (this.f17476c) {
            a10 = a(str, appLovinCommunicatorSubscriber);
        }
        if (a10 != null) {
            a10.a(false);
            AppLovinBroadcastManager.unregisterReceiver(a10);
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f17476c) {
                b a10 = a(str, appLovinCommunicatorSubscriber);
                if (a10 != null) {
                    y.i("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!a10.c()) {
                        a10.a(true);
                        AppLovinBroadcastManager.registerReceiver(a10, new IntentFilter(str));
                    }
                    return true;
                }
                b bVar = new b(str, appLovinCommunicatorSubscriber);
                this.f17475b.add(bVar);
                AppLovinBroadcastManager.registerReceiver(bVar, new IntentFilter(str));
                return true;
            }
        }
        y.i("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private b a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (b bVar : this.f17475b) {
            if (str.equals(bVar.a()) && appLovinCommunicatorSubscriber.equals(bVar.b())) {
                return bVar;
            }
        }
        return null;
    }
}
