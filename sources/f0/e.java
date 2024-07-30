package f0;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import androidx.activity.n;
import e0.f;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final l f27906a;

    /* renamed from: b, reason: collision with root package name */
    public static final q.g<String, Typeface> f27907b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public static class a extends n {
        public final f.e J0;

        public a(f.e eVar) {
            this.J0 = eVar;
        }
    }

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f27906a = new j();
        } else if (i10 >= 28) {
            f27906a = new i();
        } else if (i10 >= 26) {
            f27906a = new h();
        } else {
            Method method = g.f27915c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f27906a = new g();
            } else {
                f27906a = new f();
            }
        }
        f27907b = new q.g<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r0.equals(r4) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r7, e0.d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, e0.f.e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e.a(android.content.Context, e0.d$b, android.content.res.Resources, int, java.lang.String, int, int, e0.f$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
