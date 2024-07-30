package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.NavigableSet;

/* renamed from: com.facebook.ads.redexgen.X.Gq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0919Gq {
    void A3P(String str, H2 h22) throws C0917Go;

    void A44(File file) throws C0917Go;

    long A5t();

    long A5u(String str, long j10, long j11);

    @NonNull
    NavigableSet<C0923Gu> A5v(String str);

    long A66(String str);

    H0 A67(String str);

    void ADj(C0923Gu c0923Gu);

    void ADq(C0923Gu c0923Gu) throws C0917Go;

    void AEO(String str, long j10) throws C0917Go;

    File AEo(String str, long j10, long j11) throws C0917Go;

    C0923Gu AEq(String str, long j10) throws InterruptedException, C0917Go;

    @Nullable
    C0923Gu AEr(String str, long j10) throws C0917Go;
}
