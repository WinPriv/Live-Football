package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.g;

/* loaded from: classes.dex */
public class ak extends Exception implements g {

    /* renamed from: k, reason: collision with root package name */
    public static final g.a<ak> f13188k = new k0(2);

    /* renamed from: i, reason: collision with root package name */
    public final int f13189i;

    /* renamed from: j, reason: collision with root package name */
    public final long f13190j;

    public ak(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    private static Throwable a(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(a(3));
        String string2 = bundle.getString(a(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, ak.class.getClassLoader());
            Throwable a10 = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (a10 != null) {
                return a10;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    public ak(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f13189i = i10;
        this.f13190j = j10;
    }
}
