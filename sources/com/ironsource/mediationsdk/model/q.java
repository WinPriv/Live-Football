package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static q f25717b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<NetworkSettings> f25718a = new ArrayList<>();

    private q() {
    }

    public final NetworkSettings a(String str) {
        Iterator<NetworkSettings> it = this.f25718a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        a(networkSettings);
        return networkSettings;
    }

    public final void b() {
        Iterator<NetworkSettings> it = this.f25718a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a10 = a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a10.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a10.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a10.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a10.getBannerSettings()));
            }
        }
    }

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            if (f25717b == null) {
                f25717b = new q();
            }
            qVar = f25717b;
        }
        return qVar;
    }

    public final boolean b(String str) {
        Iterator<NetworkSettings> it = this.f25718a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(NetworkSettings networkSettings) {
        this.f25718a.add(networkSettings);
    }
}
