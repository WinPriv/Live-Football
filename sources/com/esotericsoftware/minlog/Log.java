package com.esotericsoftware.minlog;

import e0.i;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class Log {
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_TRACE = 1;
    public static final int LEVEL_WARN = 4;
    private static int level = 3;
    public static boolean ERROR = true;
    public static boolean WARN = true;
    public static boolean INFO = true;
    public static boolean DEBUG = false;
    public static boolean TRACE = false;
    private static Logger logger = new Logger();

    /* loaded from: classes.dex */
    public static class Logger {
        private long firstLogTime = i.e();

        public void log(int i10, String str, String str2, Throwable th) {
            StringBuilder sb2 = new StringBuilder(256);
            long e10 = i.e() - this.firstLogTime;
            long j10 = e10 / 60000;
            long j11 = (e10 / 1000) % 60;
            if (j10 <= 9) {
                sb2.append('0');
            }
            sb2.append(j10);
            sb2.append(':');
            if (j11 <= 9) {
                sb2.append('0');
            }
            sb2.append(j11);
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                sb2.append(" ERROR: ");
                            }
                        } else {
                            sb2.append("  WARN: ");
                        }
                    } else {
                        sb2.append("  INFO: ");
                    }
                } else {
                    sb2.append(" DEBUG: ");
                }
            } else {
                sb2.append(" TRACE: ");
            }
            if (str != null) {
                sb2.append('[');
                sb2.append(str);
                sb2.append("] ");
            }
            sb2.append(str2);
            if (th != null) {
                StringWriter stringWriter = new StringWriter(256);
                th.printStackTrace(new PrintWriter(stringWriter));
                sb2.append('\n');
                sb2.append(stringWriter.toString().trim());
            }
            print(sb2.toString());
        }

        public void print(String str) {
            System.out.println(str);
        }
    }

    private Log() {
    }

    public static void DEBUG() {
        set(2);
    }

    public static void ERROR() {
        set(5);
    }

    public static void INFO() {
        set(3);
    }

    public static void NONE() {
        set(6);
    }

    public static void TRACE() {
        set(1);
    }

    public static void WARN() {
        set(4);
    }

    public static void debug(String str, Throwable th) {
        if (DEBUG) {
            logger.log(2, null, str, th);
        }
    }

    public static void error(String str, Throwable th) {
        if (ERROR) {
            logger.log(5, null, str, th);
        }
    }

    public static void info(String str, Throwable th) {
        if (INFO) {
            logger.log(3, null, str, th);
        }
    }

    public static void set(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        level = i10;
        boolean z14 = false;
        if (i10 <= 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        ERROR = z10;
        if (i10 <= 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        WARN = z11;
        if (i10 <= 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        INFO = z12;
        if (i10 <= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        DEBUG = z13;
        if (i10 <= 1) {
            z14 = true;
        }
        TRACE = z14;
    }

    public static void setLogger(Logger logger2) {
        logger = logger2;
    }

    public static void trace(String str, Throwable th) {
        if (TRACE) {
            logger.log(1, null, str, th);
        }
    }

    public static void warn(String str, Throwable th) {
        if (WARN) {
            logger.log(4, null, str, th);
        }
    }

    public static void debug(String str, String str2, Throwable th) {
        if (DEBUG) {
            logger.log(2, str, str2, th);
        }
    }

    public static void error(String str, String str2, Throwable th) {
        if (ERROR) {
            logger.log(5, str, str2, th);
        }
    }

    public static void info(String str, String str2, Throwable th) {
        if (INFO) {
            logger.log(3, str, str2, th);
        }
    }

    public static void trace(String str, String str2, Throwable th) {
        if (TRACE) {
            logger.log(1, str, str2, th);
        }
    }

    public static void warn(String str, String str2, Throwable th) {
        if (WARN) {
            logger.log(4, str, str2, th);
        }
    }

    public static void debug(String str) {
        if (DEBUG) {
            logger.log(2, null, str, null);
        }
    }

    public static void error(String str) {
        if (ERROR) {
            logger.log(5, null, str, null);
        }
    }

    public static void info(String str) {
        if (INFO) {
            logger.log(3, null, str, null);
        }
    }

    public static void trace(String str) {
        if (TRACE) {
            logger.log(1, null, str, null);
        }
    }

    public static void warn(String str) {
        if (WARN) {
            logger.log(4, null, str, null);
        }
    }

    public static void debug(String str, String str2) {
        if (DEBUG) {
            logger.log(2, str, str2, null);
        }
    }

    public static void error(String str, String str2) {
        if (ERROR) {
            logger.log(5, str, str2, null);
        }
    }

    public static void info(String str, String str2) {
        if (INFO) {
            logger.log(3, str, str2, null);
        }
    }

    public static void trace(String str, String str2) {
        if (TRACE) {
            logger.log(1, str, str2, null);
        }
    }

    public static void warn(String str, String str2) {
        if (WARN) {
            logger.log(4, str, str2, null);
        }
    }
}
