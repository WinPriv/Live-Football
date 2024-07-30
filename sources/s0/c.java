package s0;

import android.content.Context;
import android.view.LayoutInflater;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {
    public final int A;
    public final LayoutInflater B;

    /* renamed from: z, reason: collision with root package name */
    public final int f35048z;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.A = i10;
        this.f35048z = i10;
        this.B = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
