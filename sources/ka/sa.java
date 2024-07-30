package ka;

import java.util.HashMap;

/* loaded from: classes2.dex */
public interface sa<P> {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f31823a;

        /* renamed from: b, reason: collision with root package name */
        public static final ra f31824b;

        static {
            HashMap hashMap = new HashMap();
            f31823a = hashMap;
            pa paVar = new pa();
            f31824b = new ra();
            hashMap.put(String.class, new ta());
            hashMap.put(Integer.TYPE, paVar);
            hashMap.put(Integer.class, paVar);
            hashMap.put(Float.TYPE, paVar);
            hashMap.put(Float.class, paVar);
            hashMap.put(Long.TYPE, paVar);
            hashMap.put(Long.class, paVar);
            hashMap.put(Double.TYPE, paVar);
            hashMap.put(Double.class, paVar);
            hashMap.put(Short.TYPE, paVar);
            hashMap.put(Short.class, paVar);
            hashMap.put(Byte.TYPE, paVar);
            hashMap.put(Byte.class, paVar);
            hashMap.put(Character.TYPE, paVar);
            hashMap.put(Character.class, paVar);
            hashMap.put(Boolean.TYPE, paVar);
            hashMap.put(Boolean.class, paVar);
        }
    }

    String a();

    String a(P p10, na naVar);
}
