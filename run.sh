#!/bin/sh
echo "start to build APP and test APP"
ant clean debug


echo "uninstall source apk"
adb uninstall com.yuhj.ontheway
adb uninstall com.android.systemui.tests
echo "uninstall tested apk"
adb uninstall com.yuhj.ontheway.test.test

echo "start to install source apk"
adb install workspace\apk\WelcomeActivity-debug.apk
echo "start to install tested apk"
adb install workspace\bin\workspace-debug.apk

echo "start to run test"
adb shell am instrument -w com.yuhj.ontheway.test.test/runner.Runner01

