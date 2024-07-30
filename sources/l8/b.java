package l8;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import s7.e;
import s7.f;
import s7.v;

/* compiled from: ComponentMonitor.java */
/* loaded from: classes2.dex */
public final class b implements f {
    @Override // s7.f
    public final List<s7.b<?>> b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final s7.b<?> bVar : componentRegistrar.getComponents()) {
            final String str = bVar.f35212a;
            if (str != null) {
                bVar = new s7.b<>(str, bVar.f35213b, bVar.f35214c, bVar.f35215d, bVar.f35216e, new e() { // from class: l8.a
                    @Override // s7.e
                    public final Object d(v vVar) {
                        String str2 = str;
                        s7.b bVar2 = bVar;
                        try {
                            Trace.beginSection(str2);
                            return bVar2.f.d(vVar);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, bVar.f35217g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
