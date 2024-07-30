package j0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        zc.d.d(bundle, "bundle");
        zc.d.d(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        zc.d.d(bundle, "bundle");
        zc.d.d(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
