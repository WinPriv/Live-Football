package o8;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class i implements s<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f33736a;

    public i(Class cls) {
        this.f33736a = cls;
    }

    @Override // o8.s
    public final Object a() {
        Class cls = this.f33736a;
        try {
            return z.f33778a.b(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }
}
