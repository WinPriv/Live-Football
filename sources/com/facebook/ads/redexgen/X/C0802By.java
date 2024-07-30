package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.By, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0802By {
    public static String[] A00 = {"5xEbc1UmueoelDSrZ01pbd3BmJNIPp1U", "V2pwOmwpGDtIWtnsLDXNbgXk3OH02STy", "ZygQfCeNfaSOACHLv", "IIEFhzt6S27nqtVGpISchgUV1ko256DH", "7IV1id8R", "S", "X", "3B1kWjUEw7n1jDPOxVE4cJw7NZn0CFn3"};

    public static C0801Bx A00(int i10, long[] jArr, int[] iArr, long j10) {
        int chunkSamplesRemaining = 8192 / i10;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += C0940Hl.A04(i12, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[i11];
        String[] strArr = A00;
        String str = strArr[5];
        String str2 = strArr[6];
        int maxSampleCount = str.length();
        if (maxSampleCount != str2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[4] = "MOnhYedn";
        strArr2[2] = "VzeyWK1Y20Sbegflw";
        int[] iArr2 = new int[i11];
        int originalSampleIndex = 0;
        long[] timestamps = new long[i11];
        int[] flags = new int[i11];
        int i13 = 0;
        int bufferSampleCount = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int rechunkedSampleCount = iArr[i14];
            long j11 = jArr[i14];
            while (rechunkedSampleCount > 0) {
                int min = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j11;
                iArr2[bufferSampleCount] = i10 * min;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i13 * j10;
                flags[bufferSampleCount] = 1;
                j11 += iArr2[bufferSampleCount];
                i13 += min;
                rechunkedSampleCount -= min;
                bufferSampleCount++;
            }
        }
        return new C0801Bx(jArr2, iArr2, originalSampleIndex, timestamps, flags, j10 * i13);
    }
}
