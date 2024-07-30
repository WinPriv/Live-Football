package b3;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // b3.a
    public final int a() {
        return 1;
    }

    @Override // b3.a
    public final String b() {
        return "ByteArrayPool";
    }

    @Override // b3.a
    public final int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // b3.a
    public final byte[] newArray(int i10) {
        return new byte[i10];
    }
}
