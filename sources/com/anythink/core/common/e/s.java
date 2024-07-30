package com.anythink.core.common.e;

import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s extends i<u> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5736a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5737b = 2;
    public int R;
    public long S;
    String T = "";
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;

    /* renamed from: aa, reason: collision with root package name */
    private String f5738aa;

    /* renamed from: ab, reason: collision with root package name */
    private String f5739ab;

    /* renamed from: ac, reason: collision with root package name */
    private String f5740ac;

    /* renamed from: ad, reason: collision with root package name */
    private String f5741ad;
    private long ae;
    private int af;
    private String ag;
    private String ah;
    private String ai;
    private String aj;
    private String ak;

    private String Z() {
        return this.ak;
    }

    private int aa() {
        return this.R;
    }

    private long ab() {
        return this.S;
    }

    private long ac() {
        return this.ae;
    }

    private void g(int i10) {
        this.R = i10;
    }

    public final void E(String str) {
        this.ah = str;
    }

    public final void F(String str) {
        this.ai = str;
    }

    public final void G(String str) {
        this.aj = str;
    }

    public final void H(String str) {
        this.U = str;
    }

    public final void I(String str) {
        this.V = str;
    }

    public final void J(String str) {
        this.W = str;
    }

    public final void K(String str) {
        this.X = str;
    }

    public final void L(String str) {
        this.Y = str;
    }

    public final void M(String str) {
        this.Z = str;
    }

    public final String N() {
        return this.aj;
    }

    public final int O() {
        return this.af;
    }

    public final String P() {
        return this.U;
    }

    public final String Q() {
        return this.V;
    }

    public final String R() {
        return this.W;
    }

    public final String S() {
        return this.X;
    }

    public final String T() {
        return this.Y;
    }

    public final String U() {
        return this.Z;
    }

    public final String V() {
        return this.f5738aa;
    }

    public final String W() {
        return this.f5739ab;
    }

    public final String X() {
        return this.f5740ac;
    }

    public final String Y() {
        return this.f5741ad;
    }

    public final void a(String str) {
        this.ak = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    @Override // com.anythink.core.common.e.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.util.List b(com.anythink.core.common.e.u r11) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.s.b(com.anythink.core.common.e.k):java.util.List");
    }

    public final String c() {
        return this.ai;
    }

    @Override // com.anythink.core.common.e.i
    public final int d() {
        return 1;
    }

    @Override // com.anythink.core.common.e.i
    public final String m() {
        return this.T;
    }

    public final void N(String str) {
        this.f5738aa = str;
    }

    public final void O(String str) {
        this.f5739ab = str;
    }

    public final void P(String str) {
        this.f5740ac = str;
    }

    public final void Q(String str) {
        this.f5741ad = str;
    }

    public final String R(String str) {
        try {
            JSONObject jSONObject = new JSONObject(this.ak);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                str = str.replaceAll("\\{" + next + "\\}", jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public final String a() {
        return this.ag;
    }

    public final void a(int i10) {
        this.af = i10;
    }

    public final void a(long j10) {
        this.ae = j10;
    }

    public final boolean a(u uVar) {
        return uVar == null || System.currentTimeMillis() - this.ae > uVar.A();
    }

    public final void b(String str) {
        this.ag = str;
    }

    public final String b() {
        return this.ah;
    }

    private void b(long j10) {
        this.S = j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* renamed from: b, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> b2(com.anythink.core.common.e.u r11) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.s.b2(com.anythink.core.common.e.u):java.util.List");
    }
}
