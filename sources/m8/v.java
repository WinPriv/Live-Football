package m8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: s, reason: collision with root package name */
    public static final a f32944s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ v[] f32945t;

    /* compiled from: LongSerializationPolicy.java */
    /* loaded from: classes2.dex */
    public enum a extends v {
        public a() {
            super("DEFAULT", 0);
        }
    }

    static {
        a aVar = new a();
        f32944s = aVar;
        f32945t = new v[]{aVar, new v() { // from class: m8.v.b
        }};
    }

    public v() {
        throw null;
    }

    public v(String str, int i10) {
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f32945t.clone();
    }
}
