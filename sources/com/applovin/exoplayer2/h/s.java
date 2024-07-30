package com.applovin.exoplayer2.h;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface s {

    /* loaded from: classes.dex */
    public interface a {
        s createProgressiveMediaExtractor();
    }

    int a(com.applovin.exoplayer2.e.u uVar) throws IOException;

    void a();

    void a(long j10, long j11);

    void a(com.applovin.exoplayer2.k.g gVar, Uri uri, Map<String, List<String>> map, long j10, long j11, com.applovin.exoplayer2.e.j jVar) throws IOException;

    void b();

    long c();
}
