package com.applovin.impl.mediation.c;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.network.j;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17805a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17806b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.f f17807c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f17808d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f17809e;

    /* renamed from: i, reason: collision with root package name */
    private final MaxError f17810i;

    public d(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar, p pVar) {
        super("TaskFireMediationPostbacks", pVar);
        MaxError maxErrorImpl;
        this.f17805a = str;
        this.f17806b = com.ironsource.adapters.facebook.a.h(str, "_urls");
        this.f17808d = Utils.toUrlSafeMap(map, pVar);
        if (maxError != null) {
            maxErrorImpl = maxError;
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        this.f17810i = maxErrorImpl;
        this.f17807c = fVar;
        Map<String, String> map2 = CollectionUtils.map(7);
        map2.put("AppLovin-Event-Type", str);
        map2.put("AppLovin-Ad-Network-Name", fVar.X());
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) fVar;
            map2.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            map2.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            map2.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.r());
        }
        if (maxError != null) {
            map2.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map2.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f17809e = map2;
    }

    private void a(String str, Map<String, Object> map) {
        d().al().a(j.o().c(str).b("POST").b(this.f17809e).a(false).c(map).b(((Boolean) this.f.a(com.applovin.impl.sdk.c.a.f18681ab)).booleanValue()).a());
    }

    private String b(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull(map.get(str2)));
        }
        return str;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> g6 = this.f17807c.g(this.f17806b);
        Map<String, String> a10 = a();
        Iterator<String> it = g6.iterator();
        while (it.hasNext()) {
            Uri parse = Uri.parse(a(b(it.next(), this.f17808d), this.f17810i));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            Map<String, Object> map = CollectionUtils.map(a10.size());
            for (String str : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str);
                if (a10.containsKey(queryParameter)) {
                    map.put(str, this.f17807c.h(a10.get(queryParameter)));
                } else {
                    clearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            a(clearQuery.build().toString(), map);
        }
    }

    private Map<String, String> a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f.a(com.applovin.impl.sdk.c.a.f18688i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private String a(String str, MaxError maxError) {
        int i10;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i10 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i10 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i10)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
