package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o5 implements qa.a<s5> {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f31588a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final u f31589b;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ s5 f31590s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f31591t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f31592u;

        public a(s5 s5Var, String str, long j10) {
            this.f31590s = s5Var;
            this.f31591t = str;
            this.f31592u = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u uVar = o5.this.f31589b;
            long j10 = this.f31592u;
            uVar.getClass();
            s5 s5Var = this.f31590s;
            if (s5Var == null) {
                n7.g("AnalysisReport", "reportAdResDownloadEvent, task is null");
                return;
            }
            ContentRecord contentRecord = new ContentRecord();
            contentRecord.a(s5Var.f31793s);
            contentRecord.g2(s5Var.f31795u);
            contentRecord.a2(s5Var.f31796v);
            contentRecord.m2(s5Var.f31794t);
            String str = this.f31591t;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case 50:
                    if (str.equals("2")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1755:
                    if (str.equals("72")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    uVar.j(s5Var.s(), s5Var.S(), s5Var.f31799z, null, s5Var.f31797w, j10, contentRecord, "", s5Var.b());
                    return;
                case 1:
                    uVar.l(s5Var.s(), null, s5Var.f31797w, s5Var.f31798x, Long.valueOf(j10), s5Var.y, contentRecord, "", s5Var.L(), s5Var.b());
                    return;
                case 2:
                    uVar.k(s5Var.s(), contentRecord, null, s5Var.b());
                    return;
                default:
                    return;
            }
        }
    }

    public o5(Context context) {
        this.f31589b = new u(context);
    }

    @Override // qa.a
    public final void a(s5 s5Var) {
        s5 s5Var2 = s5Var;
        k("2", s5Var2);
        Set<qa.a<s5>> j10 = j(s5Var2.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().a(s5Var2);
            }
        }
    }

    @Override // qa.a
    public final void b(s5 s5Var, boolean z10) {
        Set<qa.a<s5>> j10 = j(s5Var.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().b(s5Var, z10);
            }
        }
    }

    @Override // qa.a
    public final void c(s5 s5Var) {
        s5 s5Var2 = s5Var;
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        s5Var2.f31797w = Long.valueOf(System.currentTimeMillis());
        k("72", s5Var2);
        Set<qa.a<s5>> j10 = j(s5Var2.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().c(s5Var2);
            }
        }
    }

    @Override // qa.a
    public final void d(s5 s5Var) {
        s5 s5Var2 = s5Var;
        Set<qa.a<s5>> j10 = j(s5Var2.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().d(s5Var2);
            }
        }
    }

    @Override // qa.a
    public final void e(s5 s5Var) {
        Set<qa.a<s5>> j10 = j(s5Var.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().e(s5Var);
            }
        }
    }

    @Override // qa.a
    public final void f(s5 s5Var) {
        s5 s5Var2 = s5Var;
        k("5", s5Var2);
        Set<qa.a<s5>> j10 = j(s5Var2.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().f(s5Var2);
            }
        }
    }

    @Override // qa.a
    public final void g(s5 s5Var) {
        s5 s5Var2 = s5Var;
        Set<qa.a<s5>> j10 = j(s5Var2.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().g(s5Var2);
            }
        }
    }

    @Override // qa.a
    public final void h(s5 s5Var) {
        Set<qa.a<s5>> j10 = j(s5Var.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().h(s5Var);
            }
        }
    }

    @Override // qa.a
    public final void i(s5 s5Var) {
        Set<qa.a<s5>> j10 = j(s5Var.f31794t);
        if (j10 != null) {
            Iterator<qa.a<s5>> it = j10.iterator();
            while (it.hasNext()) {
                it.next().i(s5Var);
            }
        }
    }

    public final synchronized Set<qa.a<s5>> j(String str) {
        return (Set) this.f31588a.get(str);
    }

    public final void k(String str, s5 s5Var) {
        if (this.f31589b != null) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(s5Var, str, System.currentTimeMillis()), 2);
        }
    }
}
