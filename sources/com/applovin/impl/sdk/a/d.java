package com.applovin.impl.sdk.a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final View f18506a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f18507b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18508c;

    public d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f18506a = view;
        this.f18507b = friendlyObstructionPurpose;
        this.f18508c = str;
    }

    public View a() {
        return this.f18506a;
    }

    public FriendlyObstructionPurpose b() {
        return this.f18507b;
    }

    public String c() {
        return this.f18508c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        View view = this.f18506a;
        if (view == null ? dVar.f18506a != null : !view.equals(dVar.f18506a)) {
            return false;
        }
        if (this.f18507b != dVar.f18507b) {
            return false;
        }
        String str = this.f18508c;
        String str2 = dVar.f18508c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        View view = this.f18506a;
        int i12 = 0;
        if (view != null) {
            i10 = view.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f18507b;
        if (friendlyObstructionPurpose != null) {
            i11 = friendlyObstructionPurpose.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str = this.f18508c;
        if (str != null) {
            i12 = str.hashCode();
        }
        return i14 + i12;
    }
}
