package n5;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* compiled from: EventStream.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final EventMessage[] f33382a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f33383b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33384c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33385d;

    public f(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.f33384c = str;
        this.f33385d = str2;
        this.f33383b = jArr;
        this.f33382a = eventMessageArr;
    }

    public final String a() {
        return this.f33384c + "/" + this.f33385d;
    }
}
