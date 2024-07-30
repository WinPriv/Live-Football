package l4;

import android.util.Base64;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements i7.m {
    @Override // i7.m
    public final Object get() {
        byte[] bArr = new byte[12];
        t.f32441h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
