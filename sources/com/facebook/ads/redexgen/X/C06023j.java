package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.dynview.a.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06023j implements FH, QI {
    public static byte[] A0A;
    public static String[] A0B = {"5Oiv1GLvIq7zEHzIHOTPzi3kaYzi9CKu", "OYJ8Vha7o3AKqeq5fQgjy4YAYzCEKBrH", "4fHxCa0vWIAizdOtLSYViH6HX8wZM136", "7SeobKfCaIBp1RCtBr0PVzHsRPnznuT1", "fOxTiSwrZex6", "3vZIMeafrjOpHP1eiyT8MHuy7IIJRNdQ", "XI5vdZH0G6FndxBvW8fNBqRq2FpLqBJ1", "pJZH6qXQIaEu24ksEJ9XliOUqsc1pAkZ"};
    public final C7G A00;
    public final C7X A01;
    public final InterfaceC1143Po A02;
    public final QJ A03;
    public final QR A04;
    public final QS A05;
    public final String A06;
    public final Map<QE, C0888Fl> A09 = new HashMap();
    public final Map<QE, C4L> A08 = new HashMap();
    public final List<QW> A07 = new ArrayList();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A04() throws Throwable {
        Map<QD, QZ> hashMap = new HashMap<>();
        Map<FI, QM> hashMap2 = new HashMap<>();
        Map<FI, JSONObject> hashMap3 = new HashMap<>();
        Map<FI, JSONObject> hashMap4 = new HashMap<>();
        synchronized (this) {
            for (QD qd : this.A09.values()) {
                if (qd.A8Z()) {
                    hashMap.put(qd, QZ.A04);
                } else {
                    hashMap.put(qd, QZ.A03);
                }
            }
            AtomicReference<JSONObject> atomicReference = new AtomicReference<>();
            AtomicReference<JSONObject> atomicReference2 = new AtomicReference<>();
            for (C4L c4l : this.A08.values()) {
                if (c4l.A8Z()) {
                    if (c4l.A07(atomicReference, atomicReference2)) {
                        hashMap2.put(c4l, QM.A05);
                        hashMap3.put(c4l, atomicReference.get());
                    } else {
                        hashMap2.put(c4l, QM.A04);
                    }
                    hashMap4.put(c4l, atomicReference2.get());
                }
            }
            Iterator<QW> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(a.f11399v, 22, 80));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference3 = new AtomicReference();
        AtomicReference atomicReference4 = new AtomicReference();
        JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        String.format(Locale.US, A01(188, 33, 55), this.A06, A03.toString(2));
        this.A02.AD5(this.A06, (A01(327, 8, 88) + URLEncoder.encode(A03.toString())).getBytes(), new FF(this, atomicReference3, atomicReference4, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference4.get() != null) {
                throw ((Throwable) atomicReference4.get());
            }
            Set<QV> A02 = A02((JSONObject) atomicReference3.get());
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            Iterator<QV> it2 = A02.iterator();
            while (it2.hasNext()) {
                it2.next().A3O(hashMap5, hashMap6);
            }
            this.A03.A5Q(A00((JSONObject) atomicReference3.get()));
            Iterator<QW> it3 = this.A07.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw new NullPointerException(A01(381, 23, 105));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{101, -82, -72, 101, -73, -86, -72, -71, -73, -82, -88, -71, -86, -87, 115, 101, -104, -80, -82, -75, -75, -82, -77, -84, 101, -72, -66, -77, -88, -48, -1, -1, -81, -8, -3, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -67, -54, -24, -11, -11, -10, -5, -89, -22, -7, -20, -24, -5, -20, -89, -6, -20, -7, -3, -20, -7, -89, -23, -4, -11, -21, -13, -20, -89, -2, -16, -5, -17, -89, -11, -10, -11, -76, -6, -20, -7, -3, -20, -7, -89, -10, -2, -11, -20, -21, -89, -23, -4, -11, -21, -13, -20, -89, -48, -53, -85, -56, -37, -56, -121, -41, -39, -42, -54, -52, -38, -38, -48, -43, -50, -121, -42, -41, -37, -48, -42, -43, -121, -49, -12, -4, -25, -14, -17, -22, -90, -8, -21, -20, -8, -21, -7, -18, -90, -6, -17, -13, -21, -64, -90, -85, -22, -79, -56, -38, -125, -42, -56, -43, -39, -56, -43, -112, -46, -38, -47, -56, -57, -125, -59, -40, -47, -57, -49, -56, -125, -58, -43, -56, -60, -41, -56, -57, -99, -125, -120, -42, -101, -63, -74, -85, -80, -70, -73, -74, -79, -62, -87, -68, -79, -73, -74, 104, -70, -83, -71, -67, -83, -69, -68, 104, -68, -73, 104, 109, -69, -126, 82, 109, -69, -88, -50, -61, -72, -67, -57, -60, -61, -66, -49, -74, -55, -66, -60, -61, 117, -57, -70, -56, -59, -60, -61, -56, -70, -113, 95, 122, -56, 114, -104, -115, -126, -121, -111, -114, -115, -120, -103, Byte.MIN_VALUE, -109, -120, -114, -115, 63, -111, -108, -115, 63, -123, Byte.MIN_VALUE, -120, -117, -124, -125, 90, 63, -123, -114, -111, -126, -120, -115, -122, 63, -120, -115, 63, 68, -125, 63, -110, -124, -126, -114, -115, -125, -110, -103, -84, -91, -101, -93, -100, -86, -107, -95, -96, -90, -105, -86, -90, -122, -125, -106, -125, -89, -86, -81, -88, -90, -77, -79, -77, -86, -81, -75, -39, -54, -30, -43, -40, -54, -51, -90, -45, -58, -57, -45, -58, -44, -55, -40, -53, -41, -37, -53, -39, -38, -34, -47, -33, -36, -37, -38, -33, -47, -59, -73, -60, -56, -73, -60, -95, -55, -64, -73, -74, -108, -57, -64, -74, -66, -73, -107, -60, -73, -77, -58, -73, -74, -19, -13, -24, -35, -30, -20, -23, -24, -29, -12, -37, -18, -29, -23, -24, -64, -29, -24, -29, -19, -30, -33, -34, -44, -38, -49, -60, -55, -45, -48, -49, -54, -37, -62, -43, -54, -48, -49, -76, -43, -62, -45, -43, -58, -59, -73, -92, -75, -86, -88, -73, -94, -75, -88, -87, -75, -88, -74, -85, -94, -74};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(Throwable th) {
        Iterator<QW> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(381, 23, 105));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.FH
    public final synchronized QD A4O(QE qe) {
        if (qe.A02() != QG.A03) {
            throw new IllegalArgumentException(A01(47, 59, 118));
        }
        if (this.A09.containsKey(qe)) {
            return this.A09.get(qe);
        }
        C0888Fl c0888Fl = new C0888Fl(qe);
        this.A09.put(qe, c0888Fl);
        Iterator<QW> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(357, 24, 65));
        }
        String.format(Locale.US, A01(153, 35, 82), qe);
        return c0888Fl;
    }

    static {
        A05();
    }

    public C06023j(C7G c7g, C7X c7x, InterfaceC1143Po interfaceC1143Po, String str, QS qs, QR qr, QH qh) {
        this.A00 = c7g;
        this.A01 = c7x;
        this.A02 = interfaceC1143Po;
        this.A06 = str;
        this.A05 = qs;
        this.A04 = qr;
        this.A03 = qh.A4C(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getJSONObject(A01(335, 7, 80)).getInt(A01(426, 16, 50));
        if (i10 > 0) {
            return i10;
        }
        throw new JSONException(String.format(Locale.US, A01(com.anythink.expressad.video.module.a.a.T, 24, 117), Integer.valueOf(i10)));
    }

    private Set<QV> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(349, 8, 91));
        JSONObject jSONObject3 = jSONObject.getJSONObject(A01(com.anythink.expressad.foundation.g.a.aX, 7, 38));
        for (final C0888Fl c0888Fl : this.A09.values()) {
            int i10 = QU.A01[EnumC1155Qa.A00(jSONObject2.getString(c0888Fl.A6j().A03())).ordinal()];
            if (i10 == 1) {
                final JSONObject fingerprint = jSONObject3.getJSONObject(c0888Fl.A6j().A03()).getJSONObject(A01(312, 4, 17));
                final JSONObject responseObject = jSONObject3.getJSONObject(c0888Fl.A6j().A03()).optJSONObject(A01(316, 11, 48));
                hashSet.add(new FD(c0888Fl, fingerprint, responseObject) { // from class: com.facebook.ads.redexgen.X.3m
                    public final JSONObject A00;

                    @Nullable
                    public final JSONObject A01;

                    {
                        EnumC1155Qa enumC1155Qa = EnumC1155Qa.A03;
                        this.A00 = fingerprint;
                        this.A01 = responseObject;
                    }

                    @Override // com.facebook.ads.redexgen.X.FD, com.facebook.ads.redexgen.X.QV
                    public final void A3O(Map<QD, EnumC1155Qa> map, Map<FI, QN> map2) {
                        super.A00.A05(this.A00, this.A01);
                        super.A3O(map, map2);
                    }
                });
            } else if (i10 == 2) {
                hashSet.add(new FD(c0888Fl) { // from class: com.facebook.ads.redexgen.X.3l
                    {
                        EnumC1155Qa enumC1155Qa = EnumC1155Qa.A04;
                    }
                });
            } else {
                throw new AssertionError();
            }
        }
        for (final C4L c4l : this.A08.values()) {
            int i11 = QU.A00[QN.A00(jSONObject2.getString(c4l.A6j().A03())).ordinal()];
            if (i11 == 1) {
                hashSet.add(new FE(c4l) { // from class: com.facebook.ads.redexgen.X.45
                    {
                        QN qn = QN.A04;
                    }
                });
            } else if (i11 == 2) {
                hashSet.add(new FE(c4l) { // from class: com.facebook.ads.redexgen.X.3k
                    {
                        QN qn = QN.A05;
                    }

                    @Override // com.facebook.ads.redexgen.X.FE, com.facebook.ads.redexgen.X.QV
                    public final void A3O(Map<QD, EnumC1155Qa> map, Map<FI, QN> map2) {
                        this.A01.A06();
                        super.A3O(map, map2);
                    }
                });
            } else {
                throw new AssertionError();
            }
        }
        return hashSet;
    }

    private JSONObject A03(Map<QD, QZ> map, Map<FI, QM> map2, Map<FI, JSONObject> map3, Map<FI, JSONObject> map4) throws JSONException {
        String A01;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<QD, QZ> entry : map.entrySet()) {
            jSONObject.put(entry.getKey().A6j().A03(), entry.getValue().A02());
        }
        for (Map.Entry<FI, QM> entry2 : map2.entrySet()) {
            jSONObject.put(entry2.getKey().A6j().A03(), entry2.getValue().A02());
        }
        JSONObject bundleData = new JSONObject();
        Iterator<Map.Entry<QD, QZ>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(316, 11, 48);
            if (!hasNext) {
                break;
            }
            Map.Entry<QD, QZ> next = it.next();
            if (next.getValue() == QZ.A04) {
                JSONObject bundles = new JSONObject();
                QD key = next.getKey();
                bundleData.put(key.A6j().A03(), bundles);
                if (next.getKey().A6j().A04()) {
                    JSONObject request = key.A6e();
                    bundles.put(A01, request);
                } else {
                    bundles.put(A01, JSONObject.NULL);
                }
                bundleData.put(key.A6j().A03(), bundles);
            }
        }
        for (Map.Entry<FI, QM> entry3 : map2.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            FI key2 = entry3.getKey();
            JSONObject request2 = map4.get(entry3.getKey());
            jSONObject2.put(A01, request2);
            if (entry3.getValue() == QM.A05) {
                jSONObject2.put(A01(312, 4, 17), map3.get(key2));
                bundleData.put(key2.A6j().A03(), jSONObject2);
            } else {
                String A03 = key2.A6j().A03();
                String[] strArr = A0B;
                if (strArr[1].charAt(20) == strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                A0B[5] = "j6hI8A69HBwx3QyEu85lNgwu8aXeWQ7U";
                bundleData.put(A03, jSONObject2);
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A6V().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject3.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject syncRequest = new JSONObject();
        syncRequest.put(A01(342, 7, 85), jSONObject);
        syncRequest.put(A01(com.anythink.expressad.foundation.g.a.aX, 7, 38), bundleData);
        syncRequest.put(A01(IronSourceConstants.OFFERWALL_OPENED, 7, 33), jSONObject3);
        return syncRequest;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 68), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e10) {
            atomicReference2.set(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FH, com.facebook.ads.redexgen.X.C7M
    public final void A5S() {
        this.A03.A5R();
    }

    @Override // com.facebook.ads.redexgen.X.QI
    @SuppressLint({"CatchGeneralException"})
    public final void AE6() {
        if (this.A01.A8a()) {
            String str = A01(106, 23, 86) + this.A01.A6I().A07() + A01(0, 29, 52);
            A08(new QY());
            return;
        }
        try {
            if (!ID.A1Q(this.A00) || this.A00.A02().A8S()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 126));
        } catch (Throwable th) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int A01 = this.A04.A01();
            if (A0B[5].charAt(3) != 'I') {
                Throwable t10 = new RuntimeException();
                throw t10;
            }
            String[] strArr = A0B;
            strArr[2] = "JEtZyGAVdUTB5WRsJGoBqRot3n7K2sjz";
            strArr[3] = "em0I48mZsoEuthzWerVnjSUWeJS3cW5z";
            objArr[0] = Integer.valueOf(A01);
            String.format(locale, A01(249, 49, 14), objArr);
            A08(th);
            this.A03.A5Q(this.A04.A01());
        }
    }
}
