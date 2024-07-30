package gb;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28592d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static m f28593e;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28594a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28595b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public b f28596c;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f28597s;

        public a(b bVar) {
            this.f28597s = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SharedPreferences.Editor edit = m.this.f28594a.edit();
            edit.putString("cache_data", gb.b.p(this.f28597s));
            edit.apply();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Cloneable {
        public String A;
        public Integer B;
        public Integer C;

        /* renamed from: s, reason: collision with root package name */
        public String f28599s;

        /* renamed from: t, reason: collision with root package name */
        public Boolean f28600t;

        /* renamed from: u, reason: collision with root package name */
        public Boolean f28601u;

        /* renamed from: v, reason: collision with root package name */
        public String f28602v;

        /* renamed from: w, reason: collision with root package name */
        public Integer f28603w;

        /* renamed from: x, reason: collision with root package name */
        public Boolean f28604x;
        public String y;

        /* renamed from: z, reason: collision with root package name */
        public String f28605z;

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b clone() {
            b bVar = new b();
            bVar.f28599s = this.f28599s;
            bVar.f28600t = this.f28600t;
            bVar.f28601u = this.f28601u;
            bVar.f28602v = this.f28602v;
            bVar.f28603w = this.f28603w;
            bVar.f28604x = this.f28604x;
            bVar.y = this.y;
            bVar.f28605z = this.f28605z;
            bVar.A = this.A;
            bVar.B = this.B;
            bVar.C = this.C;
            return bVar;
        }
    }

    public m(Context context) {
        this.f28594a = context.getSharedPreferences("hiad_sp_properties_cache_sdk", 0);
    }

    public static m b(Context context) {
        m mVar;
        synchronized (f28592d) {
            if (f28593e == null) {
                f28593e = new m(context);
            }
            mVar = f28593e;
        }
        return mVar;
    }

    public final void a(boolean z10) {
        synchronized (this.f28595b) {
            g();
            b bVar = this.f28596c;
            if (bVar == null) {
                return;
            }
            bVar.A = String.valueOf(z10);
            c(this.f28596c);
        }
    }

    public final void c(b bVar) {
        if (bVar == null) {
            return;
        }
        c0.c(new a(bVar.clone()));
    }

    public final void d(String str) {
        synchronized (this.f28595b) {
            g();
            b bVar = this.f28596c;
            if (bVar == null) {
                return;
            }
            bVar.y = str;
            c(bVar);
        }
    }

    public final void e(Integer num) {
        synchronized (this.f28595b) {
            g();
            b bVar = this.f28596c;
            if (bVar == null) {
                return;
            }
            bVar.C = num;
            c(bVar);
        }
    }

    public final String f() {
        synchronized (this.f28595b) {
            g();
            b bVar = this.f28596c;
            if (bVar == null) {
                return null;
            }
            String str = bVar.A;
            if (str == null) {
                return null;
            }
            return str;
        }
    }

    public final void g() {
        if (this.f28596c == null) {
            b bVar = null;
            String string = this.f28594a.getString("cache_data", null);
            if (string != null && string.length() > 0) {
                bVar = (b) gb.b.o(b.class, string, new Class[0]);
            }
            if (bVar == null) {
                bVar = new b();
            }
            this.f28596c = bVar;
        }
    }
}
