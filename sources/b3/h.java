package b3;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes.dex */
public final class h implements a<int[]> {
    @Override // b3.a
    public final int a() {
        return 4;
    }

    @Override // b3.a
    public final String b() {
        return "IntegerArrayPool";
    }

    @Override // b3.a
    public final int c(int[] iArr) {
        return iArr.length;
    }

    @Override // b3.a
    public final int[] newArray(int i10) {
        return new int[i10];
    }
}
