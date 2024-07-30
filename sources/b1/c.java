package b1;

import android.graphics.Path;
import i2.t;
import java.util.ArrayList;
import s2.g;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2800a = new ArrayList();

    public final void a(Path path) {
        ArrayList arrayList = this.f2800a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                t tVar = (t) arrayList.get(size);
                g.a aVar = g.f35111a;
                if (tVar != null && !tVar.f29159a) {
                    g.a(path, tVar.f29162d.l() / 100.0f, tVar.f29163e.l() / 100.0f, tVar.f.l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
