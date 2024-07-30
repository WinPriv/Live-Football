package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public Context f26387a;

    /* renamed from: b, reason: collision with root package name */
    public com.ironsource.sdk.service.d f26388b;

    /* renamed from: c, reason: collision with root package name */
    public c f26389c;

    /* renamed from: d, reason: collision with root package name */
    public j f26390d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26391e;
    public JSONObject f;

    /* renamed from: g, reason: collision with root package name */
    public int f26392g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26393h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26394i = "y";

    /* renamed from: j, reason: collision with root package name */
    public int f26395j;

    /* JADX WARN: Enum class init method not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f26396a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f26397b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f26398c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f26399d = 4;
    }

    public y(Context context, c cVar, com.ironsource.sdk.service.d dVar, j jVar, int i10, JSONObject jSONObject) {
        int i11;
        int initRecoverTrials = FeaturesManager.getInstance().getInitRecoverTrials();
        this.f26393h = initRecoverTrials;
        Logger.i("y", "getInitialState mMaxAllowedTrials: " + initRecoverTrials);
        if (initRecoverTrials <= 0) {
            Logger.i("y", "recovery is not allowed by config");
            i11 = a.f26399d;
        } else {
            i11 = a.f26396a;
        }
        this.f26395j = i11;
        if (i11 != a.f26399d) {
            this.f26387a = context;
            this.f26389c = cVar;
            this.f26388b = dVar;
            this.f26390d = jVar;
            this.f26391e = i10;
            this.f = jSONObject;
            this.f26392g = 0;
        }
    }

    public final void a(boolean z10) {
        if (this.f26395j != a.f26398c) {
            return;
        }
        if (z10) {
            this.f26387a = null;
            this.f26389c = null;
            this.f26388b = null;
            this.f26390d = null;
            this.f = null;
            this.f26395j = a.f26397b;
            return;
        }
        if (this.f26392g == this.f26393h) {
            Logger.i(this.f26394i, "handleRecoveringEndedFailed | Reached max trials");
            this.f26395j = a.f26399d;
            this.f26387a = null;
            this.f26389c = null;
            this.f26388b = null;
            this.f26390d = null;
            this.f = null;
            return;
        }
        this.f26395j = a.f26396a;
    }

    public final JSONObject b() {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f26395j == a.f26397b) {
                z10 = true;
            } else {
                z10 = false;
            }
            jSONObject.put("isRecovered", z10);
            jSONObject.put("trialNumber", this.f26392g);
            jSONObject.put("maxAllowedTrials", this.f26393h);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public final boolean a() {
        return this.f26395j == a.f26398c;
    }

    public final boolean a(d.c cVar, d.b bVar) {
        String str;
        String str2 = this.f26394i;
        Logger.i(str2, "shouldRecoverWebController: ");
        int i10 = this.f26395j;
        if (i10 == a.f26399d) {
            str = "shouldRecoverWebController: false | recover is not allowed";
        } else if (cVar != d.c.Native) {
            str = "shouldRecoverWebController: false | current controller type is: " + cVar;
        } else if (bVar == d.b.Loading || bVar == d.b.None) {
            str = "shouldRecoverWebController: false | a Controller is currently loading";
        } else if (i10 == a.f26397b) {
            str = "shouldRecoverWebController: false | already recovered";
        } else if (i10 == a.f26398c) {
            str = "shouldRecoverWebController: false | currently in recovering";
        } else {
            if (this.f26387a != null && this.f26389c != null && this.f26388b != null && this.f26390d != null) {
                Logger.i(str2, "shouldRecoverWebController: true | allow recovering ");
                return true;
            }
            str = "shouldRecoverWebController: false | missing mandatory param";
        }
        Logger.i(str2, str);
        return false;
    }
}
