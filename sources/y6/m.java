package y6;

import android.content.Context;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.huawei.opendevice.open.IOaidManager;
import ib.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.n7;
import ka.t5;
import ka.u4;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
public abstract class m implements IOaidManager {

    /* renamed from: a, reason: collision with root package name */
    public Object f36804a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36805b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36806c;

    public /* synthetic */ m(Context context) {
        this.f36805b = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f36806c = applicationContext;
        this.f36804a = new y(applicationContext);
    }

    public abstract void a();

    public abstract String b();

    public abstract void c();

    public final void d() {
        Iterator it = ((List) this.f36805b).iterator();
        while (it.hasNext()) {
            String x10 = ((pa.a) it.next()).x();
            try {
                if (((u4) this.f36804a).m(x10)) {
                    ((u4) this.f36804a).j(x10);
                }
            } catch (t5 unused) {
                n7.g(b(), "delete table fail");
            }
        }
        for (pa.a aVar : (List) this.f36806c) {
            try {
                ((u4) this.f36804a).l(aVar.v());
            } catch (t5 unused2) {
                n7.h(b(), "create table %s failed", aVar.x());
            }
        }
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final void disableOaidCollection(boolean z10) {
        synchronized (this.f36805b) {
            ((y) this.f36804a).d().edit().putBoolean("oaid_disable_collection", z10).apply();
        }
    }

    public abstract void e();

    public abstract void f(BaseProgressIndicator.c cVar);

    public abstract void g();

    public abstract void h();

    public abstract void i();

    @Override // com.huawei.opendevice.open.IOaidManager
    public final boolean isDisableOaidCollection() {
        boolean z10;
        synchronized (this.f36805b) {
            z10 = ((y) this.f36804a).d().getBoolean("oaid_disable_collection", false);
        }
        return z10;
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final void setResetOaid(boolean z10) {
        synchronized (this.f36805b) {
            ((y) this.f36804a).d().edit().putBoolean("oaid_key_reset_oaid", z10).apply();
        }
    }

    public /* synthetic */ m(u4 u4Var) {
        this.f36805b = new ArrayList(4);
        this.f36806c = new ArrayList(4);
        a();
        this.f36804a = u4Var;
    }

    public /* synthetic */ m(int i10) {
        this.f36805b = new float[i10 * 2];
        this.f36806c = new int[i10];
    }
}
