package com.onesignal;

import com.onesignal.b4;
import com.onesignal.e3;
import com.onesignal.v3;
import org.json.JSONObject;

/* compiled from: UserStateSynchronizer.java */
/* loaded from: classes2.dex */
public final class b5 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f26695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f26696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z4 f26697c;

    public b5(z4 z4Var, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f26697c = z4Var;
        this.f26695a = jSONObject;
        this.f26696b = jSONObject2;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        e3.b(3, "Failed PUT sync request with status code: " + i10 + " and response: " + str, null);
        synchronized (this.f26697c.f27223a) {
            if (z4.a(this.f26697c, i10, str, "No user with this id found")) {
                z4.c(this.f26697c);
            } else {
                z4.d(this.f26697c, i10);
            }
        }
        if (this.f26695a.has("tags")) {
            z4 z4Var = this.f26697c;
            while (true) {
                e3.n nVar = (e3.n) z4Var.f27227e.poll();
                if (nVar == null) {
                    break;
                } else {
                    nVar.onFailure();
                }
            }
        }
        if (this.f26695a.has("external_user_id")) {
            e3.b(3, "Error setting external user id for push with status code: " + i10 + " and message: " + str, null);
            z4 z4Var2 = this.f26697c;
            while (true) {
                e3.r rVar = (e3.r) z4Var2.f.poll();
                if (rVar == null) {
                    break;
                }
                z4Var2.f27224b.name().toLowerCase();
                rVar.onComplete();
            }
        }
        if (this.f26695a.has("language")) {
            z4 z4Var3 = this.f26697c;
            while (true) {
                b4.a aVar = (b4.a) z4Var3.f27228g.poll();
                if (aVar != null) {
                    aVar.onFailure();
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        synchronized (this.f26697c.f27223a) {
            this.f26697c.j().i(this.f26696b, this.f26695a);
            this.f26697c.t(this.f26695a);
        }
        if (this.f26695a.has("tags")) {
            z4 z4Var = this.f26697c;
            z4Var.getClass();
            b4.d(false);
            while (true) {
                e3.n nVar = (e3.n) z4Var.f27227e.poll();
                if (nVar == null) {
                    break;
                } else {
                    nVar.onSuccess();
                }
            }
        }
        if (this.f26695a.has("external_user_id")) {
            z4 z4Var2 = this.f26697c;
            while (true) {
                e3.r rVar = (e3.r) z4Var2.f.poll();
                if (rVar == null) {
                    break;
                }
                z4Var2.f27224b.name().toLowerCase();
                rVar.onComplete();
            }
        }
        if (this.f26695a.has("language")) {
            this.f26697c.g();
        }
    }
}
