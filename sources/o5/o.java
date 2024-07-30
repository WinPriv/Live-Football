package o5;

import android.text.TextUtils;
import d6.d0;
import d6.w;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.i0;
import k4.z0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p4.t;
import p4.u;

/* compiled from: WebvttExtractor.java */
/* loaded from: classes2.dex */
public final class o implements p4.h {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f33721g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f33722h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f33723a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f33724b;

    /* renamed from: d, reason: collision with root package name */
    public p4.j f33726d;
    public int f;

    /* renamed from: c, reason: collision with root package name */
    public final w f33725c = new w();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f33727e = new byte[1024];

    public o(String str, d0 d0Var) {
        this.f33723a = str;
        this.f33724b = d0Var;
    }

    @RequiresNonNull({"output"})
    public final p4.w a(long j10) {
        p4.w s10 = this.f33726d.s(0, 3);
        i0.a aVar = new i0.a();
        aVar.f30534k = com.anythink.expressad.exoplayer.k.o.O;
        aVar.f30527c = this.f33723a;
        aVar.o = j10;
        s10.b(aVar.a());
        this.f33726d.m();
        return s10;
    }

    @Override // p4.h
    public final int c(p4.i iVar, t tVar) throws IOException {
        String e10;
        int length;
        this.f33726d.getClass();
        p4.e eVar = (p4.e) iVar;
        int i10 = (int) eVar.f34313c;
        int i11 = this.f;
        byte[] bArr = this.f33727e;
        if (i11 == bArr.length) {
            if (i10 != -1) {
                length = i10;
            } else {
                length = bArr.length;
            }
            this.f33727e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f33727e;
        int i12 = this.f;
        int read = eVar.read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f + read;
            this.f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        w wVar = new w(this.f33727e);
        a6.h.d(wVar);
        String e11 = wVar.e();
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(e11)) {
                if (e11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f33721g.matcher(e11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f33722h.matcher(e11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = a6.h.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j10 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw z0.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(e11), null);
                        }
                    } else {
                        throw z0.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(e11), null);
                    }
                }
                e11 = wVar.e();
            } else {
                while (true) {
                    String e12 = wVar.e();
                    if (e12 == null) {
                        break;
                    }
                    if (a6.h.f348a.matcher(e12).matches()) {
                        do {
                            e10 = wVar.e();
                            if (e10 != null) {
                            }
                        } while (!e10.isEmpty());
                    } else {
                        Matcher matcher4 = a6.f.f323a.matcher(e12);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c10 = a6.h.c(group3);
                long b10 = this.f33724b.b(((((j10 + c10) - j11) * 90000) / 1000000) % 8589934592L);
                p4.w a10 = a(b10 - c10);
                byte[] bArr3 = this.f33727e;
                int i14 = this.f;
                w wVar2 = this.f33725c;
                wVar2.C(i14, bArr3);
                a10.f(this.f, wVar2);
                a10.c(b10, 1, this.f, 0, null);
                return -1;
            }
        }
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        p4.e eVar = (p4.e) iVar;
        eVar.c(this.f33727e, 0, 6, false);
        byte[] bArr = this.f33727e;
        w wVar = this.f33725c;
        wVar.C(6, bArr);
        if (a6.h.a(wVar)) {
            return true;
        }
        eVar.c(this.f33727e, 6, 3, false);
        wVar.C(9, this.f33727e);
        return a6.h.a(wVar);
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        this.f33726d = jVar;
        jVar.i(new u.b(com.anythink.expressad.exoplayer.b.f7291b));
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // p4.h
    public final void release() {
    }
}
