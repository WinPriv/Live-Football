package o9;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;

/* loaded from: classes2.dex */
public final class b extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33783a;

    public b(Context context) {
        super(null);
        this.f33783a = context;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        String str;
        super.onChange(z10, uri);
        Log.d("HomeCountryImpl", "homeCountry changed");
        if (uri.equals(Settings.Secure.getUriFor("appgallery_service_homecountry"))) {
            Context context = this.f33783a;
            try {
                str = Settings.Secure.getString(context.getContentResolver(), "appgallery_service_homecountry");
            } catch (Exception unused) {
                Log.e("HomeCountryImpl", "getHomeCountryBySettings exception");
                str = null;
            }
            q9.a.a(context).d(str);
        }
    }
}
