package i8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import i8.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* compiled from: ImageDownload.java */
/* loaded from: classes2.dex */
public final class p implements Closeable {

    /* renamed from: s, reason: collision with root package name */
    public final URL f29291s;

    /* renamed from: t, reason: collision with root package name */
    public volatile Future<?> f29292t;

    /* renamed from: u, reason: collision with root package name */
    public Task<Bitmap> f29293u;

    public p(URL url) {
        this.f29291s = url;
    }

    public final Bitmap b() throws IOException {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f29291s;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] b10 = d.b(new d.a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + b10.length + " bytes from " + url);
                }
                if (b10.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b10, 0, b10.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29292t.cancel(true);
    }
}
