package d8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f27504a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<g> f27505b;

    public e(j jVar, TaskCompletionSource<g> taskCompletionSource) {
        this.f27504a = jVar;
        this.f27505b = taskCompletionSource;
    }

    @Override // d8.i
    public final boolean a(f8.a aVar) {
        boolean z10;
        if (aVar.f() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.f27504a.a(aVar)) {
            return false;
        }
        String str = aVar.f28151d;
        if (str != null) {
            Long valueOf = Long.valueOf(aVar.f);
            Long valueOf2 = Long.valueOf(aVar.f28153g);
            String str2 = "";
            if (valueOf == null) {
                str2 = "".concat(" tokenExpirationTimestamp");
            }
            if (valueOf2 == null) {
                str2 = com.ironsource.adapters.facebook.a.h(str2, " tokenCreationTimestamp");
            }
            if (str2.isEmpty()) {
                this.f27505b.setResult(new a(str, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
        throw new NullPointerException("Null token");
    }

    @Override // d8.i
    public final boolean b(Exception exc) {
        this.f27505b.trySetException(exc);
        return true;
    }
}
