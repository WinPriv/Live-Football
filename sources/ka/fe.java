package ka;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class fe implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f31184s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f31185t = null;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ce f31186u;

    public fe(ce ceVar, ArrayList arrayList) {
        this.f31186u = ceVar;
        this.f31184s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31186u.f31052e.u(this.f31184s, this.f31185t);
    }
}
