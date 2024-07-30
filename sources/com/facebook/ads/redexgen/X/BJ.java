package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public interface BJ {
    byte[] executeKeyRequest(UUID uuid, BA ba2, @Nullable String str) throws Exception;

    byte[] executeProvisionRequest(UUID uuid, BE be) throws Exception;
}
