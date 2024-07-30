package com.onesignal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageInternal.java */
/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26667a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, HashMap<String, String>> f26668b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<ArrayList<z2>> f26669c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<String> f26670d;

    /* renamed from: e, reason: collision with root package name */
    public final h1 f26671e;
    public double f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26672g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26673h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26674i;

    /* renamed from: j, reason: collision with root package name */
    public final Date f26675j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26676k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26677l;

    public b1() {
        this.f26667a = "";
        this.f26671e = new h1();
        this.f26672g = false;
        this.f26673h = false;
        this.f26676k = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            return this.f26667a.equals(((b1) obj).f26667a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26667a.hashCode();
    }

    public final String toString() {
        return "OSInAppMessage{messageId='" + this.f26667a + "', variants=" + this.f26668b + ", triggers=" + this.f26669c + ", clickedClickIds=" + this.f26670d + ", redisplayStats=" + this.f26671e + ", displayDuration=" + this.f + ", displayedInSession=" + this.f26672g + ", triggerChanged=" + this.f26673h + ", actionTaken=" + this.f26674i + ", isPreview=" + this.f26676k + ", endTime=" + this.f26675j + ", hasLiquid=" + this.f26677l + '}';
    }

    public b1(String str, HashSet hashSet, boolean z10, h1 h1Var) {
        this.f26667a = str;
        this.f26671e = new h1();
        this.f26673h = false;
        this.f26670d = hashSet;
        this.f26672g = z10;
        this.f26671e = h1Var;
    }

    public b1(JSONObject jSONObject) throws JSONException {
        this.f26667a = jSONObject.getString("id");
        this.f26671e = new h1();
        this.f26672g = false;
        this.f26673h = false;
        JSONObject jSONObject2 = jSONObject.getJSONObject("variants");
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
            HashMap<String, String> hashMap2 = new HashMap<>();
            Iterator<String> keys2 = jSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject3.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        this.f26668b = hashMap;
        JSONArray jSONArray = jSONObject.getJSONArray("triggers");
        ArrayList<ArrayList<z2>> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList<z2> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(new z2(jSONArray2.getJSONObject(i11)));
            }
            arrayList.add(arrayList2);
        }
        this.f26669c = arrayList;
        this.f26670d = new HashSet();
        Date date = null;
        try {
            String string = jSONObject.getString(com.anythink.core.common.b.e.f4976b);
            if (!string.equals("null")) {
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(string);
                } catch (ParseException e10) {
                    e10.printStackTrace();
                }
            }
        } catch (JSONException unused) {
        }
        this.f26675j = date;
        if (jSONObject.has("has_liquid")) {
            this.f26677l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            this.f26671e = new h1(jSONObject.getJSONObject("redisplay"));
        }
    }
}
