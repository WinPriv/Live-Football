package d8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetIdListener.java */
/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<String> f27506a;

    public f(TaskCompletionSource<String> taskCompletionSource) {
        this.f27506a = taskCompletionSource;
    }

    @Override // d8.i
    public final boolean a(f8.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (aVar.f() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (aVar.f() == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (aVar.f() == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return false;
                }
            }
        }
        this.f27506a.trySetResult(aVar.f28149b);
        return true;
    }

    @Override // d8.i
    public final boolean b(Exception exc) {
        return false;
    }
}
