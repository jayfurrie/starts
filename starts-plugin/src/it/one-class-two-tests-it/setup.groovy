/*
 * Copyright (c) 2015 - Present. The STARTS Team. All Rights Reserved.
 */

import edu.illinois.starts.jdeps.SetupUtil

firstRun = new File(basedir, "first-run.txt")

if (firstRun.exists()) {
    setupUtil = new SetupUtil(new File(basedir, ".starts/deps.zlc"))
    file = new File(basedir, "src/main/java/base/Base.java")
    setupUtil.replaceAllInFile(file, "Set<Integer>", "Set")
}