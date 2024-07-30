package ka;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s6 extends z6.f {

    /* renamed from: t, reason: collision with root package name */
    public final Context f31800t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31801s;

        /* renamed from: ka.s6$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0431a implements d7<String> {
            public C0431a() {
            }

            @Override // ka.d7
            public final void a(y6 y6Var) {
                if (y6Var.f32210b == 200) {
                    n7.b("FatCodeInjector", "asyn query user tag success");
                    com.huawei.openalliance.ad.ppskit.handlers.t a10 = com.huawei.openalliance.ad.ppskit.handlers.t.a(s6.this.f31800t);
                    String str = (String) y6Var.f32211c;
                    synchronized (a10.f22627b) {
                        if (a10.f22626a != null) {
                            n7.c("UserTagSpHandler", "save user tag: %s", str);
                            a10.f22628c = (Map) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str, Map.class, new Class[0]);
                            a10.f22626a.edit().putString("user_tag", str).commit();
                        }
                    }
                }
            }
        }

        public a(String str) {
            this.f31801s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j10;
            if (!com.huawei.openalliance.ad.ppskit.handlers.l.d(s6.this.f31800t).D(this.f31801s)) {
                return;
            }
            com.huawei.openalliance.ad.ppskit.handlers.t a10 = com.huawei.openalliance.ad.ppskit.handlers.t.a(s6.this.f31800t);
            HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (a10.f22627b) {
                SharedPreferences sharedPreferences = a10.f22626a;
                j10 = 0;
                if (sharedPreferences != null) {
                    j10 = sharedPreferences.getLong("last_query_tag_time", 0L);
                }
            }
            if (currentTimeMillis - j10 <= 43200000) {
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            synchronized (a10.f22627b) {
                SharedPreferences sharedPreferences2 = a10.f22626a;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("last_query_tag_time", currentTimeMillis2).commit();
                }
            }
            n7.b("FatCodeInjector", "asyn query user tag");
            try {
                z6.m(s6.this.f31800t).k("queryUserTag", null, new C0431a(), String.class);
            } catch (Throwable th) {
                n7.h("FatCodeInjector", "asyn query user tag failed: %s", th.getClass().getSimpleName());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31804s;

        /* loaded from: classes2.dex */
        public class a implements d7<String> {
            public a() {
            }

            @Override // ka.d7
            public final void a(y6 y6Var) {
                if (y6Var.f32210b == 200) {
                    n7.b("FatCodeInjector", "asyn query aud id success");
                    com.huawei.openalliance.ad.ppskit.handlers.b0 a10 = com.huawei.openalliance.ad.ppskit.handlers.b0.a(s6.this.f31800t);
                    String str = (String) y6Var.f32211c;
                    synchronized (a10.f22508b) {
                        if (a10.f22507a != null) {
                            n7.c("AudIdSpHandler", "save aud id: %s", str);
                            a10.f22509c = (List) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str, List.class, String.class);
                            a10.f22507a.edit().putString("aud_id", str).commit();
                        }
                    }
                }
            }
        }

        public b(String str) {
            this.f31804s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j10;
            if (!com.huawei.openalliance.ad.ppskit.handlers.l.d(s6.this.f31800t).E(this.f31804s)) {
                return;
            }
            com.huawei.openalliance.ad.ppskit.handlers.b0 a10 = com.huawei.openalliance.ad.ppskit.handlers.b0.a(s6.this.f31800t);
            HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (a10.f22508b) {
                j10 = a10.f22507a.getLong("last_query_audid_time", 0L);
            }
            if (currentTimeMillis - j10 <= 43200000) {
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            synchronized (a10.f22508b) {
                a10.f22507a.edit().putLong("last_query_audid_time", currentTimeMillis2).commit();
            }
            n7.b("FatCodeInjector", "asyn query aud id");
            try {
                z6.m(s6.this.f31800t).k("queryAudId", null, new a(), String.class);
            } catch (Throwable th) {
                n7.h("FatCodeInjector", "asyn query aud id failed: %s", th.getClass().getSimpleName());
            }
        }
    }

    public s6(Context context) {
        super(3);
        this.f31800t = context;
    }

    @Override // z6.f
    public final void c(String str) {
        com.huawei.openalliance.ad.ppskit.utils.p2.d(new a(str));
    }

    @Override // z6.f
    public final boolean d(long j10) {
        Context context = this.f31800t;
        com.huawei.openalliance.ad.ppskit.utils.q1 m10 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context);
        if (m10.f() == null) {
            return com.huawei.openalliance.ad.ppskit.utils.m.m(context, m10).booleanValue();
        }
        boolean booleanValue = m10.f().booleanValue();
        if (com.huawei.openalliance.ad.ppskit.utils.c2.b("isChildMode", j10)) {
            com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.q(context, m10));
        }
        return booleanValue;
    }

    @Override // z6.f
    public final void i(String str) {
        com.huawei.openalliance.ad.ppskit.utils.p2.d(new b(str));
    }
}
