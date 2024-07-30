package i8;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f29230d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f29231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29232b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29233c;

    public a0(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f29230d.matcher(str3).matches()) {
            this.f29231a = str3;
            this.f29232b = str;
            this.f29233c = e0.i.f(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.f29231a.equals(a0Var.f29231a) || !this.f29232b.equals(a0Var.f29232b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f29232b, this.f29231a);
    }
}
