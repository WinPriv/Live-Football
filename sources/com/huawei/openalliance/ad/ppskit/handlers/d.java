package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Network;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static d f22514h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f22515i = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22516a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public Network f22517b;

    /* renamed from: c, reason: collision with root package name */
    public App f22518c;

    /* renamed from: d, reason: collision with root package name */
    public Device f22519d;

    /* renamed from: e, reason: collision with root package name */
    public Pair<Integer, Pair<String, String>> f22520e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final l f22521g;

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        this.f22521g = l.d(applicationContext);
    }

    public static d a(Context context) {
        d dVar;
        synchronized (f22515i) {
            if (f22514h == null) {
                f22514h = new d(context);
            }
            dVar = f22514h;
        }
        return dVar;
    }
}
