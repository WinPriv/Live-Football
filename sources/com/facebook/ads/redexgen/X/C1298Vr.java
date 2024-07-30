package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.k.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Vr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1298Vr implements A7 {
    public static String[] A06 = {"5utGUnn02b5VIzuc1FLHs1Qqi0fGEzz2", "DaG3Y2wQcTFt6n6rQ7Gr6iJZtSjkgUIR", "I5wcdOmu3UXBpwLMhd1MA2dM71iQzRTS", "a3TfZcOy08z7kq2pPCWxFv40lmZdIopZ", "nCxl35vO69EqZhEDDoDcGzJRz4rMZlE7", "Y5761Ga76B4ReZAKlzLfDyZ1gXjGXB3L", "t1lur4hbWemc11jTFC6OlnNGsbjhQ3VM", "6CnjKSKlGDDfBCJgDd7Ssr26upnReJdk"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = A7.A00;
    public ByteBuffer A04 = A7.A00;

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A47(int i10, int i11, int i12) throws A6 {
        if (i12 == 3 || i12 == 2 || i12 == Integer.MIN_VALUE || i12 == 1073741824) {
            if (this.A02 == i10 && this.A00 == i11 && this.A01 == i12) {
                return false;
            }
            this.A02 = i10;
            this.A00 = i11;
            this.A01 = i12;
            return true;
        }
        throw new A6(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final ByteBuffer A71() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = A7.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A72() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A73() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A74() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8L() {
        int i10 = this.A01;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8P() {
        return this.A05 && this.A04 == A7.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADN() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADO(ByteBuffer byteBuffer) {
        int i10;
        int resampledSize = byteBuffer.position();
        int size = byteBuffer.limit();
        int limit = size - resampledSize;
        int position = this.A01;
        if (position == Integer.MIN_VALUE) {
            i10 = (limit / 3) * 2;
        } else if (position == 3) {
            i10 = limit * 2;
        } else if (position == 1073741824) {
            i10 = limit / 2;
        } else {
            throw new IllegalStateException();
        }
        int capacity = this.A03.capacity();
        String[] strArr = A06;
        if (strArr[6].charAt(17) == strArr[3].charAt(17)) {
            String[] strArr2 = A06;
            strArr2[2] = "W94yXwDUFyNDAMV4dQ9gRwTb9HKmhar0";
            strArr2[1] = "UxSCLQ06z7wJwwSNZRUXPEmpHaH1zCeE";
            if (capacity < i10) {
                this.A03 = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
            } else {
                this.A03.clear();
            }
            int position2 = this.A01;
            if (position2 == Integer.MIN_VALUE) {
                while (resampledSize < size) {
                    this.A03.put(byteBuffer.get(resampledSize + 1));
                    this.A03.put(byteBuffer.get(resampledSize + 2));
                    resampledSize += 3;
                }
            } else if (position2 == 3) {
                while (resampledSize < size) {
                    this.A03.put((byte) 0);
                    this.A03.put((byte) ((byteBuffer.get(resampledSize) & p.f9095b) - 128));
                    resampledSize++;
                }
            } else if (position2 == 1073741824) {
                while (resampledSize < size) {
                    ByteBuffer byteBuffer2 = this.A03;
                    String[] strArr3 = A06;
                    if (strArr3[2].charAt(9) != strArr3[1].charAt(9)) {
                        String[] strArr4 = A06;
                        strArr4[2] = "sfuVTkj8IwDRAmHRKMELNpZyhpVkIKBS";
                        strArr4[1] = "Fl4ka6a0nXkGByMLlkeuhoftQnViDXP0";
                        byteBuffer2.put(byteBuffer.get(resampledSize + 2));
                        this.A03.put(byteBuffer.get(resampledSize + 3));
                        resampledSize += 4;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
            byteBuffer.position(byteBuffer.limit());
            this.A03.flip();
            this.A04 = this.A03;
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void flush() {
        this.A04 = A7.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = A7.A00;
    }
}
