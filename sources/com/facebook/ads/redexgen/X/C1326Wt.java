package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1326Wt implements InterfaceC06545k {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final QD A01;
    public Set<InterfaceC06575n> A00 = new HashSet();
    public final List<InterfaceC06565m> A02 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, Ascii.VT, -46, -72, -67, Ascii.VT, 41, 59, 59, 45, 60, 59};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.A8Z()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC06575n> A01 = A01(this.A01.A6H());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            Iterator<InterfaceC06565m> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A3S();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC06575n interfaceC06575n : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC06575n.A7h(), interfaceC06575n.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C1326Wt(FH fh) {
        this.A01 = fh.A4O(QE.A0B);
        this.A01.A3F(new C1327Wu(this));
        A03();
    }

    @Nullable
    public static Set<InterfaceC06575n> A01(JSONObject jSONObject) {
        C1325Ws A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null || (A00 = C1325Ws.A00(optJSONObject)) == null) {
                return null;
            }
            hashSet.add(A00);
            if (A04[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06545k
    public final void A3D(InterfaceC06565m interfaceC06565m) {
        this.A02.add(interfaceC06565m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06545k
    public final synchronized Set<InterfaceC06575n> A5h() {
        return new HashSet(this.A00);
    }
}
