package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f21928a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, d> f21929b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private List<b> f21930c = new ArrayList(16);

    public d a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f21929b.get(str);
        }
        Logger.w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    public String b() {
        return this.f21928a;
    }

    public void c(String str) {
        this.f21928a = str;
    }

    public List<b> a() {
        return this.f21930c;
    }

    public void b(String str) {
    }

    public void a(String str, d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        this.f21929b.put(str, dVar);
    }

    public void a(List<b> list) {
        this.f21930c = list;
    }
}
