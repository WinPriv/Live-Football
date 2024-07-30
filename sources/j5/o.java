package j5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f29817b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f29818a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(long j10, c6.m mVar, long j11) {
        this(Collections.emptyMap());
        Uri uri = mVar.f3377a;
    }

    public o(Map map) {
        this.f29818a = map;
    }
}
