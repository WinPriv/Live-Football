package k0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final q.g<String, Typeface> f30266a = new q.g<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f30267b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f30268c;

    /* renamed from: d, reason: collision with root package name */
    public static final q.i<String, ArrayList<m0.a<a>>> f30269d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f30267b = threadPoolExecutor;
        f30268c = new Object();
        f30269d = new q.i<>();
    }

    public static a a(String str, Context context, f fVar, int i10) {
        int i11;
        q.g<String, Typeface> gVar = f30266a;
        Typeface typeface = gVar.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            l a10 = e.a(context, fVar);
            int i12 = 1;
            m[] mVarArr = a10.f30273b;
            int i13 = a10.f30272a;
            if (i13 != 0) {
                if (i13 == 1) {
                    i11 = -2;
                }
                i11 = -3;
            } else {
                if (mVarArr != null && mVarArr.length != 0) {
                    i12 = 0;
                    for (m mVar : mVarArr) {
                        int i14 = mVar.f30278e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i11 = i14;
                            }
                            i11 = -3;
                        }
                    }
                }
                i11 = i12;
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface b10 = f0.e.f27906a.b(context, mVarArr, i10);
            if (b10 != null) {
                gVar.put(str, b10);
                return new a(b10);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f30270a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30271b;

        public a(int i10) {
            this.f30270a = null;
            this.f30271b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f30270a = typeface;
            this.f30271b = 0;
        }
    }
}
