package u0;

import java.util.Arrays;
import java.util.List;
import m2.i;

/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes.dex */
public abstract class c implements i {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f35737s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f35738t;

    public /* synthetic */ c(Object obj, int i10) {
        this.f35737s = i10;
        this.f35738t = obj;
    }

    @Override // m2.i
    public final List b() {
        return (List) this.f35738t;
    }

    @Override // m2.i
    public final boolean c() {
        Object obj = this.f35738t;
        if (((List) obj).isEmpty()) {
            return true;
        }
        if (((List) obj).size() == 1 && ((t2.a) ((List) obj).get(0)).c()) {
            return true;
        }
        return false;
    }

    public abstract float d(Object obj);

    public abstract void e(Object obj, float f);

    public final String toString() {
        switch (this.f35737s) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f35738t;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
