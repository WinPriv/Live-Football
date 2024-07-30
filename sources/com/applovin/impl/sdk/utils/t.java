package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f19540a = new t();

    /* renamed from: b, reason: collision with root package name */
    protected String f19541b;

    /* renamed from: c, reason: collision with root package name */
    protected final List<t> f19542c;

    /* renamed from: d, reason: collision with root package name */
    private final t f19543d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19544e;
    private final Map<String, String> f;

    public t(String str, Map<String, String> map, t tVar) {
        this.f19543d = tVar;
        this.f19544e = str;
        this.f = Collections.unmodifiableMap(map);
        this.f19542c = new ArrayList();
    }

    public String a() {
        return this.f19544e;
    }

    public Map<String, String> b() {
        return this.f;
    }

    public String c() {
        return this.f19541b;
    }

    public List<t> d() {
        return Collections.unmodifiableList(this.f19542c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f19544e + "', text='" + this.f19541b + "', attributes=" + this.f + '}';
    }

    public List<t> a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f19542c.size());
            for (t tVar : this.f19542c) {
                if (str.equalsIgnoreCase(tVar.a())) {
                    arrayList.add(tVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public t b(String str) {
        if (str != null) {
            for (t tVar : this.f19542c) {
                if (str.equalsIgnoreCase(tVar.a())) {
                    return tVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public t c(String str) {
        if (str != null) {
            if (this.f19542c.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                t tVar = (t) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(tVar.a())) {
                    return tVar;
                }
                arrayList.addAll(tVar.d());
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    private t() {
        this.f19543d = null;
        this.f19544e = "";
        this.f = Collections.emptyMap();
        this.f19541b = "";
        this.f19542c = Collections.emptyList();
    }
}
