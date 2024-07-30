package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14204a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<C0165a> f14205b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final f f14206c = new f();

    /* renamed from: d, reason: collision with root package name */
    private b f14207d;

    /* renamed from: e, reason: collision with root package name */
    private int f14208e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private long f14209g;

    /* renamed from: com.applovin.exoplayer2.e.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0165a {

        /* renamed from: a, reason: collision with root package name */
        private final int f14210a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14211b;

        private C0165a(int i10, long j10) {
            this.f14210a = i10;
            this.f14211b = j10;
        }
    }

    private long b(i iVar) throws IOException {
        iVar.a();
        while (true) {
            iVar.d(this.f14204a, 0, 4);
            int a10 = f.a(this.f14204a[0]);
            if (a10 != -1 && a10 <= 4) {
                int a11 = (int) f.a(this.f14204a, a10, false);
                if (this.f14207d.b(a11)) {
                    iVar.b(a10);
                    return a11;
                }
            }
            iVar.b(1);
        }
    }

    private static String c(i iVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        iVar.b(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public void a(b bVar) {
        this.f14207d = bVar;
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public void a() {
        this.f14208e = 0;
        this.f14205b.clear();
        this.f14206c.a();
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public boolean a(i iVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f14207d);
        while (true) {
            C0165a peek = this.f14205b.peek();
            if (peek != null && iVar.c() >= peek.f14211b) {
                this.f14207d.c(this.f14205b.pop().f14210a);
                return true;
            }
            if (this.f14208e == 0) {
                long a10 = this.f14206c.a(iVar, true, false, 4);
                if (a10 == -2) {
                    a10 = b(iVar);
                }
                if (a10 == -1) {
                    return false;
                }
                this.f = (int) a10;
                this.f14208e = 1;
            }
            if (this.f14208e == 1) {
                this.f14209g = this.f14206c.a(iVar, false, true, 8);
                this.f14208e = 2;
            }
            int a11 = this.f14207d.a(this.f);
            if (a11 != 0) {
                if (a11 == 1) {
                    long c10 = iVar.c();
                    this.f14205b.push(new C0165a(this.f, this.f14209g + c10));
                    this.f14207d.a(this.f, c10, this.f14209g);
                    this.f14208e = 0;
                    return true;
                }
                if (a11 == 2) {
                    long j10 = this.f14209g;
                    if (j10 <= 8) {
                        this.f14207d.a(this.f, a(iVar, (int) j10));
                        this.f14208e = 0;
                        return true;
                    }
                    throw ai.b("Invalid integer size: " + this.f14209g, null);
                }
                if (a11 == 3) {
                    long j11 = this.f14209g;
                    if (j11 <= 2147483647L) {
                        this.f14207d.a(this.f, c(iVar, (int) j11));
                        this.f14208e = 0;
                        return true;
                    }
                    throw ai.b("String element size: " + this.f14209g, null);
                }
                if (a11 == 4) {
                    this.f14207d.a(this.f, (int) this.f14209g, iVar);
                    this.f14208e = 0;
                    return true;
                }
                if (a11 == 5) {
                    long j12 = this.f14209g;
                    if (j12 != 4 && j12 != 8) {
                        throw ai.b("Invalid float size: " + this.f14209g, null);
                    }
                    this.f14207d.a(this.f, b(iVar, (int) j12));
                    this.f14208e = 0;
                    return true;
                }
                throw ai.b("Invalid element type " + a11, null);
            }
            iVar.b((int) this.f14209g);
            this.f14208e = 0;
        }
    }

    private double b(i iVar, int i10) throws IOException {
        long a10 = a(iVar, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) a10);
        }
        return Double.longBitsToDouble(a10);
    }

    private long a(i iVar, int i10) throws IOException {
        iVar.b(this.f14204a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f14204a[i11] & DefaultClassResolver.NAME);
        }
        return j10;
    }
}
