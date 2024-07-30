package b2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* compiled from: WakeLocks.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2830a = r1.h.e("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f2831b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String b10 = s.f.b("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, b10);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f2831b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, b10);
        }
        return newWakeLock;
    }
}
