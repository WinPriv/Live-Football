package com.anythink.core.common.j;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.g.a.c;
import com.anythink.core.common.g.i;
import com.anythink.core.common.k.p;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f6033b;

    /* renamed from: h, reason: collision with root package name */
    private Context f6039h;

    /* renamed from: i, reason: collision with root package name */
    private File f6040i;

    /* renamed from: j, reason: collision with root package name */
    private AtomicInteger f6041j;

    /* renamed from: a, reason: collision with root package name */
    private final String f6034a = "Agent";

    /* renamed from: c, reason: collision with root package name */
    private int f6035c = 5;

    /* renamed from: d, reason: collision with root package name */
    private int f6036d = 10;

    /* renamed from: e, reason: collision with root package name */
    private long f6037e = 1800000;
    private String f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f6038g = "";

    /* renamed from: k, reason: collision with root package name */
    private boolean f6042k = false;

    /* renamed from: l, reason: collision with root package name */
    private String f6043l = "";

    /* renamed from: m, reason: collision with root package name */
    private i f6044m = new i() { // from class: com.anythink.core.common.j.b.1
        @Override // com.anythink.core.common.g.i
        public final void onLoadCanceled(int i10) {
            b.this.f6042k = false;
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadError(int i10, String str, AdError adError) {
            b.this.f6042k = false;
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadFinish(int i10, Object obj) {
            b.this.a(((Integer) obj).intValue());
            b.this.f6042k = false;
            p.a(b.this.f6039h, g.o, "LOG_SEND_TIME", System.currentTimeMillis());
        }

        @Override // com.anythink.core.common.g.i
        public final void onLoadStart(int i10) {
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private c.a f6045n = new c.a() { // from class: com.anythink.core.common.j.b.2
        @Override // com.anythink.core.common.g.a.c.a
        public final void a(Object obj) {
            if (obj instanceof com.anythink.core.common.g.a.a) {
                b.this.a(((com.anythink.core.common.g.a.a) obj).b());
                b.this.f6042k = false;
                p.a(b.this.f6039h, g.o, "LOG_SEND_TIME", System.currentTimeMillis());
            }
        }

        @Override // com.anythink.core.common.g.a.c.a
        public final void a(Throwable th) {
            b.this.f6042k = false;
        }
    };
    private Object o = new Object();

    private b() {
    }

    public final void b() {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.j.b.3
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0120, code lost:
            
                if (r2 == null) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
            
                if (r2 == null) goto L77;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.j.b.AnonymousClass3.run():void");
            }
        });
    }

    public static b a() {
        if (f6033b == null) {
            synchronized (b.class) {
                if (f6033b == null) {
                    f6033b = new b();
                }
            }
        }
        return f6033b;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea A[Catch: all -> 0x0132, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #3 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:11:0x001c, B:13:0x007a, B:15:0x008d, B:16:0x0096, B:18:0x009e, B:28:0x00cf, B:28:0x00cf, B:30:0x00e6, B:30:0x00e6, B:32:0x00ea, B:32:0x00ea, B:33:0x00f1, B:33:0x00f1, B:35:0x0103, B:35:0x0103, B:36:0x010a, B:36:0x010a, B:38:0x011a, B:38:0x011a, B:39:0x0121, B:39:0x0121, B:47:0x011f, B:47:0x011f, B:48:0x0108, B:48:0x0108, B:58:0x00dd, B:58:0x00dd, B:56:0x00e0, B:56:0x00e0, B:53:0x00e3, B:53:0x00e3), top: B:10:0x001c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103 A[Catch: all -> 0x0132, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #3 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:11:0x001c, B:13:0x007a, B:15:0x008d, B:16:0x0096, B:18:0x009e, B:28:0x00cf, B:28:0x00cf, B:30:0x00e6, B:30:0x00e6, B:32:0x00ea, B:32:0x00ea, B:33:0x00f1, B:33:0x00f1, B:35:0x0103, B:35:0x0103, B:36:0x010a, B:36:0x010a, B:38:0x011a, B:38:0x011a, B:39:0x0121, B:39:0x0121, B:47:0x011f, B:47:0x011f, B:48:0x0108, B:48:0x0108, B:58:0x00dd, B:58:0x00dd, B:56:0x00e0, B:56:0x00e0, B:53:0x00e3, B:53:0x00e3), top: B:10:0x001c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a A[Catch: all -> 0x0132, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #3 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:11:0x001c, B:13:0x007a, B:15:0x008d, B:16:0x0096, B:18:0x009e, B:28:0x00cf, B:28:0x00cf, B:30:0x00e6, B:30:0x00e6, B:32:0x00ea, B:32:0x00ea, B:33:0x00f1, B:33:0x00f1, B:35:0x0103, B:35:0x0103, B:36:0x010a, B:36:0x010a, B:38:0x011a, B:38:0x011a, B:39:0x0121, B:39:0x0121, B:47:0x011f, B:47:0x011f, B:48:0x0108, B:48:0x0108, B:58:0x00dd, B:58:0x00dd, B:56:0x00e0, B:56:0x00e0, B:53:0x00e3, B:53:0x00e3), top: B:10:0x001c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a A[Catch: all -> 0x0165, TryCatch #4 {, blocks: (B:4:0x0003, B:8:0x000b, B:40:0x0126, B:42:0x012a, B:43:0x012f, B:44:0x0161, B:68:0x014b, B:70:0x014f, B:71:0x0156, B:79:0x0134, B:81:0x0138, B:73:0x0141, B:75:0x0145, B:76:0x0157, B:78:0x015b, B:82:0x0163, B:11:0x001c, B:13:0x007a, B:15:0x008d, B:16:0x0096, B:18:0x009e, B:28:0x00cf, B:30:0x00e6, B:32:0x00ea, B:33:0x00f1, B:35:0x0103, B:36:0x010a, B:38:0x011a, B:39:0x0121, B:47:0x011f, B:48:0x0108, B:58:0x00dd, B:56:0x00e0, B:53:0x00e3, B:72:0x013e), top: B:3:0x0003, inners: #0, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f A[Catch: all -> 0x0132, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #3 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:11:0x001c, B:13:0x007a, B:15:0x008d, B:16:0x0096, B:18:0x009e, B:28:0x00cf, B:28:0x00cf, B:30:0x00e6, B:30:0x00e6, B:32:0x00ea, B:32:0x00ea, B:33:0x00f1, B:33:0x00f1, B:35:0x0103, B:35:0x0103, B:36:0x010a, B:36:0x010a, B:38:0x011a, B:38:0x011a, B:39:0x0121, B:39:0x0121, B:47:0x011f, B:47:0x011f, B:48:0x0108, B:48:0x0108, B:58:0x00dd, B:58:0x00dd, B:56:0x00e0, B:56:0x00e0, B:53:0x00e3, B:53:0x00e3), top: B:10:0x001c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[Catch: all -> 0x0132, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #3 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:11:0x001c, B:13:0x007a, B:15:0x008d, B:16:0x0096, B:18:0x009e, B:28:0x00cf, B:28:0x00cf, B:30:0x00e6, B:30:0x00e6, B:32:0x00ea, B:32:0x00ea, B:33:0x00f1, B:33:0x00f1, B:35:0x0103, B:35:0x0103, B:36:0x010a, B:36:0x010a, B:38:0x011a, B:38:0x011a, B:39:0x0121, B:39:0x0121, B:47:0x011f, B:47:0x011f, B:48:0x0108, B:48:0x0108, B:58:0x00dd, B:58:0x00dd, B:56:0x00e0, B:56:0x00e0, B:53:0x00e3, B:53:0x00e3), top: B:10:0x001c, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.j.b.a(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(com.anythink.core.common.e.h r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.f6040i     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L9
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f6041j     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L14
        L9:
            com.anythink.core.common.b.n r0 = com.anythink.core.common.b.n.a()     // Catch: java.lang.Throwable -> L86
            android.content.Context r0 = r0.g()     // Catch: java.lang.Throwable -> L86
            r4.a(r0)     // Catch: java.lang.Throwable -> L86
        L14:
            android.content.Context r0 = r4.f6039h     // Catch: java.lang.Throwable -> L86
            com.anythink.core.c.b r0 = com.anythink.core.c.b.a(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r4.f6043l     // Catch: java.lang.Throwable -> L86
            com.anythink.core.c.a r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L86
            int r1 = r0.ad()     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L2b
            int r1 = r0.ad()     // Catch: java.lang.Throwable -> L86
            goto L2d
        L2b:
            int r1 = r4.f6035c     // Catch: java.lang.Throwable -> L86
        L2d:
            r4.f6035c = r1     // Catch: java.lang.Throwable -> L86
            int r1 = r1 * 2
            r4.f6036d = r1     // Catch: java.lang.Throwable -> L86
            long r0 = r0.af()     // Catch: java.lang.Throwable -> L86
            r4.f6037e = r0     // Catch: java.lang.Throwable -> L86
            r0 = 0
            org.json.JSONObject r5 = r5.a()     // Catch: java.lang.Throwable -> L6a java.lang.Error -> L6c java.lang.Throwable -> L72 java.lang.Exception -> L7e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a java.lang.Error -> L6c java.lang.Throwable -> L72 java.lang.Exception -> L7e
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L6a java.lang.Error -> L6c java.lang.Throwable -> L72 java.lang.Exception -> L7e
            java.io.File r2 = r4.f6040i     // Catch: java.lang.Throwable -> L6a java.lang.Error -> L6c java.lang.Throwable -> L72 java.lang.Exception -> L7e
            r3 = 1
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L6a java.lang.Error -> L6c java.lang.Throwable -> L72 java.lang.Exception -> L7e
            r1.append(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Error -> L64 java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Error -> L64 java.lang.Throwable -> L66 java.lang.Exception -> L68
            r1.flush()     // Catch: java.lang.Throwable -> L61 java.lang.Error -> L64 java.lang.Throwable -> L66 java.lang.Exception -> L68
            r1.close()     // Catch: java.lang.Throwable -> L61 java.lang.Error -> L64 java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f6041j     // Catch: java.lang.Throwable -> L61 java.lang.Error -> L64 java.lang.Throwable -> L66 java.lang.Exception -> L68
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L61 java.lang.Error -> L64 java.lang.Throwable -> L66 java.lang.Exception -> L68
            r1.close()     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L86
            goto L81
        L61:
            r5 = move-exception
            r0 = r1
            goto L78
        L64:
            r0 = r1
            goto L6c
        L66:
            r0 = r1
            goto L72
        L68:
            r0 = r1
            goto L7e
        L6a:
            r5 = move-exception
            goto L78
        L6c:
            if (r0 == 0) goto L81
        L6e:
            r0.close()     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L86
            goto L81
        L72:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L81
            goto L6e
        L78:
            if (r0 == 0) goto L7d
            r0.close()     // Catch: java.io.IOException -> L7d java.lang.Throwable -> L86
        L7d:
            throw r5     // Catch: java.lang.Throwable -> L86
        L7e:
            if (r0 == 0) goto L81
            goto L6e
        L81:
            r4.a(r6)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r4)
            return
        L86:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.j.b.a(com.anythink.core.common.e.h, boolean):void");
    }

    private synchronized void a(boolean z10) {
        String readLine;
        AtomicInteger atomicInteger;
        if (this.f6039h == null) {
            return;
        }
        if (this.f6042k || (!z10 && ((atomicInteger = this.f6041j) == null || atomicInteger.get() < this.f6035c))) {
            return;
        }
        this.f6042k = true;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f6040i));
                try {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < this.f6036d && (readLine = bufferedReader2.readLine()) != null; i10++) {
                        arrayList.add(readLine);
                    }
                    com.anythink.core.c.a b10 = com.anythink.core.c.b.a(n.a().g()).b(n.a().p());
                    if (b10 != null) {
                        if (b10.u() != 1) {
                            new com.anythink.core.common.g.b(this.f6039h, b10.u(), arrayList).a(0, this.f6044m);
                        } else {
                            com.anythink.core.common.g.a.a aVar = new com.anythink.core.common.g.a.a(arrayList);
                            aVar.a(1, b10.t());
                            aVar.a(this.f6045n);
                        }
                    } else {
                        new com.anythink.core.common.g.b(this.f6039h, 0, arrayList).a(0, this.f6044m);
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    bufferedReader = bufferedReader2;
                    this.f6042k = false;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                        }
                    }
                } catch (OutOfMemoryError | StackOverflowError unused4) {
                    bufferedReader = bufferedReader2;
                    this.f6042k = false;
                    System.gc();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused5) {
                        }
                    }
                } catch (Throwable unused6) {
                    bufferedReader = bufferedReader2;
                    this.f6042k = false;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused7) {
                        }
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused8) {
                    }
                }
                throw th;
            }
        } catch (Exception unused9) {
        } catch (OutOfMemoryError | StackOverflowError unused10) {
        } catch (Throwable unused11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i10) {
        File file;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            file = new File(this.f6038g);
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(this.f6040i));
        } catch (Exception unused) {
        } catch (OutOfMemoryError | StackOverflowError unused2) {
        } catch (Error unused3) {
        } catch (Throwable unused4) {
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            int i11 = 0;
            int i12 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                i12++;
                if (i12 > i10) {
                    fileWriter.append((CharSequence) readLine);
                    fileWriter.append((CharSequence) "\n");
                }
            }
            fileWriter.flush();
            fileWriter.close();
            bufferedReader.close();
            AtomicInteger atomicInteger = this.f6041j;
            if (atomicInteger.get() - i10 >= 0) {
                i11 = this.f6041j.get() - i10;
            }
            atomicInteger.set(i11);
            this.f6040i.delete();
            file.renameTo(this.f6040i);
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
        } catch (Error unused6) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused7) {
                }
            }
        } catch (Exception unused8) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused9) {
                }
            }
        } catch (OutOfMemoryError | StackOverflowError unused10) {
            bufferedReader2 = bufferedReader;
            try {
                System.gc();
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused11) {
                    }
                }
            } catch (Throwable th) {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused12) {
                    }
                }
                throw th;
            }
        } catch (Throwable unused13) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused14) {
                }
            }
        }
    }
}
