package j0;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        zc.d.d(bundle, "bundle");
        zc.d.d(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
