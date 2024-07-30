package com.anythink.expressad.exoplayer.j.a;

import android.net.Uri;
import com.anythink.expressad.exoplayer.j.a.a;
import com.anythink.expressad.exoplayer.k.v;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8747a = 131072;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public volatile long f8748a;

        /* renamed from: b, reason: collision with root package name */
        public volatile long f8749b;

        /* renamed from: c, reason: collision with root package name */
        public volatile long f8750c = -1;

        private long a() {
            return this.f8748a + this.f8749b;
        }
    }

    private f() {
    }

    private static String a(Uri uri) {
        return uri.toString();
    }

    public static String a(com.anythink.expressad.exoplayer.j.k kVar) {
        String str = kVar.f8819h;
        return str != null ? str : kVar.f8815c.toString();
    }

    private static void a(com.anythink.expressad.exoplayer.j.k kVar, com.anythink.expressad.exoplayer.j.a.a aVar, a aVar2) {
        String a10 = a(kVar);
        long j10 = kVar.f8817e;
        long j11 = kVar.f8818g;
        if (j11 == -1) {
            j11 = aVar.b(a10);
        }
        aVar2.f8750c = j11;
        aVar2.f8748a = 0L;
        aVar2.f8749b = 0L;
        long j12 = j10;
        long j13 = j11;
        while (j13 != 0) {
            long b10 = aVar.b(a10, j12, j13 != -1 ? j13 : Long.MAX_VALUE);
            if (b10 > 0) {
                aVar2.f8748a += b10;
            } else {
                b10 = -b10;
                if (b10 == Long.MAX_VALUE) {
                    return;
                }
            }
            j12 += b10;
            if (j13 == -1) {
                b10 = 0;
            }
            j13 -= b10;
        }
    }

    private static void a(com.anythink.expressad.exoplayer.j.k kVar, com.anythink.expressad.exoplayer.j.a.a aVar, com.anythink.expressad.exoplayer.j.h hVar, a aVar2, AtomicBoolean atomicBoolean) {
        a aVar3;
        String str;
        long j10;
        long j11;
        c cVar = new c(aVar, hVar);
        byte[] bArr = new byte[131072];
        com.anythink.expressad.exoplayer.k.a.a(cVar);
        com.anythink.expressad.exoplayer.k.a.a(bArr);
        long j12 = 0;
        if (aVar2 != null) {
            String a10 = a(kVar);
            long j13 = kVar.f8817e;
            long j14 = kVar.f8818g;
            if (j14 == -1) {
                j14 = aVar.b(a10);
            }
            aVar2.f8750c = j14;
            aVar2.f8748a = 0L;
            aVar2.f8749b = 0L;
            long j15 = j13;
            long j16 = j14;
            while (j16 != 0) {
                String str2 = a10;
                long b10 = aVar.b(a10, j15, j16 != -1 ? j16 : Long.MAX_VALUE);
                if (b10 <= 0) {
                    b10 = -b10;
                    if (b10 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar2.f8748a += b10;
                }
                j15 += b10;
                if (j16 == -1) {
                    b10 = 0;
                }
                j16 -= b10;
                a10 = str2;
            }
            aVar3 = aVar2;
        } else {
            aVar3 = new a();
        }
        String a11 = a(kVar);
        long j17 = kVar.f8817e;
        long j18 = kVar.f8818g;
        if (j18 == -1) {
            j18 = aVar.b(a11);
        }
        long j19 = j17;
        long j20 = j18;
        while (j20 != j12) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b11 = aVar.b(a11, j19, j20 != -1 ? j20 : Long.MAX_VALUE);
            if (b11 <= j12) {
                long j21 = -b11;
                str = a11;
                j10 = j12;
                if (a(kVar, j19, j21, cVar, bArr, (v) null, aVar3) < j21) {
                    return;
                } else {
                    j11 = j21;
                }
            } else {
                str = a11;
                j10 = j12;
                j11 = b11;
            }
            j19 += j11;
            if (j20 == -1) {
                j11 = j10;
            }
            j20 -= j11;
            a11 = str;
            j12 = j10;
        }
    }

    private static void a(com.anythink.expressad.exoplayer.j.k kVar, com.anythink.expressad.exoplayer.j.a.a aVar, c cVar, byte[] bArr, v vVar, a aVar2, AtomicBoolean atomicBoolean) {
        a aVar3;
        String str;
        long j10;
        long j11;
        com.anythink.expressad.exoplayer.k.a.a(cVar);
        com.anythink.expressad.exoplayer.k.a.a(bArr);
        long j12 = 0;
        if (aVar2 != null) {
            String a10 = a(kVar);
            long j13 = kVar.f8817e;
            long j14 = kVar.f8818g;
            if (j14 == -1) {
                j14 = aVar.b(a10);
            }
            aVar2.f8750c = j14;
            aVar2.f8748a = 0L;
            aVar2.f8749b = 0L;
            long j15 = j13;
            long j16 = j14;
            while (j16 != 0) {
                long b10 = aVar.b(a10, j15, j16 != -1 ? j16 : Long.MAX_VALUE);
                if (b10 <= 0) {
                    b10 = -b10;
                    if (b10 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar2.f8748a += b10;
                }
                j15 += b10;
                if (j16 == -1) {
                    b10 = 0;
                }
                j16 -= b10;
            }
            aVar3 = aVar2;
        } else {
            aVar3 = new a();
        }
        String a11 = a(kVar);
        long j17 = kVar.f8817e;
        long j18 = kVar.f8818g;
        if (j18 == -1) {
            j18 = aVar.b(a11);
        }
        long j19 = j17;
        long j20 = j18;
        while (j20 != j12) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b11 = aVar.b(a11, j19, j20 != -1 ? j20 : Long.MAX_VALUE);
            if (b11 <= j12) {
                long j21 = -b11;
                str = a11;
                j10 = j12;
                if (a(kVar, j19, j21, cVar, bArr, vVar, aVar3) < j21) {
                    return;
                } else {
                    j11 = j21;
                }
            } else {
                str = a11;
                j10 = j12;
                j11 = b11;
            }
            j19 += j11;
            if (j20 == -1) {
                j11 = j10;
            }
            j20 -= j11;
            a11 = str;
            j12 = j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(com.anythink.expressad.exoplayer.j.k r16, long r17, long r19, com.anythink.expressad.exoplayer.j.h r21, byte[] r22, com.anythink.expressad.exoplayer.k.v r23, com.anythink.expressad.exoplayer.j.a.f.a r24) {
        /*
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = r16
        L8:
            if (r23 == 0) goto Ld
            r23.b()
        Ld:
            boolean r4 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            if (r4 != 0) goto L87
            com.anythink.expressad.exoplayer.j.k r4 = new com.anythink.expressad.exoplayer.j.k     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            android.net.Uri r6 = r3.f8815c     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            byte[] r7 = r3.f8816d     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            long r8 = r3.f     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            long r8 = r8 + r17
            long r10 = r3.f8817e     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            long r10 = r8 - r10
            r12 = -1
            java.lang.String r14 = r3.f8819h     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            int r5 = r3.f8820i     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            r15 = r5 | 2
            r5 = r4
            r8 = r17
            r5.<init>(r6, r7, r8, r10, r12, r14, r15)     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            long r5 = r1.a(r4)     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            long r7 = r2.f8750c     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L44
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 == 0) goto L44
            long r7 = r4.f8817e     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            long r7 = r7 + r5
            r2.f8750c = r7     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
        L44:
            r5 = 0
        L46:
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 == 0) goto L81
            boolean r3 = java.lang.Thread.interrupted()     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            if (r3 != 0) goto L7b
            int r3 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r3 == 0) goto L5e
            int r3 = r0.length     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            long r7 = (long) r3     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            long r11 = r19 - r5
            long r7 = java.lang.Math.min(r7, r11)     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            int r3 = (int) r7     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            goto L5f
        L5e:
            int r3 = r0.length     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
        L5f:
            r7 = 0
            int r3 = r1.a(r0, r7, r3)     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            r7 = -1
            if (r3 != r7) goto L73
            long r7 = r2.f8750c     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L81
            long r7 = r4.f8817e     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            long r7 = r7 + r5
            r2.f8750c = r7     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            goto L81
        L73:
            long r7 = (long) r3     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            long r5 = r5 + r7
            long r11 = r2.f8749b     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            long r11 = r11 + r7
            r2.f8749b = r11     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            goto L46
        L7b:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            r3.<init>()     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
            throw r3     // Catch: com.anythink.expressad.exoplayer.k.v.a -> L85 java.lang.Throwable -> L8d
        L81:
            com.anythink.expressad.exoplayer.k.af.a(r21)
            return r5
        L85:
            r3 = r4
            goto L92
        L87:
            java.lang.InterruptedException r4 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            r4.<init>()     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
            throw r4     // Catch: java.lang.Throwable -> L8d com.anythink.expressad.exoplayer.k.v.a -> L92
        L8d:
            r0 = move-exception
            com.anythink.expressad.exoplayer.k.af.a(r21)
            throw r0
        L92:
            com.anythink.expressad.exoplayer.k.af.a(r21)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.j.a.f.a(com.anythink.expressad.exoplayer.j.k, long, long, com.anythink.expressad.exoplayer.j.h, byte[], com.anythink.expressad.exoplayer.k.v, com.anythink.expressad.exoplayer.j.a.f$a):long");
    }

    private static void a(com.anythink.expressad.exoplayer.j.a.a aVar, String str) {
        Iterator<e> it = aVar.a(str).iterator();
        while (it.hasNext()) {
            try {
                aVar.b(it.next());
            } catch (a.C0114a unused) {
            }
        }
    }
}
