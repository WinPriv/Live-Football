package j7;

import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: StandardTable.java */
/* loaded from: classes2.dex */
public final class m2 extends a0<Object, Object> {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f30048t;

    public m2(Map.Entry entry) {
        this.f30048t = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (i7.g.a(getKey(), entry.getKey()) && i7.g.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // z6.f
    public final Object p() {
        return this.f30048t;
    }

    @Override // j7.a0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return super.setValue(obj);
    }
}
