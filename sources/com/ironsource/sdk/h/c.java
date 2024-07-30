package com.ironsource.sdk.h;

import com.anythink.core.api.ATAdConst;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c extends File {
    public c(String str) {
        super(str);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public final String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public c(String str, String str2) {
        super(str, str2);
    }
}
