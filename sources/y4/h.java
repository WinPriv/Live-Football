package y4;

import java.io.IOException;
import k4.i0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p4.j;
import p4.u;
import p4.w;
import y4.b;

/* compiled from: StreamReader.java */
/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public w f36682b;

    /* renamed from: c, reason: collision with root package name */
    public j f36683c;

    /* renamed from: d, reason: collision with root package name */
    public f f36684d;

    /* renamed from: e, reason: collision with root package name */
    public long f36685e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f36686g;

    /* renamed from: h, reason: collision with root package name */
    public int f36687h;

    /* renamed from: i, reason: collision with root package name */
    public int f36688i;

    /* renamed from: k, reason: collision with root package name */
    public long f36690k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f36691l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f36692m;

    /* renamed from: a, reason: collision with root package name */
    public final d f36681a = new d();

    /* renamed from: j, reason: collision with root package name */
    public a f36689j = new a();

    /* compiled from: StreamReader.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public i0 f36693a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f36694b;
    }

    public void a(long j10) {
        this.f36686g = j10;
    }

    public abstract long b(d6.w wVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean c(d6.w wVar, long j10, a aVar) throws IOException;

    public void d(boolean z10) {
        if (z10) {
            this.f36689j = new a();
            this.f = 0L;
            this.f36687h = 0;
        } else {
            this.f36687h = 1;
        }
        this.f36685e = -1L;
        this.f36686g = 0L;
    }

    /* compiled from: StreamReader.java */
    /* loaded from: classes2.dex */
    public static final class b implements f {
        @Override // y4.f
        public final long a(p4.e eVar) {
            return -1L;
        }

        @Override // y4.f
        public final u b() {
            return new u.b(com.anythink.expressad.exoplayer.b.f7291b);
        }

        @Override // y4.f
        public final void c(long j10) {
        }
    }
}
