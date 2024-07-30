package k4;

import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo.java */
/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f30468a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public static String f30469b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (g0.class) {
            if (f30468a.add(str)) {
                f30469b += ", " + str;
            }
        }
    }
}
