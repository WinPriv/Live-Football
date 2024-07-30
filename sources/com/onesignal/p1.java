package com.onesignal;

import com.onesignal.q1;
import com.onesignal.v0;
import com.onesignal.v3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class p1 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.a f26967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f26968b;

    public p1(q1 q1Var, v0.a aVar) {
        this.f26968b = q1Var;
        this.f26967a = aVar;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        boolean z10;
        int i11;
        q1 q1Var = this.f26968b;
        q1.b(q1Var, "html", i10, str);
        JSONObject jSONObject = new JSONObject();
        int[] iArr = OSUtils.f26621a;
        int i12 = 0;
        while (true) {
            if (i12 < 5) {
                if (i10 == iArr[i12]) {
                    z10 = false;
                    break;
                }
                i12++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 && (i11 = q1Var.f26987d) < 3) {
            q1Var.f26987d = i11 + 1;
            try {
                jSONObject.put("retry", true);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else {
            q1Var.f26987d = 0;
            try {
                jSONObject.put("retry", false);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        this.f26967a.onFailure(jSONObject.toString());
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        this.f26968b.f26987d = 0;
        this.f26967a.a(str);
    }
}
