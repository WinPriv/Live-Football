package g4;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes.dex */
public final class h implements b4.b<e> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f28489a = new h();
    }

    @Override // tc.a
    public final Object get() {
        g4.a aVar = e.f28486a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
