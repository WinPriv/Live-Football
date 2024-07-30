package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.Ty, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1256Ty extends GF {
    public static String[] A01 = {"26JblF4b6dorFS8jU2vwriUxZ0G71mwq", "Xnpi2o2sUEOze", "R71e3dTOAhzB09tZHggtqRTS0V3by", "x11tshWAsx1g8", "baPvwG8wSWpB2aFi4", "NgcUJ4cAOsbj9", "II", "FdNrM275eXYBmZtzCUl1db95x7ONP"};

    @Nullable
    public GA A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.GF
    public final GG A0T(InterfaceC07449g[] interfaceC07449gArr, TrackGroupArray trackGroupArray) throws AnonymousClass98 {
        int[] iArr = new int[interfaceC07449gArr.length + 1];
        TrackGroup[][] trackGroupArr = new TrackGroup[interfaceC07449gArr.length + 1];
        int[][][] iArr2 = new int[interfaceC07449gArr.length + 1][];
        for (int i10 = 0; i10 < trackGroupArr.length; i10++) {
            trackGroupArr[i10] = new TrackGroup[trackGroupArray.A01];
            iArr2[i10] = new int[trackGroupArray.A01];
        }
        int[] A0S = A0S(interfaceC07449gArr);
        for (int i11 = 0; i11 < trackGroupArray.A01; i11++) {
            TrackGroup A012 = trackGroupArray.A01(i11);
            int A0Q = A0Q(interfaceC07449gArr, A012);
            int[] A0R = A0Q == interfaceC07449gArr.length ? new int[A012.A01] : A0R(interfaceC07449gArr[A0Q], A012);
            int i12 = iArr[A0Q];
            trackGroupArr[A0Q][i12] = A012;
            iArr2[A0Q][i12] = A0R;
            iArr[A0Q] = iArr[A0Q] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC07449gArr.length];
        int[] iArr3 = new int[interfaceC07449gArr.length];
        for (int i13 = 0; i13 < interfaceC07449gArr.length; i13++) {
            int i14 = iArr[i13];
            trackGroupArrayArr[i13] = new TrackGroupArray((TrackGroup[]) C0940Hl.A0k(trackGroupArr[i13], i14));
            iArr2[i13] = (int[][]) C0940Hl.A0k(iArr2[i13], i14);
            iArr3[i13] = interfaceC07449gArr[i13].A7g();
        }
        GA ga2 = new GA(iArr3, trackGroupArrayArr, A0S, iArr2, new TrackGroupArray((TrackGroup[]) C0940Hl.A0k(trackGroupArr[interfaceC07449gArr.length], iArr[interfaceC07449gArr.length])));
        Pair<C07459h[], GC[]> A0V = A0V(ga2, iArr2, A0S);
        return new GG((C07459h[]) A0V.first, (GC[]) A0V.second, ga2);
    }

    public abstract Pair<C07459h[], GC[]> A0V(GA ga2, int[][][] iArr, int[] iArr2) throws AnonymousClass98;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0Q(com.facebook.ads.redexgen.X.InterfaceC07449g[] r6, com.facebook.ads.internal.exoplayer2.source.TrackGroup r7) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L3:
            int r0 = r6.length
            if (r3 >= r0) goto L25
            r2 = r6[r3]
            r1 = 0
        L9:
            int r0 = r7.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.internal.exoplayer2.Format r0 = r7.A01(r1)
            int r0 = r2.AEy(r0)
            r0 = r0 & 7
            if (r0 <= r4) goto L1f
            r5 = r3
            r4 = r0
            r0 = 4
            if (r4 != r0) goto L1f
            return r5
        L1f:
            int r1 = r1 + 1
            goto L9
        L22:
            int r3 = r3 + 1
            goto L3
        L25:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1256Ty.A0Q(com.facebook.ads.redexgen.X.9g[], com.facebook.ads.internal.exoplayer2.source.TrackGroup):int");
    }

    public static int[] A0R(InterfaceC07449g interfaceC07449g, TrackGroup trackGroup) throws AnonymousClass98 {
        int[] iArr = new int[trackGroup.A01];
        for (int i10 = 0; i10 < trackGroup.A01; i10++) {
            iArr[i10] = interfaceC07449g.AEy(trackGroup.A01(i10));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC07449g[] interfaceC07449gArr) throws AnonymousClass98 {
        int[] iArr = new int[interfaceC07449gArr.length];
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int i11 = str.length();
            if (i11 == str2.length()) {
                throw new RuntimeException();
            }
            A01[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            if (i10 < length) {
                iArr[i10] = interfaceC07449gArr[i10].AF0();
                i10++;
            } else {
                return iArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GF
    public final void A0U(Object obj) {
        this.A00 = (GA) obj;
    }
}
