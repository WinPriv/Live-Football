package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.huawei.openalliance.ad.constant.w;
import d0.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import s.f;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f1569t = {"_display_name", "_size"};

    /* renamed from: u, reason: collision with root package name */
    public static final File f1570u = new File("/");

    /* renamed from: v, reason: collision with root package name */
    public static final HashMap<String, b> f1571v = new HashMap<>();

    /* renamed from: s, reason: collision with root package name */
    public b f1572s;

    /* loaded from: classes.dex */
    public static class a {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        File a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap<String, File> f1573a = new HashMap<>();

        @Override // androidx.core.content.FileProvider.b
        public final File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f1573a.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
    }

    public static c a(Context context, String str) throws IOException, XmlPullParserException {
        c cVar = new c();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            Bundle bundle = resolveContentProvider.metaData;
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f1570u;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            Object obj = d0.a.f27248a;
                            File[] b10 = a.b.b(context, null);
                            if (b10.length > 0) {
                                file = b10[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            Object obj2 = d0.a.f27248a;
                            File[] a10 = a.b.a(context);
                            if (a10.length > 0) {
                                file = a10[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] a11 = a.a(context);
                            if (a11.length > 0) {
                                file = a11[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            if (attributeValue2 != null) {
                                file = new File(file, attributeValue2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    cVar.f1573a.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e10) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return cVar;
                }
            }
        } else {
            throw new IllegalArgumentException(f.b("Couldn't find meta-data for provider with authority ", str));
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        b bVar;
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(w.aG)[0];
                HashMap<String, b> hashMap = f1571v;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                synchronized (hashMap) {
                    bVar = hashMap.get(str);
                    if (bVar == null) {
                        try {
                            bVar = a(context, str);
                            hashMap.put(str, bVar);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        } catch (XmlPullParserException e11) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                        }
                    }
                }
                this.f1572s = bVar;
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return this.f1572s.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a10 = this.f1572s.a(uri);
        int lastIndexOf = a10.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a10.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i10;
        File a10 = this.f1572s.a(uri);
        if ("r".equals(str)) {
            i10 = 268435456;
        } else if (!"w".equals(str) && !com.anythink.expressad.d.a.b.R.equals(str)) {
            if ("wa".equals(str)) {
                i10 = 704643072;
            } else if ("rw".equals(str)) {
                i10 = 939524096;
            } else if ("rwt".equals(str)) {
                i10 = 1006632960;
            } else {
                throw new IllegalArgumentException(f.b("Invalid mode: ", str));
            }
        } else {
            i10 = 738197504;
        }
        return ParcelFileDescriptor.open(a10, i10);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        String str3;
        File a10 = this.f1572s.a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1569t;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                if (queryParameter == null) {
                    str3 = a10.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i11] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        String[] strArr4 = new String[i11];
        System.arraycopy(strArr3, 0, strArr4, 0, i11);
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
