package b5;

/* compiled from: IntArrayQueue.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f2934a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2935b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f2936c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2937d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int f2938e;

    public j() {
        this.f2938e = r0.length - 1;
    }

    public final void a(int i10) {
        int i11 = this.f2936c;
        int[] iArr = this.f2937d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i12 = this.f2934a;
                int i13 = length2 - i12;
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy(this.f2937d, 0, iArr2, i13, i12);
                this.f2934a = 0;
                this.f2935b = this.f2936c - 1;
                this.f2937d = iArr2;
                this.f2938e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = (this.f2935b + 1) & this.f2938e;
        this.f2935b = i14;
        this.f2937d[i14] = i10;
        this.f2936c++;
    }
}
