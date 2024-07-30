package vc;

import androidx.activity.n;
import java.util.Collection;

/* compiled from: IteratorsJVM.kt */
/* loaded from: classes2.dex */
public class b extends n {
    public static final int N0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
