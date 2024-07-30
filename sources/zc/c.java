package zc;

import androidx.activity.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yc.h;
import yc.i;
import yc.j;
import yc.k;
import yc.l;
import yc.m;
import yc.o;
import yc.p;
import yc.q;
import yc.r;
import yc.s;
import yc.t;
import yc.u;
import yc.v;
import yc.w;

/* compiled from: ClassReference.kt */
/* loaded from: classes2.dex */
public final class c implements bd.a<Object>, b {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Class<Object>, Integer> f37363b;

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f37364a;

    static {
        int i10 = 0;
        List F0 = n.F0(yc.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, yc.b.class, yc.c.class, yc.d.class, yc.e.class, yc.f.class, yc.g.class, h.class, i.class, j.class, k.class, m.class, yc.n.class, o.class);
        ArrayList arrayList = new ArrayList(vc.b.N0(F0));
        for (Object obj : F0) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new uc.b((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f37363b = vc.h.L(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        d.c(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            d.c(str, "kotlinName");
            sb2.append(cd.d.Z0(str));
            sb2.append("CompanionObject");
            hashMap3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<Object>, Integer> entry : f37363b.entrySet()) {
            Class<Object> key = entry.getKey();
            int intValue = entry.getValue().intValue();
            hashMap3.put(key.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.r.F(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), cd.d.Z0((String) entry2.getValue()));
        }
    }

    public c(Class<?> cls) {
        d.d(cls, "jClass");
        this.f37364a = cls;
    }

    @Override // zc.b
    public final Class<?> a() {
        return this.f37364a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && d.a(j7.r.A(this), j7.r.A((bd.a) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return j7.r.A(this).hashCode();
    }

    public final String toString() {
        return this.f37364a.toString() + " (Kotlin reflection is not available)";
    }
}
