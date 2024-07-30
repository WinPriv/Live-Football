package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1962a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1963b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1964c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void b() {
    }
}
