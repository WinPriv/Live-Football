package o4;

import android.net.Uri;
import c6.m;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: MediaDrmCallbackException.java */
/* loaded from: classes2.dex */
public final class j extends IOException {

    /* renamed from: s, reason: collision with root package name */
    public final Map<String, List<String>> f33624s;

    public j(m mVar, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.f33624s = map;
    }
}
