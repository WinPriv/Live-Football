package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class BT {
    public final HV A00 = new HV(10);

    @Nullable
    public final Metadata A00(BP bp, @Nullable DE de2) throws IOException, InterruptedException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                bp.AD0(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int A0G = this.A00.A0G();
                int peekedId3Bytes = UV.A03;
                if (A0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int framesLength = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    bp.AD0(bArr, 10, A0D);
                    metadata = new UV(de2).A0O(bArr, framesLength);
                } else {
                    bp.A3K(A0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        bp.AE3();
        bp.A3K(tagLength);
        return metadata;
    }
}
