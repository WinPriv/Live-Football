package com.vungle.warren.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.vungle.warren.SessionTracker;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class OMInjector {
    private static final String OM_SDK_JS = "omsdk.js";
    private static final String OM_SESSION_JS = "omsdk-session.js";
    private AtomicReference<Context> contextRef;
    private Handler uiHandler = new Handler(Looper.getMainLooper());

    public OMInjector(Context context) {
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private File writeToFile(String str, File file) throws IOException {
        Closeable closeable = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            try {
                fileWriter.write(str);
                fileWriter.flush();
                closeQuietly(fileWriter);
                return file;
            } catch (Throwable th) {
                th = th;
                closeable = fileWriter;
                closeQuietly(closeable);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void init() {
        this.uiHandler.post(new Runnable() { // from class: com.vungle.warren.omsdk.OMInjector.1
            @Override // java.lang.Runnable
            public void run() {
                if (!Omid.isActive()) {
                    Omid.activate((Context) OMInjector.this.contextRef.get());
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.OM_SDK).addData(SessionAttribute.ENABLED, true).addData(SessionAttribute.SUCCESS, Omid.isActive()).build());
                }
            }
        });
    }

    public List<File> injectJsFiles(File file) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(writeToFile(Res.OM_JS, new File(file, OM_SDK_JS)));
        arrayList.add(writeToFile(Res.OM_SESSION_JS, new File(file, OM_SESSION_JS)));
        return arrayList;
    }
}
