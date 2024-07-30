package e0;

import android.content.Context;
import android.media.UnsupportedSchemeException;
import com.google.android.exoplayer2.drm.i;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.huawei.hms.ads.ex;
import com.ironsource.mediationsdk.adunit.b.d;
import d6.o;
import d6.p;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import k8.f;
import ka.n7;
import l4.b;
import l4.r;
import s7.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements i7.d, o.a, f.a, TextInputLayout.f, i.c, p4.l, s7.e {
    public /* synthetic */ i() {
    }

    public static int b(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static long e() {
        return new Date().getTime();
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String g(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static HashMap h(Class cls, y7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static /* synthetic */ void i(int i10, String str) {
        if (i10 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = zc.d.class.getName();
            int i11 = 0;
            while (!stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            while (stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            StringBuilder o = a3.k.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            o.append(str);
            NullPointerException nullPointerException = new NullPointerException(o.toString());
            zc.d.e(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void j(com.ironsource.mediationsdk.adunit.b.d dVar, int i10, int i11, HashMap hashMap, com.ironsource.mediationsdk.adunit.b.b bVar) {
        hashMap.put(bVar, new d.a(dVar, i10, i11));
    }

    public static /* synthetic */ void k(Object obj) {
        if (obj == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public static /* bridge */ /* synthetic */ void l(Object obj, int i10, int i11, int i12) {
        throw null;
    }

    public static void m(String str, StringBuilder sb2, String str2) {
        sb2.append(ka.o.c(str));
        sb2.append(str2);
    }

    public static void n(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static void o(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void p(Throwable th, String str, String str2) {
        n7.g(str2, str.concat(th.getClass().getSimpleName()));
    }

    public static void q(Throwable th, String str, String str2) {
        ex.I(str2, str.concat(th.getClass().getSimpleName()));
    }

    public static /* synthetic */ String r(int i10) {
        if (i10 == 1) {
            return "OK";
        }
        if (i10 == 2) {
            return "BAD_CONFIG";
        }
        if (i10 == 3) {
            return "AUTH_ERROR";
        }
        return "null";
    }

    public static /* synthetic */ String s(int i10) {
        if (i10 == 1) {
            return "EXPONENTIAL";
        }
        if (i10 == 2) {
            return "LINEAR";
        }
        return "null";
    }

    public static /* synthetic */ String t(int i10) {
        if (i10 == 1) {
            return "IDLE";
        }
        if (i10 == 2) {
            return "QUEUING";
        }
        if (i10 == 3) {
            return "QUEUED";
        }
        if (i10 == 4) {
            return "RUNNING";
        }
        return "null";
    }

    public static /* synthetic */ String u(int i10) {
        if (i10 == 1) {
            return "UNKNOWN";
        }
        if (i10 == 2) {
            return "HORIZONTAL_DIMENSION";
        }
        if (i10 == 3) {
            return "VERTICAL_DIMENSION";
        }
        if (i10 == 4) {
            return "LEFT";
        }
        if (i10 == 5) {
            return "RIGHT";
        }
        if (i10 == 6) {
            return "TOP";
        }
        if (i10 == 7) {
            return "BOTTOM";
        }
        if (i10 == 8) {
            return "BASELINE";
        }
        return "null";
    }

    @Override // com.google.android.exoplayer2.drm.i.c
    public com.google.android.exoplayer2.drm.i acquireExoMediaDrm(UUID uuid) {
        try {
            try {
                try {
                    return new com.google.android.exoplayer2.drm.j(uuid);
                } catch (Exception e10) {
                    throw new o4.k(e10);
                }
            } catch (UnsupportedSchemeException e11) {
                throw new o4.k(e11);
            }
        } catch (o4.k unused) {
            p.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new com.google.android.exoplayer2.drm.g();
        }
    }

    @Override // i7.d
    public Object apply(Object obj) {
        return new r((d6.c) obj);
    }

    @Override // k8.f.a
    public String c(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return FirebaseCommonRegistrar.a(installerPackageName);
        }
        return "";
    }

    @Override // p4.l
    public p4.h[] createExtractors() {
        return new p4.h[0];
    }

    @Override // s7.e
    public Object d(v vVar) {
        return ExecutorsRegistrar.f21264b.get();
    }

    @Override // d6.o.a
    public void invoke(Object obj) {
        ((l4.b) obj).getClass();
    }

    public /* synthetic */ i(b.a aVar, boolean z10, int i10) {
    }
}
