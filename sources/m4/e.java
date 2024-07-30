package m4;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import d6.g0;
import j7.j0;
import j7.m0;
import j7.t2;
import j7.w1;
import java.util.Arrays;

/* compiled from: AudioCapabilities.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f32726c = new e(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final e f32727d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final w1 f32728e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f32729a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32730b;

    /* compiled from: AudioCapabilities.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final AudioAttributes f32731a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        public static int[] a() {
            boolean isDirectPlaybackSupported;
            j0.b bVar = j0.f30006t;
            j0.a aVar = new j0.a();
            t2 it = e.f32728e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f32731a);
                if (isDirectPlaybackSupported) {
                    aVar.b(Integer.valueOf(intValue));
                }
            }
            aVar.b(2);
            return l7.a.j0(aVar.e());
        }

        public static int b(int i10, int i11) {
            boolean isDirectPlaybackSupported;
            for (int i12 = 8; i12 > 0; i12--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(g0.n(i12)).build(), f32731a);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
            return 0;
        }
    }

    static {
        m0.a aVar = new m0.a(0);
        aVar.a(5, 6);
        aVar.a(17, 6);
        aVar.a(7, 6);
        aVar.a(18, 6);
        aVar.a(6, 8);
        aVar.a(8, 8);
        aVar.a(14, 8);
        f32728e = w1.y(aVar.f30040b, aVar.f30039a);
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f32729a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f32729a = new int[0];
        }
        this.f32730b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        if (r10 != 5) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> a(k4.i0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.D
            r0.getClass()
            java.lang.String r1 = r12.A
            int r0 = d6.r.d(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            j7.w1 r2 = m4.e.f32728e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L19
            return r3
        L19:
            int[] r1 = r11.f32729a
            r4 = 1
            r5 = 0
            r6 = 7
            r7 = 6
            r8 = 8
            r9 = 18
            if (r0 != r9) goto L32
            int r10 = java.util.Arrays.binarySearch(r1, r9)
            if (r10 < 0) goto L2d
            r10 = r4
            goto L2e
        L2d:
            r10 = r5
        L2e:
            if (r10 != 0) goto L32
            r0 = r7
            goto L40
        L32:
            if (r0 != r8) goto L40
            int r10 = java.util.Arrays.binarySearch(r1, r8)
            if (r10 < 0) goto L3c
            r10 = r4
            goto L3d
        L3c:
            r10 = r5
        L3d:
            if (r10 != 0) goto L40
            r0 = r6
        L40:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto L48
            r1 = r4
            goto L49
        L48:
            r1 = r5
        L49:
            if (r1 != 0) goto L4c
            return r3
        L4c:
            r1 = -1
            int r10 = r12.Q
            if (r10 == r1) goto L59
            if (r0 != r9) goto L54
            goto L59
        L54:
            int r12 = r11.f32730b
            if (r10 <= r12) goto L82
            return r3
        L59:
            int r12 = r12.R
            if (r12 == r1) goto L5e
            goto L61
        L5e:
            r12 = 48000(0xbb80, float:6.7262E-41)
        L61:
            int r1 = d6.g0.f27302a
            r9 = 29
            if (r1 < r9) goto L6c
            int r12 = m4.e.a.b(r0, r12)
            goto L81
        L6c:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r12 = r2.getOrDefault(r12, r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r12 = r12.intValue()
        L81:
            r10 = r12
        L82:
            int r12 = d6.g0.f27302a
            r1 = 28
            if (r12 > r1) goto L96
            if (r10 != r6) goto L8c
            r7 = r8
            goto L97
        L8c:
            r1 = 3
            if (r10 == r1) goto L97
            r1 = 4
            if (r10 == r1) goto L97
            r1 = 5
            if (r10 != r1) goto L96
            goto L97
        L96:
            r7 = r10
        L97:
            r1 = 26
            if (r12 > r1) goto La8
            java.lang.String r12 = "fugu"
            java.lang.String r1 = d6.g0.f27303b
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto La8
            if (r7 != r4) goto La8
            r7 = 2
        La8:
            int r12 = d6.g0.n(r7)
            if (r12 != 0) goto Laf
            return r3
        Laf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r12 = android.util.Pair.create(r0, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.e.a(k4.i0):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Arrays.equals(this.f32729a, eVar.f32729a) && this.f32730b == eVar.f32730b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f32729a) * 31) + this.f32730b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f32730b + ", supportedEncodings=" + Arrays.toString(this.f32729a) + "]";
    }
}
