package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f19368a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    private final String f19369b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f19370c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19371d;

    public u(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f19369b = str;
        Map<String, Object> map3 = CollectionUtils.map();
        this.f19370c = map3;
        map3.putAll(map);
        map3.put("applovin_sdk_super_properties", map2);
        this.f19371d = System.currentTimeMillis();
    }

    public String a() {
        return this.f19369b;
    }

    public Map<String, Object> b() {
        return this.f19370c;
    }

    public long c() {
        return this.f19371d;
    }

    public String d() {
        return this.f19368a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f19371d != uVar.f19371d) {
            return false;
        }
        String str = this.f19369b;
        if (str == null ? uVar.f19369b != null : !str.equals(uVar.f19369b)) {
            return false;
        }
        Map<String, Object> map = this.f19370c;
        if (map == null ? uVar.f19370c != null : !map.equals(uVar.f19370c)) {
            return false;
        }
        String str2 = this.f19368a;
        String str3 = uVar.f19368a;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f19369b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Map<String, Object> map = this.f19370c;
        if (map != null) {
            i11 = map.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        long j10 = this.f19371d;
        int i15 = (i14 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f19368a;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i15 + i12;
    }

    public String toString() {
        return "Event{name='" + this.f19369b + "', id='" + this.f19368a + "', creationTimestampMillis=" + this.f19371d + ", parameters=" + this.f19370c + '}';
    }
}
