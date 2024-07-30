package com.applovin.exoplayer2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import b5.q;
import b6.e;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.h.a.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d6.o;
import g4.o;
import g5.a;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.regex.Pattern;
import k4.f;
import k4.h1;
import k4.n0;
import k4.n1;
import k4.r1;
import k8.f;
import okhttp3.Dns;
import p4.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements g.a, g.a, o.a, f.a, o.b, f.a.InterfaceC0458a, a.InterfaceC0387a, q.f, f.a, Continuation, Dns {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13572s;

    public /* synthetic */ b0(int i10) {
        this.f13572s = i10;
    }

    @Override // p4.f.a.InterfaceC0458a
    public final Constructor a() {
        int[] iArr = p4.f.f34317t;
        if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return null;
        }
        return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(p4.h.class).getConstructor(Integer.TYPE);
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        w3.b bVar = g4.o.f28502x;
        throw new h4.a("Timed out while trying to open db.", (Throwable) obj);
    }

    @Override // k8.f.a
    public final String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    @Override // d6.o.b
    public final void d(Object obj, d6.j jVar) {
    }

    @Override // com.applovin.exoplayer2.g.e.g.a
    public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        switch (this.f13572s) {
            case 4:
                return com.applovin.exoplayer2.e.f.d.f(i10, i11, i12, i13, i14);
            case 17:
                if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
                    if (i11 != 77 || i12 != 76 || i13 != 76) {
                        return false;
                    }
                    if (i14 != 84 && i10 != 2) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // com.applovin.exoplayer2.g.a
    public final g fromBundle(Bundle bundle) {
        switch (this.f13572s) {
            case 0:
                return ab.e.b(bundle);
            case 1:
                return aj.c(bundle);
            case 2:
                return an.e.b(bundle);
            case 3:
                return ba.c.b(bundle);
            case 4:
            default:
                return p.b(bundle);
            case 5:
                return a.C0173a.b(bundle);
        }
    }

    @Override // b5.q.f
    public final int getScore(Object obj) {
        Pattern pattern = b5.q.f2985a;
        String str = ((b5.m) obj).f2945a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (d6.g0.f27302a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    @Override // okhttp3.Dns
    public final List lookup(String str) {
        List lambda$static$0;
        lambda$static$0 = Dns.lambda$static$0(str);
        return lambda$static$0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Object obj = i8.k.f29280c;
        return Integer.valueOf(com.huawei.openalliance.ad.constant.ag.f22001l);
    }

    @Override // k4.f.a
    /* renamed from: fromBundle */
    public final k4.f mo0fromBundle(Bundle bundle) {
        switch (this.f13572s) {
            case 9:
                n0.b.a aVar = new n0.b.a();
                n0.c cVar = n0.b.f30591x;
                long j10 = bundle.getLong(n0.b.y, cVar.f30593s);
                d6.a.a(j10 >= 0);
                aVar.f30598a = j10;
                long j11 = bundle.getLong(n0.b.f30592z, cVar.f30594t);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    r2 = false;
                }
                d6.a.a(r2);
                aVar.f30599b = j11;
                aVar.f30600c = bundle.getBoolean(n0.b.A, cVar.f30595u);
                aVar.f30601d = bundle.getBoolean(n0.b.B, cVar.f30596v);
                aVar.f30602e = bundle.getBoolean(n0.b.C, cVar.f30597w);
                return new n0.c(aVar);
            case 10:
            case 12:
            default:
                int i10 = bundle.getInt(e.d.f3039v, -1);
                int[] intArray = bundle.getIntArray(e.d.f3040w);
                int i11 = bundle.getInt(e.d.f3041x, -1);
                d6.a.a(i10 >= 0 && i11 >= 0);
                intArray.getClass();
                return new e.d(i10, intArray, i11);
            case 11:
                String str = n1.f30656w;
                d6.a.a(bundle.getInt(h1.f30485s, -1) == 2);
                int i12 = bundle.getInt(n1.f30656w, 5);
                float f = bundle.getFloat(n1.f30657x, -1.0f);
                if (f == -1.0f) {
                    return new n1(i12);
                }
                return new n1(i12, f);
            case 13:
                String str2 = r1.a.f30781x;
                com.applovin.exoplayer2.a.l lVar = j5.m0.f29800z;
                Bundle bundle2 = bundle.getBundle(r1.a.f30781x);
                bundle2.getClass();
                j5.m0 m0Var = (j5.m0) lVar.mo0fromBundle(bundle2);
                int[] intArray2 = bundle.getIntArray(r1.a.y);
                int[] iArr = new int[m0Var.f29801s];
                if (intArray2 == null) {
                    intArray2 = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(r1.a.f30782z);
                boolean[] zArr = new boolean[m0Var.f29801s];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new r1.a(m0Var, bundle.getBoolean(r1.a.A, false), intArray2, booleanArray);
        }
    }
}
