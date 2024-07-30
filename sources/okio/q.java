package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: Okio.java */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f33861a = Logger.getLogger(q.class.getName());

    public static m a(File file) throws FileNotFoundException {
        if (file != null) {
            return new m(new FileOutputStream(file, true), new a0());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static t b(m mVar) {
        return new t(mVar);
    }

    public static m c(File file) throws FileNotFoundException {
        if (file != null) {
            return new m(new FileOutputStream(file), new a0());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static y d(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                p pVar = new p(socket);
                OutputStream outputStream = socket.getOutputStream();
                if (outputStream != null) {
                    return pVar.sink(new m(outputStream, pVar));
                }
                throw new IllegalArgumentException("out == null");
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static z e(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                p pVar = new p(socket);
                InputStream inputStream = socket.getInputStream();
                if (inputStream != null) {
                    return pVar.source(new n(inputStream, pVar));
                }
                throw new IllegalArgumentException("in == null");
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }
}
