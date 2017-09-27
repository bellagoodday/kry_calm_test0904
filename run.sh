#!/bin/sh
echo "adb connect 127.0.0.1:62001"
adb connect 127.0.0.1:62001
echo "uninstall source apk"
adb uninstall com.yuhj.ontheway
echo "uninstall tested apk"
adb uninstall com.yuhj.ontheway.test.test
echo "start to install source apk"
adb install apk/WelcomeActivity-debug.apk
echo "start to install tested apk"
adb install bin/workspace-debug.apk
echo "start to run test"
adb shell am instrument -w com.yuhj.ontheway.test.test/runner.Runner01