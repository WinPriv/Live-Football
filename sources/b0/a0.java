package b0;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class a0 implements Iterable<Intent> {

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList<Intent> f2697s = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    public final Context f2698t;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public a0(Context context) {
        this.f2698t = context;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f2697s.iterator();
    }
}
