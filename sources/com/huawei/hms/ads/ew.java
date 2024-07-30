package com.huawei.hms.ads;

import android.text.TextUtils;
import android.util.Log;
import gb.m0;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* loaded from: classes2.dex */
public final class ew extends ev {
    private static final long I = 4194304;
    private static final String V = "FileLogNode";
    private File Z;

    private ew() {
    }

    public static fc Code() {
        return new fa(new ew());
    }

    private void I(String str) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(this.Z, true);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    try {
                        outputStreamWriter = new OutputStreamWriter(bufferedOutputStream, "UTF-8");
                    } catch (FileNotFoundException | IOException unused) {
                    }
                    try {
                        outputStreamWriter.write(str);
                        outputStreamWriter.flush();
                        Code(outputStreamWriter);
                    } catch (FileNotFoundException unused2) {
                        outputStreamWriter2 = outputStreamWriter;
                        Log.w(V, "Exception when writing the log file.");
                        Code(outputStreamWriter2);
                        Code(bufferedOutputStream);
                        Code(fileOutputStream);
                    } catch (IOException unused3) {
                        outputStreamWriter2 = outputStreamWriter;
                        Log.w(V, "Exception when writing the log file.");
                        Code(outputStreamWriter2);
                        Code(bufferedOutputStream);
                        Code(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        outputStreamWriter2 = outputStreamWriter;
                        Code(outputStreamWriter2);
                        Code(bufferedOutputStream);
                        Code(fileOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException unused4) {
                    bufferedOutputStream = null;
                } catch (IOException unused5) {
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException unused6) {
            fileOutputStream = null;
            bufferedOutputStream = null;
        } catch (IOException unused7) {
            fileOutputStream = null;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            bufferedOutputStream = null;
        }
        Code(bufferedOutputStream);
        Code(fileOutputStream);
    }

    private boolean V(String str) {
        boolean z10;
        String str2;
        if (this.Z.length() + str.length() > I) {
            File file = new File(this.Z.getPath() + ".bak");
            if (file.exists()) {
                z10 = file.delete();
            } else {
                z10 = true;
            }
            if (z10) {
                if (!this.Z.renameTo(file)) {
                    str2 = "Failed to backup the log file.";
                }
            } else {
                str2 = "Cannot rename log file to bak.";
            }
            Log.w(V, str2);
            return false;
        }
        return true;
    }

    @Override // com.huawei.hms.ads.fc
    public fc Code(String str, String str2) {
        String concat;
        if (str2 == null || str2.isEmpty()) {
            Log.e(V, "Failed to initialize the file logger, parameter error.");
            return this;
        }
        if (this.Z == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    File canonicalFile = new File(str, "Log").getCanonicalFile();
                    if (canonicalFile.isDirectory() || m0.a(canonicalFile)) {
                        File file = new File(canonicalFile, str2.concat(".log"));
                        this.Z = file;
                        file.setReadable(true);
                        this.Z.setWritable(true);
                        this.Z.setExecutable(false, false);
                        return this;
                    }
                }
            } catch (IOException unused) {
                concat = "file path error. ioex";
                Log.e(V, concat);
                Log.w(V, "the file logger has been created already.");
                return this;
            } catch (Throwable th) {
                concat = "file path error. ".concat(th.getClass().getSimpleName());
                Log.e(V, concat);
                Log.w(V, "the file logger has been created already.");
                return this;
            }
        }
        Log.w(V, "the file logger has been created already.");
        return this;
    }

    @Override // com.huawei.hms.ads.fc
    public void Code(fe feVar, int i10, String str) {
        if (feVar == null) {
            return;
        }
        Code(feVar.Code() + feVar.V());
        fc fcVar = this.Code;
        if (fcVar != null) {
            fcVar.Code(feVar, i10, str);
        }
    }

    private static void Code(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.w(V, "Exception when closing the closeable.");
            }
        }
    }

    private void Code(String str) {
        if (str == null || this.Z == null) {
            return;
        }
        String str2 = str + '\n';
        if (V(str2)) {
            I(str2);
        }
    }
}
