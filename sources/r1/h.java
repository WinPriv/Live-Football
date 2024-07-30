package r1;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static h f34817a;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends h {

        /* renamed from: b, reason: collision with root package name */
        public final int f34818b;

        public a(int i10) {
            this.f34818b = i10;
        }

        @Override // r1.h
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f34818b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // r1.h
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f34818b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // r1.h
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f34818b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // r1.h
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.f34818b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized h c() {
        h hVar;
        synchronized (h.class) {
            if (f34817a == null) {
                f34817a = new a(3);
            }
            hVar = f34817a;
        }
        return hVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
