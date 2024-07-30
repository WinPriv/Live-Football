package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class US implements D2 {
    public static String[] A03 = {"TasyJMHsWGEkz863ImR0Q5Lz0Jv5KZRl", "wAvcoPGmhTOD2UdnkI7mjYYyFDdz6tY4", "tIFolEUfJcQQhLLKuuKqSvXZilOQ0d41", "wnba1Mxhk7UAzMMhJxuW", "IqdHVgHf3sWcJ9J53HVfrlZmkyidEDTw", "kUaC4Xj2GLTFGhk3U8FgQLf5h3yptWRi", "yAL9OJMifRSpz7GOwtKlA6RWbWPVLH5t", "1By3yk2Axs3IVYX9txEI"};

    @Nullable
    public C0936Hh A00;
    public final HV A02 = new HV();
    public final HU A01 = new HU();

    @Override // com.facebook.ads.redexgen.X.D2
    public final Metadata A4h(C9 c92) throws D3 {
        if (this.A00 == null || c92.A00 != this.A00.A05()) {
            this.A00 = new C0936Hh(((C1294Vn) c92).A00);
            this.A00.A06(((C1294Vn) c92).A00 - c92.A00);
        }
        ByteBuffer buffer = c92.A01;
        byte[] array = buffer.array();
        int limit = buffer.limit();
        this.A02.A0b(array, limit);
        this.A01.A0C(array, limit);
        this.A01.A08(39);
        long A04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
        this.A01.A08(20);
        int A042 = this.A01.A04(12);
        int spliceCommandType = this.A01.A04(8);
        Metadata.Entry entry = null;
        this.A02.A0Z(14);
        if (spliceCommandType == 0) {
            entry = new SpliceNullCommand();
        } else if (spliceCommandType == 255) {
            HV hv = this.A02;
            if (A03[1].charAt(6) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "IAVDgnOrTVyqUqMF0jCb";
            strArr[7] = "AiSzseiiVBo4zRVGAcCm";
            entry = PrivateCommand.A00(hv, A042, A04);
        } else if (spliceCommandType == 4) {
            entry = SpliceScheduleCommand.A00(this.A02);
        } else if (spliceCommandType == 5) {
            entry = SpliceInsertCommand.A00(this.A02, A04, this.A00);
        } else if (spliceCommandType == 6) {
            entry = TimeSignalCommand.A01(this.A02, A04, this.A00);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
