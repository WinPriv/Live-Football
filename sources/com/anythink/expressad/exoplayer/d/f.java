package com.anythink.expressad.exoplayer.d;

import android.annotation.TargetApi;
import com.anythink.expressad.exoplayer.d.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@TargetApi(16)
/* loaded from: classes.dex */
public interface f<T extends i> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7697d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7698e = 1;
    public static final int f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7699g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7700h = 4;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    int e();

    a f();

    T g();

    Map<String, String> h();

    byte[] i();
}
