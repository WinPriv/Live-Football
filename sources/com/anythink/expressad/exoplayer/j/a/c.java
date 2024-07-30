package com.anythink.expressad.exoplayer.j.a;

import android.net.Uri;
import com.anythink.expressad.exoplayer.j.a.a;
import com.anythink.expressad.exoplayer.j.r;
import com.anythink.expressad.exoplayer.j.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class c implements com.anythink.expressad.exoplayer.j.h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8719a = 2097152;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8720b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8721c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8722d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8723e = 0;
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8724g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static final long f8725h = 102400;
    private boolean A;
    private long B;
    private long C;

    /* renamed from: i, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.a.a f8726i;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.h f8727j;

    /* renamed from: k, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.h f8728k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.h f8729l;

    /* renamed from: m, reason: collision with root package name */
    private final b f8730m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f8731n;
    private final boolean o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f8732p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.j.h f8733q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8734r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f8735s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f8736t;

    /* renamed from: u, reason: collision with root package name */
    private int f8737u;

    /* renamed from: v, reason: collision with root package name */
    private String f8738v;

    /* renamed from: w, reason: collision with root package name */
    private long f8739w;

    /* renamed from: x, reason: collision with root package name */
    private long f8740x;
    private e y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8741z;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.expressad.exoplayer.j.a.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0115c {
    }

    public c(com.anythink.expressad.exoplayer.j.a.a aVar, com.anythink.expressad.exoplayer.j.h hVar) {
        this(aVar, hVar, 0, (byte) 0);
    }

    private void c() {
        this.f8740x = 0L;
        if (g()) {
            this.f8726i.d(this.f8738v, this.f8739w);
        }
    }

    private boolean d() {
        if (!f()) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (this.f8733q == this.f8729l) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if (this.f8733q == this.f8727j) {
            return true;
        }
        return false;
    }

    private boolean g() {
        if (this.f8733q == this.f8728k) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h() {
        com.anythink.expressad.exoplayer.j.h hVar = this.f8733q;
        if (hVar == null) {
            return;
        }
        try {
            hVar.b();
        } finally {
            this.f8733q = null;
            this.f8734r = false;
            e eVar = this.y;
            if (eVar != null) {
                this.f8726i.a(eVar);
                this.y = null;
            }
        }
    }

    private void j() {
        if (this.f8730m != null && this.B > 0) {
            this.f8726i.c();
            this.B = 0L;
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(com.anythink.expressad.exoplayer.j.k kVar) {
        char c10;
        try {
            String a10 = f.a(kVar);
            this.f8738v = a10;
            Uri uri = kVar.f8815c;
            this.f8735s = uri;
            Uri uri2 = null;
            String a11 = this.f8726i.c(a10).a("exo_redir", (String) null);
            if (a11 != null) {
                uri2 = Uri.parse(a11);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f8736t = uri;
            this.f8737u = kVar.f8820i;
            this.f8739w = kVar.f;
            boolean z10 = true;
            if (this.o && this.f8741z) {
                c10 = 0;
            } else {
                c10 = (this.f8732p && kVar.f8818g == -1) ? (char) 1 : (char) 65535;
            }
            if (c10 == 65535) {
                z10 = false;
            }
            this.A = z10;
            long j10 = kVar.f8818g;
            if (j10 == -1 && !z10) {
                long b10 = this.f8726i.b(this.f8738v);
                this.f8740x = b10;
                if (b10 != -1) {
                    long j11 = b10 - kVar.f;
                    this.f8740x = j11;
                    if (j11 <= 0) {
                        throw new com.anythink.expressad.exoplayer.j.i();
                    }
                }
                a(false);
                return this.f8740x;
            }
            this.f8740x = j10;
            a(false);
            return this.f8740x;
        } catch (IOException e10) {
            b(e10);
            throw e10;
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        this.f8735s = null;
        this.f8736t = null;
        if (this.f8730m != null && this.B > 0) {
            this.f8726i.c();
            this.B = 0L;
        }
        try {
            h();
        } catch (IOException e10) {
            b(e10);
            throw e10;
        }
    }

    private c(com.anythink.expressad.exoplayer.j.a.a aVar, com.anythink.expressad.exoplayer.j.h hVar, int i10) {
        this(aVar, hVar, i10, (byte) 0);
    }

    private c(com.anythink.expressad.exoplayer.j.a.a aVar, com.anythink.expressad.exoplayer.j.h hVar, int i10, byte b10) {
        this(aVar, hVar, new r(), new com.anythink.expressad.exoplayer.j.a.b(aVar), i10, null);
    }

    private c(com.anythink.expressad.exoplayer.j.a.a aVar, com.anythink.expressad.exoplayer.j.h hVar, com.anythink.expressad.exoplayer.j.h hVar2, com.anythink.expressad.exoplayer.j.g gVar, int i10, b bVar) {
        this.f8726i = aVar;
        this.f8727j = hVar2;
        this.f8731n = (i10 & 1) != 0;
        this.o = (i10 & 2) != 0;
        this.f8732p = (i10 & 4) != 0;
        this.f8729l = hVar;
        this.f8728k = new z(hVar, gVar);
        this.f8730m = bVar;
    }

    private void b(IOException iOException) {
        if (f() || (iOException instanceof a.C0114a)) {
            this.f8741z = true;
        }
    }

    private int b(com.anythink.expressad.exoplayer.j.k kVar) {
        if (this.o && this.f8741z) {
            return 0;
        }
        return (this.f8732p && kVar.f8818g == -1) ? 1 : -1;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        boolean z10 = false;
        if (i11 == 0) {
            return 0;
        }
        if (this.f8740x == 0) {
            return -1;
        }
        try {
            if (this.f8739w >= this.C) {
                a(true);
            }
            int a10 = this.f8733q.a(bArr, i10, i11);
            if (a10 != -1) {
                if (f()) {
                    this.B += a10;
                }
                long j10 = a10;
                this.f8739w += j10;
                long j11 = this.f8740x;
                if (j11 != -1) {
                    this.f8740x = j11 - j10;
                }
            } else if (this.f8734r) {
                c();
            } else {
                long j12 = this.f8740x;
                if (j12 <= 0) {
                    if (j12 == -1) {
                    }
                }
                h();
                a(false);
                return a(bArr, i10, i11);
            }
            return a10;
        } catch (IOException e10) {
            if (this.f8734r) {
                Throwable th = e10;
                while (true) {
                    if (th != null) {
                        if ((th instanceof com.anythink.expressad.exoplayer.j.i) && ((com.anythink.expressad.exoplayer.j.i) th).f8807b == 0) {
                            z10 = true;
                            break;
                        }
                        th = th.getCause();
                    } else {
                        break;
                    }
                }
                if (z10) {
                    c();
                    return -1;
                }
            }
            b(e10);
            throw e10;
        }
    }

    private static void i() {
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        return this.f8736t;
    }

    private void a(boolean z10) {
        e a10;
        long j10;
        com.anythink.expressad.exoplayer.j.k kVar;
        com.anythink.expressad.exoplayer.j.h hVar;
        if (this.A) {
            a10 = null;
        } else if (this.f8731n) {
            try {
                a10 = this.f8726i.a(this.f8738v, this.f8739w);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            a10 = this.f8726i.b(this.f8738v, this.f8739w);
        }
        if (a10 == null) {
            hVar = this.f8729l;
            kVar = new com.anythink.expressad.exoplayer.j.k(this.f8735s, this.f8739w, this.f8740x, this.f8738v, this.f8737u);
        } else if (a10.f8745d) {
            Uri fromFile = Uri.fromFile(a10.f8746e);
            long j11 = this.f8739w - a10.f8743b;
            long j12 = a10.f8744c - j11;
            long j13 = this.f8740x;
            if (j13 != -1) {
                j12 = Math.min(j12, j13);
            }
            kVar = new com.anythink.expressad.exoplayer.j.k(fromFile, this.f8739w, j11, j12, this.f8738v, this.f8737u);
            hVar = this.f8727j;
        } else {
            if (a10.a()) {
                j10 = this.f8740x;
            } else {
                j10 = a10.f8744c;
                long j14 = this.f8740x;
                if (j14 != -1) {
                    j10 = Math.min(j10, j14);
                }
            }
            com.anythink.expressad.exoplayer.j.k kVar2 = new com.anythink.expressad.exoplayer.j.k(this.f8735s, this.f8739w, j10, this.f8738v, this.f8737u);
            com.anythink.expressad.exoplayer.j.h hVar2 = this.f8728k;
            if (hVar2 == null) {
                hVar2 = this.f8729l;
                this.f8726i.a(a10);
                a10 = null;
            }
            kVar = kVar2;
            hVar = hVar2;
        }
        this.C = (this.A || hVar != this.f8729l) ? Long.MAX_VALUE : this.f8739w + f8725h;
        if (z10) {
            com.anythink.expressad.exoplayer.k.a.b(e());
            if (hVar == this.f8729l) {
                return;
            }
            try {
                h();
            } catch (Throwable th) {
                if (a10.b()) {
                    this.f8726i.a(a10);
                }
                throw th;
            }
        }
        if (a10 != null && a10.b()) {
            this.y = a10;
        }
        this.f8733q = hVar;
        this.f8734r = kVar.f8818g == -1;
        long a11 = hVar.a(kVar);
        k kVar3 = new k();
        if (this.f8734r && a11 != -1) {
            this.f8740x = a11;
            j.a(kVar3, this.f8739w + a11);
        }
        if (d()) {
            Uri a12 = this.f8733q.a();
            this.f8736t = a12;
            if (true ^ this.f8735s.equals(a12)) {
                j.a(kVar3, this.f8736t);
            } else {
                kVar3.a("exo_redir");
            }
        }
        if (g()) {
            this.f8726i.a(this.f8738v, kVar3);
        }
    }

    private static Uri a(com.anythink.expressad.exoplayer.j.a.a aVar, String str, Uri uri) {
        String a10 = aVar.c(str).a("exo_redir", (String) null);
        Uri parse = a10 != null ? Uri.parse(a10) : null;
        return parse == null ? uri : parse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.io.IOException r1) {
        /*
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.anythink.expressad.exoplayer.j.i
            if (r0 == 0) goto Lf
            r0 = r1
            com.anythink.expressad.exoplayer.j.i r0 = (com.anythink.expressad.exoplayer.j.i) r0
            int r0 = r0.f8807b
            if (r0 != 0) goto Lf
            r1 = 1
            return r1
        Lf:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        L14:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.j.a.c.a(java.io.IOException):boolean");
    }
}
