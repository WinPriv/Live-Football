package j0;

import android.content.Context;
import android.os.UserManager;

/* compiled from: UserManagerCompat.java */
/* loaded from: classes.dex */
public final class j {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
