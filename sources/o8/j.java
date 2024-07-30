package o8;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, m8.k<?>> f33737a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33738b;

    /* renamed from: c, reason: collision with root package name */
    public final List<m8.w> f33739c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class a<T> implements s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.k f33740a;

        public a(m8.k kVar, Type type) {
            this.f33740a = kVar;
        }

        @Override // o8.s
        public final T a() {
            return (T) this.f33740a.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class b<T> implements s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.k f33741a;

        public b(m8.k kVar, Type type) {
            this.f33741a = kVar;
        }

        @Override // o8.s
        public final T a() {
            return (T) this.f33741a.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class c<T> implements s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33742a;

        public c(String str) {
            this.f33742a = str;
        }

        @Override // o8.s
        public final T a() {
            throw new m8.o(this.f33742a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class d<T> implements s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33743a;

        public d(String str) {
            this.f33743a = str;
        }

        @Override // o8.s
        public final T a() {
            throw new m8.o(this.f33743a);
        }
    }

    public j(List list, Map map, boolean z10) {
        this.f33737a = map;
        this.f33738b = z10;
        this.f33739c = list;
    }

    public static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> o8.s<T> b(r8.a<T> r10) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.b(r8.a):o8.s");
    }

    public final String toString() {
        return this.f33737a.toString();
    }
}
