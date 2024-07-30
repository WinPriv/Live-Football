package okio;

import java.io.IOException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.java */
/* loaded from: classes2.dex */
public final class l implements z {

    /* renamed from: s, reason: collision with root package name */
    public final d f33852s;

    /* renamed from: t, reason: collision with root package name */
    public final Inflater f33853t;

    /* renamed from: u, reason: collision with root package name */
    public int f33854u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33855v;

    public l(u uVar, Inflater inflater) {
        this.f33852s = uVar;
        this.f33853t = inflater;
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f33855v) {
            return;
        }
        this.f33853t.end();
        this.f33855v = true;
        this.f33852s.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: DataFormatException -> 0x00ae, TryCatch #0 {DataFormatException -> 0x00ae, blocks: (B:19:0x004d, B:43:0x0065, B:21:0x0071, B:23:0x0077, B:28:0x0081, B:29:0x0088, B:32:0x0089, B:35:0x009c, B:37:0x00a2, B:40:0x008e), top: B:18:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065 A[SYNTHETIC] */
    @Override // okio.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(okio.b r8, long r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.l.read(okio.b, long):long");
    }

    @Override // okio.z
    public final a0 timeout() {
        return this.f33852s.timeout();
    }
}
