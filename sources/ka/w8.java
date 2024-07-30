package ka;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class w8 {

    /* renamed from: b, reason: collision with root package name */
    public static w8 f32128b;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f32127a = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f32129c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Long> f32130d = new ConcurrentHashMap<>();

    public static long a(String str) {
        synchronized (f32129c) {
            ConcurrentHashMap<String, Long> concurrentHashMap = f32130d;
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str).longValue();
            }
            concurrentHashMap.put(str, 0L);
            return 0L;
        }
    }

    public static w8 b() {
        w8 w8Var;
        synchronized (f32127a) {
            if (f32128b == null) {
                f32128b = new w8();
            }
            w8Var = f32128b;
        }
        return w8Var;
    }
}
