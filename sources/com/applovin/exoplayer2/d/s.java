package com.applovin.exoplayer2.d;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final com.applovin.exoplayer2.k.l f14056a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f14057b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f14058c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14059d;

    public s(com.applovin.exoplayer2.k.l lVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f14056a = lVar;
        this.f14057b = uri;
        this.f14058c = map;
        this.f14059d = j10;
    }
}
