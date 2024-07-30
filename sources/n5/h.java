package n5;

import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;

/* compiled from: ProgramInformation.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f33390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33391b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33392c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33393d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33394e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f33390a = str;
        this.f33391b = str2;
        this.f33392c = str3;
        this.f33393d = str4;
        this.f33394e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (g0.a(this.f33390a, hVar.f33390a) && g0.a(this.f33391b, hVar.f33391b) && g0.a(this.f33392c, hVar.f33392c) && g0.a(this.f33393d, hVar.f33393d) && g0.a(this.f33394e, hVar.f33394e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.f33390a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        String str2 = this.f33391b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f33392c;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f33393d;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f33394e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
