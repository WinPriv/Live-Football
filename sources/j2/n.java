package j2;

import java.util.List;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class n extends g<l2.b> {
    public n(List<t2.a<l2.b>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j2.a
    public final Object g(t2.a aVar, float f) {
        T t10;
        float floatValue;
        l2.b bVar;
        t2.c cVar = this.f29579e;
        Object obj = aVar.f35379b;
        if (cVar != null) {
            float f10 = aVar.f35383g;
            Float f11 = aVar.f35384h;
            if (f11 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f11.floatValue();
            }
            l2.b bVar2 = (l2.b) obj;
            Object obj2 = aVar.f35380c;
            if (obj2 == null) {
                bVar = bVar2;
            } else {
                bVar = (l2.b) obj2;
            }
            return (l2.b) cVar.b(f10, floatValue, bVar2, bVar, f, d(), this.f29578d);
        }
        if (f == 1.0f && (t10 = aVar.f35380c) != 0) {
            return (l2.b) t10;
        }
        return (l2.b) obj;
    }
}
