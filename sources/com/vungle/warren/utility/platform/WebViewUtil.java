package com.vungle.warren.utility.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import m0.a;

/* loaded from: classes2.dex */
public class WebViewUtil {
    private final String TAG = "WebViewUtil";
    private final Context context;
    private final Repository repository;

    public WebViewUtil(Context context, Repository repository) {
        this.context = context;
        this.repository = repository;
    }

    private void addUserAgentInCookie(String str) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.USER_AGENT_ID_COOKIE);
        cookie.putValue(Cookie.USER_AGENT_ID_COOKIE, str);
        this.repository.save(cookie);
    }

    public void getUserAgent(a<String> aVar) {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            aVar.accept(defaultUserAgent);
            addUserAgentInCookie(defaultUserAgent);
        } catch (Exception e10) {
            if (e10 instanceof DatabaseHelper.DBException) {
                VungleLogger.error(this.TAG, "Ran into database issue");
            }
            if (e10 instanceof AndroidRuntimeException) {
                VungleLogger.error(this.TAG, "WebView could be missing here");
            }
            aVar.accept(null);
        }
    }
}
