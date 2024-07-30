package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SharedValues.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, HashSet<WeakReference<a>>> f1519a;

    /* compiled from: SharedValues.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b() {
        new SparseIntArray();
        this.f1519a = new HashMap<>();
    }
}
