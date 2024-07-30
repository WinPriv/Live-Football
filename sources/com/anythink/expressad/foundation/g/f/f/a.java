package com.anythink.expressad.foundation.g.f.f;

import com.anythink.expressad.foundation.g.f.g;
import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.video.module.a.a.m;

/* loaded from: classes.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9980a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9981b = 3000;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.e.a f9982c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.c f9983d;

    public a(com.anythink.expressad.foundation.g.f.e.a aVar, com.anythink.expressad.foundation.g.f.c cVar) {
        this.f9982c = aVar;
        this.f9983d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    @Override // com.anythink.expressad.foundation.g.f.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.foundation.g.f.f.c a(com.anythink.expressad.foundation.g.f.i<?> r22) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.f.f.a.a(com.anythink.expressad.foundation.g.f.i):com.anythink.expressad.foundation.g.f.f.c");
    }

    private static void a(long j10, i<?> iVar, byte[] bArr, int i10) {
        if (com.anythink.expressad.a.f6552a) {
            if (j10 > m.ag) {
                try {
                    String str = f9980a;
                    Object[] objArr = new Object[6];
                    objArr[0] = iVar.d();
                    objArr[1] = Integer.valueOf(iVar.a());
                    objArr[2] = Long.valueOf(j10);
                    objArr[3] = bArr != null ? Integer.valueOf(bArr.length) : "null";
                    objArr[4] = Integer.valueOf(i10);
                    objArr[5] = Integer.valueOf(iVar.l().c());
                    o.b(str, String.format("Slow HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", objArr));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            try {
                String str2 = f9980a;
                Object[] objArr2 = new Object[6];
                objArr2[0] = iVar.d();
                objArr2[1] = Integer.valueOf(iVar.a());
                objArr2[2] = Long.valueOf(j10);
                objArr2[3] = bArr != null ? Integer.valueOf(bArr.length) : "null";
                objArr2[4] = Integer.valueOf(i10);
                objArr2[5] = Integer.valueOf(iVar.l().c());
                o.b(str2, String.format("Normal HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", objArr2));
            } catch (Exception unused2) {
            }
        }
    }

    private static void a(String str, long j10, i<?> iVar) {
        if (com.anythink.expressad.a.f6552a) {
            try {
                String str2 = f9980a;
                Object[] objArr = new Object[4];
                objArr[0] = iVar.d();
                objArr[1] = Long.valueOf(j10);
                if (str == null) {
                    str = "null";
                }
                objArr[2] = str;
                objArr[3] = Integer.valueOf(iVar.l().c());
                o.b(str2, String.format("HTTP exception for request=<%s> [lifetime=%d], [size=%s], [retryCount=%s]", objArr));
            } catch (Exception unused) {
            }
        }
    }

    private void a(i<?> iVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        if (iVar.l().d()) {
            this.f9983d.e(iVar);
            return;
        }
        throw aVar;
    }
}
