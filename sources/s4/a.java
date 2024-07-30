package s4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.w;
import java.io.IOException;
import p4.a;
import p4.e;
import p4.m;
import p4.p;

/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes2.dex */
public final class a extends p4.a {

    /* compiled from: FlacBinarySearchSeeker.java */
    /* renamed from: s4.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0475a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final p f35121a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35122b;

        /* renamed from: c, reason: collision with root package name */
        public final m.a f35123c = new m.a();

        public C0475a(p pVar, int i10) {
            this.f35121a = pVar;
            this.f35122b = i10;
        }

        @Override // p4.a.f
        public final a.e a(e eVar, long j10) throws IOException {
            long j11 = eVar.f34314d;
            long c10 = c(eVar);
            long d10 = eVar.d();
            eVar.k(Math.max(6, this.f35121a.f34330c), false);
            long c11 = c(eVar);
            long d11 = eVar.d();
            if (c10 <= j10 && c11 > j10) {
                return a.e.a(d10);
            }
            if (c11 <= j10) {
                return new a.e(-2, c11, d11);
            }
            return new a.e(-1, c10, j11);
        }

        public final long c(e eVar) throws IOException {
            long j10;
            m.a aVar;
            p pVar;
            boolean a10;
            int m10;
            while (true) {
                long d10 = eVar.d();
                j10 = eVar.f34313c;
                long j11 = j10 - 6;
                aVar = this.f35123c;
                pVar = this.f35121a;
                if (d10 >= j11) {
                    break;
                }
                long d11 = eVar.d();
                byte[] bArr = new byte[2];
                eVar.c(bArr, 0, 2, false);
                int i10 = ((bArr[0] & DefaultClassResolver.NAME) << 8) | (bArr[1] & DefaultClassResolver.NAME);
                int i11 = this.f35122b;
                if (i10 != i11) {
                    eVar.f = 0;
                    eVar.k((int) (d11 - eVar.f34314d), false);
                    a10 = false;
                } else {
                    w wVar = new w(16);
                    System.arraycopy(bArr, 0, wVar.f27384a, 0, 2);
                    byte[] bArr2 = wVar.f27384a;
                    int i12 = 0;
                    for (int i13 = 2; i12 < 14 && (m10 = eVar.m(bArr2, i13 + i12, 14 - i12)) != -1; i13 = 2) {
                        i12 += m10;
                    }
                    wVar.D(i12);
                    eVar.f = 0;
                    eVar.k((int) (d11 - eVar.f34314d), false);
                    a10 = m.a(wVar, pVar, i11, aVar);
                }
                if (a10) {
                    break;
                }
                eVar.k(1, false);
            }
            if (eVar.d() >= j10 - 6) {
                eVar.k((int) (j10 - eVar.d()), false);
                return pVar.f34336j;
            }
            return aVar.f34325a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(p4.p r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            q0.d r1 = new q0.d
            r2 = 9
            r1.<init>(r15, r2)
            s4.a$a r2 = new s4.a$a
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.b()
            long r5 = r0.f34336j
            int r7 = r0.f34330c
            int r8 = r0.f34331d
            if (r8 <= 0) goto L27
            long r8 = (long) r8
            long r10 = (long) r7
            long r8 = r8 + r10
            r10 = 2
            long r8 = r8 / r10
            r10 = 1
            goto L40
        L27:
            int r8 = r0.f34329b
            int r9 = r0.f34328a
            if (r9 != r8) goto L31
            if (r9 <= 0) goto L31
            long r8 = (long) r9
            goto L33
        L31:
            r8 = 4096(0x1000, double:2.0237E-320)
        L33:
            int r10 = r0.f34333g
            long r10 = (long) r10
            long r8 = r8 * r10
            int r0 = r0.f34334h
            long r10 = (long) r0
            long r8 = r8 * r10
            r10 = 8
            long r8 = r8 / r10
            r10 = 64
        L40:
            long r11 = r8 + r10
            r0 = 6
            int r13 = java.lang.Math.max(r0, r7)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.a.<init>(p4.p, int, long, long):void");
    }
}
