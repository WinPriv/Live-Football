package hd;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f28970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28971b;

    public q(byte[] bArr, int i10) {
        this.f28970a = bArr;
        this.f28971b = i10;
    }

    public final String toString() {
        char c10;
        byte[] bArr = this.f28970a;
        int i10 = this.f28971b;
        byte b10 = bArr[i10];
        StringBuffer stringBuffer = new StringBuffer(b10 * 2);
        for (int i11 = 0; i11 < b10; i11++) {
            int i12 = i11 * 2;
            byte b11 = bArr[i12 + i10 + 1];
            if (b11 != 0) {
                if (b11 != 1) {
                    if (b11 != 2) {
                        if (b11 != 3) {
                            c10 = '_';
                        } else {
                            stringBuffer.append((int) bArr[i12 + i10 + 2]);
                            c10 = ';';
                        }
                    } else {
                        c10 = '*';
                    }
                } else {
                    c10 = '.';
                }
            } else {
                c10 = '[';
            }
            stringBuffer.append(c10);
        }
        return stringBuffer.toString();
    }
}
