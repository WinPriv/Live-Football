package n7;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class f extends Exception {
    @Deprecated
    public f() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
