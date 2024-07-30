package com.ironsource.sdk.g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f26471a;

    /* renamed from: b, reason: collision with root package name */
    public String f26472b;

    /* renamed from: c, reason: collision with root package name */
    public String f26473c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26474d;

    /* renamed from: e, reason: collision with root package name */
    public int f26475e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f26476g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26477h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26478i;

    /* renamed from: j, reason: collision with root package name */
    public Map<String, String> f26479j;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList<String> f26480s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f26481t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<String> f26482u;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f26483v;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b() {
        c();
    }

    public static HashMap a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return hashMap;
    }

    public final void c() {
        this.f26474d = false;
        this.f26475e = -1;
        this.f26480s = new ArrayList<>();
        this.f26481t = new ArrayList<>();
        this.f26482u = new ArrayList<>();
        new ArrayList();
        this.f26477h = true;
        this.f26478i = false;
        this.f26476g = "";
        this.f = "";
        this.f26483v = new HashMap();
        this.f26479j = new HashMap();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f26474d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f26475e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f26480s);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f26481t);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f26476g);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f26483v);
            sb2.append(", ");
            sb2.append("OWReportInit");
            sb2.append(this.f26477h);
            sb2.append(", ");
            sb2.append("OWInitSuccess");
            sb2.append(this.f26478i);
            sb2.append(", ");
            sb2.append("OWExtraParams");
            sb2.append(this.f26479j);
            sb2.append(", ");
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        int i12;
        try {
            int i13 = 1;
            if (this.f26474d) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            parcel.writeByte((byte) i11);
            parcel.writeInt(this.f26475e);
            parcel.writeString(this.f26471a);
            parcel.writeString(this.f26472b);
            parcel.writeString(this.f26473c);
            parcel.writeString(this.f);
            parcel.writeString(this.f26476g);
            parcel.writeString(new JSONObject(this.f26483v).toString());
            if (this.f26478i) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            parcel.writeByte((byte) i12);
            if (!this.f26477h) {
                i13 = 0;
            }
            parcel.writeByte((byte) i13);
            parcel.writeString(new JSONObject(this.f26479j).toString());
        } catch (Throwable unused) {
        }
    }

    public b(Parcel parcel) {
        c();
        try {
            boolean z10 = true;
            this.f26474d = parcel.readByte() != 0;
            this.f26475e = parcel.readInt();
            this.f26471a = parcel.readString();
            this.f26472b = parcel.readString();
            this.f26473c = parcel.readString();
            this.f = parcel.readString();
            this.f26476g = parcel.readString();
            this.f26483v = a(parcel.readString());
            this.f26478i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z10 = false;
            }
            this.f26477h = z10;
            this.f26479j = a(parcel.readString());
        } catch (Throwable unused) {
            c();
        }
    }

    public final void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str) || this.f26482u.indexOf(str) != -1) {
            return;
        }
        this.f26482u.add(str);
    }
}
