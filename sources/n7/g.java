package n7;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f33469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33471c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33472d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33473e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33474g;

    public g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f33470b = str;
        this.f33469a = str2;
        this.f33471c = str3;
        this.f33472d = str4;
        this.f33473e = str5;
        this.f = str6;
        this.f33474g = str7;
    }

    public static g a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new g(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Objects.equal(this.f33470b, gVar.f33470b) || !Objects.equal(this.f33469a, gVar.f33469a) || !Objects.equal(this.f33471c, gVar.f33471c) || !Objects.equal(this.f33472d, gVar.f33472d) || !Objects.equal(this.f33473e, gVar.f33473e) || !Objects.equal(this.f, gVar.f) || !Objects.equal(this.f33474g, gVar.f33474g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f33470b, this.f33469a, this.f33471c, this.f33472d, this.f33473e, this.f, this.f33474g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f33470b).add("apiKey", this.f33469a).add("databaseUrl", this.f33471c).add("gcmSenderId", this.f33473e).add("storageBucket", this.f).add("projectId", this.f33474g).toString();
    }
}
