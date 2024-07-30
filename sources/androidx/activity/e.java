package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.e;
import e.a;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f474s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.C0364a f475t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f476u;

    public e(ComponentActivity.b bVar, int i10, a.C0364a c0364a) {
        this.f476u = bVar;
        this.f474s = i10;
        this.f475t = c0364a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.a<O> aVar;
        T t10 = this.f475t.f27611a;
        ComponentActivity.b bVar = this.f476u;
        String str = (String) bVar.f535b.get(Integer.valueOf(this.f474s));
        if (str != null) {
            e.a aVar2 = (e.a) bVar.f.get(str);
            if (aVar2 != null && (aVar = aVar2.f541a) != 0) {
                if (bVar.f538e.remove(str)) {
                    aVar.a(t10);
                }
            } else {
                bVar.f540h.remove(str);
                bVar.f539g.put(str, t10);
            }
        }
    }
}
